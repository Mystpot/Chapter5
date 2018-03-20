package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
// Abstract Factory

public class MidPlayerTest {

    MidPlayer mp;

    @Before
    public void setUp() throws Exception {

        mp = new MidPlayer();
    }

    @Test
    public void performRole() {

        assertEquals("I will win the mid lane", mp.performRole());
    }
}