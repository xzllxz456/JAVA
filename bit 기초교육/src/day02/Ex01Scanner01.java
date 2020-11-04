package day02;
//사용자로부터 
//나이, 이름, 국어, 영어, 수학 순으로 입력 받아서
// 나이: 15세, 이름: 조재영
// 국어: 080점, 영어: 081점, 수학: 080점
// 총점: 241점, 평균: 80.333333점
// 요로케 출력되는 프로그램을 한번 작성해보세요(15분)
import java.util.Scanner;
public class Ex01Scanner01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		String name;
		int korean, english, math;
		
		System.out.print("나이: ");
		age = scanner.nextInt();
		
		System.out.print("이름: ");
		scanner.nextLine();
		name = scanner.nextLine();
		
		System.out.print("국어: ");
		korean = scanner.nextInt();
		
		System.out.print("영어: ");
		english = scanner.nextInt();
		
		System.out.print("수학: ");
		math = scanner.nextInt();
		
		System.out.println("나이: "+age+"세, 이름: "+name);
		System.out.println("국어: "+korean+"점, 영어: "+english+"점, 수학: "+math+"점");
		
		int sum = korean + english + math;
		double average = sum / 3.0;
		
		System.out.println("총점: "+sum+"점, 평균: "+average+"점");
		
		scanner.close();
	}
}













