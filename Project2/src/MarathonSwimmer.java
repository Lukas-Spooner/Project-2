
/**
 * This class is a subclass of athlete and represendts a marathon swimmer.
 * 
 * @author Lukas Spooner
 *
 */
public class MarathonSwimmer extends Athlete {
	private int endurance;
	
	/**
     * This is an accessor method for the instance variable endurance
     * 
     * @return - returns the int value of endurance.
     */
	public int getEndurance() {
		return endurance;
	}
	
	/**
     * This is the mutator method for the instance variable endurance
     * 
     * @param name - the int value to be set as the new value of the instance variable endurance
     */
	public void setEndurance(int endurance) throws IllegalArgumentException {
		this.endurance = endurance;
	}
	
	/**
	 * This method overrides the getSkill() method in the Athlete class and returns 
	 * the skill plus 100 * endurance to the user 
	 */
	@Override
	public int getSkill() {
		return skill + (100 * endurance);
	}
	
	/**
	 * This method overrides the Athlete's toString method by simply adding a string representation 
	 * of the MarathonSwimmer class to the end of the Athlete class' toString().
	 */
	@Override
	public String toString() {
		return super.toString() + ", Endurance: " + endurance;
	}
	
}
