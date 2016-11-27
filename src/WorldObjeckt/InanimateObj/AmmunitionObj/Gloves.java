package WorldObjeckt.InanimateObj.AmmunitionObj;
import Constant.TypeOfClothing;
import WorldObjeckt.InanimateObj.*;

public abstract class Gloves extends AmmunitionClothing {
    private final TypeOfClothing typeOfClothing = TypeOfClothing.HANDS;
    @Override
    public TypeOfClothing getTypeOfClothing() {
        return typeOfClothing;
    }
}
