package pattern.strategy.before;

public class Atom extends Robot {

	public Atom(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Punch Attack !");
	}

	@Override
	public void move() {
		System.out.println("I can fly !");
	}
}
