package com.gareth;

// Abstract Factory

public class SidelinePlayerFactory extends TeamFactory {

    public DotaTeam getTeamPlayer ( String teamPlayer )
    {
        DotaTeam dt = null;

        if ("support".equals(teamPlayer))
        {
            dt = new SupportPlayer();
        }

        else if ("coach".equals(teamPlayer))
        {
            dt = new CoachPlayer();
        }

        return dt;
    }
}
