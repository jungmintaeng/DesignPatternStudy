package pattern.strategy.ex4;

public class BlueDrawStrategy extends DrawStrategy{

	@Override
	public void draw(Ball ball) {
		System.out.println("Blue Draw Strategy");
	}
	
}
