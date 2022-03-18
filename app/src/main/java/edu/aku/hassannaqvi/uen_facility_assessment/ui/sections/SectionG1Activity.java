package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleG;

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

import edu.aku.hassannaqvi.uen_facility_assessment.R;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;
import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionG1Binding;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.SectionMainActivity;

public class SectionG1Activity extends AppCompatActivity {

    private static final String TAG = "SectionG1Activity";
    ActivitySectionG1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g1);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
        bi.setForm(moduleG);
    }


    private boolean insertNewRecord() {
        if (!moduleG.getUid().equals("") || MainApp.superuser) return true;
        moduleG.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addModuleG(moduleG);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        moduleG.setId(String.valueOf(rowId));
        if (rowId > 0) {
            moduleG.setUid(moduleG.getDeviceId() + moduleG.getId());
            db.updatesModuleGColumn(TableContracts.ModuleGTable.COLUMN_UID, moduleG.getUid());
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
        try {
            updcount = db.updatesModuleGColumn(TableContracts.ModuleGTable.COLUMN_SG1, moduleG.sG1toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
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
            startActivity(new Intent(this, SectionG2Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, SectionMainActivity.class));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;

        if (Integer.parseInt(moduleG.getG0105a()) + Integer.parseInt(moduleG.getG0105b()) == 0)
            return Validator.emptyCustomTextBox(this, bi.g0105a, "Both Can't be zero");

        if (Integer.parseInt(moduleG.getG0110a()) + Integer.parseInt(moduleG.getG0110b()) == 0)
            return Validator.emptyCustomTextBox(this, bi.g0110a, "Both Can't be zero");

        return true;
    }


}