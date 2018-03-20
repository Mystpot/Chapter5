package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

// Abstract Factory

public class CoachPlayerTest {

    CoachPlayer cp;

    @Before
    public void setUp() throws Exception {

        cp = new CoachPlayer();
    }

    @Test
    public void performRole() {

        assertEquals("I will coach the team", cp.performRole());
    }
}