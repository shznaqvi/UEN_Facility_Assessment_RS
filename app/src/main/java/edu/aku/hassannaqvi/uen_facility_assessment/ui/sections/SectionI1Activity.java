package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.countI;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.form;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleI;

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

import java.util.Calendar;

import edu.aku.hassannaqvi.uen_facility_assessment.R;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;
import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionI1Binding;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleI;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.SectionMainActivity;

public class SectionI1Activity extends AppCompatActivity {

    private static final String TAG = "SectionI1Activity";
    ActivitySectionI1Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_i1);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
        bi.setForm(moduleI);
        setupContent();
    }


    private void setupContent() {
        moduleI.setI0102aa(moduleI.getI0101().equals("1") ? String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) : "");
        moduleI.setI0102ab(moduleI.getI0101().equals("1") ? String.valueOf(Calendar.getInstance().get(Calendar.MONTH) + 1) : "");
        moduleI.setI0102ac(moduleI.getI0101().equals("1") ? String.valueOf(Calendar.getInstance().get(Calendar.YEAR)) : "");
        moduleI.setI0102ba(moduleI.getI0101().equals("1") ? String.valueOf(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)) : "");
        moduleI.setI0102bb(moduleI.getI0101().equals("1") ? String.valueOf(Calendar.getInstance().get(Calendar.MINUTE)) : "");

        bi.hfType.setText(form.getA10().equals("1") ? getString(R.string.a10a) : getString(R.string.a10b));
        bi.countI.setText(new StringBuilder("Entries: 0").append(countI++));
        bi.btnAdd.setEnabled(form.getA10().equals("1") ? countI < 6 : countI < 3);
    }


    private boolean insertNewRecord() {
        if (!moduleI.getUid().equals("") || MainApp.superuser) return true;
        moduleI.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addModuleI(moduleI);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        moduleI.setId(String.valueOf(rowId));
        if (rowId > 0) {
            moduleI.setUid(moduleI.getDeviceId() + moduleI.getId());
            db.updatesModuleIColumn(TableContracts.ModuleITable.COLUMN_UID, moduleI.getUid());
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
            updcount = db.updatesModuleIColumn(TableContracts.ModuleITable.COLUMN_SI, moduleI.sItoString());
            stcount = db.updatesModuleIColumn(TableContracts.ModuleITable.COLUMN_ISTATUS, moduleI.getiStatus());
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
        moduleI.setiStatus("1");
        if (updateDB()) {
            finish();
            if (view.getId() == bi.btnAdd.getId()) {
                moduleI = new ModuleI();
                startActivity(new Intent(this, SectionI1Activity.class));
            } else startActivity(new Intent(this, SectionMainActivity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        if (countI > 1) {
            Toast.makeText(this, "You have Enter Patient Already", Toast.LENGTH_LONG).show();
            return;
        }
        finish();
        startActivity(new Intent(this, SectionMainActivity.class));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        if (countI > 1)
            Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
        else super.onBackPressed();
    }


}