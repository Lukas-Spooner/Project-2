package edu.century.project;

public class Skateboarder extends Athlete {
	private int style;
	
	public int getStyle() {
		return style;
	}
	
	public void setStyle(int style) {
		this.style = style;
	}
	
	@Override
	public int getSkill() {
		return skill + (1 * style);
	}
	
	@Override
	public string toString() {
		return super.toString() + ", Style: " + style;
	}
}
