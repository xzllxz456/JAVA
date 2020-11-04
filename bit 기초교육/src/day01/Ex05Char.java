package day01;
// char 는 character 의 줄임말로써
// 문자 1개를 관리한다.
// 문자는 당연히 알파벳, 영어, 기본 특수문자 종류만 해당한다.
// char는 2진법 숫자를 하나 가지고 있고
// 그 숫자와 대응되는 문자를 화면에 출력하거나 연산에 사용한다.
// 숫자-문자 대응표는 ASCII 테이블이란 코드테이블을 사용한다.

public class Ex05Char {
	public static void main(String[] args) {
		char myChar = 'A';
		System.out.println("myChar의 현재값: "+myChar);
		myChar = (char)(myChar + 32);
		System.out.println("myChar의 현재값: "+myChar);
		
		// char의 단점
		// 1. 아스키 테이블의 있는 값만 다룰 수 있다.
		// 2. 글자 한개만 다룰 수 있다.
		myChar = '가';
		System.out.println("myChar의 현재값: "+myChar);
	}
}














