package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;


import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
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
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionABinding;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.SectionMainActivity;


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
        setupSkips();
    }


    private void setupSkips() {

        bi.a03y.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.a03y.getText().toString().isEmpty()) return;
                bi.a03y.setMaxvalue(Calendar.getInstance().get(Calendar.YEAR));
                bi.a03m.setMinvalue(Integer.parseInt(bi.a03y.getText().toString()) == 2021 ? 12f : 1f);
                bi.a03d.setMinvalue(1f);
                bi.a03m.setMaxvalue(Integer.parseInt(bi.a03y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.MONTH) + 1 : 12f);
                bi.a03d.setMaxvalue(Integer.parseInt(bi.a03y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(bi.a03m.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        bi.a03m.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.a03y.getText().toString().isEmpty() || bi.a03m.getText().toString().isEmpty())
                    return;
                bi.a03d.setMaxvalue(Integer.parseInt(bi.a03y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(bi.a03m.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }


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
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionMainActivity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "SORRY! Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }


}