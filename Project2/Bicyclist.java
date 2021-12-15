
import java.util.Random;

public class Bicyclist extends Athlete {

	private int speed; 
	
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
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
