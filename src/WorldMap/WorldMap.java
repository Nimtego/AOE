package WorldMap;
import WorldObjeckt.*;

public class WorldMap {
	private String information;
	private LocalMap[][] localMap = new LocalMap[10][10];
	
	public WorldMap() {
		setInformation("World map");
		setLocalMap();
		System.out.println("World map created");
	}
	
	public void setInformation(String information) {
		this.information = information;
	}
	
	public void setLocalMap() {
		for (int i = 0; i< localMap.length; i++) {
			for (int j = 0; j< localMap.length; j++) {
				localMap[i][j] = new LocalMap("Local map");
			}
		}	
	}
	
	public void landingInLockalMap(WorldObj anyWorldObj) {
		int lockalMapX = anyWorldObj.getCoordinate().getLockalMapX();
		int lockalMapY = anyWorldObj.getCoordinate().getLockalMapY();
		int spotX = anyWorldObj.getCoordinate().getSpotX();
		int spotY = anyWorldObj.getCoordinate().getSpotY();
		localMap[lockalMapX][lockalMapY].getSpot(spotX, spotY).getWorldObj().add(anyWorldObj);
	}
	
	
	
	public String getNameLockal(int x, int y) {
		return localMap[x][y].getInformation();
	}
	public LocalMap getLockalMap(int x, int y) {
		return localMap[x][y];
	}
	public void setLockalMap(LocalMap lockal, int x, int y) {
		localMap[x][y] = lockal;
	}

	public String getInformation() {
		return information;
	}
}
