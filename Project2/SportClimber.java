

public class SportClimber extends Athlete {
	private double strength;
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(double strength) {
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
