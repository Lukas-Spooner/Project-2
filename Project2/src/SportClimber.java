

public class SportClimber extends Athlete {
	private int strength;
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) throws IllegalArgumentException {
		this.strength = strength;
	}
	
	@Override
	public int getSkill() {
		return (int) (skill + (.5 * strength));
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Strength: " + strength;
	}
}
