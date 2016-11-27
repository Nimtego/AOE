package WorldObjeckt.InanimateObj.AmmunitionObj;
import Constant.TypeOfClothing;
import WorldObjeckt.InanimateObj.*;
import static Constant.TypeOfClothing.LEFTHAND;

public abstract class LeftHand extends AmmunitionClothing {
    private final TypeOfClothing typeOfClothing = LEFTHAND;
    @Override
    public TypeOfClothing getTypeOfClothing() {
        return typeOfClothing;
    }
}
