package types;

import bomb.Bomb;
import bomb.C4;
import weapone.Gun;
import weapone.Weapone;

public class Atype implements AbstractItem {

	@Override
	public Weapone createWeapone() {
		return new Gun();
	}

	@Override
	public Bomb createBomb() {
		return new C4();
	}

}
