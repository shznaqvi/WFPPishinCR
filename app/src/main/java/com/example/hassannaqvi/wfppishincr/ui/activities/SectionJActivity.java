package com.example.hassannaqvi.wfppishincr.ui.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.hassannaqvi.wfppishincr.R;
import com.example.hassannaqvi.wfppishincr.core.DatabaseHelper;
import com.example.hassannaqvi.wfppishincr.core.MainApp;
import com.example.hassannaqvi.wfppishincr.databinding.ActivitySectionJBinding;
import com.example.hassannaqvi.wfppishincr.validation.ClearClass;

import org.json.JSONException;
import org.json.JSONObject;

public class SectionJActivity extends AppCompatActivity {


    ActivitySectionJBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_j);
        bi.setCallback(this);
        this.setTitle("Section J");


        //=========================skip patterns=======================================

        bi.ccj03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i != R.id.ccj03a) {
                    bi.fldgrpccj04.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj04, false);
                    bi.fldgrpccj05.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj05, false);
                    bi.fldgrpccj06.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj06, false);
                    bi.fldgrpccj07.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj07, false);
                    bi.fldgrpccj08.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj08, false);
                    bi.fldgrpccj09.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj09, false);
                    bi.fldgrpccj10.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj10, false);


                } else {
                    bi.fldgrpccj04.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj04, true);
                    bi.fldgrpccj05.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj05, true);
                    bi.fldgrpccj06.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj06, true);
                    bi.fldgrpccj07.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj07, true);
                    bi.fldgrpccj08.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj08, true);
                    bi.fldgrpccj09.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj09, true);
                    bi.fldgrpccj10.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj10, true);
                }

            }
        });

        bi.ccj09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i != R.id.ccj09a) {
                    bi.fldgrpccj10.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj10, false);
                } else {
                    bi.fldgrpccj10.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj10, true);
                }

            }
        });

        bi.ccj11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != R.id.ccj11a) {
                    bi.fldgrpccj12.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj12, false);
                    bi.fldgrpccj13.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj13, false);

                } else {
                    bi.fldgrpccj12.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj12, true);
                    bi.fldgrpccj13.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj13, true);
                }
            }
        });

        bi.ccj14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i != R.id.ccj14a) {
                    bi.fldgrpccj15.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj15, false);
                } else {
                    bi.fldgrpccj15.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj15, true);
                }
            }
        });
        bi.ccj18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.ccj18a) {
                    bi.fldgrpccj19.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj19, false);
                    bi.fldgrpccj20.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj20, false);
                    bi.fldgrpccj21.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj21, false);
                    bi.fldgrpccj22.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj22, false);
                    bi.fldgrpccj23.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj23, false);
                    bi.fldgrpccj24.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj24, false);
                    bi.fldgrpccj25.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj25, false);
                    bi.fldgrpccj26.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj26, false);
                    bi.fldgrpccj27.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj27, false);
                    bi.fldgrpccj28.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj28, false);

                } else {
                    bi.fldgrpccj19.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj19, true);
                    bi.fldgrpccj20.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj20, true);
                    bi.fldgrpccj21.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj21, true);
                    bi.fldgrpccj22.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj22, true);
                    bi.fldgrpccj23.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj23, true);
                    bi.fldgrpccj24.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj24, true);
                    bi.fldgrpccj25.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj25, true);
                    bi.fldgrpccj26.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj26, true);
                    bi.fldgrpccj27.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj27, true);
                    bi.fldgrpccj28.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj28, true);
                }

            }
        });

        bi.ccj2298.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    bi.fldgrpccj23.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj23, false);
                } else {
                    bi.fldgrpccj23.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj23, true);
                }
            }
        });

        bi.ccj24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.ccj24b) {
                    bi.fldgrpccj25.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj25, false);
                } else {
                    bi.fldgrpccj25.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj25, true);
                }
            }
        });

        bi.ccj2697.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {

                    bi.fldgrpccj27.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj27, false);
                    bi.fldgrpccj28.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldgrpccj28, false);

                } else {

                    bi.fldgrpccj27.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj27, true);
                    bi.fldgrpccj28.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldgrpccj28, true);
                }
            }
        });


    }

    public void BtnContinue() {

        if (formValidate()) {

            try {
                saveData();
                if (updateDb()) {
                    Intent secNext = new Intent(this, SectionKActivity.class);
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
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSJ();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void saveData() throws JSONException {
        JSONObject sJ = new JSONObject();

        MainApp.fc.setsJ(String.valueOf(sJ));
        Toast.makeText(this, "Validation Successful", Toast.LENGTH_SHORT).show();

    }

    private boolean formValidate() {

//        if(!validatorClass.EmptyTextBox(this,bi.ccj01a,getString(R.string.ccj01))){
//            return false;
//        }
//
//        if(!validatorClass.EmptyTextBox(this,bi.ccj01a,getString(R.string.ccj01))){
//            return false;
//        }


        return true;
    }

    public void BtnEnd() {


        MainApp.endActivity(this, this);
    }
}
