package edu.aku.hassannaqvi.uen_facility_assessment.ui;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleA;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.uen_facility_assessment.MainActivity;
import edu.aku.hassannaqvi.uen_facility_assessment.R;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;
import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleA;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;
    private Intent openIntent;
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
        moduleA = new ModuleA();
        bi.setForm(moduleA);
        populateSpinner();

        /*openIntent = new Intent();
        switch (MainApp.idType) {
            case 1:
                bi.btnContinue.setText(R.string.open_hf);
                MainApp.form = new Form();
                openIntent = new Intent(this, SectionMainActivity.class);
                break;
         *//*   case 2:
                bi.btnContinue.setText(R.string.open_anhtro_form);
                MainApp.anthro = new Anthro();
                openIntent = new Intent(this, SectionAnthroActivity.class);
                break;
            case 3:
                bi.btnContinue.setText(R.string.open_blood_form);
                //     MainApp.sample = new Sample();
                openIntent = new Intent(this, SectionSamplesActivity.class);
                break;
            case 4:
                bi.btnContinue.setText(R.string.open_stool_form);
                //    MainApp.sample = new Sample();
                openIntent = new Intent(this, SectionSamplesActivity.class);
                break;*//*

        }*/

    }

    private void populateSpinner() {

        /*Collection<Form> lhw = db.getRegisteredLhws();
        tehsilNames = new ArrayList<>();
        tehsilCodes = new ArrayList<>();

        tehsilNames.add("...");
        tehsilCodes.add("...");
        for (Form lf : lhw) {
            tehsilNames.add(lf.getA104n());
            tehsilCodes.add(lf.getA104c());
        }

        // Apply the adapter to the spinner
        bi.a08.setAdapter(new ArrayAdapter<>(IdentificationActivity.this, R.layout.custom_spinner, tehsilNames));

        bi.a08.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.a09.setAdapter(null);
                bi.a12.setText(null);

                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);

                if (position == 0) return;
                try {
                    lhwhhs = db.getKhandanNoByLHW(lhwCodes.get(position));
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(IdentificationActivity.this, "JSONException(LHWHouseholds)" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                khandanNo = new ArrayList<>();
                hhheads = new ArrayList<>();

                khandanNo.add("...");
                hhheads.add("...");

                Iterator<LHWHouseholds> i = lhwhhs.iterator();
                while (i.hasNext()) {
                    LHWHouseholds lhwhh = i.next();
                    if (!hhDone(lhwhh.getH102())) {
                        khandanNo.add(lhwhh.getH102());
                    } else {
                        i.remove();
                    }
                }

                for (LHWHouseholds lhwhh : lhwhhs) {
                    if (!hhDone(lhwhh.getH102())){
                        khandanNo.add(lhwhh.getH102());} else {

                    }
                    // hhheads.add(lhwhh.getH103());
                }

                // Apply the adapter to the spinner
                bi.a09.setAdapter(new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, ucNames));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        bi.a09.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.a12.setText(null);

                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);

                if (position == 0) return;
                // position -1, because lhwhhs does not have ... on 0 index`
                bi.a12.setText(hfCodes.get(position - 1).getHfCode);
                MainApp.LHWHouseholds = lhwhhs.get(position - 1);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                bi.btnContinue.setEnabled(true);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });*/

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


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
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
        moduleA = new ModuleA();
        moduleA.setUserName(MainApp.user.getUserName());
        moduleA.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        moduleA.setDeviceId(MainApp.deviceid);
        moduleA.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        moduleA.setTehsilCode(tehsilCodes.get(bi.a08.getSelectedItemPosition()));
        moduleA.setA08(bi.a08.getSelectedItem().toString());
        moduleA.setUcCode(ucCodes.get(bi.a09.getSelectedItemPosition()));
        moduleA.setA09(bi.a09.getSelectedItem().toString());
        moduleA.setHfCode(hfCodes.get(bi.a13.getSelectedItemPosition()));
        moduleA.setA12(hfCodes.get(bi.a13.getSelectedItemPosition()));
        moduleA.setA13(bi.a13.getSelectedItem().toString());
    }


}