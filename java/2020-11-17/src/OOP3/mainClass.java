package OOP3;

public class mainClass {
	public static void main(String[] args) {
		/*
		 	은닉성: 접근 지정자를 통해서 외부로부터 접근을 차단, 허용해 주는것을 의미
		 		 	private(변수), public(메소드)
		 		 	
		 	상속성: 부모클래스(super)에서 기능을 상속하는 것을 의미한다.
		 			추가 기입을 할수 있다(Over ride)
		 			public: 외부의 모든 클래스 및 생성자, 메소드, 필드로부터 접근을 완전히 허용하고 다른 패키지 접근 허용
		 			protected:rotected 접근 제한자는 같은 패키지에 속해있는 클래스에서 생성자와 메소드, 
		 							필드(객체)만 호출 할 수 있고, 다른 패키지에 있는 생성자, 메소드, 필드는 호출하지 못하지만 
		 							상속관계에 있는 클래스라면 예외로 호출
		 			default: public이나 protected, private를 추가하지 않았다면
		 			 			기본적으로 default 접근 제한자가 되어 
		 			 			다른 패키지와의 클래스 선언과 생성자/메소드/필드의 호출이 불가능함. 
		 			 			물론 동일 패키지안에서는 모든게 허용
		 			private: 무조건 클래스 내부에서만 사용이 가능
		 			
		 	
		 	다형성: 상속후에 여러 형태의 자식클래스를 제작
		 	
		 				부모	직사각형
		 				
		 		자식	정사각형	 마름모	삼각형
		 */
		ChildClass cc = new ChildClass();
//		cc.parantMethod();
		cc.childmethod();
		cc.public_num = 354;
		
//		cc.protected_num;	protected_num은 자식클래스 까지만 접근가능
//		cc.parentProtectedMethod();		같은 패키지는 가능 다른 패키지는 호출 불가
		
//		ParantClass pc = new ParantClass();	
//		pc.childmethod();	부모는 자식꺼 못씀
//		pc.parantMethod();
	}
}
