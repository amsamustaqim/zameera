package com.example.adrian.zameera.Activity;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.adrian.zameera.Adapter.ProductItemAdapter;
import com.example.adrian.zameera.R;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabSelectedListener;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Adrian on 8/1/2016.
 */
public class MainMenuActivity extends FragmentActivity {

    @BindView(R.id.rv_fragment_catalogue)RecyclerView mRecyclerViewCatalogue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        ButterKnife.bind(this);


     //   mRecyclerViewCatalogue.addItemDecoration(new MarginDecoration(this));
        mRecyclerViewCatalogue.setHasFixedSize(true);
        mRecyclerViewCatalogue.setLayoutManager(new GridLayoutManager(this, 2));
        mRecyclerViewCatalogue.setAdapter(new ProductItemAdapter(this));


        // Set the color for the active tab. Ignored on mobile when there are more than three tabs.
        // Use the dark theme. Ignored on mobile when there are more than three tabs.
        //bottomBar.useDarkTheme(true);

        // Use custom text appearance in tab titles.
        //bottomBar.setTextAppearance(R.style.MyTextAppearance);

        // Use custom typeface that's located at the "/src/main/assets" directory. If using with
        // custom text appearance, set the text appearance first.
        //bottomBar.setTypeFace("MyFont.ttf");

    }


}
