package com.example.fiona1.musicshop;

import android.support.v4.app.INotificationSideChannel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class PianoTest {
    private Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Yamaha", InstrumentType.KEYBOARD, 88);

    }

    @Test
    public void testBrand() throws Exception {
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void testType() throws Exception {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());

    }

    @Test
    public void testNumKeys() throws Exception {
        assertEquals(88, piano.getNumKeys());

    }
}
