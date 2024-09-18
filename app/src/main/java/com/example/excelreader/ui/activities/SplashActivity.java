package com.example.excelreader.ui.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.excelreader.BaseActivity;
import com.example.excelreader.GlobalConstant;
import com.example.excelreader.R;
import com.example.excelreader.SharedPreferenceUtils;

public class SplashActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (getIntent() != null && getIntent().getData() != null) {

                    Uri uri = getIntent().getData();
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    intent.putExtra(GlobalConstant.KEY_DATA_FROM_OUTSIDE, uri.toString());
                    Log.i("Thang123", uri.toString());
                    startActivity(intent);
                    finish();
                } else {
                    if (!SharedPreferenceUtils.getInstance(SplashActivity.this).getBoolean(GlobalConstant.LANGUAGE_SET, false)) {

                        startActivity(new Intent(SplashActivity.this, LanguageActivity.class));
                        finish();
                    } else {

                        startActivity(new Intent(SplashActivity.this, MainActivity.class));
                        finish();

                    }
                }
            }
        }, 3500);


    }


}