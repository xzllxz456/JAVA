
public class mainClass {
	public static void main(String[] args) {
		// final : 제약적
		// 			변수, 메소드, 클래스
		final int MAX = 10;	// 변수 -> 상수
//		MAX = 12;
		int num; 
		
		num = MAX;		// define, enum
	}
}

final class SuperClass{				// final이 붙으면 상속안됨
	public final void method() {	// final이 붙으면 ovrride 안됨
		
	}
	
}
/*
//class ChildClass extends SuperClass{
//	public void method() {
//	}
//}
*/