package com.example.fiona1.musicshop;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class Guitar extends Instrument implements Sellable, Playable {

    private int buyPrice;
    private int sellPrice;
    private int numStrings;




    public Guitar(String brand, InstrumentType type, int numStrings, int buyPrice, int sellPrice) {
        super(brand, type);
        this.numStrings = numStrings;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;


    }

    public int getNumStrings() {
        return numStrings;
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

    @Override
    public String play() {
        return "Twang";
    }
}
