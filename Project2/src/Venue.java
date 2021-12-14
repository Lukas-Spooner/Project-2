package edu.century.project;

import java.util.Random;

public enum Venue {
   
    MetropolitanGymnasium, 
    YoyogiNationalStadium, 
    NipponBudokan, 
    InternationalForum, 
    KokugikanArena, 
    EquestrianPark, 
    MusashinoForestSportPlaza,
    TokyoStadium,
    MusashinonomoriPark,
    AriakeArena,
    AriakeGymnasticsCentre,
    AriakeUrbanSportsPark,
    OdaibaMarinePark,
    TokyoAquaticsCentre;
    

    public static Venue selectRandomVenue() {
        Random rand = new Random();
        int r = rand.nextInt(Venue.values().length);
        return Venue.values()[r];
    }
}
