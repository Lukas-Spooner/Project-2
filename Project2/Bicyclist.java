

import java.util.Random;

public class Bicyclist extends Athlete {

	private int speed; 
	
	
	public int getSpeed() {
		return endurance;
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
	public string toString() {
		return super.toString() + ", speed: " + speed;
	}
}
