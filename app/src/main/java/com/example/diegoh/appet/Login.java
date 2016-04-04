package com.example.diegoh.appet;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.TextView;

/**
 * Created by DIEGOH on 2/04/2016
 * Copyright 2016 Sinapsis Soft.
 */
public class Login extends Activity implements View.OnClickListener{
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        loadView();
    }
    public void loadView(){

        textView=(TextView)findViewById(R.id.textregistreAcount);
        textView.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {

            super.onBackPressed();
            overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);

    }

    @Override
    public void onClick(View v) {
        startActivity();
    }
    public void startActivity(){

        Intent intent=new Intent(this,CreateAccount.class);
        startActivity(intent);
        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);

    }
}
