package WorldMap;
import java.awt.Point;

public class Coordinate {
	private Point pointOfLocalMap;
	private Point pointOfSpot;
	
	public Coordinate() {
		this(new Point(), new Point());
	}
	public Coordinate(final Point pointOfLocalMap, final Point pointOfSpot) {
		this.pointOfLocalMap = pointOfLocalMap;
		this.pointOfSpot = pointOfSpot;
	}
	public Point getPointOfLocalMap() {return pointOfLocalMap;}
	public void setPointOfLocalMap(Point pointOfLocalMap) {this.pointOfLocalMap = pointOfLocalMap;}
	public Point getPointOfSpot() {return pointOfSpot;}
	public void setPointOfSpot(Point pointOfSpot) {this.pointOfSpot = pointOfSpot;}
}
