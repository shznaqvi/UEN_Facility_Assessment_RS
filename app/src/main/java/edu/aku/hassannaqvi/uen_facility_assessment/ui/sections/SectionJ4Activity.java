package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.form;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.uen_facility_assessment.R;
import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionJ1Binding;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionJ4Binding;

public class SectionJ4Activity extends AppCompatActivity {

    private static final String TAG = "SectionJ4Activity";
    ActivitySectionJ4Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_j4);
        //bi.setCallback(this);
        bi.setForm(form);
    }
}