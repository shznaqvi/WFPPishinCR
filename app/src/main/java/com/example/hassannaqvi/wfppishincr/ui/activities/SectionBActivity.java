package com.example.hassannaqvi.wfppishincr.ui.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.hassannaqvi.wfppishincr.R;
import com.example.hassannaqvi.wfppishincr.core.MainApp;
import com.example.hassannaqvi.wfppishincr.databinding.ActivitySectionBBinding;
import com.example.hassannaqvi.wfppishincr.utils.DateUtils;
import com.example.hassannaqvi.wfppishincr.validation.validatorClass;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;

public class SectionBActivity extends AppCompatActivity {

    ActivitySectionBBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b);
        bi.setCallback(this);
        this.setTitle("Section B");
       /* setupViews();
        skipPatterns();*/
    }
/*
    public void skipPatterns() {

        bi.wrb04.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.wrb04.getText().toString().isEmpty()) {
                    bi.wrb03.setEnabled(false);
                    bi.wrb033.setEnabled(false);
                    bi.wrb033.setText(null);
                    bi.wrb03.setText(null);

                    // bi.wrb06.clearCheck();
                    for (int i = 0; i < bi.wrb06.getChildCount(); i++) {
                        View v = bi.wrb06.getChildAt(i);
                        if (v instanceof RadioButton) {
                            v.setEnabled(false);
                        }
                    }

                    //bi.wrb07.clearCheck();
                    for (int i = 0; i < bi.wrb07.getChildCount(); i++) {
                        View v = bi.wrb07.getChildAt(i);
                        if (v instanceof RadioButton) {
                            v.setEnabled(false);
                        }
                    }

                } else {
                    if(Integer.valueOf(bi.wrb04.getText().toString()) < 3){

                        bi.wrb03.setEnabled(true);
                        bi.wrb03.setText(null);
                        bi.wrb033.setEnabled(true);
                        // bi.wrb033.setText(null);
                        switch (Integer.valueOf(bi.wrb04.getText().toString())) {
                            case 1:
                                bi.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -1));
                                break;
                            case 2:
                                bi.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -2));
                                break;
                            case 3:
                                bi.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -3));
                                break;
                            case 4:
                                bi.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -4));
                                break;
                        }


                        bi.wrb05.clearCheck();
                        bi.wrb06.clearCheck();
                        View v = bi.fldGrpccb05.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        bi.wrb06a.setEnabled(true);
                        //bi.wrb06b.setEnabled(true);
                        bi.wrb07.clearCheck();
                        v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        bi.wrb07a.setChecked(true);


                    } else if (Integer.valueOf(bi.wrb04.getText().toString()) < 5) {
                        bi.wrb03.setEnabled(true);
                        bi.wrb03.setText(null);
                        bi.wrb033.setEnabled(true);
                        // bi.wrb033.setText(null);
                        switch (Integer.valueOf(bi.wrb04.getText().toString())) {
                            case 1:
                                bi.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -1));
                                break;
                            case 2:
                                bi.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -2));
                                break;
                            case 3:
                                bi.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -3));
                                break;
                            case 4:
                                bi.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -4));
                                break;
                        }


                        bi.wrb05.clearCheck();
                        bi.wrb06.clearCheck();
                        View v = bi.fldGrpccb05.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        bi.wrb06a.setEnabled(true);
                        bi.wrb06b.setEnabled(true);
                        bi.wrb07.clearCheck();
                        v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (bi.ccb02a.isChecked()) {
                            bi.wrb07b.setEnabled(false);
                        } else if (bi.ccb02b.isChecked()) {
                            bi.wrb07b.setEnabled(true);
                        }


                    } else if (Integer.valueOf(bi.wrb04.getText().toString()) < 11) {

                        bi.wrb03.setEnabled(false);
                        bi.wrb033.setEnabled(false);
                        bi.wrb03.setText(null);
                        bi.wrb033.setText(null);
                        bi.wrb05.clearCheck();
                        bi.wrb05e.setChecked(true);

                        bi.wrb06.clearCheck();
                        View v = bi.fldGrpccb05.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        bi.wrb06a.setEnabled(true);
                        bi.wrb06b.setEnabled(true);
                        bi.wrb06c.setEnabled(true);
                        bi.wrb07.clearCheck();
                        //bi.wrb07a.setChecked(true);
                        v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (bi.ccb02a.isChecked()) {
                            bi.wrb07b.setEnabled(false);
                        } else if (bi.ccb02b.isChecked()) {
                            bi.wrb07b.setEnabled(true);
                        }

                    } else if (Integer.valueOf(bi.wrb04.getText().toString()) < 14) {

                        bi.wrb03.setEnabled(false);
                        bi.wrb033.setEnabled(false);
                        bi.wrb03.setText(null);
                        bi.wrb033.setText(null);
                        bi.wrb05.clearCheck();
                        bi.wrb05e.setChecked(true);

                        bi.wrb06.clearCheck();
                        View v = bi.fldGrpccb05.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        bi.wrb06a.setEnabled(true);
                        bi.wrb06b.setEnabled(true);
                        bi.wrb06c.setEnabled(true);
                        bi.wrb06d.setEnabled(true);
                        bi.wrb07.clearCheck();
                        v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (bi.ccb02a.isChecked()) {
                            bi.wrb07b.setEnabled(false);
                        } else if (bi.ccb02b.isChecked()) {
                            bi.wrb07b.setEnabled(true);
                        }

                    } else if (Integer.valueOf(bi.wrb04.getText().toString()) < 16) {

                        bi.wrb03.setEnabled(false);
                        bi.wrb033.setEnabled(false);
                        bi.wrb03.setText(null);
                        bi.wrb033.setText(null);
                        bi.wrb05.clearCheck();
                        bi.wrb05e.setChecked(true);

                        bi.wrb06.clearCheck();
                        View v = bi.fldGrpccb05.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        bi.wrb06a.setEnabled(true);
                        bi.wrb06b.setEnabled(true);
                        bi.wrb06c.setEnabled(true);
                        bi.wrb06d.setEnabled(true);
                        bi.wrb06e.setEnabled(true);
                        bi.wrb07.clearCheck();

                        v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (bi.ccb02a.isChecked()) {
                            bi.wrb07b.setEnabled(false);
                        } else if (bi.ccb02b.isChecked()) {
                            bi.wrb07b.setEnabled(true);
                        }
                    } else if (Integer.valueOf(bi.wrb04.getText().toString()) < 18) {
                        bi.wrb03.setEnabled(false);
                        bi.wrb033.setEnabled(false);
                        bi.wrb03.setText(null);
                        bi.wrb033.setText(null);
                        bi.wrb05.clearCheck();
                        bi.wrb05e.setChecked(true);

                        bi.wrb06.clearCheck();
//                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
//                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
//                        }
                        bi.wrb06a.setEnabled(true);
                        bi.wrb06b.setEnabled(true);
                        bi.wrb06c.setEnabled(true);
                        bi.wrb06d.setEnabled(true);
                        bi.wrb06e.setEnabled(true);
                        bi.wrb06f.setEnabled(true);
                        bi.wrb07.clearCheck();

                        View v = bi.fldGrpccb05.getChildAt(0);
                        v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (bi.ccb02a.isChecked()) {
                            bi.wrb07b.setEnabled(false);
                        } else if (bi.ccb02b.isChecked()) {
                            bi.wrb07b.setEnabled(true);
                        }
                    } else if (Integer.valueOf(bi.wrb04.getText().toString()) < 20) {
                        bi.wrb03.setEnabled(false);
                        bi.wrb033.setEnabled(false);
                        bi.wrb03.setText(null);
                        bi.wrb033.setText(null);
                        bi.wrb05.clearCheck();
                        bi.wrb05e.setChecked(true);

                        bi.wrb06.clearCheck();
                        View v = bi.fldGrpccb05.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        bi.wrb06a.setEnabled(true);
                        bi.wrb06b.setEnabled(true);
                        bi.wrb06c.setEnabled(true);
                        bi.wrb06d.setEnabled(true);
                        bi.wrb06e.setEnabled(true);
                        bi.wrb06f.setEnabled(true);
                        bi.wrb06g.setEnabled(true);
                        bi.wrb07.clearCheck();

                        v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (bi.ccb02a.isChecked()) {
                            bi.wrb07b.setEnabled(false);
                        } else if (bi.ccb02b.isChecked()) {
                            bi.wrb07b.setEnabled(true);
                        }
                    } else {
                        bi.wrb03.setEnabled(false);
                        bi.wrb033.setEnabled(false);
                        bi.wrb03.setText(null);
                        bi.wrb033.setText(null);
                        bi.wrb05.clearCheck();
                        bi.wrb05e.setChecked(true);

                        bi.wrb06.clearCheck();
                        View v = bi.fldGrpccb05.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        bi.wrb06a.setEnabled(true);
                        bi.wrb06b.setEnabled(true);
                        bi.wrb06c.setEnabled(true);
                        bi.wrb06d.setEnabled(true);
                        bi.wrb06e.setEnabled(true);
                        bi.wrb06f.setEnabled(true);
                        bi.wrb06g.setEnabled(true);
                        bi.wrb06h.setEnabled(true);
                        bi.wrb07.clearCheck();

                        v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (bi.ccb02a.isChecked()) {
                            bi.wrb07b.setEnabled(false);
                        } else if (bi.ccb02b.isChecked()) {
                            bi.wrb07b.setEnabled(true);
                        }
                    }

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        bi.wrb033.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (!bi.wrb033.getText().toString().equalsIgnoreCase("")) {
                    if (Integer.valueOf(bi.wrb04.getText().toString()) == 1) {
                        switch (Integer.valueOf(bi.wrb033.getText().toString())) {
                            case 0:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -12, 0));
                                break;
                            case 1:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -13, 0));
                                break;
                            case 2:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -14, 0));
                                break;
                            case 3:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -15, 0));
                                break;
                            case 4:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -16, 0));
                                break;
                            case 5:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -17, 0));
                                break;
                            case 6:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -18, 0));
                                break;
                            case 7:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -19, 0));
                                break;
                            case 8:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -20, 0));
                                break;
                            case 9:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -21, 0));
                                break;
                            case 10:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -22, 0));
                                break;
                            case 11:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -23, 0));
                                break;
                            case 12:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -24, 0));
                                break;

                        }

                    } else if (Integer.valueOf(bi.wrb04.getText().toString()) == 2) {
                        switch (Integer.valueOf(bi.wrb033.getText().toString())) {
                            case 0:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -12, 0));
                                break;
                            case 1:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -13, -1));
                                break;
                            case 2:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -14, -1));
                                break;
                            case 3:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -15, -1));
                                break;
                            case 4:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -16, -1));
                                break;
                            case 5:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -17, -1));
                                break;
                            case 6:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -18, -1));
                                break;
                            case 7:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -19, -1));
                                break;
                            case 8:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -20, -1));
                                break;
                            case 9:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -21, -1));
                                break;
                            case 10:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -22, -1));
                                break;
                            case 11:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -23, -1));
                                break;
                            case 12:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -24, -1));
                                break;

                        }

                    } else if (Integer.valueOf(bi.wrb04.getText().toString()) == 3) {
                        switch (Integer.valueOf(bi.wrb033.getText().toString())) {
                            case 0:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -12, 0));
                                break;
                            case 1:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -13, -3));
                                break;
                            case 2:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -14, -2));
                                break;
                            case 3:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -15, -2));
                                break;
                            case 4:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -16, -2));
                                break;
                            case 5:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -17, -2));
                                break;
                            case 6:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -18, -2));
                                break;
                            case 7:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -19, -2));
                                break;
                            case 8:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -20, -2));
                                break;
                            case 9:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -21, -2));
                                break;
                            case 10:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -22, -2));
                                break;
                            case 11:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -23, -2));
                                break;
                            case 12:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -24, -2));
                                break;

                        }

                    } else if (Integer.valueOf(bi.wrb04.getText().toString()) == 4) {
                        switch (Integer.valueOf(bi.wrb033.getText().toString())) {
                            case 0:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -12, 0));
                                break;
                            case 1:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -13, -3));
                                break;
                            case 2:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -14, -3));
                                break;
                            case 3:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -15, -3));
                                break;
                            case 4:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -16, -3));
                                break;
                            case 5:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -17, -3));
                                break;
                            case 6:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -18, -3));
                                break;
                            case 7:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -19, -3));
                                break;
                            case 8:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -20, -3));
                                break;
                            case 9:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -21, -3));
                                break;
                            case 10:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -22, -3));
                                break;
                            case 11:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -23, -3));
                                break;
                            case 12:
                                bi.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -24, -3));
                                break;

                        }

                    }


                }


            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });

        bi.wrb06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                if (i == R.id.wrb06c) {
//                    if (bi.ccb02a.isChecked()) {
//
//                        for (int j = 0; j < bi.wrb07.getChildCount(); j++) {
//
//                            bi.wrb07.getChildAt(j).setEnabled(false);
//
//                        }
//
//                    } else {
//
//                        for (int j = 0; j < bi.wrb07.getChildCount(); j++) {
//
//                            bi.wrb07.getChildAt(j).setEnabled(true);
//
//                        }
//
//                    }
//
//
//                }


            }
        });

        bi.ccb02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.ccb02a) {
                    if (bi.wrb04.getText().toString().equalsIgnoreCase("") || Integer.valueOf(bi.wrb04.getText().toString()) >= 3) {
                        View v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }
                        bi.wrb07b.setEnabled(false);
                        bi.wrb07.clearCheck();

                    } else {
                        View v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        bi.wrb07a.setChecked(true);
                    }
//

                } else if (i == R.id.ccb02b) {
                    if (bi.wrb04.getText().toString().equalsIgnoreCase("") || Integer.valueOf(bi.wrb04.getText().toString()) >= 3) {
                        View v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }
                        bi.wrb07b.setEnabled(true);
                        bi.wrb07.clearCheck();
                    } else {
                        View v = bi.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        bi.wrb07a.setChecked(true);
                    }


                }


            }
        });


//        bi.wrb04.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                if () {
//
//                    if ( && ) {
//
//
//                    }
//
//                }
//
//            }
//
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });


    }

    public void setupViews() {
        bi.wrb03.setManager(getSupportFragmentManager());
        bi.wrb03.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis()));
    }

    public void BtnAddMember() {
        if (ValidateForm()) {
            try {
                SaveDrafts();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDb()) {
                finish();

                startActivity(new Intent(this, SectionBActivity.class));

            } else {
                Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void BtnContinue() {
        if (ValidateForm()) {
            try {
                SaveDrafts();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDb()) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder
                        .setMessage("Are you sure to continue for next section?")
                        .setCancelable(false)
                        .setPositiveButton("Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        if (SectionAActivity.pwList.size() > 0) {
                                            serial_no = 0;
                                            startActivity(new Intent(SectionBActivity.this, SectionCActivity.class));
                                        } else {
                                            serial_no = 0;
                                            startActivity(new Intent(SectionBActivity.this, EndingActivity.class).putExtra("complete", true));
                                        }
                                        finish();
                                    }
                                });
                alertDialogBuilder.setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();

            } else {
                Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void BtnEnd() {
        MainApp.endActivity(this, this);
    }

    public boolean ValidateForm() {

//        01
        if (!validatorClass.EmptyTextBox(this, bi.ccb01, getString(R.string.ccb01))) {
            return false;
        }
//        02
        if (!validatorClass.EmptyRadioButton(this, bi.ccb02, bi.ccb02b, getString(R.string.ccb02))) {
            return false;
        }
//        04
        if (!validatorClass.EmptyTextBox(this, bi.wrb04, getString(R.string.wrb04))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrb04, 0, 99, getString(R.string.wrb04), " AGE")) {
            return false;
        }
//        03
        if (Integer.valueOf(bi.wrb04.getText().toString()) < 5) {

            if (!validatorClass.EmptyTextBox(this, bi.wrb033, getString(R.string.wrb033))) {

                return false;
            }

            if (!validatorClass.RangeTextBox(this, bi.wrb033, 0, 12, "Month can not be greater than 12", "Number")) {
                return false;
            }

            if (!validatorClass.EmptyTextBox(this, bi.wrb03, getString(R.string.wrb03))) {
                return false;
            }
        }
//        05
//        if (Integer.valueOf(bi.wrb04.getText().toString()) > 10) {
//            if (!validatorClass.EmptyRadioButton(this, bi.wrb05, bi.wrb06e, getString(R.string.wrb05))) {
//                return false;
//            }
//        }
//        06
        if (!validatorClass.EmptyRadioButton(this, bi.wrb06, bi.wrb06h, getString(R.string.wrb06))) {
            return false;
        }
//        07
        return validatorClass.EmptyRadioButton(this, bi.wrb07, bi.wrb07k, getString(R.string.wrb07));
    }

    private void SaveDrafts() throws JSONException {

        serial_no++;

        MainApp.fmc = new FamilyMembersContract();
        MainApp.fmc.setDevicetagID(MainApp.fc.getDevicetagID());
        MainApp.fmc.setFormDate(MainApp.fc.getFormDate());
        MainApp.fmc.setInterviewer1(MainApp.fc.getInterviewer01());
        MainApp.fmc.setInterviewer2(MainApp.fc.getInterviewer02());
        MainApp.fmc.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.fmc.setApp_ver(MainApp.fc.getAppversion());
        MainApp.fmc.set_UUID(MainApp.fc.getUID());

        MainApp.fmc.setSerialNo(String.valueOf(serial_no));
        MainApp.fmc.setName(bi.ccb01.getText().toString());

        JSONObject sB = new JSONObject();

        sB.put("ccb01", bi.ccb01.getText().toString());
        sB.put("serial_no", String.valueOf(serial_no));
        sB.put("ccb02", bi.ccb02a.isChecked() ? "1" : bi.ccb02b.isChecked() ? "2" : "0");
        sB.put("wrb03", bi.wrb03.getText().toString());
        sB.put("wrb04m", bi.wrb033.getText().toString());
        sB.put("wrb04", bi.wrb04.getText().toString());
        // sB.put("wrb05", bi.wrb05a.isChecked() ? "1" : bi.wrb05b.isChecked() ? "2" : bi.wrb05c.isChecked() ? "3" : bi.wrb05d.isChecked() ? "4"
        //: bi.wrb05e.isChecked() ? "5" : "0");
        sB.put("wrb06", bi.wrb06a.isChecked() ? "1" : bi.wrb06b.isChecked() ? "2" : bi.wrb06c.isChecked() ? "3" : bi.wrb06d.isChecked() ? "4"
                : bi.wrb06e.isChecked() ? "5" : bi.wrb06f.isChecked() ? "6" : bi.wrb06g.isChecked() ? "7" : bi.wrb06h.isChecked() ? "8"
                : "0");
        sB.put("wrb07", bi.wrb07a.isChecked() ? "1" : bi.wrb07b.isChecked() ? "2" : bi.wrb07c.isChecked() ? "3" : bi.wrb07d.isChecked() ? "4"
                : bi.wrb07e.isChecked() ? "5" : bi.wrb07f.isChecked() ? "6" : bi.wrb07g.isChecked() ? "7" : bi.wrb07h.isChecked() ? "8"
                : bi.wrb07i.isChecked() ? "9" : bi.wrb07j.isChecked() ? "10" : bi.wrb07k.isChecked() ? "11" : "0");

        MainApp.fmc.setsB(String.valueOf(sB));


//        Functionality
        if (bi.ccb02b.isChecked() && Integer.valueOf(bi.wrb04.getText().toString()) >= 14 && Integer.valueOf(bi.wrb04.getText().toString()) < 50 ) {
            SectionAActivity.pwList.add(MainApp.fmc);
        }

    }

    private boolean UpdateDb() {
        DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addFamilyMembers(MainApp.fmc);
        MainApp.fmc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            MainApp.fmc.set_UID(
                    (MainApp.fmc.getDeviceId() + MainApp.fmc.get_ID()));
            db.updateFamilyMemberID();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }
*/
}
