package types;

import bomb.Bomb;
import bomb.Dynamite;
import weapone.Sword;
import weapone.Weapone;

public class Btype implements AbstractItem {

	@Override
	public Weapone createWeapone() {
		return new Sword();
	}

	@Override
	public Bomb createBomb() {
		// TODO Auto-generated method stub
		return new Dynamite();
	}

}
