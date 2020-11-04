package day03;
// while은 횟수 제한이 없는 반복문이다.
// 따라서 특정 조건을 계속 체크하여 우리가 원하는 용도로 사용가능하다.

// 사용자가 자연수만 입력할 수 있게 강제하는 프로그램
import java.util.Scanner;
public class Ex11While02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("자연수를 입력해주세요: ");
		int userNumber = scanner.nextInt();
		
		while(userNumber < 0) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("자연수를 입력해주세요: ");
			userNumber = scanner.nextInt();
		}
		
		System.out.println("사용자가 입력한 자연수는 "+userNumber+"입니다.");
		
		scanner.close();
	}
}
