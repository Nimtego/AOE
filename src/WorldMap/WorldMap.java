package WorldMap;
import WorldObjeckt.*;

public class WorldMap {
	String information;
	LockalMap[][] lockalMap = new LockalMap[10][10];
	
	public WorldMap() {
		setInformation("World map");
		setLockalMap();
		System.out.println("World map created");
	}
	
	public void setInformation(String information) {
		this.information = information;
	}
	
	public void setLockalMap() {
		for (int  i=0; i<lockalMap.length; i++) {
			for (int j=0; j<lockalMap.length; j++) {
				lockalMap[i][j] = new LockalMap("Lockal map");
			}
		}	
	}
	
	public void landingInLockalMap(WorldObj anyWorldObj) {
		int lockalMapX = anyWorldObj.getCoordinate().getLockalMapX();
		int lockalMapY = anyWorldObj.getCoordinate().getLockalMapY();
		int spotX = anyWorldObj.getCoordinate().getSpotX();
		int spotY = anyWorldObj.getCoordinate().getSpotY();
		lockalMap[lockalMapX][lockalMapY].getSpot(spotX, spotY).getWorldObj().add(anyWorldObj);
	}
	
	
	
	public String getNameLockal(int x, int y) {
		return lockalMap[x][y].getInformation();
	}
	public LockalMap getLockalMap(int x, int y) {
		return lockalMap[x][y];
	}
	public void setLockalMap(LockalMap lockal, int x, int y) {
		lockalMap[x][y] = lockal;
	}
}
