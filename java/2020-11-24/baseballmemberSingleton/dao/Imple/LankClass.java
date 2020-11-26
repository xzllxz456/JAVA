package dao.Imple;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.MemberDao;
import dto.Human;
import dto.Pitcher;
import dto.Batter;
import singleton.SingletonClass;

public class LankClass implements MemberDao{
	
	public LankClass() {
		
	}

	@Override
	public void proc() {
		SingletonClass si = SingletonClass.getInstance();
//		Map<Integer, Human> map= new HashMap<Integer, Human>();
//		for (int i = 0; i < si.getList().size(); i++) {
//			map.put(i, si.getList().get(i));
//		}
//		
		
		/*
		List<Human> pi = new ArrayList<Human>();
		List<Human> ba = new ArrayList<Human>();
		
		for (int i = 0; i < si.getList().size(); i++) {
			if (si.getList().get(i) instanceof Pitcher) {
				pi.add(si.getList().get(i));
			}else if(si.getList().get(i) instanceof Batter) {
				ba.add(si.getList().get(i));
			}
		}
//		List<Human> pi1 = sort(pi);
//		List<Human> ba1 = sort(ba);
		ba = sort(ba);
		pi = sort(pi);
		for (int i = 0; i < pi.size(); i++) {
			System.out.println(pi.get(i));
		}
		System.out.println("==============================");
		for (int i = 0; i < ba.size(); i++) {
			System.out.println(ba.get(i));
		}
		*/
	}
	/*
	public List<Human> sort(List<Human> list) {
		Human h = null;
		
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if(list.get(i) instanceof dto.Pitcher && list.get(j) instanceof Pitcher) {
					double num1 = ((Pitcher)list.get(i)).getDefence();
					double num2 = ((Pitcher)list.get(j)).getDefence();
					if(num1 < num2) {
						h = list.get(i);
						list.set(i, list.get(j));
						list.set(j, h);
					}
				}else if(list.get(i) instanceof dto.Batter && list.get(j) instanceof Batter) {
					double num1 = ((Batter)list.get(i)).getHitAvg();
					double num2 = ((Batter)list.get(j)).getHitAvg();
					if(num1 < num2) {
						h = list.get(i);
						list.set(i, list.get(j));
						list.set(j, h);
					}
				}
			}
		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		
		return list;
	}
	
	*/
	
}
