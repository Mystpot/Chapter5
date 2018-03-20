package com.gareth;

// Adaptor

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandFanTest {

    HandFan hf;

    @Before
    public void setUp() throws Exception {

        hf = new HandFan();
    }

    @Test
    public void spinSlow() {

        assertEquals("I spin slowly", hf.spinSlow());
    }
}