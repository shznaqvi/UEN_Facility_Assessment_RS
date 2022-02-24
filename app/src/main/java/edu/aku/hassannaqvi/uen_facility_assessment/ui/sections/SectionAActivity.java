package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;


import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.form;

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
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionABinding;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.EndingActivity;


public class SectionAActivity extends AppCompatActivity {

    private static final String TAG = "SectionAActivity";
    ActivitySectionABinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a);
        bi.setForm(form);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
    }


/*
    private boolean insertNewRecord() {
        if (!form.getUid().equals("") || MainApp.superuser) return true;
        form.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addForm(form);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(form): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }
        form.setId(String.valueOf(rowId));
        if (rowId > 0) {
            form.setUid(form.getDeviceId() + form.getId());
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_UID, form.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }
*/


    private boolean updateDB() {
        if (MainApp.superuser) return true;
        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SA, form.sAtoString());
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
        //  if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            //   startActivity(new Intent(this, SectionMainActivity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}