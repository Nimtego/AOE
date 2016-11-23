package WorldMap;

public class LockalMap {
	String information;
	Spot[][] spot = new Spot[10][10];
	public static int num = 0;

	public LockalMap(String information) {
		num++;
	//	System.out.println("Lockal map created " +num);
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
		return information+num;
	}
	public Spot[][] getSpot() {
		return spot;
	}
	public Spot getSpot(int x, int y) {
		return spot[x][y];
	}
}
