package staticEx;

public class StaticMyClass {
	private int memberVar;	// 멤버변수
	static int staticVar;	// 정적변수	프로그램 시작 동시에 생성 종료후 삭제 == global(전역)변수
	
	public void method() {
		int localVal = 0;	// 지역변수
		localVal++;
		memberVar++;
		staticVar++;
		
		System.out.println("지역 변수: " + localVal);
		System.out.println("멤버 변수: " + memberVar);
		System.out.println("(정적)static변수: " + staticVar);
	}
	
	public void func() {
		
	}
	
	public static void staticMethod() {
		System.out.println("staticMethod() 호출");
//		this super 사용(접근)불가 
	}
	
	public static StaticMyClass getInstance() {		
		StaticMyClass c = new StaticMyClass();
		c.func();
		return c;
	}
}
