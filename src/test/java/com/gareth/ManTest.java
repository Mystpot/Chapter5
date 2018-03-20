package com.gareth;

// Prototype

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManTest {

    Man man;
    Man newMan;

    @Before
    public void setUp() throws Exception {

        man = new Man();

    }

    @Test
    public void createClone() {

        newMan = (Man) man.getClone(man);
    }

    @Test
    public void testToString() {

        assertEquals("This is a new man!", man.toString());
    }
}