package mainM;

import childone.childOneClass;
import chilldtwo.ChildTwoClass;
import parantp.ParantClass;

public class mainClass {
	public static void main(String[] args) {
		/*
		 	instanceOf
		 	: instance를 구별하기 위한 키워드
		 */
		
		ParantClass arrPar[] = new ParantClass[3];
		
		arrPar[0] = new childOneClass();
		arrPar[1] = new ChildTwoClass();
		arrPar[2] = new ChildTwoClass();
		
		for (int i = 0; i < arrPar.length; i++) {
			arrPar[i].method();	// Over Ride된 메소드
			
			if(arrPar[i] instanceof childOneClass) {
				((childOneClass)arrPar[i]).ChildOnemethod();
			}else if(arrPar[i] instanceof ChildTwoClass) {
				ChildTwoClass t = (ChildTwoClass)arrPar[i];
				t.ChildTwoMethod();
			}
		}
		
//		childOneClass one = (childOneClass)arrPar[0];
//		one.ChildOnemethod();
		
		if(arrPar[0] instanceof childOneClass) {
			System.out.println("arrPar[0]는 childOneClass로 생성되었음" );
		}
		if(arrPar[0] instanceof ChildTwoClass) {	//false
			System.out.println("arrPar[0]는 childOneClass로 생성되었음" );
		}
	}
}
