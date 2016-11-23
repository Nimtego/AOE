package Capacity;

import Constant.TypeOfClothing;
import WorldObjeckt.InanimateObj.AmmunitionClothing;

import java.util.HashMap;

import static Constant.TypeOfClothing.*;

/**
 * Created by nimtego_loc on 23.11.2016.
 */
public class ClothingInUse {
    private HashMap<TypeOfClothing, AmmunitionClothing> clothing =
                new HashMap<TypeOfClothing, AmmunitionClothing>();

    public ClothingInUse() {
        this.clothing.put(HEAD, null);
        this.clothing.put(SHOULDERS, null);
        this.clothing.put(BODY, null);
        this.clothing.put(HANDS, null);
        this.clothing.put(LEGS, null);
        this.clothing.put(FEET, null);
    }
    public HashMap<TypeOfClothing, AmmunitionClothing> getClothing() {
        return clothing;
    }
    public void setClothing(HashMap<TypeOfClothing, AmmunitionClothing> clothing) {
        this.clothing = clothing;
    }
    public AmmunitionClothing getClothingByKey(final TypeOfClothing typeOfClothing) {
        return clothing.get(typeOfClothing);
    }
    public void setClothingByKey(final TypeOfClothing typeOfClothing, final AmmunitionClothing ammunitionClothing) {
        clothing.put(typeOfClothing, ammunitionClothing);
    }
}
