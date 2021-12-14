package edu.century.project;

import java.util.Random;

public class Bicyclist extends Athlete {

	private int speed;
	private Random randGen = new Random();
	
	
	public int getSpeed() {
		return endurance;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public int getSkill() {
		return skill + ((randGen.nextInt(1000) + 1) % endurance);
	}
	
	@Override
	public string toString() {
		return super.toString() + ", Endurance: " + endurance;
	}
}
