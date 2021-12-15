
import java.util.Random;

/**
 * This class is a subclass of athlete and represendts a bicyclist.
 * 
 * @author Lukas Spooner
 *
 */
public class Bicyclist extends Athlete {
	private int speed; 
	
	/**
     * This is an accessor method for the instance variable speed
     * 
     * @return - returns the int value of speed.
     */
	public int getSpeed() {
		return speed;
	}
	
	/**
     * This is the mutator method for the instance variable speed
     * 
     * @param name - the int value to be set as the new value of the instance variable speed
     */
	public void setSpeed(int speed) throws IllegalArgumentException {
		this.speed = speed;
	}
	
	/**
	 * This method overrides the getSkill() method in the Athlete class and returns 
	 * the skill plus a random number between 1 and 1000 % speed to the user 
	 */
	@Override
	public int getSkill() {
		Random randGen = new Random();
		return skill + ((randGen.nextInt(1000) + 1) % speed);
	}
	
	/**
	 * This method overrides the Athlete's toString method by simply adding a string representation 
	 * of the Bicyclist class to the end of the Athlete class' toString().
	 */
	@Override
	public String toString() {
		return super.toString() + ", speed: " + speed;
	}
}
