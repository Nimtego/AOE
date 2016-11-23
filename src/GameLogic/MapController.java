package GameLogic;
import WorldObjeckt.*;

public class MapController {
	public static void landingInSpot(WorldObj anyWorlObj) {
		int lockalMapX = anyWorlObj.getCoordinate().getLockalMapX();
		int lockalMapY = anyWorlObj.getCoordinate().getLockalMapY();
		int spotX = anyWorlObj.getCoordinate().getSpotX();
		int spotY = anyWorlObj.getCoordinate().getSpotY();
	} 
}
