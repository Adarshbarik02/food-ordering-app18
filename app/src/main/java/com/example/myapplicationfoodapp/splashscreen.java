package com.example.myapplicationfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SplashScreen;

public class splashscreen extends AppCompatActivity {

    ImageView logo;
    TextView appName;
    TextView poweredby;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.appName);
        poweredby = findViewById(R.id.poweredby);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent =  new Intent(splashscreen.this,AccessoriesList.class);
                startActivity(intent);

            }
        },3000);


        Animation animation = AnimationUtils.loadAnimation(this,R.anim.splashscreenanimation);
        logo.startAnimation(animation);
        appName.startAnimation(animation);
        poweredby.startAnimation(animation);
    }
}