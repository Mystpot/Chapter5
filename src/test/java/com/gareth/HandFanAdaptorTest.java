package com.gareth;

// Adaptor

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandFanAdaptorTest {

    Fan hfa;

    @Before
    public void setUp() throws Exception {

        hfa = new HandFanAdaptor(new HandFan());
    }

    @Test
    public void spinQuick() {

        assertEquals("I spin slowly", hfa.spinQuick());
    }
}