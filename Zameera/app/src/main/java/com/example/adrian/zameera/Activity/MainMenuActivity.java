package com.example.adrian.zameera.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.example.adrian.zameera.Adapter.ProductItemAdapter;
import com.example.adrian.zameera.R;
import com.example.adrian.zameera.RecyclerItemClickListener;
import com.google.firebase.database.DatabaseReference;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Adrian on 8/1/2016.
 */
public class MainMenuActivity extends FragmentActivity {

    @BindView(R.id.rv_fragment_catalogue)RecyclerView mRecyclerViewCatalogue;
    @BindView(R.id.btm_bar_menu) LinearLayout mLinearLayout;

    private DatabaseReference mDataBase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        ButterKnife.bind(this);


     //   mRecyclerViewCatalogue.addItemDecoration(new MarginDecoration(this));
        mRecyclerViewCatalogue.setHasFixedSize(true);
        mRecyclerViewCatalogue.setLayoutManager(new GridLayoutManager(this, 2));
        mRecyclerViewCatalogue.setAdapter(new ProductItemAdapter(this));

        mRecyclerViewCatalogue.addOnItemTouchListener(new RecyclerItemClickListener(this, mRecyclerViewCatalogue,new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent myIntent = new Intent(MainMenuActivity.this, ItemDetailActivity.class);
                startActivity(myIntent);
            }

            @Override public void onLongItemClick(View view, int position) {
                // do whatever
            }
        }));

        // Set the color for the active tab. Ignored on mobile when there are more than three tabs.
        // Use the dark theme. Ignored on mobile when there are more than three tabs.
        //bottomBar.useDarkTheme(true);

        // Use custom text appearance in tab titles.
        //bottomBar.setTextAppearance(R.style.MyTextAppearance);

        // Use custom typeface that's located at the "/src/main/assets" directory. If using with
        // custom text appearance, set the text appearance first.
        //bottomBar.setTypeFace("MyFont.ttf");

    }

    @OnClick(R.id.btn_menu_category)
    void start() {
        Intent myIntent = new Intent(MainMenuActivity.this, CategoryActivity.class);
        startActivity(myIntent);
    }

    @OnClick(R.id.btn_menu_camera)
    void startCamera() {
        Intent myIntent = new Intent(MainMenuActivity.this,CameraActivity.class);
        startActivity(myIntent);
    }

    @OnClick(R.id.btn_menu_sort)
    void selectCategory() {
        Intent myIntent = new Intent(MainMenuActivity.this, CategoryActivity.class);
        startActivityForResult(myIntent,100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
