package com.example.attendanceproject.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;

import com.example.attendanceproject.Constant.Constant;
import com.example.attendanceproject.MainActivity;
import com.example.attendanceproject.R;
import com.example.attendanceproject.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {
    private ActivitySplashBinding layoutBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layoutBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
        getSupportActionBar().hide();

        /**
         * Handler for delay splash screen
         */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
            }
        }, Constant.DELAY_SPLASH);
    }
}