package WorldObjeckt.AnimateObj;
import WorldObjeckt.InanimateObj.*;
import ParametersAll.*;
import GameLogic.*;

public class Enemy extends Creature /*implements Interactable */{

	private int gold;
	private Ammunition[] arrInventoryAmm = new Ammunition[20];   //у энеми тоже будет амуниция если с него что-то падает то почему он не может это одеть чтоб покрепче быть 
	private Ammunition[] arrPutAmm = new Ammunition[7];  // (зайцы с тапками на талкинг исланде)

	public Enemy(String name, int healPoints, int pAtack, int lvl) {   //  пока так пока нет x y place и не факт что нужны будут
		super(name, "Enemy", new Parameters(healPoints, pAtack, lvl, healPoints / 2));
		setGold((healPoints + pAtack + lvl) / 2);
		setArrPutAmmAll();
		setArrInventoryAmmAll();
	//	setArrInventorySlot(AmmunationCollection.getAmmunation(), 0);
		setArrPutAmmSlot(getInventoryFromSlot(0), 0);
	}

	public void setGold(int gold) {this.gold = gold;}
	public void setArrInventoryAmmAll() {
		for (int i=0; i<arrInventoryAmm.length; i++)
			setArrInventorySlot(new Ammunition(), i);
	}
	public void setArrPutAmmAll() {
		for (int i=0; i<arrPutAmm.length; i++)
			setArrPutAmmSlot(new Ammunition(), i);
	}
	public void setArrPutAmmSlot(Ammunition a, int numberOfSlot) {arrPutAmm[numberOfSlot] = a;}
	public void setArrInventorySlot(Ammunition a, int numberOfSlot)
	{arrInventoryAmm[numberOfSlot] = a;}

	@Override
	public String getName(){
		return super.getName();
	}
	@Override
	public void interact(Creature somfing) {
		Fight.blow(this, somfing);
	}

	public int getGold() {return gold;}
	public Ammunition[] getArrInventoryAmmAll() {return arrInventoryAmm;}
	public Ammunition[] getArrPutAmmAll() {return arrPutAmm;}
	public Ammunition getPutAmmFromSlot(int numberOfSlot) {return arrPutAmm[numberOfSlot];}
	public Ammunition getInventoryFromSlot(int numberOfSlot) {return arrInventoryAmm[numberOfSlot];}

	public void checkSlotInventory(Ammunition dropFromMob) {
		for (int i=0; i<arrInventoryAmm.length; i++) {
			if (arrInventoryAmm[i].getName().equals("NULL")) {
				setArrInventorySlot(dropFromMob, i);
				break;
			}
			else if (i+1 == arrInventoryAmm.length)
				System.out.println("Нет свободной ячейки в инвентаре");
		}
	}
}
