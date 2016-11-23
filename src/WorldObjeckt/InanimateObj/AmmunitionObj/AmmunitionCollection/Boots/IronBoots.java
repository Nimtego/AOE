package WorldObjeckt.InanimateObj.AmmunitionObj.AmmunitionCollection.Boots;

import Utilits.Rand;
import WorldObjeckt.InanimateObj.AmmunitionObj.Boots;

/**
 * Created by nimtego_loc on 23.11.2016.
 */
public class IronBoots extends Boots {
    String name = "Leather Boot";
    public IronBoots() {
        super("Iron Boots", "Heavy", Rand.getRandInt(10),
                Rand.getRandInt(8), 2, 0, 1, 5, 0, 0, 1, 0);
        //"Ring", "Less Ring", rand.nextInt(10)+1, rand.nextInt(5)+1, 2, 0, 1, 2, 0, 0, 1, 0);
        // String type, String name, int healPoints, int pAtack,
        //	int mAtack, int pDef, int mDef, int block, int parry,
        //	int critChens, int powerOfCrit, int speedAtack)

    }
}
