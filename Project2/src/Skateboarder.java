import java.util.Random;

public class Skateboarder extends Athlete {
	private int style;
	
	public int getStyle() {
		return style;
	}
	
	public void setStyle(int style) throws IllegalArgumentException {
		this.style = style;
	}
	
	@Override
	public int getSkill() {
		return skill + (1 * style);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Style: " + style;
	}
}
