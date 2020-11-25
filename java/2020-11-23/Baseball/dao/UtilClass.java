package dao;


import java.util.ArrayList;
import java.util.List;

import dto.Human;
import single.SingleClass;

public class UtilClass {
	
//	static List<Human> list = new ArrayList<Human>();
	public UtilClass() {
//		list = si.list;
	}
	public static void allPrint() {
		SingleClass si = SingleClass.getSi();
		
		for (Human human : si.list) {
			System.out.println(human);
		}
	}
	
	public static int search(String name) {
		SingleClass si = SingleClass.getSi();
		int index = -1;
		for (int i = 0; i < si.list.size(); i++) {
			if(si.list.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static List<Integer> searchAll(String name) {
		SingleClass si = SingleClass.getSi();
		List<Integer>hu = new ArrayList<Integer>();
		for (int i = 0; i < si.list.size(); i++) {
			Human h = si.list.get(i);
			if(name.equals(h.getName())) {
				hu.add( i );
			}			
		}		
		return hu;
	}
}
