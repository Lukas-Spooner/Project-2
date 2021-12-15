
import java.util.Random;

/**
 * This enum stores within it a set of different sports for the athletes to compete in.
 * 
 * @author Lukas Spooner
 *
 */
public enum Sport {


	Skateboarding, Swimming, MarathonSwimming, Karate, Triathlon, ArtisticGymnastics, 
	BeachVolleyball, Basketball, Surfing, SportClimbing, Rowing, 
	Diving, Tennis, Bicycling;
	
	/**
	 * This method returns a random value stored within the Sport enum.
	 */
	public static Sport selectRandomSport() {
	    Random rand = new Random();
	    int r = rand.nextInt(Sport.values().length);
	      
	    return Sport.values()[r];
	}
	
}

