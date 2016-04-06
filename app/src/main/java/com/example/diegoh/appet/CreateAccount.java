package com.example.diegoh.appet;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Calendar;
import Class.General;
import  Class.DatePickerFragment;
/**
 * Created by DIEGOH on 2/04/2016
 * Copyright 2016 Sinapsis Soft.
 */
public class CreateAccount extends Activity implements View.OnClickListener{
    private Button button;
    private ImageView imgDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);
        button=(Button)findViewById(R.id.btnLogin);
        button.setOnClickListener(this);

        imgDate=(ImageView)findViewById(R.id.imgDate);
        imgDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.btnLogin:
            break;
            case R.id.imgDate:
                Toast.makeText(this,General.dialogCalendar(this),Toast.LENGTH_LONG).show();
                break;
        }

    }

    @Override
    public void onBackPressed() {

            super.onBackPressed();
            overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);



    }



}
