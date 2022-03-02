package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.countC;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleC;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.uen_facility_assessment.R;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;
import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionC1Binding;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.SectionMainActivity;


public class SectionC1Activity extends AppCompatActivity {

    private static final String TAG = "SectionC1Activity";
    ActivitySectionC1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c1);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
        bi.setForm(moduleC);
        countC = 0;
        setupTextWatchers();
    }


    private void setupTextWatchers() {
        editTextImplementation(bi.c01aa, bi.c01ab);
        editTextImplementation(bi.c01ba, bi.c01bb);
        editTextImplementation(bi.c01ca, bi.c01cb);
        editTextImplementation(bi.c01da, bi.c01db);
        editTextImplementation(bi.c01ea, bi.c01eb);
        editTextImplementation(bi.c01fa, bi.c01fb);
        editTextImplementation(bi.c01ga, bi.c01gb);
        editTextImplementation(bi.c01ha, bi.c01hb);
        editTextImplementation(bi.c01ia, bi.c01ib);
        editTextImplementation(bi.c01ja, bi.c01jb);
        editTextImplementation(bi.c01ka, bi.c01kb);
        editTextImplementation(bi.c01la, bi.c01lb);
    }


    public void editTextImplementation(EditTextPicker edit01, EditTextPicker edit02) {

        edit01.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(edit01.getText())) return;
                edit02.setMaxvalue(Integer.parseInt(edit01.getText().toString().trim()));
            }
        });

    }


    private boolean insertNewRecord() {
        if (!moduleC.getUid().equals("") || MainApp.superuser) return true;
        moduleC.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addModuleC(moduleC);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        moduleC.setId(String.valueOf(rowId));
        if (rowId > 0) {
            moduleC.setUid(moduleC.getDeviceId() + moduleC.getId());
            db.updatesModuleCColumn(TableContracts.ModuleCTable.COLUMN_UID, moduleC.getUid());
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
            updcount = db.updatesModuleCColumn(TableContracts.ModuleCTable.COLUMN_SC1, moduleC.sC1toString());
            updcount = db.updatesModuleCColumn(TableContracts.ModuleCTable.COLUMN_ISTATUS, moduleC.getiStatus());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 1) return true;
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
        moduleC.setiStatus("1");
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionC2Activity.class));
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