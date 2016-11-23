package Capacity;

import WorldObjeckt.InanimateObj.Ammunition;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by nimtego_loc on 23.11.2016.
 */
public class Inventory {
    private ArrayList<Ammunition> listInventory;

    public Inventory() {
        this.listInventory = new ArrayList<>();
    }
    public Inventory(Ammunition ... listOfAmmunition) {
        this.listInventory = new ArrayList<>();
        Collections.addAll(listInventory, listOfAmmunition);
    }
    public ArrayList<Ammunition> getListInventory() {
        return listInventory;
    }

    public void setListInventory(ArrayList<Ammunition> listInventory) {
        this.listInventory = listInventory;
    }
    public void setListInventoryByIndex(final int index, final Ammunition ammunition) {
        listInventory.set(index, ammunition);
    }
}
