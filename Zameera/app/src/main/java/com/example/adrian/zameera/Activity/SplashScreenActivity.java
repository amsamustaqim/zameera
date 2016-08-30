package com.example.adrian.zameera.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.adrian.zameera.R;

/**
 * Created by Asus on 8/29/2016.
 */
public class SplashScreenActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //creating thread that will sleep for 10 seconds
        Thread t=new Thread() {
            public void run() {

                try {
                    //sleep thread for 10 seconds, time in milliseconds
                    sleep(4000);

                    //start new activity
                    Intent i=new Intent(SplashScreenActivity.this,LoginActivity.class);
                    startActivity(i);

                    //destroying Splash activity
                    finish();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        //start thread
        t.start();

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
