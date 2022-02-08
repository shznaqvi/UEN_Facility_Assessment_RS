package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionABinding;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionBBinding;

public class SectionBActivity extends AppCompatActivity {

    private static final String TAG = "SectionBActivity";
    ActivitySectionBBinding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}