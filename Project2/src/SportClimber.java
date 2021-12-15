
/**
 * This class is a subclass of athlete and represendts a sport climber.
 * 
 * @author Lukas Spooner
 *
 */
public class SportClimber extends Athlete {
	private int strength;
	
	/**
     * This is an accessor method for the instance variable strength
     * 
     * @return - returns the int value of strength.
     */
	public int getStrength() {
		return strength;
	}
	
	/**
     * This is the mutator method for the instance variable strength
     * 
     * @param name - the int value to be set as the new value of the instance variable strength
     */
	public void setStrength(int strength) throws IllegalArgumentException {
		this.strength = strength;
	}
	
	/**
	 * This method overrides the getSkill() method in the Athlete class and returns 
	 * the skill plus .5 * stregth to the user 
	 */
	@Override
	public int getSkill() {
		return (int) (skill + (.5 * strength));
	}
	
	/**
	 * This method overrides the Athlete's toString method by simply adding a string representation 
	 * of the SportClimber class to the end of the Athlete class' toString().
	 */
	@Override
	public String toString() {
		return super.toString() + ", Strength: " + strength;
	}
}
