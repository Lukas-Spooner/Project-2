import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This class is the driver program for this project.
 * 
 * @author Lukas Spooner, CSCI 1082-70, Project 2
 *
 */
public class Driver {
	
	/**
	 * This is the main method for the program.
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
    	
    	try {
    		FileInputStream fileInputStream = new FileInputStream("events.txt");
    		Scanner inFS = new Scanner(fileInputStream);

    		
    		while (inFS.hasNext()) {
        		String currLine = inFS.next();
        		String[] eventInputStream = currLine.split("%", 3);
        		driveCompetitions(eventInputStream[0], eventInputStream[1], eventInputStream[2]);
        	}
    
        	inFS.close();
        	
		} catch (FileNotFoundException e) {
			System.out.print("Unable to find file events.txt");
		} catch (IOException e) {
			System.out.print("Unable to close file");
		}
    }
    
    /**
     * This method sets up the events and drives the competitions.
     * 
     * @param setEvent - The string value to be set as the name of the event.
     * @param setVenue - The string value to be used to find the coordinating venue in the Venue enum which will be set as the Venue in the event.
     * @param setSport - The string value to be used to find the coordinating sport in the Sport enum which will be set as the Sport in the event
     */
    private static void driveCompetitions (String setEvent, String setVenue, String setSport) {
       ArrayList<Athlete> athletes = new ArrayList<Athlete>();
       
       String eventName, venue, sport;
       eventName = setEvent;
       venue = setVenue;
       sport = setSport;
       
       Random rand = new Random();
       int randInt = rand.nextInt(24) + 8;
       
       if (sport.equals("MarathonSwimming")) {
    	   for (int i = 0; i < randInt; ++i) {
    		   athletes.add(generateSwimmer());
    	   }
       }
       else if (sport.equals("Skateboarding")) {
    	   for (int i = 0; i < randInt; ++i) {
    		   athletes.add(generateSkateboarder());
    	   }
       }
       else if (sport.equals("SportClimbing")) {
    	   for (int i = 0; i < randInt; ++i) {
    		   athletes.add(generateSportClimber());
    	   }
       }
       else if (sport.equals("Bicycling")) {
    	   for (int i = 0; i < randInt; ++i) {
    		   athletes.add(generateBicyclist());
    	   }
       }
       
       Sport s = Sport.valueOf(sport);
           
       System.out.println("\n******-> " + s);

       Event e = new Event(eventName, Venue.valueOf(venue), s, athletes);
           
       System.out.println ("Winning athlete of the " + e.getName() + " event is " + e.compete());
                        
       
       athletes.clear();
    }    
    
    /**
     * This method returns a random name to the user from the Names.txt file.
     * 
     * @return - returns the variable name of type string
     */
    public static String getRandomName() {
    	String name = null;
    	
    	try {
    		FileInputStream fileInputStream = new FileInputStream("Names.txt");
    		Scanner nameFS = new Scanner(fileInputStream);
    		Random randInt = new Random();
        	int randNum = randInt.nextInt(5163);
        	
        	for (int i = 0; i < randNum; ++i) {
        		name = nameFS.nextLine();
        	}
        	
        	fileInputStream.close();
        	
		} catch (FileNotFoundException e) {
			System.out.print("Unable to find file Names.txt");
		} catch (IOException e) {
			System.out.print("Unable to close file");
		}
    	
    	
    	
    	return name;
    }
    
    /**
     * This method creates a marathon swimmer, populates its values, and returns it to the user.
     * 
     * @return - returns swimmer of type MarathonSwimmer, a subclass of Athlete.
     */
    public static MarathonSwimmer generateSwimmer(){
    	String name = getRandomName();
    	Random randInt = new Random();
    	MarathonSwimmer swimmer = new MarathonSwimmer();
    	
    	try {
    		swimmer.setName(name);
    		swimmer.setHomeNation(Country.selectRandomCountry());
    		swimmer.setSkill(randInt.nextInt(10) + 1);
    		swimmer.setMedals(randInt.nextInt(5));
    		swimmer.setEndurance(randInt.nextInt(101));
    	} catch (IllegalArgumentException e) {
    		System.out.print("Invalid argument in generateSwimmer() method.");
    	}
    	
    	return swimmer;
    }
    
    /**
     * This method creates a skateboarder, populates its values, and returns it to the user.
     * 
     * @return - returns skateboarder of type Skateboarder, a subclass of Athlete.
     */
    public static Skateboarder generateSkateboarder() {
    	String name = getRandomName();
    	Random randInt = new Random();
    	Skateboarder skateboarder = new Skateboarder();
    	
    	try {
    		skateboarder.setName(name);
    		skateboarder.setHomeNation(Country.selectRandomCountry());
    		skateboarder.setSkill(randInt.nextInt(10) + 1);
    		skateboarder.setMedals(randInt.nextInt(5));
    		skateboarder.setStyle(randInt.nextInt(10));
    	} catch (IllegalArgumentException e) {
    		System.out.print("Invalid argument in generateSkateboarder() method.");
    	}
    	
    	return skateboarder;
    }
    
    /**
     * This method creates a sport climber, populates its values, and returns it to the user.
     * 
     * @return - returns sportClimber of type SportClimber, a subclass of Athlete.
     */
    public static SportClimber generateSportClimber() {
    	String name = getRandomName();
    	Random randInt = new Random();
    	SportClimber sportClimber = new SportClimber();
    	
    	try {
    		sportClimber.setName(name);
    		sportClimber.setHomeNation(Country.selectRandomCountry());
    		sportClimber.setSkill(randInt.nextInt(10) + 1);
    		sportClimber.setMedals(randInt.nextInt(5));
    		sportClimber.setStrength(randInt.nextInt(150) + 51);
    	} catch (IllegalArgumentException e) {
    		System.out.print("Invalid argument in generateSportClimber() method.");
    	}
    	
    	return sportClimber;
    }
    
    /**
     * This method creates a bicyclist, populates its values, and returns it to the user.
     * 
     * @return - returns bicyclist of type Bicyclist, a subclass of Athlete.
     */
    public static Bicyclist generateBicyclist() {
    	String name = getRandomName();
    	Random randInt = new Random();
    	Bicyclist bicyclist = new Bicyclist();
    	
    	try {
    		bicyclist.setName(name);
    		bicyclist.setHomeNation(Country.selectRandomCountry());
    		bicyclist.setSkill((randInt.nextInt(10) + 1));
    		bicyclist.setMedals(randInt.nextInt(5));
    		bicyclist.setSpeed((randInt.nextInt(150) + 51));
    	} catch (IllegalArgumentException e) {
    		System.out.print("Invalid argument in generateBicyclist() method.");
    	}
    	
    	return bicyclist;
    }
     
    
}
