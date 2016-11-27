package GameLogic;

import Utilits.UserChoice;
import WorldObjeckt.AnimateObj.Player;

/**
 * Created by nimtego_loc on 27.11.2016.
 */
public class PlayerCreater {
    public static Player create () {
        System.out.print("Введите имя ");
        String name = UserChoice.setString();
        return new Player(name);
    }
}
