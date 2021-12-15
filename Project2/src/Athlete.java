
/**
 * This class represendts an athlete.
 * 
 * @author Lukas Spooner
 *
 */
public class Athlete {
    protected String name;
    protected Country homeCountry;
    protected int skill;
    protected int medals;
    
    /**
     * This is the default constructor of the class.
     */
    public Athlete() {
        this.name = "DEFAULT";
        this.homeCountry = Country.selectRandomCountry();
        this.skill = 5;
        this.medals = 0;
    }
    
    /**
     * This is the constructor for the class.
     * 
     * @param name - the String value to be set for the instance variable name.
     * @param home - the Country value to be set for the instance variable homeCountry.
     * @param skill - the int value to be set for the instance variable skill.
     * @param medals - the int value to be set for the instance variable medals.
     */
    public Athlete (String name, Country home, int skill, int medals) {
        this.name = name;
        this.homeCountry = home;
        this.skill = skill;
        this.medals = medals;
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
     * @param name - the String value to be set as the new value of the instance variable name
     */
    public void setName(String name) throws IllegalArgumentException {
        if (name.length() > 1)
            this.name = name;
        else {
            this.name = "DEFAULT";
        }
    }
    
    /**
     * This is an accessor method for the instance variable homeCountry
     * 
     * @return - returns the Country value of homeCountry.
     */
    public Country getHomeCountry() {
        return homeCountry;
    }
    
    /**
     * This is the mutator method for the instance variable homeCountry
     * 
     * @param name - the Country value to be set as the new value of the instance variable homeCountry
     */
    public void setHomeNation(Country home) throws IllegalArgumentException {
        homeCountry = home;
    }
    
    /**
     * This is an accessor method for the instance variable skill
     * 
     * @return - returns the int value of skill.
     */
    public int getSkill() {
        return skill;
    }
    
    /**
     * This is the mutator method for the instance variable skill
     * 
     * @param name - the int value to be set as the new value of the instance variable skill
     */
    public void setSkill(int skill) throws IllegalArgumentException {
        if (skill >=0 && skill <= 10) {
            this.skill = skill;
        } else {
            this.skill = 0;
        }    
    }
    
    /**
     * This is an accessor method for the instance variable medals
     * 
     * @return - returns the int value of medals.
     */
    public int getMedals() {
        return medals;
    }
    
    /**
     * This is the mutator method for the instance variable medals
     * 
     * @param name - the int value to be set as the new value of the instance variable medals
     */
    public void setMedals(int medals) throws IllegalArgumentException {
        if (medals < 0) {
            this.medals = 0;
        } else {
            this.medals = medals;
        }    
    }
    
    /**
     * This method ovverrides the default method for equals and compares two Athletes to one another.
     * 
     * @param a - the Athlete value to be compared to another.
     * @return - returns true if the two Athlete objects are identical and false if they are not.
     */
    public boolean equals (Athlete a) {

        if (a == null)
        	return false;
        
        if (getClass() != a.getClass())
            return false;
        
        if ((getName().equalsIgnoreCase (a.getName())) &&
            (getHomeCountry() == a.getHomeCountry()) &&
            (getSkill() == a.getSkill()) &&
            (getMedals() == a.getMedals()))
            return true;
        
        else return false;    
            
    }
    
    /**
     * Returns a string representation of the Athlete class.
     */
    public String toString () {
        return "Athlete name: " + getName() + ", Home Country: " + getHomeCountry() + 
        	   ", Skill level: " + getSkill() + ", Number of medals: " + medals;
    }
    
    
}
