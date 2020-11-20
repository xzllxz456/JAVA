package multi;

import inter.Myinterface;
import inter.WriteMode;

public class multiClass implements WriteMode, Myinterface{

	@Override
	public void method() {
		System.out.println("멀티클래스 메소드");
		
	}

	@Override
	public void func() {
		// TODO Auto-generated method stub
		System.out.println("멀티클래스의 메소드");
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("멀티클래스의 쓰기");
		
	}

}
