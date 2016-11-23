package TetsPack;

import WorldObjeckt.AnimateObj.Player;
import WorldObjeckt.InanimateObj.AmmunitionClothing;
import WorldObjeckt.InanimateObj.AmmunitionObj.AmmunitionCollection.Boots.IronBoots;
import WorldObjeckt.InanimateObj.AmmunitionObj.AmmunitionCollection.Boots.LeatherBoots;

/**
 * Created by nimtego_loc on 23.11.2016.
 */
public class TestEkvip {
    public static void main(String[] args) {
        Player player = new Player("Test");
        AmmunitionClothing leatherBoots = new LeatherBoots();
        AmmunitionClothing ironBoots = new IronBoots();
        System.out.println("Имеются\n" +leatherBoots +ironBoots);
        System.out.println("\nПробуем запихнуть в хаш сэт обьекта инвенторю у него \n");
        player.getClothingInUse().setClothingByKey(leatherBoots.getTypeOfClothing(), leatherBoots);
        System.out.println("Пробуем есчо\n");
        player.getClothingInUse().setClothingByKey(ironBoots.getTypeOfClothing(), ironBoots);

    }
}
