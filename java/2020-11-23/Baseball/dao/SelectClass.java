package dao;

import java.util.List;
import java.util.Scanner;

import dto.Human;
import single.SingleClass;

public class SelectClass {
	Scanner sc = new Scanner(System.in);
	public SelectClass() {
	}
	
	public void select() {
		SingleClass sgtc = SingleClass.getSi();
		System.out.print("검색하고 싶은 선수 명 = ");
		String name = sc.next();
		
		List<Integer> indexList = UtilClass.searchAll(name);
		
		if(indexList.size() == 0) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		
		for (int i = 0; i < indexList.size(); i++) {
			Human h = sgtc.list.get( indexList.get(i) );
			System.out.println(h.toString());
		}		
	}
}
