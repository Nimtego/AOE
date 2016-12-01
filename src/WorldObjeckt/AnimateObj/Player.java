package WorldObjeckt.AnimateObj;
import ParametersAll.*;


public class Player extends Creature {

	public Player(String name) {
		super(name, "Gamer", new Parameters(BasicParameters.newBuilder().strength(5).
                                            constitution(5).dexterity(5).intelligence(5).
                                            knowlege(5).wisdom(5).luck(5).build()));
	}
	public Player(Player player) {
        super(player);
    }

}
