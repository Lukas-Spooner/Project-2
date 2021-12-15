
/**
 * This class is a subclass of athlete and represendts a skateboarder.
 * 
 * @author Lukas Spooner
 *
 */
public class Skateboarder extends Athlete {
	private int style;
	
	/**
     * This is an accessor method for the instance variable style
     * 
     * @return - returns the int value of style.
     */
	public int getStyle() {
		return style;
	}
	
	/**
     * This is the mutator method for the instance variable style
     * 
     * @param name - the int value to be set as the new value of the instance variable style
     */
	public void setStyle(int style) throws IllegalArgumentException {
		this.style = style;
	}
	
	/**
	 * This method overrides the getSkill() method in the Athlete class and returns 
	 * the skill plus 1 * style to the user 
	 */
	@Override
	public int getSkill() {
		return skill + (1 * style);
	}
	
	/**
	 * This method overrides the Athlete's toString method by simply adding a string representation 
	 * of the Skateboarder class to the end of the Athlete class' toString().
	 */
	@Override
	public String toString() {
		return super.toString() + ", Style: " + style;
	}
}
