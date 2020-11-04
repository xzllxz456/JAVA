package day02;
// 사용자로부터
// 이름, 나이, 국어, 영어, 수학 점수를 입력 받아서
// 이름: 조재영 나이: 015세
// 국어: 080점 영어: 081점 수학: 080점
// 총점: 241점 평균: 80.33점
// 의 형식으로 출력이 되게 프로그램을 작성하세요(12시 25분까지)
import java.util.Scanner;
public class Ex04ScoreBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.print("나이: ");
		int age = scanner.nextInt();
		
		System.out.print("국어: ");
		int korean = scanner.nextInt();
		
		System.out.print("영어: ");
		int english = scanner.nextInt();
		
		System.out.print("수학: ");
		int math = scanner.nextInt();
		
		int sum = korean + english + math;
		double average = sum / 3.0;
		
		System.out.printf("이름: %s 나이: %03d세\n", name, age);
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", 
				korean, english, math);
		System.out.printf("총점: %d점 평균: %.2f점\n", sum, average);
		
		scanner.close();
	}
}
