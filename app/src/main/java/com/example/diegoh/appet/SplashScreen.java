package com.example.diegoh.appet;

import android.app.Activity;
import Class.*;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by DIEGOH on 2/04/2016
 * Copyright 2016 Sinapsis Soft.
 */
public class SplashScreen extends Activity implements View.OnClickListener {
    private ImageView imageView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        imageView=(ImageView)findViewById(R.id.imgLogo);
        imageView.setOnClickListener(this);
        imageView.setAnimation(AnimationGeneral.selectAnimation(this, 0));



    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,Login.class);
        startActivity(intent);
        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
    }
}
