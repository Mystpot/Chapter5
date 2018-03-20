package com.gareth;


//Bridge

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MacnCheeseTest {

    Meal mnc;

    @Before
    public void setUp() throws Exception {

        mnc = new MacnCheese(new Macaroni());
    }

}