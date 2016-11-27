package WorldObjeckt.AnimateObj;
import Capacity.ClothingInUse;
import Capacity.Inventory;
import WorldObjeckt.*;
import ParametersAll.*;
import WorldObjeckt.InanimateObj.AmmunitionObj.Gold;


abstract public class Creature extends WorldObj {
	private Gold gold;
	private Parameters parameters;
	private Inventory inventory;
	private ClothingInUse clothingInUse;

	public Creature(String name, String information, Parameters parameters) {
		super(name,information);
		inventory = new Inventory();
		clothingInUse = new ClothingInUse();
		gold = new Gold();
		setParameters(parameters);
	}
	public Gold getGold() {return gold;}
	public void setGold(Gold gold) {
		this.gold.setGold(gold.getGold() + this.gold.getGold());
	}
	public ClothingInUse getClothingInUse() {return clothingInUse;}
	public void setClothingInUse(ClothingInUse clothingInUse) {this.clothingInUse = clothingInUse;}
	public Inventory getInventory() {return inventory;}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}
	public Parameters getParameters(){return parameters;}
}
