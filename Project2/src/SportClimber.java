package edu.century.project;

public class SportClimber extends Athlete {
	private int strength;
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	@Override
	public int getSkill() {
		return skill + (.5 * strength);
	}
	
	@Override
	public string toString() {
		return super.toString() + ", Strength: " + strength;
	}
}
