
import WorldObjeckt.AnimateObj.Player;
import GameLogic.*;
import WorldMap.*;
import WorldObjeckt.AnimateObj.EnemyCollection.*;
import WorldObjeckt.InanimateObj.AmmunitionObj.AmmunitionCollection.Boots.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start");
		WorldMap worldMap = new WorldMap();
		System.out.println("Локальных карт создано: " +LockalMap.num);
		System.out.println("Spot создано: " +Spot.num);
		System.out.println("Мобов создано: " +MobCreater.numberMobsCreated);
		Player player = new Player("Fred");
		System.out.println(player);
		worldMap.landingInLockalMap(player);
		Bat bat = new Bat();
		player.interact(player);
		player.interact(new LeatherBoots());
		bat.interact(player);
	}
}
