package day02;
// if - else 구조란
// 만약 if문의 조건식이 false가 나왔을 때
// 무조건 else 코드 블락이 실행이 되는 구조이다.

public class Ex07IfElse01 {
	public static void main(String[] args) {
		int number = -5;
		if(number >= 0) {
			System.out.println("number의 현재값: "+number);
			System.out.println(number+"는 자연수입니다.");
		}else {
			System.out.println("number의 현재값: "+number);
			System.out.println(number+"는 음의 정수입니다.");
		}
		
		
		System.out.println("프로그램의 가장 마지막 줄");
	}
}
