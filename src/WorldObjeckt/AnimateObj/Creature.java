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

	public Creature(final String name, final String information, final Parameters parameters) {
		super(name,information);
		this.inventory = new Inventory();
		this.clothingInUse = new ClothingInUse();
		this.gold = new Gold();
		this.parameters = parameters;
	}
	public Creature(final Creature creature) {
		super(creature.getName(), creature.getInformation());
		this.inventory = creature.getInventory();
		this.clothingInUse = creature.getClothingInUse();
		this.gold = creature.getGold();
		this.parameters = creature.getParameters();

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
