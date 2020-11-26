package dao.Imple;

import java.util.Scanner;

import Util.UtilClass;
import dao.MemberDao;
import singleton.SingletonClass;

public class DeleteClass implements MemberDao {
	Scanner sc = new Scanner(System.in);
	public DeleteClass() {
	}
	
	@Override
	public void proc() {
		SingletonClass si = SingletonClass.getInstance();
		System.out.print("삭제하고 싶은 선수의 이름 = ");
		String name = sc.next();
		
		int index = UtilClass.search(name, si.getList());
		
		if(index == -1) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		
		si.getList().remove(index);
		System.out.println("선수 명단에서 삭제하였습니다");

	}

}
