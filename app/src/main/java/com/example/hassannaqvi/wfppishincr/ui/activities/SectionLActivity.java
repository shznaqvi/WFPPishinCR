package com.example.hassannaqvi.wfppishincr.ui.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

import com.example.hassannaqvi.wfppishincr.R;
import com.example.hassannaqvi.wfppishincr.core.MainApp;
import com.example.hassannaqvi.wfppishincr.databinding.ActivitySectionLBinding;
import com.example.hassannaqvi.wfppishincr.validation.ClearClass;

import org.json.JSONException;

public class SectionLActivity extends AppCompatActivity {

    ActivitySectionLBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_l);
        bi.setCallback(this);

        this.setTitle("Section L");


        //============================skip patterns==============================================

        bi.ccl01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.ccl01b || i == R.id.ccl01c || i == R.id.ccl01d) {
                    bi.fldgrpccl02.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccl02, false);
                    bi.fldgrpccl03.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccl03, false);
                } else {
                    bi.fldgrpccl02.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccl02, true);
                    bi.fldgrpccl03.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccl03, true);
                }
            }
        });

        bi.ccl04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.ccl04b) {
                    bi.fldgrpccl05.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccl05, false);
                } else {
                    bi.fldgrpccl05.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccl05, true);
                }
            }
        });


    }

    public void BtnContinue() {

        if (formValidate()) {

            try {
                saveData();
                if (updateDb()) {
                    Intent secNext = new Intent(this, SectionMActivity.class);
                    secNext.putExtra("check", false);
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


    }

    private boolean formValidate() {


        return true;
    }

    public void BtnEnd() {
        MainApp.endActivity(this, this);


    }
}
