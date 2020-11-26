package types;

import bomb.Bomb;
import weapone.Weapone;

public interface AbstractItem {
	public Weapone createWeapone();
	public Bomb createBomb();
}
