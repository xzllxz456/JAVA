package day02;
//사용자로부터 점수를 입력받아서
// 90~100: A
// 80~89: B
// 70~79: C
// 60~69: D
// ~59: F
// 가 출력되는 프로그램을 작성하세요 (3시 23분까지)
import java.util.Scanner;
public class Ex10IfElseIf02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력해주세요: ");
		int score = scanner.nextInt();
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		//현재 이 코드의 문젯점은 사용자가 잘못된 점수(100보다 크거나 0보다 작은)를
		//입력하면 잘못된 결과가 나온다.
		//이렇게 입력받은 값이 유효한지 체크하는 과정을 밸리데이션(validation)이라고
		//부르며 여러분들이 코딩할때 매우 중요하다.
		
		//위의 코드는 2가지 방법으로 유효성을 체크할 수 있다.
		//1. if의 조건식을 정확하게 잡아주기
		//   각 조건식의 조건을 정확하게 범위를 잡아준다.
		System.out.println("1. 조건식 정확하게 잡기");
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}else if(score >= 80 && score <= 89) {
			System.out.println("B");
		}else if(score >= 70 && score <= 79) {
			System.out.println("C");
		}else if(score >= 60 && score <= 69) {
			System.out.println("D");
		}else if(score >= 0 && score <= 59) {
			System.out.println("F");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		//2. 중첩if문을 통한 데이터 선검증 후 올바른 값이 입력됬을 때에만
		//   성적 출력
		System.out.println("2. 점수 선검증");
		if(score >= 0 && score <= 100) {
			//올바른 점수이므로 ABCDF 출력되는
			//if-else 실행
			if(score >= 90) {
				System.out.println("A");
			}else if(score >= 80) {
				System.out.println("B");
			}else if(score >= 70) {
				System.out.println("C");
			}else if(score >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}else {
			// 점수가 0에서 100사이가 아니다
			// 즉 음수거나 100을 초과하는 숫자이므로
			// 경고메시지만 출력
			System.out.println("잘못된 입력입니다.");
		}
		
		scanner.close();
	}
}










