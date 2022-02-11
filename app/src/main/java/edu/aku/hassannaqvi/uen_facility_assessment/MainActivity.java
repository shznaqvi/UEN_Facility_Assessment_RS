package edu.aku.hassannaqvi.uen_facility_assessment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;
import edu.aku.hassannaqvi.uen_facility_assessment.database.AndroidDatabaseManager;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.uen_facility_assessment.models.Form;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.ChangePasswordActivity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.IdentificationActivity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.SyncActivity;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.lists.FormsReportCluster;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.lists.FormsReportDate;
import edu.aku.hassannaqvi.uen_facility_assessment.ui.lists.FormsReportPending;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.app_icon);
        bi.adminView.setVisibility(MainApp.admin ? View.VISIBLE : View.GONE);
        bi.toolbar.setSubtitle("Welcome, " + MainApp.user.getFullname() + (MainApp.admin ? " (Admin)" : "") + "!");
        invalidateOptionsMenu();
    }

    public void sectionPress(View view) {


        switch (view.getId()) {

            case R.id.openForm:
            case R.id.seca:
                MainApp.form = new Form();
                startActivity(new Intent(this, IdentificationActivity.class));
                break;
            case R.id.changePassword:
                startActivity(new Intent(this, ChangePasswordActivity.class));
                break;
            /*case R.id.seca:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionAActivity.class));
                break;
            case R.id.seca2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionBActivity.class));
                break;

            case R.id.seca3a:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionC1Activity.class));
                break;

            case R.id.seca3b:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionC2Activity.class));
                break;

            case R.id.seca4:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionD1Activity.class));
                break;
            case R.id.seca5:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionD2Activity.class));
                break;
            case R.id.secb1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionD3Activity.class));
                break;
            case R.id.secb2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionD4Activity.class));
                break;
            case R.id.secc1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionD5Activity.class));
                break;
            case R.id.secc2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionC2Activity.class));
                break;

            case R.id.secc3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionC3Activity.class));
                break;

            case R.id.secc4:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionC4Activity.class));
                break;
            case R.id.secc5:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionC5Activity.class));
                break;
            case R.id.secc6:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionC6Activity.class));
                break;
            case R.id.secd1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionD1Activity.class));
                break;
            case R.id.secd2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionD2Activity.class));
                break;
            case R.id.secd3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionD3Activity.class));
                break;
            case R.id.secd4:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionD4Activity.class));
                break;
            case R.id.sece1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionE1Activity.class));
                break;

            case R.id.e2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionE2Activity.class));
                break;
            case R.id.f1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF1Activity.class));
                break;
            case R.id.f2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF2Activity.class));
                break;*/

            case R.id.dbManager:
                startActivity(new Intent(this, AndroidDatabaseManager.class));
                break;


        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                intent = new Intent(MainActivity.this, AndroidDatabaseManager.class);
                startActivity(intent);
                break;
            case R.id.onSync:
                intent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(intent);
                break;
            case R.id.checkPendingForms:
                intent = new Intent(MainActivity.this, FormsReportPending.class);
                startActivity(intent);
                break;
            case R.id.formsReportDate:
                intent = new Intent(MainActivity.this, FormsReportDate.class);
                startActivity(intent);
                break;
            case R.id.changePassword:
                intent = new Intent(MainActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
                break;
            case R.id.formsReportCluster:
                intent = new Intent(MainActivity.this, FormsReportCluster.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        MenuItem action_database = menu.findItem(R.id.action_database);

        action_database.setVisible(MainApp.admin);
        return true;

    }

}