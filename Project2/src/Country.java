


import java.util.Random;

/**
 * This enum stores within it a set of different countries for the athletes to serve as home countries for the athletes.
 * 
 * @author Lukas Spooner
 *
 */
public enum Country {
    Togo, Kenya, Chile, Argentina, Japan, 
    Italy, Germany, Australia, Tonga, 
    China, Norway, UnitedKingdom;
    
	/**
	 * This method returns a random value stored within the Country enum.
	 */
    public static Country selectRandomCountry() {
        Random rand = new Random();
        int r = rand.nextInt(Country.values().length);
                
        return Country.values()[r];
    }
    
}
