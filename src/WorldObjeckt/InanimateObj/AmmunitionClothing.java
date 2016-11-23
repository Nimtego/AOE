package WorldObjeckt.InanimateObj;
import ParametersAll.*;
import WorldObjeckt.*;
import WorldMap.*;

abstract public class AmmunitionClothing extends Ammunition {
	private Parameters parameters;
	public AmmunitionClothing() {
		super("Empty", "Empty");
		parameters = new Parameters();
	}
	public AmmunitionClothing(String name, String information,int healPoints, int pAtack,int mAtack, int pDef, int mDef, int block, int parry, 
					  int critChens, int powerOfCrit, int speedAtack) {
		super(name, information);
		parameters = new Parameters(healPoints, pAtack, mAtack, pDef, mDef, block, parry, 
									critChens, powerOfCrit, speedAtack);
	}
	public Parameters getParameters() {
		return parameters;
	}
	
}
