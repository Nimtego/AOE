package WorldObjeckt.AnimateObj.EnemyCollection;
import ParametersAll.BasicParameters;
import ParametersAll.Parameters;
import WorldObjeckt.AnimateObj.Enemy;

public class Bat extends Enemy {
	public Bat() {
		super("Bat", new Parameters(BasicParameters.newBuilder().
							strength(2).constitution(2).dexterity(1).
							intelligence(5).knowlege(2).wisdom(2).
							luck(3).build()));
	}

	@Override
	public String getName() {
		return super.getName();
	}

}
