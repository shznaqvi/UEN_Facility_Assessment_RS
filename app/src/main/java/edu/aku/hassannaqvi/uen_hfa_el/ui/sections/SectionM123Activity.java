package edu.aku.hassannaqvi.uen_hfa_el.ui.sections;

import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.moduleM;

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
import edu.aku.hassannaqvi.uen_hfa_el.databinding.ActivitySectionM123Binding;
import edu.aku.hassannaqvi.uen_hfa_el.ui.SectionMainActivity;


public class SectionM123Activity extends AppCompatActivity {

    private static final String TAG = "SectionM123Activity";
    ActivitySectionM123Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_m123);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
        bi.setForm(moduleM);
    }


    private boolean insertNewRecord() {
        if (!moduleM.getUid().equals("") || MainApp.superuser) return true;
        moduleM.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addModuleM(moduleM);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        moduleM.setId(String.valueOf(rowId));
        if (rowId > 0) {
            moduleM.setUid(moduleM.getDeviceId() + moduleM.getId());
            db.updatesModuleMColumn(TableContracts.ModuleMTable.COLUMN_UID, moduleM.getUid());
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
        long status = 0;
        try {
            updcount = db.updatesModuleMColumn(TableContracts.ModuleMTable.COLUMN_SM123, moduleM.sM123toString());
            if (moduleM.getM101().equals("2")) {
                moduleM.setiStatus("1");
                status = db.updatesModuleMColumn(TableContracts.ModuleMTable.COLUMN_ISTATUS, moduleM.getiStatus());
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (moduleM.getM101().equals("2") ? (updcount > 0 && status > 0) : (updcount > 0))
            return true;
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
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, moduleM.getM101().equals("2") ? SectionMainActivity.class : SectionM4Activity.class));
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