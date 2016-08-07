package com.example.adrian.zameera.Entity;

import android.widget.ImageView;

/**
 * Created by Adrian on 8/1/2016.
 */
public class ProductItem {

    String name;
    int itemNumber;
    String price;
    String likes;

    public ProductItem() {
    }

    public ProductItem(String name, String price, String likes, int itemNumber) {
        this.name = name;
        this.price = price;
        this.likes = likes;
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }
}
