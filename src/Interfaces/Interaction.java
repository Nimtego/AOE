package Interfaces;
import WorldObjeckt.AnimateObj.*;
import WorldObjeckt.InanimateObj.*;

public interface Interaction {
	void interact(Ammunition things);
	void interact(Creature things);
	String fullInformation();
}
