package com.gareth;
// Proxy

public class ProxyTV implements TV {

    private ActualTV act;

    ProxyTV()
    {

    }

    ProxyTV(ActualTV act)
    {
        this.act = act;
    }

    public String showOn()
    {
        if(act == null )
        {
            act = new ActualTV();
        }
        return act.showOn();
    }
}
