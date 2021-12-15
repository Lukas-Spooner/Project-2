
import java.util.ArrayList;
import java.util.Random;

/**
 * This class represendts an event.
 * 
 * @author Lukas Spooner
 *
 */
public class Event {
    
    private String name;
    private Venue venue;
    private Sport sport;
    private ArrayList<Athlete> athletes = new ArrayList<Athlete>();
    
    /**
     * This is the default constructor for the class.
     */
    public Event () {
    	this.name = "DEFAULT";
    	this.venue = Venue.selectRandomVenue();
    	this.sport = Sport.selectRandomSport();
    	athletes.add(new Athlete());
    	athletes.add(new Athlete());
        
    }
    
    /**
     * This is the constructor for the class.
     * 
     * @param name - the String value to be set for the instance variable name.
     * @param venue - the Venue value to be set for the instance variable venue.
     * @param sport - the Sport value to be set for the instance variable sport.
     * @param athleteList - the ArrayList<Athlete> value to be set for the instance variable athletes.
     */
    public Event (String name, Venue venue, Sport sport, ArrayList<Athlete> athleteList) {
        setName(name);
        setVenue(venue);
        setSport(sport);
        setAthletes(athleteList);
    }
    
    /**
     * This is an accessor method for the instance variable name
     * 
     * @return - returns the String value of name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * This is the mutator method for the instance variable name
     * 
     * @param name - the string value to be set as the new value of the instance variable name
     */
    public void setName(String name) throws IllegalArgumentException {
        this.name = name;
    }
    
    /**
     * This is an accessor method for the instance variable venue
     * 
     * @return - returns the Venue value of venue.
     */
    public Venue getVenue() {
        return venue;
    }
    
    /**
     * This is the mutator method for the instance variable venue
     * 
     * @param name - the Venueg value to be set as the new value of the instance variable venue
     */
    public void setVenue (Venue venue) throws IllegalArgumentException {
        this.venue = venue;
    }
    
    /**
     * This is an accessor method for the instance variable sport
     * 
     * @return - returns the Sport value of sport.
     */
    public Sport getSport () {
        return sport;
    }
    
    /**
     * This is the mutator method for the instance variable sport
     * 
     * @param name - the Sport value to be set as the new value of the instance variable sport
     */
    public void setSport(Sport sport) throws IllegalArgumentException {
        this.sport = sport;
    }
    
    /**
     * This is an accessor method for the instance variable athletes
     * 
     * @return - returns the Arraylist value of athletes.
     */
    public ArrayList<Athlete> getAthletes() {
    	ArrayList<Athlete> copy = new ArrayList<Athlete>();
        for (int i = 0; i < athletes.size(); i++) {
            copy.add(athletes.get(i));
        }
        return copy;
     }
    
    /**
     * This is the mutator method for the instance variable name
     * 
     * @param name - the string value to be set as the new value of the instance variable name
     */
    public void setAthletes(ArrayList<Athlete> athletes) throws IllegalArgumentException {
    	
        if (athletes == null || athletes.size() < 1) {
            System.out.println ("Competitions must have at least one Athlete!");
        }
        ArrayList<Athlete> copy = new ArrayList<Athlete>();
        for (int i = 0; i < athletes.size(); i++) {
            copy.add(athletes.get(i));
        }
        this.athletes = copy;
    }
    
    /**
     * This method returns a String value containing all of the information stored in Event.
     */
    @Override
    public String toString() {
        String s = "Event name: " + getName() + " Venue: " + getVenue() + " Sport: " + getSport() + 
                " Athletes Competing: ";
        int len;
        if (getAthletes() != null) {
            len = getAthletes().size();
        } else len = 0;
        
        for (int i = 0; i < len; i++) {
            s += ((Athlete) getAthletes().get(i)).getName() + " ";
        }
        return s;
    }
    
    /**
     * This method pits all of the Athletes stored within the class in a competition to see who wins and returns 
     * the winner of type Athlete to the user.
     * 
     * @return - returns winner of type Athlete to the user.
     */
    public Athlete compete() {
        
        int len = getAthletes().size();
        int scores[] = new int[len];
        Random rand = new Random();
        int r;
                
        for (int i = 0; i < len; i++) {
            r = rand.nextInt(50) + 1;
            scores[i] = r + ((Athlete) getAthletes().get(i)).getSkill();
        }
        Athlete winner = ((Athlete) getAthletes().get(findBiggestScore(scores)));   
        winner.setMedals(winner.getMedals() + 1);
        return winner;
    }
    
    /**
     * This method is used to search through an array of scores and returns the index of the biggest score.
     * 
     * @param scores - the int[] array to be searched through to find the biggest score.
     * @return - returns the index of the scores array with the highest int value.
     */
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
    
    /**
     * This method overrides the standard equals() method and instead compares two events to one another.
     * 
     * @param e - the Event object to be compared to another.
     * @return - returns false if the Event objects are not equal and true if they are.
     */
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

        if (getAthletes().size() != e.getAthletes().size())
       		return false;
        for (int i = 0; i < getAthletes().size(); i++) {
        	if (! getAthletes().get(i).equals(e.getAthletes().get(i))) {
        		return false;
        	}
        }
        return true;
        
            
    }
    
    
}
