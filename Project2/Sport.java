
import java.util.Random;


public enum Sport {


	Skateboarding, Swimming, MarathonSwimming, Karate, Triathlon, ArtisticGymnastics, 
	BeachVolleyball, Basketball, Surfing, SportClimbing, Rowing, 
	Diving, Tennis, Bicycling;
	
	public static Sport selectRandomSport() {
	    Random rand = new Random();
	    int r = rand.nextInt(Sport.values().length);
	      
	    return Sport.values()[r];
	}
	
}

