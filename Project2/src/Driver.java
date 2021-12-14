package edu.century.project;

import java.util.Random;



public class Driver {

    public static void main(String[] args) {
        driveCompetitions();
    }
     
    private static void driveCompetitions () {
       Random rand = new Random();
       Sport s;
       
       for (int i = 0; i < 5; i++) {
           s = Sport.selectRandomSport();
           
           System.out.println("******->" + s);
          
           Athlete[] athletes = new Athlete[3];
           athletes[0] = new Athlete("Anna", Country.selectRandomCountry(), s, rand.nextInt(10) + 1, 0 );
           athletes[1] = new Athlete("Bob", Country.selectRandomCountry(), s, rand.nextInt(10) + 1, 0 );
           athletes[2] = new Athlete("Charlie", Country.selectRandomCountry(), s, rand.nextInt(10) + 1, 0 );

           Event e = new Event("Event" + i, Venue.selectRandomVenue(), s, athletes);
           
           System.out.println ("Winning athlete of the " + e.getName() + " event is " + e.compete());
                        
       }
    }    
     
    
}
