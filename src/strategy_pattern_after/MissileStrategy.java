package strategy_pattern_after;

public class MissileStrategy implements AttackStrategy{

	@Override
	public void attack() {
		System.out.println("Missile attack !");
	}

}
