package dao;

import java.util.Scanner;

import single.SingleClass;

public class DeleteClass {
	Scanner sc = new Scanner(System.in);
	public DeleteClass() {
	}
	public void delete() {
		SingleClass sgtc = SingleClass.getSi();
		System.out.print("삭제할 사람 입력: ");
		String name = sc.next();
		int index = UtilClass.search(name);
		if(index == -1) {
			System.out.println("사람을 찾을수 없음");
		}
		sgtc.list.remove(index);
		System.out.println("삭제 완료");
	}
}
