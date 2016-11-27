package WorldObjeckt.InanimateObj.AmmunitionObj;
import Constant.TypeOfClothing;
import WorldObjeckt.InanimateObj.*;
import static Constant.TypeOfClothing.BODY;

public abstract class Body extends AmmunitionClothing {
    private final TypeOfClothing  typeOfClothing = BODY;
    @Override
    public TypeOfClothing getTypeOfClothing() {
        return typeOfClothing;
    }
}
