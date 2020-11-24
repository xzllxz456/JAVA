package baseballmain.main;

import java.util.Scanner;

import baseballmain.dao.MemberDaoTree;


public class TreeMainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MemberDaoTree dao = new MemberDaoTree();
		Scanner sc = new Scanner(System.in);
		// 메뉴
		while(true) {
			System.out.println("1. 선수 등록  ");
			System.out.println("2. 선수 삭제  ");
			System.out.println("3. 선수 검색  ");
			System.out.println("4. 선수 수정  ");
			System.out.println("5. 선수 모두 출력");
			System.out.println("6. 데이터의 저장 ");
			System.out.println("7. 데이터 로드");
			System.out.println("9. 종료");
			System.out.println("어느 작업을 하시겠습니까? = ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				dao.insert();
				break;
			case 2:
				dao.delete();
				break;
			case 3:
				dao.select();
				break;
			case 4:
				dao.update();
				break;
			case 5:
				dao.allPrint();
				break;
			case 6:
				dao.save();
				break;
			case 7:
				dao.load();
				break;
			}
			if(num == 9) break;
		}
	}
}
