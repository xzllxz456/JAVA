package day03;
// 무한루프를 이용한 메뉴 만들어보기

import java.util.Scanner;
public class Ex14Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("=======================");
			System.out.println("비트고등학교 성적관리 프로그램");
			System.out.println("=======================");
			System.out.println("        1. 입력");
			System.out.println("        2. 출력");
			System.out.println("        3. 종료");
			System.out.println("-----------------------");
			System.out.print("> ");
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
				//성적을 입력하는 코드 실행
			}else if(userChoice == 2) {
				//성적을 출력하는 코드 실행
			}else if(userChoice == 3) {
				//종료메시지 출력후 무한루프 종료
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
		
		
		scanner.close();
	}
}
