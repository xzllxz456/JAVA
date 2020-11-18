package main;

import dao.MemberDao;

public class mainClass {
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
		// 메뉴
		dao.insert();
		
		dao.allPrint();
		dao.insert();
		dao.insert();
		dao.allPrint();
	}
}
