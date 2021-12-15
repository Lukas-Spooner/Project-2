

public class MarathonSwimmer extends Athlete {
	private int endurance;
	
	public int getEndurance() {
		return endurance;
	}
	
	public void setEndurance(int endurance) throws IllegalArgumentException {
		this.endurance = endurance;
	}
	
	@Override
	public int getSkill() {
		return skill + (100 * endurance);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Endurance: " + endurance;
	}
	
}
