package edu.aku.hassannaqvi.uen_hfa_el.ui.sections;

import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.moduleK;

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
import edu.aku.hassannaqvi.uen_hfa_el.databinding.ActivitySectionK61Binding;
import edu.aku.hassannaqvi.uen_hfa_el.ui.SectionMainActivity;


public class SectionK61Activity extends AppCompatActivity {

    private static final String TAG = "SectionK61Activity";
    ActivitySectionK61Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_k61);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
        bi.setForm(moduleK);
        setupTextWatchers();
    }


    private void setupTextWatchers() {
        editTextImplementation(bi.k601dx, bi.k601ex);
        editTextImplementation(bi.k602dx, bi.k602ex);
        editTextImplementation(bi.k603dx, bi.k603ex);
        editTextImplementation(bi.k604dx, bi.k604ex);
        editTextImplementation(bi.k605dx, bi.k605ex);
        editTextImplementation(bi.k606dx, bi.k606ex);
        editTextImplementation(bi.k607dx, bi.k607ex);
        editTextImplementation(bi.k608dx, bi.k608ex);
        editTextImplementation(bi.k609dx, bi.k609ex);
        editTextImplementation(bi.k610dx, bi.k610ex);
        editTextImplementation(bi.k611dx, bi.k611ex);
        editTextImplementation(bi.k612dx, bi.k612ex);
        editTextImplementation(bi.k613dx, bi.k613ex);
        editTextImplementation(bi.k614dx, bi.k614ex);
        editTextImplementation(bi.k615dx, bi.k615ex);
        editTextImplementation(bi.k616dx, bi.k616ex);
        editTextImplementation(bi.k617dx, bi.k617ex);
        editTextImplementation(bi.k618dx, bi.k618ex);
        editTextImplementation(bi.k619dx, bi.k619ex);
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


    private boolean updateDB() {
        if (MainApp.superuser) return true;
        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesModuleKColumn(TableContracts.ModuleKTable.COLUMN_SK61, moduleK.sK61toString());
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
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionK62Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, SectionMainActivity.class));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "SORRY! Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }


}