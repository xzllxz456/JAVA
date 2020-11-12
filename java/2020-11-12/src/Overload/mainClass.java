package Overload;

public class mainClass {
	public static void main(String[] args) {
		/*
		 	Over Load : 함수(메소드) 명은 같고
		 				매개 변수 자료형이나 갯수가 다른것으로 분류하는 것을 의미한다.
		 				
		 	image draw
		 	RGB		-> 배경
		 	RGBA	-> 케릭터
		 	
		 	imageDraw(int x, int y, int a){}
		 	imageDraw(int x, int y){}
		 */
		funcName();
		funcName(123);	// 매개변수 있다 없다.
		funcName('A');	// 다른 자료형
		funcName('B', 234);
		funcName(567, 'C');
		
	}
	
	static void funcName() {
		System.out.println("funcName() 호출");
	}
	
	static void funcName(int i) {
		System.out.println("다른funcName(int i) 호출");
	}
	static void funcName(char c) {
		System.out.println("다른funcName(char c) 호출");
	}
	static void funcName(char c, int i) {
		System.out.println("다른funcName(char c, int i) 호출");
	}
	static void funcName(int i, char c) {
		System.out.println("다른funcName(int i, char c) 호출");
	}
//	static void funcName(char c11) {	매개변수 이름만 다르면 안됨
//	}
	
//	static int funcName() {
//		return 1;						함수 자료형이 다르다고 해서 되는거 아님 함수 이름과 매개변수 자료형 이나 갯수 으로 찾기 떄문
//	}									리턴값으로 구분안됨
	
}
