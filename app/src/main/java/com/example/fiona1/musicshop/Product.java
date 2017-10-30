package com.example.fiona1.musicshop;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class Product implements Sellable {
    private int buyPrice;
    private int sellPrice;
    private String name;

    public Product(String name, int buyPrice, int sellPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName(){
        return name;
    }

    @Override
    public int getBuyPrice() {
        return buyPrice;
    }

    @Override
    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public int calculateMarkUp() {
        return sellPrice - buyPrice;
    }
}
