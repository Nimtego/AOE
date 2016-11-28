package WorldObjeckt.InanimateObj.AmmunitionObj;

import WorldObjeckt.AnimateObj.Creature;
import WorldObjeckt.InanimateObj.Ammunition;

/**
 * Created by nimtego_loc on 23.11.2016.
 */
public class Gold extends Ammunition {
    private long gold;

    public Gold() {
        this(0);
    }


    public Gold(long gold) {
        this("Gold", "For payment", gold);
    }
    public Gold(String name, String information, long gold) {
        super(name, information);
        this.gold = gold;
    }
    public long getGold() {
        return gold;
    }
    public void setGold(long gold) {
        this.gold = gold;
    }

}
