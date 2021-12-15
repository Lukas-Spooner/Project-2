
import java.util.Random;

/**
 * This class is a subclass of athlete and represendts a bicyclist.
 * 
 * @author Lukas Spooner
 *
 */
public class Bicyclist extends Athlete {

	private int speed; 
	
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) throws IllegalArgumentException {
		this.speed = speed;
	}
	
	@Override
	public int getSkill() {
		Random randGen = new Random();
		return skill + ((randGen.nextInt(1000) + 1) % speed);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", speed: " + speed;
	}
}
