package day02;
// 사용자로부터 입력을 받아서
// 홀수일 경우에는 홀수입니다! 가 출력되는 프로그램을 작성해보세요(7분)
import java.util.Scanner;
public class Ex07If02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int number = scanner.nextInt();
		
		//홀수란?
		//2로 나눠서 나머지가 1인 숫자
		System.out.println("사용자가 입력한 숫자: "+number);
		if(number % 2 == 1) {
			System.out.println(number+"는 홀수입니다.");
		}
		
		if(number % 2 != 1) {
			System.out.println(number+"는 짝수입니다.");
		}
		
		
		
		scanner.close();
	}
}
