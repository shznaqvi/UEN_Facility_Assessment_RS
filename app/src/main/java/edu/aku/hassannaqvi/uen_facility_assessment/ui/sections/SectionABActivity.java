package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.form;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.maleList;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.uen_facility_assessment.R;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;
import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionAbBinding;
import edu.aku.hassannaqvi.uen_facility_assessment.models.FamilyMembers;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.EndingActivity;


public class SectionABActivity extends AppCompatActivity {
    private static final String TAG = "SectionABActivity";
    ActivitySectionAbBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> memberNames;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_ab);
        bi.setCallback(this);
        bi.setForm(form);

        db = MainApp.appInfo.getDbHelper();
        populateSpinner();

    }

    private void populateSpinner() {

        memberNames = new ArrayList<>();
        memberNames.add("...");
        for (FamilyMembers sfm : MainApp.adolList) {
            memberNames.add(sfm.getH302());
        }

        // Apply the adapter to the spinner

        bi.ab101.setAdapter(new ArrayAdapter<String>(SectionABActivity.this, R.layout.custom_spinner, memberNames));
        if (!MainApp.form.getAb101().equals("")) {
            int selectedPosition = memberNames.indexOf(MainApp.form.getAb101());
            bi.ab101.setSelection(selectedPosition);
        }
        bi.ab101.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemSelected: " + position);

                if (position == 0) return;
                MainApp.form.setAb101(memberNames.get(position));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });


    }

    private boolean updateDB() {
        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SAB, form.sABtoString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db_form + e.getMessage());
            Toast.makeText(this, R.string.upd_db_form + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (updateDB()) {

            if (maleList.size() > 0) {
                startActivity(new Intent(this, SectionMActivity.class).putExtra("complete", true));

            } else {
                startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
            }
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        finish();
    }


    public void btnEnd(View view) {

        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        finish();
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }


}