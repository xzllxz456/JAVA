package day03;

// 사용자로부터 나이를 입력받아서
// 성인, 미성년자를 출력하는 프로그램을
// switch를 사용해서 작성하세요 (5분)
import java.util.Scanner;

public class Ex02Switch02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이: ");
		int age = scanner.nextInt();
		//switch의 경우
		//결과값이 다양해질 수록
		//난이도가 급상승한다.
		//예를 들어, 미성년자, 성인을 출력하는 이 프로그램 같은 경우에는
		//case를 엄청 많이 만들던지
		//아니면 아래와 같이 변수의 값을 변화시켜서
		//그 결과값을 케이스를 통해서
		//실행할 코드를 결정해주어야 한다.
		//그렇기 때문에 if 보다 사용하는 곳이 적다.
		
		switch (age / 18) {
		case 0:
			System.out.println("미성년자입니다.");
			break;
		default:
			System.out.println("성인입니다.");
			break;
		}

		scanner.close();
	}
}
