package com.example.diegoh.appet;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
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

    }

    @Override
    public void onClick(View v) {

    }
}
