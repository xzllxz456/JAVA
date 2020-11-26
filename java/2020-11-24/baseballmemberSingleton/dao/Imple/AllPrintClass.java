package dao.Imple;

import dao.MemberDao;
import dto.Human;
import singleton.SingletonClass;

public class AllPrintClass implements MemberDao {

	@Override
	public void proc() {
		SingletonClass si = SingletonClass.getInstance();
		for (int i = 0; i < si.getList().size(); i++) {
			Human h = si.getList().get(i);
			if(h.getNumber() < 2000) {
				System.out.println("투수: " + h.toString());
			}else {
				System.out.println("타자: " + h.toString());
			}
		}
	}

}
