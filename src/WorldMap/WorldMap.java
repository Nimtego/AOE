package WorldMap;

public class WorldMap {
	private String information;
	private LocalMap[][] localMap;
	private final int X;
	private final int Y;
	
	public WorldMap(final int x, final int y) {
		setInformation("World map");
		localMap = new LocalMap[x][y];
		this.X = x;
		this.Y = y;
		setLocalMap();
	}
	
	public void setInformation(String information) {
		this.information = information;
	}
	public void setLocalMap() {
		for (int i = 0; i< localMap.length; i++) {
			for (int j = 0; j< localMap[i].length; j++) {
				localMap[i][j] = new LocalMap("Local map");
			}
		}	
	}
	public LocalMap[][] getLocalMap() {
		return localMap;
	}
	public void setLocalMap(LocalMap[][] localMap) {
		this.localMap = localMap;
	}
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
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
