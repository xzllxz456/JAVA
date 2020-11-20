package main;

import abstractClass2.MyClass;
import cls.Ballpen;
import cls.Myclass;
import cls.Pencil;
import cls.WriteClass;
import inter.Myinterface;
import inter.WriteMode;
import multi.multiClass;

public class mainCls {
	public static void main(String[] args) {
		/*
		 	abstract class : 추상메소드 + 일반메소드
		 	
		 	interface : 메소드가 선언만 되어 있다.	추상메소드만 가능
		 				생성은 불가능하다. 상속 후에 정의를 한 후에 생성이 가능
		 				변수 선언이 불가능하다.
		 				다중 상속이 가능하다.
		 */
		// 마이클래스로 마이클래스생성후 부르기
		Myclass mycls = new Myclass();
		mycls.method();
		mycls.func();
		//	마이인터페이스에 마이클래스 객체 오버라이딩
		Myinterface myint = new Myclass();
		myint.method();
		myint.func();
		// 마이인터페이스를 불러와 그냥 쓰기
		Myinterface myinter = new Myinterface() {
			
			@Override
			public void method() {
				System.out.println("인터페이스 method() 내용 채우고 쓰셈");
			}
			
			@Override
			public void func() {
				System.out.println("인터페이스 func() 내용 채우고 쓰셈");
			}
		};
		
		WriteClass wc = new WriteClass();
		
		wc.write_method(new Ballpen());
		wc.write_method(new Pencil());
		System.out.println("---------------------------------------");
		WriteMode mode[] = new WriteMode[5];
		mode[0] = new Pencil();
		mode[1] = new Ballpen();
		mode[2] = new Ballpen();
		mode[3] = new Pencil();
		mode[4] = new Pencil();
		
		for (int i = 0; i < mode.length; i++) {
			wc.write_method(mode[i]);
		}
		multiClass mc = new multiClass();
		mc.method();
		mc.func();
		mc.write();
		
	}
}
