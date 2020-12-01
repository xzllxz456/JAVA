package dao.Imple;

import java.util.ArrayList;
import java.util.List;

import dto.Human;

public class UtilClass {
	public static int search(String name, List<Human> list) {
//		List<Human> list = (List<Human>) obj;
		int index = -1;		
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				index = i;
				break;
			}
		}		
		return index; 
	}
	
	public static List<Integer> searchAll(String name, List<Human> list) {		
		List<Integer> indexList = new ArrayList<Integer>();		
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				indexList.add( i );
			}			
		}		
		return indexList;
	}
}