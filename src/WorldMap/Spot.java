package WorldMap;
import WorldObjeckt.*;
import GameLogic.*;
import java.util.ArrayList;
import WorldObjeckt.InanimateObj.AmmunitionObj.AmmunitionCollection.Boots.*;

public class Spot {
	String information;
	ArrayList<WorldObj> spotObj;
	public static int num = 0;

	public Spot(String information) {
		num++;
		setInformation(information);
		spotObj = new ArrayList<WorldObj>();
	//	spotObj.get(0) = MobCreater.createdMobInSpot();
		spotObj.add(MobCreater.createdMobInSpot());
	//	setSpotObj(new WorldObj());
	//	System.out.println("Spot created " +num);
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public void setSpotObj(WorldObj set) {
		spotObj.add(set);
	}
	
	public ArrayList getWorldObj() {
		return spotObj;
	}
}
