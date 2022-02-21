package edu.aku.hassannaqvi.uen_facility_assessment.ui;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleA;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.Collection;

import edu.aku.hassannaqvi.uen_facility_assessment.MainActivity;
import edu.aku.hassannaqvi.uen_facility_assessment.R;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;
import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.uen_facility_assessment.models.HealthFacilities;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleA;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;
    private Intent openIntent;
    private ArrayList<String> districtNames;
    private ArrayList<String> districtCodes;
    private ArrayList<String> tehsilNames;
    private ArrayList<String> tehsilCodes;
    private ArrayList<String> ucNames;
    private ArrayList<String> ucCodes;
    private ArrayList<String> hfNames;
    private ArrayList<String> hfCodes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        db = MainApp.appInfo.dbHelper;
        bi.btnContinue.setText(R.string.open_hf);
        if (MainApp.superuser) bi.btnContinue.setText("Review Form");
        bi.setForm(moduleA);
        populateSpinner();

    }

    private void populateSpinner() {

        Collection<HealthFacilities> dists = db.getAllDistricts();
        districtNames = new ArrayList<>();
        districtCodes = new ArrayList<>();
        districtNames.add("...");
        districtCodes.add("...");
        for (HealthFacilities dist : dists) {
            districtNames.add(dist.getDistrictName());
            districtCodes.add(dist.getDistrictCode());
        }

        // Apply the adapter to the spinner
        bi.a07.setAdapter(new ArrayAdapter<>(IdentificationActivity.this, R.layout.custom_spinner, districtNames));

        bi.a07.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a08.setAdapter(null);
                bi.a09.setAdapter(null);
                bi.a10.clearCheck();
                bi.a11.clearCheck();
                bi.a13.setAdapter(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);

                if (position == 0) return;

                Collection<HealthFacilities> tehs = db.getTehsilByDist(districtCodes.get(position));
                tehsilNames = new ArrayList<>();
                tehsilCodes = new ArrayList<>();
                tehsilNames.add("...");
                tehsilCodes.add("...");
                for (HealthFacilities teh : tehs) {
                    tehsilNames.add(teh.getTehsilName());
                    tehsilCodes.add(teh.getTehsilCode());
                }

                bi.a08.setAdapter(new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, tehsilNames));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        bi.a08.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a09.setAdapter(null);
                bi.a10.clearCheck();
                bi.a11.clearCheck();
                bi.a13.setAdapter(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);

                if (position == 0) return;

                Collection<HealthFacilities> ucs = db.getUcsByTehsil(tehsilCodes.get(position));
                ucNames = new ArrayList<>();
                ucCodes = new ArrayList<>();
                ucNames.add("...");
                ucCodes.add("...");
                for (HealthFacilities uc : ucs) {
                    ucNames.add(uc.getUcName());
                    ucCodes.add(uc.getUcCode());
                }
                bi.a09.setAdapter(new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, ucNames));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        bi.a09.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a10.clearCheck();
                bi.a11.clearCheck();
                bi.a13.setAdapter(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                if (position == 0) return;
                Collection<HealthFacilities> hfs = db.getHFsByUc(ucCodes.get(position));
                hfNames = new ArrayList<>();
                hfCodes = new ArrayList<>();
                hfNames.add("...");
                hfCodes.add("...");
                for (HealthFacilities hf : hfs) {
                    hfNames.add(hf.getHfName());
                    hfCodes.add(hf.getHfCode());
                }
                bi.a13.setAdapter(new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, hfNames));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        bi.a13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                if (position == 0) return;
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                bi.btnContinue.setEnabled(true);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!hhExists())
            saveDraftForm();
        if (moduleA.getSynced().equals("1") && !MainApp.superuser) { // Do not allow synced form to be edited
            Toast.makeText(this, "This form has been locked.", Toast.LENGTH_SHORT).show();
        } else {
            startActivity(new Intent(this, SectionMainActivity.class));
            finish();
        }
    }


    public void btnEnd(View view) {
        startActivity(new Intent(this, MainActivity.class).putExtra("complete", false));
        finish();
    }


    private boolean hhExists() {
        moduleA = new ModuleA();
        try {
            moduleA = db.getFormByHfCode(hfCodes.get(bi.a13.getSelectedItemPosition()));
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return moduleA != null;
    }

    private boolean hhDone(String kNo) {
        /*Form form = new Form(); // local variable
        try {
            form = db.getFormByLHWCode(lhwCodes.get(bi.a104.getSelectedItemPosition()), kNo);
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (form != null)
            return form.getiStatus().equals("1");
        return false;*/
        return true;
    }

    private void saveDraftForm() {
        moduleA.setDistrictCode(districtCodes.get(bi.a07.getSelectedItemPosition()));
        moduleA.setA07(bi.a07.getSelectedItem().toString());
        moduleA.setTehsilCode(tehsilCodes.get(bi.a08.getSelectedItemPosition()));
        moduleA.setA08(bi.a08.getSelectedItem().toString());
        moduleA.setUcCode(ucCodes.get(bi.a09.getSelectedItemPosition()));
        moduleA.setA09(bi.a09.getSelectedItem().toString());
        moduleA.setHfCode(hfCodes.get(bi.a13.getSelectedItemPosition()));
        moduleA.setA12(hfCodes.get(bi.a13.getSelectedItemPosition()));
        moduleA.setA13(bi.a13.getSelectedItem().toString());
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}