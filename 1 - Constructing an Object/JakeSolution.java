package constructingAnObject;

public class JakeSolution {
	public static void main(String[] args) {
		PoolBall ball = new PoolBall(34,"cyan");
		System.out.println("Pool ball #" + ball.getNumber() + ", color: " + ball.getColor());
}
