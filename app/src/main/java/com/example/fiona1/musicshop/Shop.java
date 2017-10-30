package com.example.fiona1.musicshop;

import java.util.ArrayList;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class Shop {


    private String name;
    private ArrayList<Sellable> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<Sellable>();
    }

    public String getName() {
        return name;
    }


    public int getStockCount() {
        return stock.size();
    }

    public void addStock(Sellable item) {
        stock.add(item);
    }

    public void removeStock(Sellable item) {
        stock.remove(item);

    }

    public int calculatePotentialProfit() {
        int total = 0;
        for (Sellable item : stock){
            total += item.calculateMarkUp();
        }
        return total;
    }
}
