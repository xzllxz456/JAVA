package main;

import he.HeClass;
import my.myClass;
import single.SingletonClass;
import you.YouClass;

public class mainClass {
	public static void main(String[] args) {
		/*
		myClass mycls = new myClass();
		YouClass youcls = new YouClass();
		
		int n = mycls.getNumber();
		youcls.setCount(n);
		
		System.out.println(youcls.toString());
		*/
		
		/*
		SingletonClass si = SingletonClass.getInstance();
		System.out.println(si);
		System.out.println(si.number);
		
		si = SingletonClass.getInstance();
		System.out.println(si);
		System.out.println(si.number);
		*/
		
		/*
		SingletonClass sclse1 = new SingletonClass();
		
		sclse1.staticNumber = 111;
		
		SingletonClass sclse2 = new SingletonClass();
		sclse2.staticNumber = 111;
		*/
		
		myClass mycls = new myClass();
		YouClass youcls = new YouClass();
		System.out.println(youcls.toString());
		
		HeClass hcls = new HeClass();
		hcls.method();
		System.out.println(hcls.toString());
		
		
	}
}
