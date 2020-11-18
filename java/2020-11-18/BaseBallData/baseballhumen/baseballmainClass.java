package baseballhumen;

import java.util.Scanner;


public class baseballmainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BaseBalldao bbdao = new BaseBalldao(20);
		while(true) {
			System.out.println("1. 선수 등록  ");
			System.out.println("2. 선수 삭제  ");
			System.out.println("3. 선수 검색  ");
			System.out.println("4. 선수 수정  ");
			System.out.println("5. 선수 모두 출력");
			System.out.println("6. 데이터의 저장 ");
			System.out.println("7. 종료");
			System.out.println("어느 작업을 하시겠습니까? = ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				bbdao.insert();
				break;
			case 2:
				bbdao.delete();
				break;
			case 3:
				bbdao.select();
				break;
			case 4:
				bbdao.update();
				break;
			case 5:
				bbdao.allPrint();
				break;
			case 6:
				
				break;
			}
			if(num == 7) break;
		}
	}
}

