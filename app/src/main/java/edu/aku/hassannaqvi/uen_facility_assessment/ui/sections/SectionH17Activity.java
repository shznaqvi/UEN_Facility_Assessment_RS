package edu.aku.hassannaqvi.uen_facility_assessment.ui.sections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.uen_facility_assessment.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionH17Binding;
import edu.aku.hassannaqvi.uen_facility_assessment.databinding.ActivitySectionH1Binding;

public class SectionH17Activity extends AppCompatActivity {

    private static final String TAG = "SectionH17Activity";
    ActivitySectionH17Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}