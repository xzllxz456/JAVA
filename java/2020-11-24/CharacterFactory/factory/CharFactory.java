package factory;

import bomb.Bomb;
import types.AbstractItem;
import weapone.Weapone;

public class CharFactory {
	
	public Weapone m_weapon;
	public Bomb m_bomb;
	
	public void create(AbstractItem ai) {
		m_weapon = ai.createWeapone();
		m_bomb = ai.createBomb();
	}
}
