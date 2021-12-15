
import java.util.ArrayList;
import java.util.Random;

public class Event {
    
    private String name;
    private Venue venue;
    private Sport sport;
    private ArrayList<Athlete> athletes = new ArrayList<Athlete>();
    
    public Event () {
    	this.name = "DEFAULT";
    	this.venue = Venue.selectRandomVenue();
    	this.sport = Sport.selectRandomSport();
    	athletes.add(new Athlete());
    	athletes.add(new Athlete());
        
    }
    
    public Event (String name, Venue venue, Sport sport, ArrayList<Athlete> athleteList) {
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
    
    public ArrayList<Athlete> getAthletes() {
    	ArrayList<Athlete> copy = new ArrayList<Athlete>();
        for (int i = 0; i < athletes.size(); i++) {
            copy.add(athletes.get(i));
        }
        return copy;
     }
    
    public void setAthletes(ArrayList<Athlete> athletes) {
    	
        if (athletes == null || athletes.size() < 1) {
            System.out.println ("Competitions must have at least one Athlete!");
        }
        ArrayList<Athlete> copy = new ArrayList<Athlete>();
        for (int i = 0; i < athletes.size(); i++) {
            copy.add(athletes.get(i));
        }
        this.athletes = copy;
    }
    
    
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
