package GameLogic;
import AOEException.NotCorrectEnteringException;
import WorldMap.*;
import WorldObjeckt.*;

import java.awt.Point;

public class MapController {
	public static void changeCoordinate(final WorldObj worldObj,
                                        final Point pointOfLocalMap,
                                        final Point pointOfSpot) {
        worldObj.setCoordinate(new Coordinate(pointOfLocalMap, pointOfSpot));
	}
	public static LocalMap getLocalMapForSeting(final WorldObj worldObj,
                                        final WorldMap worldMap,
                                        final Point pointOfLocalMap) throws NotCorrectEnteringException {
        return worldMap.getLocalMapByCoordinat(pointOfLocalMap);
    }
    public static Spot getSpotForSeting(final LocalMap localMap, final Point pointOfSpot) throws NotCorrectEnteringException {
        return localMap.getSpotByCoordinat(pointOfSpot);
    }
    public  static void setWorldObjInSpot(final WorldObj worldObj, Spot spot) {
        spot.setSpotObj(worldObj);
    }
}
