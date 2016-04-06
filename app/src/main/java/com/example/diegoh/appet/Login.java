package com.example.diegoh.appet;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by DIEGOH on 2/04/2016
 * Copyright 2016 Sinapsis Soft.
 */
public class Login extends Activity implements View.OnClickListener{
    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        loadView();
    }
    public void loadView(){

        textView=(TextView)findViewById(R.id.textregistreAcount);
        textView.setOnClickListener(this);

        button=(Button)findViewById(R.id.btnLogin);
        button.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {

            super.onBackPressed();
            overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);

    }

    @Override
    public void onClick(View v) {
        int iSelectionActivity=0;
        switch(v.getId())
        {

            case R.id.textregistreAcount:
                iSelectionActivity=0;
                break;
            case R.id.btnLogin:

                iSelectionActivity=1;
                break;
        }
        startActivity(iSelectionActivity);
    }
    public void startActivity(int sType){
        Intent intent=null;
        switch(sType)
        {

            case 0:
                intent=new Intent(this,CreateAccount.class);
                break;
            case 1:

                intent=new Intent(this,MainActivity.class);
                break;
        }

        startActivity(intent);
        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);

    }
}
