package WorldObjeckt.InanimateObj.AmmunitionObj;
import Constant.TypeOfClothing;
import WorldObjeckt.InanimateObj.*;

public abstract class RightHand extends AmmunitionClothing {
    private final TypeOfClothing typeOfClothing = Constant.TypeOfClothing.RIGHTHAND;
    @Override
    public TypeOfClothing getTypeOfClothing() {
        return typeOfClothing;
    }
}
