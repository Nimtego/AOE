package WorldMap;

public class Coordinate {
	private int lockalMapX;
	private int lockalMapY;
	private int spotX;
	private int spotY;
	
	public Coordinate() {
		setLockalMapX(0);
		setLockalMapY(0);
		setSpotX(0);
		setSpotY(0);
	}
	public Coordinate(int lockalMapX, int lockalMapY, int spotX, int spotY) {
		setLockalMapX(lockalMapX);
		setLockalMapY(lockalMapY);
		setSpotX(spotX);
		setSpotY(spotY);		
	}

	@Override
	public String toString() {
		return "Lockal map x : y - " +getLockalMapX() +" : " + getLockalMapY() +"\nSpot x : y - " + getSpotX() +" : " + getSpotY();
	}
	
	public void moveSpotX(int spotX) {
	//	if(spotX - 1 >=0 || spotX + 1 < ) //fuck
		setSpotX(getSpotX() + spotX);
	}
	public void moveSpotY(int spotXY) {
		setSpotY(getSpotY() + spotY);
	}

	final public void setSpotX(int spotX) {this.spotX = spotX;}
	final public void setSpotY(int spotY) {this.spotY = spotY;}
	final public void setLockalMapY(int lockalMapY) {this.lockalMapY = lockalMapY;}
	final public void setLockalMapX(int lockalMapX) {this.lockalMapX = lockalMapX;}
	public int getSpotX() {return spotX;}
	public int getSpotY() {return spotY;}
	public int getLockalMapY() {return lockalMapY;}
	public int getLockalMapX() {return lockalMapX;}
}
