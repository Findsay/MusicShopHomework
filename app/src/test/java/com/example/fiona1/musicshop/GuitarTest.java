package com.example.fiona1.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Fender Strat", InstrumentType.STRING, 6, 10000, 30000);

    }

    @Test
    public void testBrand() throws Exception {
        assertEquals("Fender Strat", guitar.getBrand());

    }

    @Test
    public void testType() throws Exception {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void testNumStrings() throws Exception {
        assertEquals(6, guitar.getNumStrings());

    }

    @Test
    public void testBuyPrice() throws Exception {
        assertEquals(10000, guitar.getBuyPrice());
    }

    @Test
    public void testSellPrice() throws Exception {
        assertEquals(30000, guitar.getSellPrice());
    }

    @Test
    public void testCalculateMarkUp() throws Exception {
        assertEquals(20000, guitar.calculateMarkUp());

    }

    @Test
    public void testPlayable() throws Exception {
        assertEquals("Twang", guitar.play());

    }
}
