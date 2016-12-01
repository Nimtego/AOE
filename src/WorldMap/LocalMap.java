package WorldMap;
import AOEException.NotCorrectEnteringException;
import java.awt.*;

public class LocalMap {
	private final String information;
	private final Spot[][] spot;
	private final Point maxSpotPoint;

	public LocalMap(final String information) {
		this(information, new Point(10,10));
	}
	public LocalMap(final String information, final Point amount) {
		this.information = information;
		spot = new Spot[amount.x][amount.y];
		maxSpotPoint = amount;
		setSpot();
	}
	private void setSpot() {
		for (int  i=0; i<spot.length; i++) {
			for (int j=0; j<spot[i].length; j++) {
				spot[i][j] = new Spot("Local map");
			}
		}	
	}

	public int getSpotSizeX() {return maxSpotPoint.x;}
	public int getSpotSizeY() {return maxSpotPoint.y;}
	public String getInformation() {return information;}
	public Spot[][] getSpot() {return spot;}
	public Spot getSpotByCoordinat(final Point pointOfSpot) throws NotCorrectEnteringException {
		if (pointOfSpot.x > maxSpotPoint.x || pointOfSpot.x < 0 || pointOfSpot.y > maxSpotPoint.y || pointOfSpot.y < 0) {
			throw new NotCorrectEnteringException("Неверная координата");
		}
		return  spot[pointOfSpot.x][pointOfSpot.y];
	}
}
