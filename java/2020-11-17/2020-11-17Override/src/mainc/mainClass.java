package mainc;

import childone.childOneClass;
import chilldtwo.ChildTwoClass;
import parantp.ParantClass;

public class mainClass {
	public static void main(String[] args) {
		// 10명
		/*
		childOneClass one = new childOneClass();
		ChildTwoClass two = new ChildTwoClass();
		
		childOneClass[] oneArr = new childOneClass[10];
		ChildTwoClass[] twoArr = new ChildTwoClass[10];
		*/
		/*
		ParantClass pone = new childOneClass();
		ParantClass ptwo = new ChildTwoClass();
		*/
		
		ParantClass pArr[] = new ParantClass[10];
		pArr[0] = new childOneClass();
		pArr[1] = new ChildTwoClass();
		pArr[2] = new ChildTwoClass();
		pArr[3] = new ChildTwoClass();
		pArr[4] = new childOneClass();
		pArr[5] = new childOneClass();
		pArr[6] = new ChildTwoClass();
		pArr[7] = new ChildTwoClass();
		pArr[8] = new ChildTwoClass();
		pArr[9] = new childOneClass();
		
		for (ParantClass p : pArr) {
			p.method();
		}
		
		
//		ParantClass pone1 = new childOneClass();
//		ParantClass ptwo1 = new ChildTwoClass();
//		childOneClass cone = (childOneClass)pone1;
//		cone.func();
//		ChildTwoClass ctwo = (ChildTwoClass)pone1;
		
		
//		Object obj = new childOneClass();
//		Object obj1 = new ChildTwoClass();
//		childOneClass one = (childOneClass)obj;
//		one.func();
		
//		Object o = new Object();
//		childOneClass one = (childOneClass)o;
//		one.func();
		
	}
}
