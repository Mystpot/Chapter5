package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

// Singleton

public class CarTest {

    @Test
    public void getInstance() {

        Car car = Car.getInstance();
    }
}