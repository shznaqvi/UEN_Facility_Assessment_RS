package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionH15Binding;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionH1Binding;

public class SectionH15Activity extends AppCompatActivity {

    private static final String TAG = "SectionH15Activity";
    ActivitySectionH15Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}