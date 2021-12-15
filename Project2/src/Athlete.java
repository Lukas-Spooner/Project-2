

public class Athlete {
    protected String name;
    protected Country homeCountry;
    protected int skill;
    protected int medals;
    
    public Athlete() {
        this.name = "DEFAULT";
        this.homeCountry = Country.selectRandomCountry();
        this.skill = 5;
        this.medals = 0;
    }
    
    public Athlete (String name, Country home, Sport specialty, int skill, int medals) {
        this.name = name;
        this.homeCountry = home;
        this.skill = skill;
        this.medals = medals;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name.length() > 1)
            this.name = name;
        else {
            this.name = "DEFAULT";
        }
    }
    
    public Country getHomeCountry() {
        return homeCountry;
    }
    
    public void setHomeNation(Country home) {
        homeCountry = home;
    }
    
    public int getSkill() {
        return skill;
    }
    
    public void setSkill(int skill) {
        if (skill >=0 && skill <= 10) {
            this.skill = skill;
        } else {
            this.skill = 0;
        }    
    }
    
    public int getMedals() {
        return medals;
    }
    
    public void setMedals(int medals) {
        if (medals < 0) {
            this.medals = 0;
        } else {
            this.medals = medals;
        }    
    }
    
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
    
    public String toString () {
        return "Athlete name: " + getName() + ", Home Country: " + getHomeCountry() + 
        	   ", Skill level: " + getSkill() + ", Number of medals: " + medals;
    }
    
    
}
