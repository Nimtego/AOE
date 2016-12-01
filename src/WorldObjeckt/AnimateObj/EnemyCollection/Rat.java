package WorldObjeckt.AnimateObj.EnemyCollection;
import ParametersAll.BasicParameters;
import ParametersAll.Parameters;
import WorldObjeckt.AnimateObj.Enemy;

public class Rat extends Enemy {
	public Rat() {
		super("Rat", new Parameters(BasicParameters.newBuilder().
				strength(3).constitution(2).dexterity(1).
				intelligence(3).knowlege(2).wisdom(2).
				luck(3).build()));
	}
	@Override
	public String getName() {
		return super.getName();
	}
}
