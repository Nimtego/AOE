package WorldMap;
import AOEException.NotCorrectEnteringException;

import java.awt.Point;

public class WorldMap {
	private String information;
	private LocalMap[][] localMap;
	private final Point maxLocalPoint;
	
	public WorldMap(final int maxLocalMapX, final int maxLocalMapY) {
		this.information = "World map";
		maxLocalPoint = new Point(maxLocalMapX, maxLocalMapY);
		localMap = new LocalMap[maxLocalMapX][maxLocalMapY];
		setLocalMap();
	}

	public void setLocalMap() {
		for (int i = 0; i< maxLocalPoint.x; i++) {
			for (int j = 0; j< maxLocalPoint.y; j++) {
				localMap[i][j] = new LocalMap("Local map");
			}
		}	
	}

	public String getInformation() {return information;}
	public void setInformation(String information) {this.information = information;}
	public LocalMap getLocalMapByCoordinat(final Point pointOfLocalMap) throws NotCorrectEnteringException{
		if (pointOfLocalMap.x > maxLocalPoint.x || pointOfLocalMap.x < 0 ||
				pointOfLocalMap.y > maxLocalPoint.y || pointOfLocalMap.y < 0) {
			throw new NotCorrectEnteringException("Не коректные координаты");
		}
		return localMap[pointOfLocalMap.x][pointOfLocalMap.y];
	}
	public LocalMap[][] getLocalMap() {return localMap;}
	public void setLocalMap(LocalMap[][] localMap) {this.localMap = localMap;}
	public int getMaxLocalMapX() {return maxLocalPoint.x;}
	public int getMaxLocalMapY() {return maxLocalPoint.y;}
}
