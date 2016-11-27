
import ParametersAll.BasicParameters;
import WorldObjeckt.AnimateObj.Player;
import GameLogic.*;
import WorldMap.*;
import WorldObjeckt.AnimateObj.EnemyCollection.*;
import WorldObjeckt.InanimateObj.AmmunitionObj.AmmunitionCollection.Boots.*;

public class Main {
	public static void main(String[] args) {
		Player player = PlayerCreater.create();
		WorldMap worldMap = new WorldMap(1,1);
		BasicParameters basicParameters = BasicParameters.newBuilder().strength(5).
				constitution(5).dexterity(5).intelligence(5).
				knowlege(5).wisdom(5).luck(5).build();
	}
}
