package com.example.adrian.zameera.Entity;

/**
 * Created by Adrian on 8/1/2016.
 */
public class ProductItem {

    String name;
    int price;
    int likes;

    public ProductItem() {
    }

    public ProductItem(String name, int price, int likes) {
        this.name = name;
        this.price = price;
        this.likes = likes;
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
}
