package WorldObjeckt.InanimateObj;
import ParametersAll.*;
import WorldObjeckt.*;

public class AmmunitionHelp extends Ammunition {
	Parameters parameters;
	public AmmunitionHelp() {
		super("Empty", "Empty");
		parameters = new Parameters();
	}
	public AmmunitionHelp(String name, String information,int healPoints, int pAtack,int mAtack, int pDef, int mDef, int block, int parry, 
							  int critChens, int powerOfCrit, int speedAtack) {
		super(name, information);
		parameters = new Parameters(healPoints, pAtack, mAtack, pDef, mDef, block, parry, 
									critChens, powerOfCrit, speedAtack);

	}
}
