package StudentWork22;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 메뉴 (View)
		System.out.println("학생수 입력: ");
		StudentDao stDao = new StudentDao(10);
		while(true) {
			System.out.print("1. 학생 정보 추가  ");
			System.out.print("2. 학생 정보 삭제  ");
			System.out.print("3. 학생 정보 검색  ");
			System.out.print("4. 학생 정보 수정  ");
			System.out.print("5. 학생 정보 모두 출력 ");
			System.out.print("6. 영어 점수의 순위 ");
			System.out.print("7. 종료  ");
			System.out.print("어느 작업을 하시겠습니까? = ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				stDao.insert();
				break;
			case 2:
				stDao.delete();
				break;
			case 3:
				stDao.select();
				break;
			case 4:
				stDao.update();
				break;
			case 5:
				stDao.allprint();
				break;
			case 6:
				stDao.sorting();
				break;
			}
			if(num == 7) break;
		}
	}
}
