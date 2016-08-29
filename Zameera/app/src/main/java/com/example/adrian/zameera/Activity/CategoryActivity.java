package com.example.adrian.zameera.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.adrian.zameera.R;

/**
 * Created by Adrian on 8/7/2016.
 */
public class CategoryActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }


    @Override
    public void onClick(View v) {
        finish();
    }
}
