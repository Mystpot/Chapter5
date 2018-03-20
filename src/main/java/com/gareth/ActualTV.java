package com.gareth;

//Proxy

public class ActualTV implements TV {

    public ActualTV()
    {

    }

    public String showOn()
    {
        String on = "This TV is on!";
        return on;
    }
}
