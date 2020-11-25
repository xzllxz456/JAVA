package my;

import single.SingletonClass;

public class myClass {
	private int number;
	
	public myClass() {
		number = 11;
		
		SingletonClass si = SingletonClass.getInstance();	// 싱글톤 객체 생성
		si.number = number;		// this.number;
	}

//	public int getNumber() {
//		return number;
//	}
//	
	
	
}
