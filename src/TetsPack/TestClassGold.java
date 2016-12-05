package TetsPack;

import AOEException.GoldNegativeException;
import WorldObjeckt.InanimateObj.AmmunitionObj.Gold;

import javax.sound.midi.Soundbank;

/**
 * Created by nimtego_loc on 06.12.2016.
 */
public class TestClassGold {
    public static void main(String[] args) throws GoldNegativeException {
        Gold gold = new Gold(100000);
        Gold gold2 = new Gold(300);
        System.out.println(gold + " " + gold2);
        gold.removePartOfGold(500);
        System.out.println(gold + " " + gold2);
        Gold gold3 = gold.removePartOfGold(100);
        System.out.println(gold + " " + gold2 + " " + gold3);
        gold.removePartOfGold(gold3);
        System.out.println(gold + " " + gold2 + " " + gold3);
        gold.addGold(gold2);
        System.out.println(gold + " " + gold2 + " " + gold3);
        gold.mergeGold(gold2, gold3, gold);
        System.out.println(gold + " " + gold2 + " " + gold3);
        gold.setNumberOfGold(10000);
        System.out.println(gold + " " + gold2 + " " + gold3);
        Gold testMergeGold = new Gold();
        Gold testM = testMergeGold.mergeGold(gold, gold2);
        System.out.println(testMergeGold +"   " +testM);
    }
}
