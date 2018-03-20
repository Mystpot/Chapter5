package com.gareth;

// Adaptor

public class HandFanAdaptor implements Fan {

    private HandFan handFan;

    public HandFanAdaptor()
    {

    }

    public HandFanAdaptor (HandFan handFan)
    {
        this.handFan = handFan;
    }

    public String spinQuick(){

       return handFan.spinSlow();

    }
}
