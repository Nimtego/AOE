package WorldMap;
import WorldObjeckt.*;
import GameLogic.*;
import java.util.ArrayList;

public class Spot {
	private String information;
	private ArrayList<WorldObj> spotObj;

	public Spot(String information) {
		setInformation(information);
		spotObj = new ArrayList<WorldObj>();
		spotObj.add(MobCreater.createdMobInSpot());
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

	public String getInformation() {
		return information;
	}
}
