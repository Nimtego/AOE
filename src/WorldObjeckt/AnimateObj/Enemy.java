package WorldObjeckt.AnimateObj;
import Interfaces.Interaction;
import ParametersAll.*;
import GameLogic.*;

public class Enemy extends Creature {

	public Enemy(final String name, final Parameters parameters) {   //  пока так пока нет x y place и не факт что нужны будут
		super(name, "Enemy", parameters);
	}
	@Override
	public String getName(){
		return super.getName();
	}
}
