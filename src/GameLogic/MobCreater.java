package GameLogic;
import WorldObjeckt.AnimateObj.*;
import WorldObjeckt.AnimateObj.EnemyCollection.*;
import Utilits.*;

public class MobCreater {
	public static int numberMobsCreated = 0;

	public static Enemy createdMobInSpot() {
		if(Rand.getRandIntForMobCreater(1, 10) == 3) {
			numberMobsCreated++;
			return new Bat();
		}
		else
			return null; // если return null то хрень получается
	}
}
