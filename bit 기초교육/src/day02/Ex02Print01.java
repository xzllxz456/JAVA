package day02;
//자바 콘솔에 출력하는 3가지 방법
// print() : 괄호안의 내용을 출력하고 다음 출력위치는 그 다음칸이 된다.
// println(): 괄호안의 내용을 출력하고 다음 출력위치는 그 다음줄이 된다.
// printf(): 괄호안의 내용을 형식에 맞춰 출력하고 다음 출력 위치는 그 다음칸이 된다.

// 공백문자
// 공백문자는 공백을 넣는 문자로써 주로 탭 문자 나 개행 문자가 쓰이게 된다.
// 탭 문자: \t 로 적으며 스페이스 4개 분량이 띄어진다.
// 개행 문자: \n 으로 적으며 다음 줄로 줄을 변경한다.
public class Ex02Print01 {
	public static void main(String[] args) {
		//print 부터 테스트 해보자
		System.out.print("abc");
		System.out.print("DEF");
		System.out.print("\tghi");
		System.out.print("\nJKL");
		
		//println 을 테스트해보자
		System.out.println("ABC");
		System.out.println("def");
		System.out.println("\tGHI");
		System.out.println("\njkl");
	}
}













