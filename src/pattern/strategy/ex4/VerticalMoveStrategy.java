package pattern.strategy.ex4;

public class VerticalMoveStrategy extends DirectionStrategy{

	@Override
	public void move(Ball ball) {
		System.out.println("Vertical Move Strategy");
	}

}
