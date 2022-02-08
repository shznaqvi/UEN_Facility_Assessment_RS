package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionF1Binding;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionF2Binding;

public class SectionF2Activity extends AppCompatActivity {

    private static final String TAG = "SectionF2Activity";
    ActivitySectionF2Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}