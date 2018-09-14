package com.example.hassannaqvi.wfppishincr.ui.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.hassannaqvi.wfppishincr.R;
import com.example.hassannaqvi.wfppishincr.core.MainApp;
import com.example.hassannaqvi.wfppishincr.databinding.ActivitySectionNopBinding;

import org.json.JSONException;
import org.json.JSONObject;

public class SectionNOPActivity extends AppCompatActivity {

    ActivitySectionNopBinding bi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_nop);
        bi.setCallback(this);
    }

    public void BtnContinue() {

        if (formValidate()) {

            try {
                saveData();
                if (updateDb()) {
                    Intent secNext = new Intent(this, EndingActivity.class);
                    startActivity(secNext);
                    finish();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }


    }

    public boolean updateDb() {

        return true;
    }

    public void saveData() {

        JSONObject sNop = new JSONObject();


    }

    private boolean formValidate() {


        return true;
    }

    public void BtnEnd() {

        MainApp.endActivity(this, this);

    }
}
