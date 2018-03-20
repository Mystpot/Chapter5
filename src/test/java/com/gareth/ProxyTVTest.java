package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//Proxy

public class ProxyTVTest {

    TV prox;

    @Before
    public void setUp() throws Exception {

        prox = new ProxyTV(new ActualTV());
    }

    @Test
    public void showOn() {

        assertEquals("This TV is on!", prox.showOn());
    }
}