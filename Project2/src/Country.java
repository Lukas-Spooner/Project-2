
package edu.century.project;

import java.util.Random;

public enum Country {
    Togo, Kenya, Chile, Argentina, Japan, 
    Italy, Germany, Australia, Tonga, 
    China, Norway, UnitedKingdom;
    
    public static Country selectRandomCountry() {
        Random rand = new Random();
        int r = rand.nextInt(Country.values().length);
                
        return Country.values()[r];
    }
}
