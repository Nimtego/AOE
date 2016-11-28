package WorldObjeckt;
import Interfaces.Interaction;
import WorldObjeckt.AnimateObj.*;
import WorldObjeckt.InanimateObj.*;
import WorldMap.*;
import Utilits.Rand;
import java.awt.Point;

abstract public class WorldObj {

	private String name;
	private String information;
	private Coordinate coordinate;
	
	public WorldObj() {
		System.out.println("World obj created");
		coordinate = new Coordinate();
	}
	public WorldObj(String name, String information) {
		setName(name);
		setInformation(information);
		coordinate = new Coordinate(new Point(Rand.getRandInt(10), Rand.getRandInt(10)),
									new Point(Rand.getRandInt(10), Rand.getRandInt(10)));
	}
	public void moveCoordinate() {

	}
	public String toString() {
		return "\nИмя: " +name +"\nИнформация: " +information +"\n" +getCoordinate();
	}

	final public void setName(String name) {this.name = name;}
	final public void setInformation(String information) {this.information = information; }
	final public void setCoordinate() {this.coordinate = new Coordinate();}
	final public void setCoordinate(final Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	public String getName() {return name;}
	public String getInformation() {return information;}
	public Coordinate getCoordinate() {return coordinate;}
}
