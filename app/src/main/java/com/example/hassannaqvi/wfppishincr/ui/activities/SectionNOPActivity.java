package com.example.hassannaqvi.wfppishincr.ui.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.hassannaqvi.wfppishincr.R;
import com.example.hassannaqvi.wfppishincr.core.MainApp;
import com.example.hassannaqvi.wfppishincr.databinding.ActivitySectionNopBinding;
import com.example.hassannaqvi.wfppishincr.validation.validatorClass;

import org.json.JSONException;

public class SectionNOPActivity extends AppCompatActivity {

    ActivitySectionNopBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_nop);
        bi.setCallback(this);

        this.setTitle("Section N,O,P");
    }

    public void BtnContinue() {

        if (formValidate()) {

            try {
                saveData();
                if (updateDb()) {
                    Intent secNext = new Intent(this, EndingActivity.class).putExtra("complete",true);
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

        if (!validatorClass.EmptyRadioButton(this, bi.ccn01, bi.ccn01a, getString(R.string.ccn01))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.ccn02, bi.ccn02a, getString(R.string.ccn02))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.ccn03, bi.ccn03a, getString(R.string.ccn03))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.ccn04, bi.ccn04a, getString(R.string.ccn04))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.ccn05, bi.ccn05a, getString(R.string.ccn05))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.cco01, bi.cco01a, getString(R.string.cco01))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.cco02, bi.cco02a, getString(R.string.cco02))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.cco03, bi.cco03a, getString(R.string.cco03))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp01, bi.ccp01no, getString(R.string.ccp01))) {
            return false;
        }
        if (bi.ccp01yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp01b, getString(R.string.ccp01b))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.ccp01ngo, getString(R.string.ccp01ngo))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp02, bi.ccp02yes, getString(R.string.ccp02))) {
            return false;
        }
        if (bi.ccp02yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp02b, getString(R.string.ccp01b))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.ccp02ngo, getString(R.string.ccp01ngo))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp03, bi.ccp03no, getString(R.string.ccp01))) {
            return false;
        }
        if (bi.ccp03yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp03b, getString(R.string.ccp01b))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.ccp03ngo, getString(R.string.ccp01ngo))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp04, bi.ccp04no, getString(R.string.ccp01))) {
            return false;
        }
        if (bi.ccp04yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp04b, getString(R.string.ccp01b))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.ccp04ngo, getString(R.string.ccp01ngo))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp05, bi.ccp05no, getString(R.string.ccp01))) {
            return false;
        }
        if (bi.ccp05yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp05b, getString(R.string.ccp01b))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.ccp05ngo, getString(R.string.ccp01ngo))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp06, bi.ccp06no, getString(R.string.ccp01))) {
            return false;
        }
        if (bi.ccp06yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp06b, getString(R.string.ccp01b))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.ccp06ngo, getString(R.string.ccp01ngo))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp07, bi.ccp07no, getString(R.string.ccp01))) {
            return false;
        }
        if (bi.ccp07yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp07b, getString(R.string.ccp01b))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.ccp07ngo, getString(R.string.ccp01ngo))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp08, bi.ccp08no, getString(R.string.ccp01))) {
            return false;
        }
        if (bi.ccp08yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp08b, getString(R.string.ccp01b))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.ccp08ngo, getString(R.string.ccp01ngo))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp09, bi.ccp09no, getString(R.string.ccp01))) {
            return false;
        }
        if (bi.ccp09yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp09b, getString(R.string.ccp01b))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.ccp09ngo, getString(R.string.ccp01ngo))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp10, bi.ccp10no, getString(R.string.ccp01))) {
            return false;
        }
        if (bi.ccp10yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp10b, getString(R.string.ccp01b))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.ccp10ngo, getString(R.string.ccp01ngo))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp11, bi.ccp11no, getString(R.string.ccp01))) {
            return false;
        }
        if (bi.ccp11yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp11b, getString(R.string.ccp01b))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.ccp11ngo, getString(R.string.ccp01ngo))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.ccp12, bi.ccp12no, getString(R.string.ccp01))) {
            return false;
        }
        if (bi.ccp12yes.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ccp1296b, getString(R.string.ccp01b))) {
                return false;
            }
            return validatorClass.EmptyTextBox(this, bi.ccp1296ngo, getString(R.string.ccp01ngo));
        }


        return true;
    }

    public void BtnEnd() {

        MainApp.endActivity(this, this);

    }
}
