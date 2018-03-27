package writingClassDef;

/**
 * Class to hold the logic of a floor rug. Rugs can be any color or size,
 * and can be either rolled up, or unrolled.
 * @author Jake
 *
 */
public class Rug {
	// TODO, Your instance variables, look at the other methods
	// to decide what info you need to save
	
	/**
	 * The constructor. Pay attention to the arguments passed to it.
	 * HINT* Remember that, in general, the constructor arguments are needed to be STORED
	 * information about the object.
	 * 
	 * Rugs are ALWAYS defaulted as rolled until unrolled later after construction.
	 * 
	 * @param length
	 * 	Length of the rug
	 * @param width
	 * 	Width of the rug
	 * @param color
	 * 	Color of the rug
	 */
	public Rug(int length, int width, String color) {
		//TODO
	}
	
	/**
	 * Gets the width of the rug
	 * @return
	 * 	The width of the rug
	 */
	public int getWidth() {
		//TODO
		return -1;
	}
	
	/**
	 * Gets the length of the rug
	 * @return
	 * 	The length of the rug
	 */
	public int getLength() {
		//TODO
		return -1;
	}
	
	/**
	 * Gets the color of the rug
	 * @return
	 * 	The color of the rug
	 */
	public String getColor() {
		//TODO
		return "";
	}
	
	/**
	 * Get whether the rug is rolled up or not.
	 * True if rolled, false if not
	 * @return
	 * 	The rolling-state of the rug
	 */
	public boolean isRolled() {
		//TODO
		return true;
	}
	
	/**
	 * Unrolls the rug if rolled, rolls up the rug in unrolled.
	 */
	public void rollUnroll() {
		//TODO
	}

}
