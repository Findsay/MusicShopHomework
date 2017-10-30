package com.example.fiona1.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class ProductTest {

    Product drumsticks;

    @Before
    public void setUp() throws Exception {
        drumsticks = new Product("Drumsticks", 500, 1000);

    }

    @Test
    public void testName() throws Exception {
        assertEquals("Drumsticks", drumsticks.getName());

    }

    @Test
    public void testBuyPrice() throws Exception {
        assertEquals(500, drumsticks.getBuyPrice());

    }

    @Test
    public void testSellPrice() throws Exception {
        assertEquals(1000, drumsticks.getSellPrice());

    }
}
