package dao.Imple;

import Util.UtilClass;
import singleton.SingletonClass;

public class DeleteClass {
	public DeleteClass() {
	}
	
	public void delete(String name) {
		SingletonClass si = SingletonClass.getInstance();
		int index = UtilClass.search(name, si.getList());
		if(index == -1) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		
		si.getList().remove(index);
		System.out.println("선수 명단에서 삭제하였습니다");
		System.out.println(si.getList().toString());
	}
}