package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import edu.aku.hassannaqvi.uen_facility_assessment.R;
import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionD3Binding;

public class SectionD3Activity extends AppCompatActivity {

    private static final String TAG = "SectionD3Activity";
    ActivitySectionD3Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d3);
        //bi.setCallback(this);
        bi.setForm(form);
    }
}