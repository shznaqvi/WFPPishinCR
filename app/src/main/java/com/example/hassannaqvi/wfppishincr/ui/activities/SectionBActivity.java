package com.example.hassannaqvi.wfppishincr.ui.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.hassannaqvi.wfppishincr.R;
import com.example.hassannaqvi.wfppishincr.databinding.ActivitySectionBBinding;

public class SectionBActivity extends AppCompatActivity {

    ActivitySectionBBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b);
    }
}
