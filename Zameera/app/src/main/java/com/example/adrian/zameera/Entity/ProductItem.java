package com.example.adrian.zameera.Entity;

import android.widget.ImageView;

/**
 * Created by Adrian on 8/1/2016.
 */
public class ProductItem {

    String name;
    int itemNumber;
    int price;
    int likes;

    public ProductItem() {
    }

    public ProductItem(String name, int price, int likes, int itemNumber) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }
}
