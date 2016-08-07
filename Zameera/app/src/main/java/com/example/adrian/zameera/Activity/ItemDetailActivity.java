package com.example.adrian.zameera.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.example.adrian.zameera.R;

/**
 * Created by Adrian on 8/1/2016.
 */
public class ItemDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setElevation(0);
            ab.setDisplayHomeAsUpEnabled(true);
            ab.setTitle("Zameraa Item 1");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setElevation(0);
            ab.setDisplayHomeAsUpEnabled(true);
            ab.setTitle("Zameraa Item 1");
        }
    }


}
