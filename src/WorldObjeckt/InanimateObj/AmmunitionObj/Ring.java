package WorldObjeckt.InanimateObj.AmmunitionObj;
import Constant.TypeOfClothing;
import WorldObjeckt.InanimateObj.*;

public class Ring extends AmmunitionClothing {
    private final TypeOfClothing typeOfClothing = TypeOfClothing.RING;
    @Override
    public TypeOfClothing getTypeOfClothing() {
        return typeOfClothing;
    }
}
