package com.gareth;

// Adaptor

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricFanTest {

    ElectricFan ef;

    @Before
    public void setUp() throws Exception {

        ef = new ElectricFan();
    }

    @Test
    public void spinQuick() {

        assertEquals("I spin quite fast!", ef.spinQuick());
    }
}