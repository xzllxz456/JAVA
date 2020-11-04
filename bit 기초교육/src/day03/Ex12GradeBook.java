package day03;
// 사용자로부터 국, 영, 수 점수를 입력받아서
// 이름: ###
// 국어: ###점 영어: ###점 수학: ###점
// 총점: ###점 평균: ##.##점
// 이 출력되는 프로그램을 작성하세요
// 단, 사용자가 유효하지 않은 점수를 입력하면
// 올바른 점수가 들어올때까지 다시 입력하도록 만드세요
// 또한, 국, 영, 수 총점은 3자리 오른쪽 정렬하고 왼쪽 빈 공백이 존재할 시에는
// 0으로 채우고 평균은 소숫점 2번째 자리까지 출력되도록
// System.out.printf()를 작성하세요. (2시 35분까지)
import java.util.Scanner;
public class Ex12GradeBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.print("국어: ");
		int korean = scanner.nextInt();
		while(korean < 0 || korean > 100) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("국어: ");
			korean = scanner.nextInt();
		}
		
		System.out.print("영어: ");
		int english = scanner.nextInt();
		while(english < 0 || english > 100) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("영어: ");
			english = scanner.nextInt();
		}
		
		System.out.print("수학: ");
		int math = scanner.nextInt();
		while(math < 0 || math > 100) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("수학: ");
			math = scanner.nextInt();
		}
		
		int sum = korean + english + math;
		double average = sum / 3.0;
		
		System.out.printf("이름: %s\n", name);
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", 
				korean, english, math);
		System.out.printf("총점: %03d점 평균: %.2f점", sum, average);
		
		scanner.close();
	}
}














