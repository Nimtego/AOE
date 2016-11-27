package WorldMap;

public class LocalMap {
	private String information;
	private Spot[][] spot = new Spot[10][10];

	public LocalMap(String information) {
		setInformation(information);
		setSpot();
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public void setSpot() {
		for (int  i=0; i<spot.length; i++) {
			for (int j=0; j<spot.length; j++) {
				spot[i][j] = new Spot("Lockal map");
			}
		}	
	}
	public String getInformation() {
		return information;
	}
	public Spot[][] getSpot() {
		return spot;
	}
	public Spot getSpot(int x, int y) {
		return spot[x][y];
	}
}
