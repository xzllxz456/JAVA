package ChildClass;

import ParantClass.ParantClass;

public class ChildClass extends ParantClass{
	private int cnumber;
	
	public ChildClass() {
		System.out.println("ChildClass ChildClass()");
	}
	
	public ChildClass(int cnumber, int pnumber) {
//		this();		// 자기참조 : heap상에 올라가는 주소(pointer)
//		super();	// 부모 클래스의 reference(참조) (pointer)
		super(pnumber);
		
		System.out.println("ChildClass ChildClass(int cnumber)");
		this.cnumber = cnumber;
	}
	public ChildClass(int cnumber) {
//		this();		// 자기참조 : heap상에 올라가는 주소(pointer)
//		super();	// 부모 클래스의 reference(참조) (pointer)
		super(42);
		
		System.out.println("ChildClass ChildClass(int cnumber)");
		this.cnumber = cnumber;
	}
}
