package WorldObjeckt.AnimateObj;
import ParametersAll.*;
import GameLogic.*;


public class Player extends Creature {

	public Player(String name) {
		super(name, "Gamer", new Parameters(125, 2, 0));
	}

	@Override
	public void interact(Creature creature) {
		System.out.println(this.getParameters().getHealPoints());
		if(creature instanceof Enemy) {
			System.out.println("{enemy} " +creature.getInformation() +" " +creature.getName());
		    System.out.println(creature.getParameters().getHealPoints());
			Fight.blow(this, creature);
		}
		else
			System.out.println("{thisis} " +creature.getInformation() +" " +creature.getName());
	}
}
