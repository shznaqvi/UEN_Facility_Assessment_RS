package edu.aku.hassannaqvi.uen_facility_assessment.ui;


import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_facility_assessment.R;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionMainBinding;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionBActivity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionC1Activity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionD1Activity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionE1Activity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionF1Activity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionG1Activity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionH16Activity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionH2Activity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionI1Activity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionJ1Activity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionK1Activity;


public class SectionMainActivity extends AppCompatActivity {
    //public static String maternalCount = 0, paedsCount = 0;
    public static int countC2 = 0, countI = 0;
    ActivitySectionMainBinding bi;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_main);
        bi.setForm(form);


        /*if (countC2 != 0 && !flag) {

            JSONObject json = new JSONObject();

            try {
                json.put("countC2", String.valueOf(countC2));
                JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(form.getsC()), json);
                form.setsC(String.valueOf(json_merge));
            } catch (JSONException e) {
                e.printStackTrace();
            }

            DatabaseHelper db = MainApp.appInfo.getDbHelper();
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SC, form.getsC());
            Toast.makeText(this, "countC2: 0" + countC2, Toast.LENGTH_SHORT).show();
        }*/

        updateSections();


    }

    private void updateSections() {

        try {
            if (!form.getsB().isEmpty() && new JSONObject(form.getsB()).has("b05")) {
                bi.formB.setEnabled(false);
                bi.checkedB.setVisibility(View.VISIBLE);
            }

            if ((!form.getsC().isEmpty() && new JSONObject(form.getsC()).has("c01le")) || form.getA10().equals("2")) {
                bi.formC.setEnabled(false);
                bi.checkedC.setVisibility(View.VISIBLE);
                flag = true;
            }

            if (!form.getsD().isEmpty() && new JSONObject(form.getsD()).has("d0810b")) {
                bi.formD.setEnabled(false);
                bi.checkedD.setVisibility(View.VISIBLE);
            }

            if (!form.getsE().isEmpty() && new JSONObject(form.getsE()).has("e0814")) {
                bi.formE.setEnabled(false);
                bi.checkedE.setVisibility(View.VISIBLE);
            }

            if ((!form.getsF().isEmpty() && new JSONObject(form.getsF()).has("f0701aad0fyx")) || form.getA10().equals("2")) {
                bi.formF.setEnabled(false);
                bi.checkedF.setVisibility(View.VISIBLE);
            }

            if ((!form.getsG().isEmpty() && new JSONObject(form.getsG()).has("g4406cm")) || form.getA10().equals("2")) {
                bi.formG.setEnabled(false);
                bi.checkedG.setVisibility(View.VISIBLE);
            }

            if (!form.getsH().isEmpty() && (new JSONObject(form.getsH()).has("h1605xx") || new JSONObject(form.getsH()).has("h1501z0dn"))) {
                bi.formH.setEnabled(false);
                bi.checkedH.setVisibility(View.VISIBLE);
            }

            if (!form.getsI().equals("")) {
                bi.formI.setEnabled(false);
                bi.checkedI.setVisibility(View.VISIBLE);
            }

            if (!form.getsJ().isEmpty() && new JSONObject(form.getsJ()).has("j0901fxx")) {
                bi.formJ.setEnabled(false);
                bi.checkedJ.setVisibility(View.VISIBLE);
            }

            if (!form.getsK().isEmpty() && new JSONObject(form.getsK()).has("k711")) {
                bi.formK.setEnabled(false);
                bi.checkedK.setVisibility(View.VISIBLE);
            }

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    public void openForm(View v) {
        OpenFormFunc(v.getId());
    }


    public void btnContinue(View v) {
        if (!bi.formB.isEnabled()
                && !bi.formC.isEnabled()
                && !bi.formD.isEnabled()
                && !bi.formE.isEnabled()
                && !bi.formF.isEnabled()
                && !bi.formG.isEnabled()
                && !bi.formH.isEnabled()
                && !bi.formI.isEnabled()
                && !bi.formJ.isEnabled()
                && !bi.formK.isEnabled()) {
            finish();
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
            //MainApp.endActivity(this, SectionBActivity.class);
        } else {
            Toast.makeText(this, "Sections still in Pending!", Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View v) {
        if (bi.formB.isEnabled()
                || bi.formC.isEnabled()
                || bi.formD.isEnabled()
                || bi.formE.isEnabled()
                || bi.formF.isEnabled()
                || bi.formG.isEnabled()
                || bi.formH.isEnabled()
                || bi.formI.isEnabled()
                || bi.formJ.isEnabled()
                || bi.formK.isEnabled()) {
            finish();
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
            //MainApp.endActivity(this, EndingActivity.class).putExtra("complete", false);
        } else {
            Toast.makeText(this, "ALL SECTIONS FILLED \n Good to GO GREEN!", Toast.LENGTH_SHORT).show();
        }

    }


    private void OpenFormFunc(int id) {
        Intent oF = new Intent();
        if (!MainApp.superuser) {
            switch (id) {
                case R.id.formB:
                    oF = new Intent(this, SectionBActivity.class);
                    break;
                case R.id.formC:
                    oF = new Intent(this, SectionC1Activity.class);
                    break;
                case R.id.formD:
                    oF = new Intent(this, SectionD1Activity.class);
                    break;
                case R.id.formE:
                    oF = new Intent(this, SectionE1Activity.class);
                    break;
                case R.id.formF:
                    oF = new Intent(this, SectionF1Activity.class);
                    break;
                case R.id.formG:
                    oF = new Intent(this, SectionG1Activity.class);
                    break;
                case R.id.formH:
                    oF = new Intent(this, form.getA10().equals("2") ? SectionH16Activity.class : SectionH2Activity.class);
                    break;
                case R.id.formI:
                    countI = 0;
                    oF = new Intent(this, SectionI1Activity.class);
                    break;
                case R.id.formJ:
                    if (form.getA10().equals("1")) {
                        oF = new Intent(this, SectionJ1Activity.class);
                    } /*else {
                        if (form.getDistrictType().equals("2") || form.getDistrictType().equals("4")) {
                            oF = new Intent(this, SectionJ1Activity.class);
                        } else if (!form.getDistrictType().equals("1")) {
                            oF = new Intent(this, SectionJ2Activity.class);
                        } else if (form.getDistrictType().equals("3") || form.getDistrictType().equals("4")) {
                            oF = new Intent(this, SectionJ3Activity.class);
                        } else if (form.getDistrictType().equals("1")) {
                            oF = new Intent(this, SectionJ4Activity.class);
                        }
                    }*/
                    break;
                case R.id.formK:
                    oF = new Intent(this, SectionK1Activity.class);
                    break;
            }
            startActivity(oF);
        } else {
            Toast.makeText(getApplicationContext(), "Please login Again!", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}