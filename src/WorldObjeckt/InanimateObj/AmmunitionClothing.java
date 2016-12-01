package WorldObjeckt.InanimateObj;
import Constant.TypeOfClothing;
import ParametersAll.*;
import WorldObjeckt.*;
import WorldMap.*;

abstract public class AmmunitionClothing extends Ammunition {
	private Parameters parameters;
	public AmmunitionClothing() {
		super("Empty", "Empty");
		parameters = new Parameters();
	}
	public Parameters getParameters() {return parameters;}
	abstract public TypeOfClothing getTypeOfClothing();

	
}
