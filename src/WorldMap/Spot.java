package WorldMap;
import WorldObjeckt.*;
import java.util.ArrayList;

public class Spot {
	private String information;
	private ArrayList<WorldObj> spotObj;

	public Spot(String information) {
		this.information = information;
		spotObj = new ArrayList<WorldObj>();
	}
	public void setInformation(String information) {this.information = information;}
	public void setSpotObj(WorldObj worldObj) {spotObj.add(worldObj);}
	public ArrayList getWorldObj() {return spotObj;}
	public String getInformation() {return information;}
}
