package WorldObjeckt;
import Constant.AllConstant;
import Interfaces.MapObservable;
import WorldMap.*;
import Utilits.Rand;

import java.awt.Point;

abstract public class WorldObj {

	private String name;
	private String information;
	private Coordinate coordinate;

	public WorldObj(final String name, final String information) {
        this(name, information, new Coordinate(new Point(Rand.getRandInt(AllConstant.LOCAL_MAP_SIZE),
                                                         Rand.getRandInt(AllConstant.LOCAL_MAP_SIZE)),
                                               new Point(Rand.getRandInt(AllConstant.SPOT_SIZE),
                                                         Rand.getRandInt(AllConstant.SPOT_SIZE))));
		setName(name);
		setInformation(information);
	}
    public WorldObj(final String name, final String information, final Coordinate coordinate) {
        setName(name);
        setInformation(information);
        this.coordinate = coordinate;
    }
	public void moveCoordinate(final Coordinate coordinate) {
        this.coordinate = coordinate;
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
