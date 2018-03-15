package strategy_pattern_after;

public class PunchStrategy implements AttackStrategy{

	@Override
	public void attack() {
		System.out.println("punch attack !");
	}
	
}
