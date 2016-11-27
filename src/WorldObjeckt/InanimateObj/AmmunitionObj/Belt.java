package WorldObjeckt.InanimateObj.AmmunitionObj;
import Constant.TypeOfClothing;
import WorldObjeckt.InanimateObj.*;
import static Constant.TypeOfClothing.BELT;

public abstract class Belt extends AmmunitionClothing {
    private final TypeOfClothing  typeOfClothing = BELT;

    @Override
    public TypeOfClothing getTypeOfClothing() {
        return typeOfClothing;
    }
}
