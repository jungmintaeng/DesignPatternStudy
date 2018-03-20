package pattern.strategy.before;

public class TaekwonV extends Robot{

	public TaekwonV(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Missile Attack !");
	}

	@Override
	public void move() {
		System.out.println("I can only walk !");
	}
	
}
