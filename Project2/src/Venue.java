

import java.util.Random;

/**
 * This enum stores within it a set of different venues for the athletes to compete at.
 * 
 * @author Lukas Spooner
 *
 */
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
    TokyoAquaticsCentre,
    AomiUrbanSportsPark;
    
	/**
	 * This method returns a random value stored within the Venue enum.
	 */
    public static Venue selectRandomVenue() {
        Random rand = new Random();
        int r = rand.nextInt(Venue.values().length);
        return Venue.values()[r];
    }
    
}
