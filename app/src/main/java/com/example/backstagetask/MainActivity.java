package com.example.backstagetask;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int SPLASH_DISPLAY_LENGTH = 3000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getBaseContext(), NewActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
