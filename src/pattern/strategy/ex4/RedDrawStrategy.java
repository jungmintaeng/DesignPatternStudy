package pattern.strategy.ex4;

public class RedDrawStrategy extends DrawStrategy{

	@Override
	public void draw(Ball ball) {
		System.out.println("Red Draw Strategy");
	}

}
