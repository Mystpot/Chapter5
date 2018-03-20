package com.gareth;

// Abstract Factory

public class CorePlayerFactory extends TeamFactory {

    public DotaTeam getTeamPlayer ( String teamPlayer )
    {
        DotaTeam dt = null;
        if("carry".equals(teamPlayer))
        {
            dt = new CarryPlayer();
        }
        else if ("mid".equals(teamPlayer))
        {
            dt = new MidPlayer();
        }

        return dt;
    }
}
