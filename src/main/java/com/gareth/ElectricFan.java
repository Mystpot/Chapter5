package com.gareth;

// Adaptor

public class ElectricFan implements Fan {


    public String spinQuick() {
        String spin = "I spin quite fast!";
        return spin;
    }
}
