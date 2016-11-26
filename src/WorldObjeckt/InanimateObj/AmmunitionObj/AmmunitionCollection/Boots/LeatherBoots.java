package WorldObjeckt.InanimateObj.AmmunitionObj.AmmunitionCollection.Boots;
import WorldObjeckt.InanimateObj.AmmunitionObj.*;
import Utilits.Rand;

public class LeatherBoots extends Feet {
	String name = "Leather Boot";
	public LeatherBoots() {
		super("Leather Boots", "Light", Rand.getRandInt(10), 
			  Rand.getRandInt(5), 2, 0, 1, 2, 0, 0, 1, 0);
		//"Ring", "Less Ring", rand.nextInt(10)+1, rand.nextInt(5)+1, 2, 0, 1, 2, 0, 0, 1, 0);
		// String type, String name, int healPoints, int pAtack, 
		//	int mAtack, int pDef, int mDef, int block, int parry, 
		//	int critChens, int powerOfCrit, int speedAtack)
			
	}
}

