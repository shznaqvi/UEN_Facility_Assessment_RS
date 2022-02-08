package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import edu.aku.hassannaqvi.uen_facility_assessment.R;
import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionF1Binding;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionF3Binding;

public class SectionF3Activity extends AppCompatActivity {

    private static final String TAG = "SectionF3Activity";
    ActivitySectionF3Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f3);
        //bi.setCallback(this);
        bi.setForm(form);
    }
}