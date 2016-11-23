package WorldObjeckt.AnimateObj.EnemyCollection;
import WorldObjeckt.AnimateObj.*;

final public class AllEnemy {
	public static Enemy takeEnemyFromCollection(int part, int num) {
		if(num == 1) return new Rat();
		else         return new Bat();
	}
}
