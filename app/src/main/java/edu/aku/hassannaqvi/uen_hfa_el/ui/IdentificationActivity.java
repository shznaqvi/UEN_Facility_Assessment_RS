package edu.aku.hassannaqvi.uen_hfa_el.ui;

import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.districtName;
import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.hfName;
import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.selectedDistrict;
import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.selectedHf;
import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.selectedTehsil;
import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.tehsilName;

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

import edu.aku.hassannaqvi.uen_hfa_el.MainActivity;
import edu.aku.hassannaqvi.uen_hfa_el.R;
import edu.aku.hassannaqvi.uen_hfa_el.core.MainApp;
import edu.aku.hassannaqvi.uen_hfa_el.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_hfa_el.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.uen_hfa_el.models.Form;
import edu.aku.hassannaqvi.uen_hfa_el.models.HealthFacilities;


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
                bi.a13.setAdapter(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);

                if (position == 0) return;
                selectedDistrict = districtCodes.get(position);
                districtName = districtNames.get(position);
                Collection<HealthFacilities> tehs = db.getTehsilByDist(selectedDistrict);
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
                bi.a13.setAdapter(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                if (position == 0) return;
                selectedTehsil = tehsilCodes.get(position);
                tehsilName = tehsilNames.get(position);
                Collection<HealthFacilities> hfs = db.getHFsByTehsil(selectedTehsil);
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

        /*bi.a09.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a13.setAdapter(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                if (position == 0) return;
                selectedUc = ucCodes.get(position);
                ucName = ucNames.get(position);
                Collection<HealthFacilities> hfs = db.getHFsByUc(selectedUc);
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

        });*/

        bi.a13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                if (position == 0) return;
                selectedHf = hfCodes.get(position);
                hfName = hfNames.get(position);
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
        if (!hhExists()) {
            finish();
            startActivity(new Intent(this, SectionMainActivity.class));
        } else if (MainApp.form.getSynced().equals("1") && !MainApp.superuser) { // Do not allow synced form to be edited
            Toast.makeText(this, "This form has been locked.", Toast.LENGTH_SHORT).show();
        } else {
            finish();
            startActivity(new Intent(this, SectionMainActivity.class));
        }
    }


    public void btnEnd(View view) {
        startActivity(new Intent(this, MainActivity.class).putExtra("complete", false));
        finish();
    }


    private boolean hhExists() {
        MainApp.form = new Form();
        try {
            MainApp.form = db.getFormByHfCode(selectedHf);
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.form != null;
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


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}