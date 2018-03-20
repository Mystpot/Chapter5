package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

// Abstract Factory

public class CarryPlayerTest {

    CarryPlayer cp;

    @Before
    public void setUp() throws Exception {

        cp = new CarryPlayer();
    }

    @Test
    public void performRole() {

        assertEquals("I will carry the team", cp.performRole());

    }
}