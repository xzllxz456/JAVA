package childone;

import parantp.ParantClass;

public class childOneClass extends ParantClass {
	public void method() {
//		super.method(); 	// 오버라이딩 되기 전 부모클래스의 메소드가 호출
		System.out.println("ChildOne OverRide method");
	}
	
	public void ChildOnemethod() {
		System.out.println("ChildOne ChildOnemethod");
	}
}
