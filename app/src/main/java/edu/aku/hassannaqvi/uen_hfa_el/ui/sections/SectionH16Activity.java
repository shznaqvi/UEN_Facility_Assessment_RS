package edu.aku.hassannaqvi.uen_hfa_el.ui.sections;

import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.moduleH;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.uen_hfa_el.R;
import edu.aku.hassannaqvi.uen_hfa_el.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_hfa_el.core.MainApp;
import edu.aku.hassannaqvi.uen_hfa_el.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_hfa_el.databinding.ActivitySectionH16Binding;
import edu.aku.hassannaqvi.uen_hfa_el.ui.SectionMainActivity;

public class SectionH16Activity extends AppCompatActivity {

    private static final String TAG = "SectionH16Activity";
    ActivitySectionH16Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h16);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
        bi.setForm(moduleH);
    }


    private boolean insertNewRecord() {
        if (!moduleH.getUid().equals("") || MainApp.superuser) return true;
        moduleH.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addModuleH(moduleH);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        moduleH.setId(String.valueOf(rowId));
        if (rowId > 0) {
            moduleH.setUid(moduleH.getDeviceId() + moduleH.getId());
            db.updatesModuleHColumn(TableContracts.ModuleHTable.COLUMN_UID, moduleH.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;
        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        long stcount = 0;
        try {
            updcount = db.updatesModuleHColumn(TableContracts.ModuleHTable.COLUMN_SH16, moduleH.sH16toString());
            stcount = db.updatesModuleHColumn(TableContracts.ModuleHTable.COLUMN_ISTATUS, moduleH.getiStatus());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0 && stcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        bi.llbtn.setVisibility(View.GONE);
        new Handler().postDelayed(() -> bi.llbtn.setVisibility(View.VISIBLE), 5000);
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        moduleH.setiStatus("1");
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionMainActivity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, SectionMainActivity.class));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}