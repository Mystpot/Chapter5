package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

// Abstract Factory

public class SupportPlayerTest {

    SupportPlayer sp;

    @Before
    public void setUp() throws Exception {
        sp = new SupportPlayer();
    }

    @Test
    public void performRole() {

        assertEquals("I will support the team", sp.performRole());
    }
}