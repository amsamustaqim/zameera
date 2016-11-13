package com.example.adrian.zameera.Activity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.adrian.zameera.R;

/**
 * Created by Asus on 11/7/2016.
 */
public class ScreenSlidePageFragment extends Fragment {

    Uri uri;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);

        Bundle bundle = getArguments();
        uri = Uri.parse(bundle.getString("photoURL"));
        ImageView iv = (ImageView) rootView.findViewById(R.id.displayImage);
        Glide.with(this).load(uri).centerCrop().crossFade().into(iv);

        return rootView;
    }
}