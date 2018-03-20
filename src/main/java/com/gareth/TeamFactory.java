package com.gareth;

// Abstract Factory

public abstract class TeamFactory {

    public abstract DotaTeam getTeamPlayer (String teamPlayer);

    public static TeamFactory getTeamFactory(String typeOfFactory)
    {
        TeamFactory dotaTeamFac = null;
        if("core".equals(typeOfFactory))
        {
            dotaTeamFac = new CorePlayerFactory();
        }
        else
        {
            dotaTeamFac = new SidelinePlayerFactory();
        }

        return dotaTeamFac;
    }


}
