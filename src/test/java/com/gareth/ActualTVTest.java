package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//Proxy

public class ActualTVTest {

    TV act;

    @Before
    public void setUp() throws Exception {

        act = new ActualTV();
    }

    @Test
    public void showOn() {

        assertEquals("This TV is on!", act.showOn());
    }
}