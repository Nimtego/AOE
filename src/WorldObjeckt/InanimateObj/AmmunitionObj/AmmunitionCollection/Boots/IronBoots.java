package WorldObjeckt.InanimateObj.AmmunitionObj.AmmunitionCollection.Boots;
import Utilits.Rand;
import WorldObjeckt.AnimateObj.Creature;
import WorldObjeckt.InanimateObj.AmmunitionObj.Feet;

/**
 * Created by nimtego_loc on 23.11.2016.
 */
public class IronBoots extends Feet {
    private final String name;
    public IronBoots() {

        super("Iron Boots", "Heavy", Rand.getRandInt(10),
                Rand.getRandInt(8), 2, 0, 1, 5, 0, 0, 1, 0);
        this.name = "Iron Boots";
        //"Ring", "Less Ring", rand.nextInt(10)+1, rand.nextInt(5)+1, 2, 0, 1, 2, 0, 0, 1, 0);
        // String type, String name, int healPoints, int pAtack,
        //	int mAtack, int pDef, int mDef, int block, int parry,
        //	int critChens, int powerOfCrit, int speedAtack)

    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void interact(Creature creature) {

    }
}
