package edu.aku.hassannaqvi.uen_facility_assessment.ui;


import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.form;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleC;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleD;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleE;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleF;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleG;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleH;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleI;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleJ;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.moduleK;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.json.JSONException;

import edu.aku.hassannaqvi.uen_facility_assessment.R;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;
import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionMainBinding;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.sections.SectionAActivity;
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
    private static final String TAG = "SectionMainActivity";
    //public static String maternalCount = 0, paedsCount = 0;
    public static int countC2 = 0, countI = 0;
    ActivitySectionMainBinding bi;
    boolean flag = false;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_main);
        bi.setForm(form);
        db = MainApp.appInfo.getDbHelper();


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


        insertNewRecord();


    }

    @Override
    protected void onResume() {
        super.onResume();
        updateSections();
    }

    private void updateSections() {

        if (!form.getA22().isEmpty()) bi.checkedA.setVisibility(View.VISIBLE);

        // moduleB = db.getModuleBByUUid();
        if (!form.getB02().isEmpty()) bi.checkedB.setVisibility(View.VISIBLE);

        try {
            moduleC = db.getModuleCByUUid();

            if (!moduleC.getC01le().isEmpty()) bi.checkedC.setVisibility(View.VISIBLE);
            if (form.getA10().equals("2")) {
                bi.formC.setEnabled(false);
                bi.formF.setEnabled(false);
                bi.formG.setEnabled(false);
                flag = true;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ModuleC)" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }
        try {
            moduleD = db.getModuleDByUUid();
            if (!moduleD.getD8101().isEmpty()) bi.checkedD.setVisibility(View.VISIBLE);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ModuleD)" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }
        try {
            moduleE = db.getModuleEByUUid();
            if (!moduleE.getE0814().isEmpty()) bi.checkedE.setVisibility(View.VISIBLE);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ModuleE)" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }
        try {
            moduleF = db.getModuleFByUUid();
            if (!moduleF.getF0701aad0fqx().isEmpty()) bi.checkedF.setVisibility(View.VISIBLE);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ModuleF)" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }
        try {
            moduleG = db.getModuleGByUUid();
            if (!moduleG.getG0403270sm().isEmpty()) bi.checkedG.setVisibility(View.VISIBLE);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ModuleG)" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }
        try {
            moduleH = db.getModuleHByUUid();
            if (!moduleH.getH1704().isEmpty() || !moduleH.getH1605xxx().isEmpty() || !moduleH.getH1501z0dy().isEmpty())
                bi.checkedH.setVisibility(View.VISIBLE);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ModuleH)" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }
        try {
            moduleI = db.getModuleIByUUid();
            if (!moduleI.getI011696x().isEmpty()) bi.checkedI.setVisibility(View.VISIBLE);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ModuleI)" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }
        try {
            moduleJ = db.getModuleJByUUid();
            if (!moduleJ.getJ0901fe().isEmpty()) bi.checkedJ.setVisibility(View.VISIBLE);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ModuleJ)" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }
        try {
            moduleK = db.getModuleKByUUid();
            if (!moduleK.getK711().isEmpty()) bi.checkedK.setVisibility(View.VISIBLE);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ModuleK)" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }


            /*if (!form.getsH().isEmpty() && (new JSONObject(form.getsH()).has("h1605xx") || new JSONObject(form.getsH()).has("h1501z0dn"))) {
                //bi.formH.setEnabled(false);
                bi.checkedH.setVisibility(View.VISIBLE);
            }*/


    }


    public void openForm(View v) {
        OpenFormFunc(v.getId());
    }


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


/*    private boolean updateDB() {
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
    }*/

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
                case R.id.formA:
                    oF = new Intent(this, SectionAActivity.class);
                    break;
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
        Toast.makeText(this, "SORRY! Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }


}