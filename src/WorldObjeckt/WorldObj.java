package WorldObjeckt;
import Interfaces.Interaction;
import WorldObjeckt.AnimateObj.*;
import WorldObjeckt.InanimateObj.*;
import WorldMap.*;
import Utilits.Rand;

abstract public class WorldObj implements Interaction {

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
		coordinate = new Coordinate(Rand.getRandInt(10), Rand.getRandInt(10), Rand.getRandInt(10), Rand.getRandInt(10));
	}
	@Override
	public void interact(Creature creature){};
	@Override
	public void interact(Ammunition things) {
		System.out.println(things.getName());
	}
	@Override
	public String fullInformation(){
		return name + " " + information;
	}
	@Override
	public String toString() {
		return "\nИмя: " +name +"\nИнформация: " +information +"\n" +getCoordinate();
	}
	
	
	final public void setName(String name) {this.name = name;}
	final public void setInformation(String information) {this.information = information; }
	final public void setCoordinate() {this.coordinate = new Coordinate();}
	final public void setCoordinate(int lockalMapX, int lockalMapY, int spotX, int spotY) {
		this.coordinate = new Coordinate(lockalMapX, lockalMapY, spotX, spotY);}
	public String getName() {return name;}
	public String getInformation() {return information;}
	public Coordinate getCoordinate() {return coordinate;}
}
