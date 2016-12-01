package WorldMap;
import AOEException.NotCorrectEnteringException;
import Constant.AllConstant;

import java.awt.Point;

public class WorldMap {
	private static WorldMap instance;
	private String information;
	private LocalMap[][] localMap;
	private final Point maxLocalPoint;

	private WorldMap(final Point amount) {
		this.information = "World map";
		this.maxLocalPoint = amount;
		this.localMap = new LocalMap[amount.x][amount.y];
		setLocalMap();
	}
	public static WorldMap getInstance() {
        if (instance == null) {
            instance = new WorldMap(new Point(AllConstant.LOCAL_MAP_SIZE, AllConstant.LOCAL_MAP_SIZE));
        }
        return instance;
    }

	private void setLocalMap() {
		for (int i = 0; i< maxLocalPoint.x; i++) {
			for (int j = 0; j< maxLocalPoint.y; j++) {
				localMap[i][j] = new LocalMap("Local map");
			}
		}	
	}

	public LocalMap getLocalMapByCoordinat(final Point pointOfLocalMap) throws NotCorrectEnteringException{
		if (pointOfLocalMap.x > maxLocalPoint.x || pointOfLocalMap.x < 0 ||
				pointOfLocalMap.y > maxLocalPoint.y || pointOfLocalMap.y < 0) {
			throw new NotCorrectEnteringException("Не коректные координаты");
		}
		return localMap[pointOfLocalMap.x][pointOfLocalMap.y];
	}

	public String getInformation() {return information;}
	public void setInformation(final String information) {this.information = information;}
	public Point getMaxLocalPoint() {return maxLocalPoint;}
	public LocalMap[][] getLocalMap() {return localMap;}
	public void setLocalMap(final LocalMap[][] localMap) {this.localMap = localMap;}
	public int getMaxLocalMapX() {return maxLocalPoint.x;}
	public int getMaxLocalMapY() {return maxLocalPoint.y;}
}
