package main;

import java.util.ArrayList;
import java.util.List;

import factory.CharFactory;
import types.AbstractItem;
import types.Atype;
import types.Btype;

public class mainCls {
	public static void main(String[] args) {
		CharFactory char1 = new CharFactory();
		char1.create(new Atype());
		
		char1.m_weapon.drawWeapon();
		char1.m_bomb.drawBomb();
		System.out.println("-------------------------");
		// list에 담기
		List<AbstractItem> list = new ArrayList<AbstractItem>();
//		List<CharFactory> list = new ArrayList<CharFactory>();
		AbstractItem[] ai = {new Atype(), new Btype(), new Atype()};
		
		for (int i = 0; i < ai.length; i++) {
			list.add(ai[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			char1.create(list.get(i));
			char1.m_weapon.drawWeapon();
			char1.m_bomb.drawBomb();
			System.out.println("-------------------------");
		}
	}
}
