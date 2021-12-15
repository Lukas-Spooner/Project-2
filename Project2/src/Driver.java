import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Driver {

    public static void main(String[] args) {
    	
    	try {
    		FileInputStream fileInputStream = new FileInputStream("Names.txt");
    		Scanner inFS = new Scanner(fileInputStream);
    		
    		while (inFS.hasNext()) {
        		String currLine = inFS.next();
        		String[] eventInputStream = currLine.split("%", 2);
        		driveCompetitions(eventInputStream[0], eventInputStream[1], eventInputStream[2]);
        	}
        	
        	inFS.close();
        	
		} catch (FileNotFoundException e) {
			System.out.print("Unable to find file");
		} catch (IOException e) {
			System.out.print("Unable to close file");
		}
    }
     
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
       
       for (int i = 0; i < 5; i++) {
           Sport s = Sport.selectRandomSport();
           
           System.out.println("******->" + s);

           Event e = new Event("Event" + i, Venue.selectRandomVenue(), s, athletes);
           
           System.out.println ("Winning athlete of the " + e.getName() + " event is " + e.compete());
                        
       }
       
       
    }    
    
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
			System.out.print("Unable to find file");
		} catch (IOException e) {
			System.out.print("Unable to close file");
		}
    	
    	
    	
    	return name;
    }
    
    public static MarathonSwimmer generateSwimmer(){
    	String name = getRandomName();
    	Random randInt = new Random();
    	
    	MarathonSwimmer swimmer = new MarathonSwimmer();
    	swimmer.setName(name);
    	swimmer.setHomeNation(Country.selectRandomCountry());
		swimmer.setSkill(randInt.nextInt(10) + 1);
    	swimmer.setMedals(randInt.nextInt(5));
    	swimmer.setEndurance(randInt.nextInt(101));
    	
    	return swimmer;
    }
    
    public static Skateboarder generateSkateboarder() {
    	String name = getRandomName();
    	Random randInt = new Random();
    	
    	Skateboarder skateboarder = new Skateboarder();
    	skateboarder.setName(name);
    	skateboarder.setHomeNation(Country.selectRandomCountry());
    	skateboarder.setSkill(randInt.nextInt(10) + 1);
    	skateboarder.setMedals(randInt.nextInt(5));
    	skateboarder.setStyle(randInt.nextInt(10));
    	
    	return skateboarder;
    }
    
    public static SportClimber generateSportClimber() {
    	String name = getRandomName();
    	Random randInt = new Random();
    	
    	SportClimber sportClimber = new SportClimber();
    	sportClimber.setName(name);
    	sportClimber.setHomeNation(Country.selectRandomCountry());
    	sportClimber.setSkill(randInt.nextInt(10) + 1);
    	sportClimber.setMedals(randInt.nextInt(5));
    	sportClimber.setStrength(randInt.nextInt(150) + 51);
    	
    	return sportClimber;
    }
    
    public static Bicyclist generateBicyclist() {
    	String name = getRandomName();
    	Random randInt = new Random();
    	
    	Bicyclist bicyclist = new Bicyclist();
    	bicyclist.setName(name);
    	bicyclist.setHomeNation(Country.selectRandomCountry());
    	bicyclist.setSkill((randInt.nextInt(10) + 1));
    	bicyclist.setMedals(randInt.nextInt(5));
    	bicyclist.setSpeed((randInt.nextInt(150) + 51));
    	
    	return bicyclist;
    }
     
    
}
