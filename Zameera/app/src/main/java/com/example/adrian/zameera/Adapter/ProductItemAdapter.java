package com.example.adrian.zameera.Adapter;

import android.content.ClipData;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adrian.zameera.Entity.ProductItem;
import com.example.adrian.zameera.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Adrian on 8/4/2016.
 */
public class ProductItemAdapter extends RecyclerView.Adapter<ProductItemAdapter.ViewHolder> {

    private List<ProductItem> mProductList;
    private Context mContext;

    public ProductItemAdapter(Context mContext) {
        this.mContext = mContext;
        String[] names = {"Anggung Warna Sejuk","Strawberry Hijau", "Hijab Silever"
                ,"Jasmyne Tunic", "Tweety Tunic", "Sahira Tunic", "Hijab Silver"};
        int likes = (int) Math.random()*400+50;
        int price = (int) Math.random()*200000 + 50000;
        mProductList = new ArrayList<>();
        for(int i = 1; i <= 6; i++) {
            ProductItem itm = new ProductItem(names[i],String.valueOf(price) , String.valueOf(likes), i);
            mProductList.add(itm);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View productView = inflater.inflate(R.layout.grid_item_menu, parent, false);
        ViewHolder viewHolder = new ViewHolder(productView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ProductItem product = mProductList.get(position);

        TextView name = holder.name;
        TextView price = holder.price;
        TextView like = holder.like;
        ImageView ivProduct = holder.product;
        ImageView heart = holder.heart;

        name.setText(product.getName());
        price.setText(product.getPrice());
        like.setText(product.getLikes());


        switch(position) {
            case 0:ivProduct.setBackgroundResource(R.drawable.item1);;break;
            case 1:ivProduct.setBackgroundResource(R.drawable.item2);;break;
            case 2:ivProduct.setBackgroundResource(R.drawable.item3);;break;
            case 3:ivProduct.setBackgroundResource(R.drawable.item4);break;
            case 4:ivProduct.setBackgroundResource(R.drawable.item5);break;
            case 5:ivProduct.setBackgroundResource(R.drawable.item6);break;
        }

    }

    @Override
    public int getItemCount() {
        return mProductList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_name_item_grid) TextView name;
        @BindView(R.id.tv_price_item_grid) TextView price;
        @BindView(R.id.tv_item_grid_likes) TextView like;
        @BindView(R.id.iv_item_image_grid) ImageView product;
        @BindView(R.id.iv_heart_item_grid) ImageView heart;

        public ViewHolder(final View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }


    }
}
