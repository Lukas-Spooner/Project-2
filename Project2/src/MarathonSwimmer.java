
/**
 * This class is a subclass of athlete and represendts a marathon swimmer.
 * 
 * @author Lukas Spooner
 *
 */
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
