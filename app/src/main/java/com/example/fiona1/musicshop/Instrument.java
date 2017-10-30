package com.example.fiona1.musicshop;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public abstract class Instrument implements Playable {


    protected InstrumentType type;
    protected String brand;

    public Instrument(String brand, InstrumentType type) {
        this.brand = brand;
        this.type = type;

    }

    public InstrumentType getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }
}
