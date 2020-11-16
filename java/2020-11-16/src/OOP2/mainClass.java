package OOP2;

import OOP2MyClass.MyClass;

public class mainClass {
	public static void main(String[] args) {
		
	/*
	 	Object Oriented Programming
	 	
	 	절차지향			객체지향(분산처리)	
	 	초기화(변수)					
	 	처리1			처리1, 처리2, 처리3
	 	처리2			
	 	처리3
	 	결과
	 	
	 	
	 					class	(묶음)
	 					변수, 메소드(함수)
	 	1. 은닉성(==캡슐화)				
		: 외부와의(접근)차단으로 변수들을 관리할 수 있다.
		class의 내부에서 접근을 제어하도록 접근지정자로 지정한다.
		
		private(개인적인) -> 멤버변수
		public(대중적인) -> 멤버 메소드
		protected(특정) -> 상속에 관련되어 있는 지정자
		
		2. 상속성
		3. 다형성
	 */
		MyClass cls = new MyClass();
		cls.name = "홍길동";
//		cls.number = 12;
//		cls.c = 'A';

		cls.setNumber(12);
		int n = cls.getNumber();
		System.out.println(n);
		System.out.println("cls heap 주소: " + cls);
		System.out.println( cls.getThis() );
		
		MyClass mcls = new MyClass();
		System.out.println("mcls heap 주소: " + mcls);
		System.out.println( mcls.getThis() );
		
	}
}
