package constructingAnObject;

/**
 * Class to create a single standard pool ball as an object.
 * @author Jake
 *
 */
public class PoolBall {
	/**
	 * The number on the ball
	 */
	private int number;
	/**
	 * The color of the ball
	 */
	private String color;
	
	/**
	 * Constructor for pool ball class
	 * @param givenNum
	 * 	The number of the ball to be constructed
	 * @param givenColor
	 * 	The color of the ball to be constructed
	 */
	public PoolBall(int givenNum, String givenColor) {
		number = givenNum;
		color  = givenColor;
	}
	
	/**
	 * Accessor to get the number of the pool ball
	 * @return
	 * 	The number on the ball
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * Accessor to get the color of the pool ball.
	 * @return
	 * 	The color of the ball.
	 */
	public String getColor() {
		return color;
	}

}
