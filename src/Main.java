
import AOEException.NotCorrectEnteringException;
import ParametersAll.BasicParameters;
import WorldObjeckt.AnimateObj.Creature;
import WorldObjeckt.AnimateObj.Player;
import GameLogic.*;
import WorldMap.*;
import WorldObjeckt.AnimateObj.EnemyCollection.*;
import WorldObjeckt.InanimateObj.AmmunitionObj.AmmunitionCollection.Boots.*;
import WorldObjeckt.InanimateObj.AmmunitionObj.Gold;
import WorldObjeckt.WorldObj;

public class Main {
	public static void main(String[] args) throws NotCorrectEnteringException {
		Player player = PlayerCreater.create();
		MapController.setWorldObjInSpot(player);
		WorldMap worldMap = WorldMap.getInstance();
		BasicParameters basicParameters = BasicParameters.newBuilder().strength(5).
				constitution(5).dexterity(5).intelligence(5).
				knowlege(5).wisdom(5).luck(5).build();
	}
}
