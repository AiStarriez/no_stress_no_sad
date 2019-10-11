package com.example.no_stress_no_sad_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.Window;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;


import pl.droidsonroids.gif.GifImageButton;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
        initFont();

        GifImageButton stressButton = (GifImageButton)findViewById(R.id.stressButton);
        stressButton.setOnClickListener(this);
        GifImageButton sadBut = (GifImageButton)findViewById(R.id.sadButton2);
        sadBut.setOnClickListener(this);
        GifImageButton contactBut = (GifImageButton)findViewById(R.id.contactButton5);
        contactBut.setOnClickListener(this);
        GifImageButton feelbetterButton6 = (GifImageButton)findViewById(R.id.feelbetterButton6);
        feelbetterButton6.setOnClickListener(this);
        Button allmenu = (Button)findViewById(R.id.allmenu);
        allmenu.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.stressButton:
                // do your code
                Intent back = new Intent(MainActivity.this, Infomation.class);
                startActivity(back);
                break;

            case R.id.sadButton2:
                // code for button when user clicks buttonOne.
                Intent intent = new Intent(MainActivity.this, WhatIsSad.class);
                startActivity(intent);
                break;

            case R.id.contactButton5:
                // code for button when user clicks buttonOne.
                Intent contactintent = new Intent(MainActivity.this, Contact.class);
                startActivity(contactintent);
                break;

            case R.id.feelbetterButton6:
                // code for button when user clicks buttonOne.
                Intent feelbetterButton6 = new Intent(MainActivity.this, YouTube.class);
                startActivity(feelbetterButton6);
                break;

            case R.id.allmenu:
                // code for button when user clicks buttonOne.
                Intent allmenuintent = new Intent(MainActivity.this, AllMenu.class);
                startActivity(allmenuintent);
                break;

            default:
                break;
        }
    }

    private void initFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("assets/font/THSarabunNew")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }


}
