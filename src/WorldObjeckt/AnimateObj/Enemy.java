package WorldObjeckt.AnimateObj;
import Interfaces.Interaction;
import ParametersAll.*;
import GameLogic.*;

public class Enemy extends Creature implements Interaction {

	public Enemy(String name, int healPoints, int pAtack, int lvl) {   //  пока так пока нет x y place и не факт что нужны будут
		super(name, "Enemy", new Parameters(healPoints, pAtack, lvl, healPoints / 2));
	}
	@Override
	public String getName(){
		return super.getName();
	}
	@Override
	public void interact(Creature creature) {
		Fight.blow(this, creature);
	}
}
