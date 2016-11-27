package WorldObjeckt.InanimateObj.AmmunitionObj;
import Constant.TypeOfClothing;
import WorldObjeckt.InanimateObj.*;
import static Constant.TypeOfClothing.HEAD;

public abstract class Head extends AmmunitionClothing {
    private final TypeOfClothing typeOfClothing = HEAD;
    @Override
    public TypeOfClothing getTypeOfClothing() {
        return typeOfClothing;
    }
}
