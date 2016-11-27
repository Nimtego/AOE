
import WorldObjeckt.AnimateObj.Player;
import GameLogic.*;
import WorldMap.*;
import WorldObjeckt.AnimateObj.EnemyCollection.*;
import WorldObjeckt.InanimateObj.AmmunitionObj.AmmunitionCollection.Boots.*;

public class Main {
	public static void main(String[] args) {
		Player player = PlayerCreater.create();
		WorldMap worldMap = new WorldMap();
		System.out.println("Мобов создано: " +MobCreater.numberMobsCreated);
		System.out.println(player);
		worldMap.landingInLockalMap(player);
		Bat bat = new Bat();
		player.interact(player);
		player.interact(new LeatherBoots());
		bat.interact(player);
	}
}
