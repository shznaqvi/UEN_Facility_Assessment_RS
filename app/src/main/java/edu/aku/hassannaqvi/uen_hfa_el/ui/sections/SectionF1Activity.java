package edu.aku.hassannaqvi.uen_hfa_el.ui.sections;

import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.moduleF;

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

import edu.aku.hassannaqvi.uen_hfa_el.R;
import edu.aku.hassannaqvi.uen_hfa_el.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_hfa_el.core.MainApp;
import edu.aku.hassannaqvi.uen_hfa_el.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_hfa_el.databinding.ActivitySectionF1Binding;
import edu.aku.hassannaqvi.uen_hfa_el.ui.SectionMainActivity;


public class SectionF1Activity extends AppCompatActivity {

    private static final String TAG = "SectionF1Activity";
    ActivitySectionF1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f1);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
        bi.setForm(moduleF);
        setupTextWatchers();
    }


    private void setupTextWatchers() {
        editTextImplementation(bi.f0101aa0aqx, bi.f0101aa0fqx);
        editTextImplementation(bi.f0101ab0aqx, bi.f0101ab0fqx);
        editTextImplementation(bi.f0105aaa0aqx, bi.f0105aaa0fqx);
        editTextImplementation(bi.f0105aab0aqx, bi.f0105aab0fqx);
        editTextImplementation(bi.f0105aac0aqx, bi.f0105aac0fqx);
        editTextImplementation(bi.f0106aaa0aqx, bi.f0106aaa0fqx);
        editTextImplementation(bi.f0110aaa0aqx, bi.f0110aaa0fqx);
        editTextImplementation(bi.f0110aab0aqx, bi.f0110aab0fqx);
        editTextImplementation(bi.f0110aac0aqx, bi.f0110aac0fqx);
        editTextImplementation(bi.f0110aad0aqx, bi.f0110aad0fqx);
        editTextImplementation(bi.f0110aae0aqx, bi.f0110aae0fqx);
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
        if (!moduleF.getUid().equals("") || MainApp.superuser) return true;
        moduleF.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addModuleF(moduleF);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        moduleF.setId(String.valueOf(rowId));
        if (rowId > 0) {
            moduleF.setUid(moduleF.getDeviceId() + moduleF.getId());
            db.updatesModuleFColumn(TableContracts.ModuleFTable.COLUMN_UID, moduleF.getUid());
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
            updcount = db.updatesModuleFColumn(TableContracts.ModuleFTable.COLUMN_SF1, moduleF.sF1toString());
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
            startActivity(new Intent(this, SectionF2Activity.class));
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