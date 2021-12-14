
package edu.century.project;

import java.util.Random;

public class Event {
    
    private String name;
    private Venue venue;
    private Sport sport;
    private Athlete[] athletes;
    
    public Event () {
    	this.name = "DEFAULT";
    	this.venue = Venue.selectRandomVenue();
    	this.sport = Sport.selectRandomSport();
    	this.athletes = new Athlete[2];
    	athletes[0] = new Athlete();
    	athletes[1] = new Athlete();
        
    }
    
    public Event (String name, Venue venue, Sport sport, Athlete[] athleteList) {
        setName(name);
        setVenue(venue);
        setSport(sport);
        setAthletes(athleteList);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Venue getVenue() {
        return venue;
    }
    
    public void setVenue (Venue venue) {
        this.venue = venue;
    }
    
    public Sport getSport () {
        return sport;
    }
    
    public void setSport(Sport sport) {
        this.sport = sport;
    }
    
    public Athlete[] getAthletes() {
    	Athlete[] copy = new Athlete[athletes.length];
        for (int i = 0; i < athletes.length; i++) {
            copy[i] = athletes[i];
        }
        return copy;
     }
    
    public void setAthletes(Athlete[] athletes) {
    	
        if (athletes == null || athletes.length < 1) {
            System.out.println ("Competitions must have at least one Athlete!");
        }
        Athlete[] copy = new Athlete[athletes.length];
        for (int i = 0; i < athletes.length; i++) {
            copy[i] = athletes[i];
        }
        this.athletes = copy;
    }
    
    
    
    public String toString() {
        String s = "Event name: " + getName() + " Venue: " + getVenue() + " Sport: " + getSport() + 
                " Athletes Competing: ";
        int len;
        if (getAthletes() != null) {
            len = getAthletes().length;
        } else len = 0;
        
        for (int i = 0; i < len; i++) {
            s += getAthletes()[i].getName() + " ";
        }
        return s;
    }
    
    
    public Athlete compete() {
        
        int len = getAthletes().length;
        int scores[] = new int[len];
        Random rand = new Random();
        int r;
                
        for (int i = 0; i < len; i++) {
            r = rand.nextInt(50) + 1;
            scores[i] = r + getAthletes()[i].getSkill();
        }
        Athlete winner = getAthletes()[findBiggestScore (scores)];   
        winner.setMedals(winner.getMedals() + 1);
        return winner;
    }
    
    private int findBiggestScore (int[] scores) {
       
        int index = 0;
        int winnerSoFar = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > winnerSoFar) {
            	winnerSoFar = scores[i];
                index = i;
            }
            i++;
        }
        return index;
    }

    public boolean equals (Event e) {
 
        if (e == null)
        	return false;
        
        if (getClass() != e.getClass())
            return false;
        
        if ((!getName().equalsIgnoreCase (e.getName())) ||
            (getSport() != e.getSport()) &&
            (getVenue() != e.getVenue()))
            return false;    
        
        if (getAthletes() == null && e.getAthletes() == null)
        	return true;
        if ((getAthletes() == null && e.getAthletes() != null) ||
        	(getAthletes() != null && e.getAthletes() ==  null)) 
        	return false;

        if (getAthletes().length != e.getAthletes().length)
       		return false;
        for (int i = 0; i < getAthletes().length; i++) {
        	if (! getAthletes()[i].equals(e.getAthletes()[i])) {
        		return false;
        	}
        }
        return true;
        
            
    }
    
    
}
