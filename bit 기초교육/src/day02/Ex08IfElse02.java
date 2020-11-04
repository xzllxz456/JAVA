package day02;
// 사용자로부터 나이를 입력받아서
// 성인/미성년자가 출력되는 프로그램을 작성하세요. (5분)
import java.util.Scanner;
public class Ex08IfElse02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력해주세요: ");
		int age = scanner.nextInt();
		if(age >= 18) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다.");
		}
		
		scanner.close();
	}
}
