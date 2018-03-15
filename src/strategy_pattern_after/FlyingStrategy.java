package strategy_pattern_after;

public class FlyingStrategy implements MovingStrategy{

	@Override
	public void move() {
		System.out.println("I can fly !");
	}
	
}
