package WorldObjeckt.AnimateObj;
import Interfaces.Interaction;
import ParametersAll.*;
import GameLogic.*;


public class Player extends Creature implements Interaction {

	public Player(String name) {
		super(name, "Gamer", new Parameters(125, 2, 0));
	}

	@Override
	public void interact(Creature things) {
		System.out.println(this.getParameters().getHealPoints());
		if(things instanceof Enemy) {
			System.out.println("{enemy} " +things.getInformation() +" " +things.getName());
		    System.out.println(things.getParameters().getHealPoints());
			Fight.blow(this, things);
		}
		else
			System.out.println("{thisis} " +things.getInformation() +" " +things.getName());
	}
}
