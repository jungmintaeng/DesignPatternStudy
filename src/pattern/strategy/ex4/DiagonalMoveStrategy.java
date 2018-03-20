package pattern.strategy.ex4;

public class DiagonalMoveStrategy extends DirectionStrategy{

	@Override
	public void move(Ball ball) {
		System.out.println("Diagonal Move Strategy");
	}
	
}
