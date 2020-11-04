package day02;
//사용자로부터 국영수 점수를 입력받아서
//평균이 70이상이고 점수가 모두다 60점 이상이면 합격
//만약 위의 조건을 만족하지 않을 시엔 불합격
//만약 잘못된 점수가 입력되면 모든 점수 입력이 끝난 후에
//잘못입력된 점수가 존재합니다. 라고 출력이 되는 프로그램을 작성하세요
//(4시 30분까지)
import java.util.Scanner;
public class Ex12IfElseIf03 {
	final static int NUMBER_OF_SUBJECTS = 3;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int korean = scanner.nextInt();
		System.out.print("영어 점수: ");
		int english = scanner.nextInt();
		System.out.print("수학 점수: ");
		int math = scanner.nextInt();
		
		int sum = korean + english + math;
		double average = sum / (double)NUMBER_OF_SUBJECTS;
		
		//먼저 입력된 점수들이 올바른지부터 체크한다
		boolean isKoreanCorrect = korean >= 0 && korean<= 100;
		boolean isEnglishCorrect = english >= 0 && english <= 100;
		boolean isMathCorrect = math >= 0 && math <= 100;
		
		if(isKoreanCorrect && isEnglishCorrect && isMathCorrect) {
			//올바른 점수이므로 합격/탈락을 if를 통해서 결정
			if(average >= 70 && korean >= 60 && english >= 60 && math >= 60) {   
				System.out.println("합격!!!");
			}else {
				System.out.println("탈락!!!");
			}
		}else {
			//잘못된 점수가 어딘가에 존재한다는 의미이므로 경고메시지 출력
			System.out.println("잘못된 형식의 점수가 존재합니다.");
		}
		
		scanner.close();
	}
}













