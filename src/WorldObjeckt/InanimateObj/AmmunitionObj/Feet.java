package WorldObjeckt.InanimateObj.AmmunitionObj;
import Constant.TypeOfClothing;
import WorldObjeckt.InanimateObj.*;

abstract public class Feet extends AmmunitionClothing {
	private final TypeOfClothing typeOfClothing = TypeOfClothing.FEET;
	public Feet(String name, String iformation, int healPoints, int pAtack, int mAtack, int pDef, int mDef, int block, int parry,
				 int critChens, int powerOfCrit, int speedAtack) {
		super(name, iformation + " boots", healPoints, pAtack, mAtack, pDef, mDef, block, parry,
				critChens, powerOfCrit, speedAtack);
	}
	@Override
	public TypeOfClothing getTypeOfClothing() {return typeOfClothing;}
	//"Ring", "Less Ring", rand.nextInt(10)+1, rand.nextInt(5)+1, 2, 0, 1, 2, 0, 0, 1, 0);
	// String type, String name, int healPoints, int pAtack, 
	//	int mAtack, int pDef, int mDef, int block, int parry, 
	//	int critChens, int powerOfCrit, int speedAtack)
}
