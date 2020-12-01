package dao.Imple;

import java.util.List;

import Util.UtilClass;
import dto.Human;
import singleton.SingletonClass;

public class SearchClass {
	public SearchClass() {
	}
	public void search(String name) {
		SingletonClass si = SingletonClass.getInstance();
		
		List<Integer> indexList = UtilClass.searchAll(name, si.getList());
		
		if(indexList.size() == 0) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		
		for (int i = 0; i < indexList.size(); i++) {
			Human h = si.getList().get( indexList.get(i) );
			System.out.println(h.toString());
		}		
	}
}