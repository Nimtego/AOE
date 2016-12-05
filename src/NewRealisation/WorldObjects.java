package NewRealisation;

import ParametersAll.Parameters;
import WorldObjeckt.WorldObj;

/**
 * Created by nimtego_loc on 03.12.2016.
 */

abstract class WorldObject {
    private String name;
    private String information;
    private WorldObjectBehavior behavior;

    public WorldObject(final String name, final String information, final WorldObjectBehavior behavior) {
        this.name = name;
        this.information = information;
        this.behavior = behavior;
    }
    public void workInBehavior() {
        behavior.viewInformation(this);
    }
    public void setBehavior(WorldObjectBehavior behavior) {this.behavior = behavior;}
    public WorldObjectBehavior getBehavior(){return behavior;}
}
class Creatyr extends WorldObject {
    private Parameters parametrs;

    public Creatyr() {
        super("NO", "NO", new CreatyrBehavior());
        this.parametrs = new Parameters();
    }
}
class Stuff extends WorldObject {
    private Parameters parametrs;

    public Stuff() {
        super("NO", "NO", new StuffBehavior());
        this.parametrs = new Parameters();
    }
}

class InBagedg implements WorldObjectBehavior {
    @Override
    public void viewInformation(WorldObject worldObject) {

    }
}
class CreatyrBehavior implements WorldObjectBehavior {
    public void viewInformation(WorldObject worldObject) {
        System.out.println("I Creatyr behaver");
        System.out.println("Change");
        worldObject.setBehavior(new StuffBehavior());
    }
}
interface WorldObjectBehavior {
    void viewInformation(WorldObject worldObject);
}
class StuffBehavior implements WorldObjectBehavior {
    public void viewInformation(WorldObject worldObject) {
        if (worldObject.getBehavior() instanceof StuffBehavior) {
            System.out.println("Yes this is stuff behavior. Change!");
            worldObject.setBehavior(new CreatyrBehavior());
        }
        else
            System.out.println(" I Creatyr behaver");

    }
}
class Test {
    public static void main(String[] args) {
        WorldObject creatyr =  new Creatyr();
        for(int i = 5; i > 0; i--)
            creatyr.workInBehavior();
    }
}