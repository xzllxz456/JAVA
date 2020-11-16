package ConstructorMain;

public class mainClass {
	public static void main(String[] args) {
		/*
		 	Constructor: 생성자
		 				  메소드
		 				 return 값이 없다.
		 				 Over Load(같은 이름의 함수로 매개변수로 구분)가 가능하다
		 				 클래스명과 같은 이름이다.
		 				 자동 호출된다.(callback)
		 				 클래스 생성시에 호출
		 				 생략이 가능하다
		 				 
		 	Destructor: 소멸자(C++)에는 있지만 자바에서 사라짐
		 				반드시 한개
		 */
		
		int array[] = {1, 2, 3};
		/*
		Student stu = new Student();
		stu.setName("홍길동");
		stu.setNumber(123);
		*/
		// Student stu = {"홍길동", 123};	불가능
		MyClass cls = new MyClass();	// 클래스 생성시에 생성자 자동 호출
		// MyClass cls = null;		// 호출안됨
		cls.setNumber(1001);
		cls.setName("홍길동");
		
		MyClass cls1 = new MyClass(12);
		
//		MyClass cls2 = {123, "홍길동"};
		MyClass cls2 = new MyClass(123, "일지매");
		
		// cls.MyClass(); 	초기화 할 걸 초기화???? 말이안됨
		
		String str = "hello";
		String str1 = new String("hello");
		
		// final
//		int num = 12;
		final int num = 12;	// 변수 -> 상수  값을 변경할 수 없어서 대입용으로 사용
//		num = 24;
		int n;
		n = num;
	}
}
