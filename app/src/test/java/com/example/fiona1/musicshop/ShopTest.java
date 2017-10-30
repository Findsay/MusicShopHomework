package com.example.fiona1.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class ShopTest {
    Shop shop;
    Guitar guitar;
    Product drumsticks;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Music Shop");
        guitar = new Guitar("Fender Strat", InstrumentType.STRING, 6, 10000, 30000);
        drumsticks = new Product("Drumsticks", 500, 1000);



    }

    @Test
    public void testName() throws Exception {
        assertEquals("Music Shop", shop.getName());
    }

    @Test
    public void testStockStartsEmpty() throws Exception {
        assertEquals(0, shop.getStockCount());

    }

    @Test
    public void testAddToStock() throws Exception {
        shop.addStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void testRemoveStock() throws Exception {
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void testRemoveStockThatDoesntExist() throws Exception {
        shop.removeStock(guitar);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void testTotalPotentialProfit() throws Exception {
        shop.addStock(guitar);
        shop.addStock(drumsticks);
        assertEquals(20500, shop.calculatePotentialProfit());

    }
}
