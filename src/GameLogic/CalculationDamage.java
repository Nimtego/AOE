package GameLogic;
import WorldObjeckt.AnimateObj.*;
import Utilits.Rand;

public class CalculationDamage {
	public static int givesDamage(Creature first, Creature second) {
		int chanceOfCrit = first.getParameters().getCritChens();
		int powerOfCrit = first.getParameters().getPowerOfCrit();
		int damage = first.getParameters().getPAtack() * chanceOfCrit(chanceOfCrit, powerOfCrit);
		int pdef = second.getParameters().getPDef();
		return damage - (Rand.getRandInt(pdef / 4, pdef) / 10);
	}

	private static int chanceOfCrit(int critChance, int powerOfCrit) {
		return Rand.getRandInt(1000) <= critChance ? powerOfCrit : 1;
	}
	
}
