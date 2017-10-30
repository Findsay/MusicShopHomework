package com.example.fiona1.musicshop;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class Piano extends Instrument {
    private int numKeys;

    public Piano(String brand, InstrumentType type, int numKeys) {
        super(brand, type);
        this.numKeys = numKeys;
    }


    @Override
    public String play() {
        return "Plinky plonk";
    }

    public int getNumKeys() {
        return numKeys;
    }
}
