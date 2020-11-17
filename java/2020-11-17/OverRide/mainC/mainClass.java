package mainC;

import Parant.ParantClass;
import child.ChildClass;
import child2.ChildClass2;
import child3.child3Class;
public class mainClass {
	public static void main(String[] args) {
		/*
		  	Over Ride
		  	상속 받은 후에 자식클래스에서 상속받은 함수를 고처 기입 함을 의미
		  	
		  	상속받은 함수와 proto type(함수의 형태)이 같아야 한다
		 	
		 	public void func(int i){
		 	}
		 	
		 	public double func(String i){ 
		 	}
		 */
		
//		ChildClass cc = new ChildClass();
//		cc.parant_method();
		
		ParantClass pc = new ChildClass();
		pc.parant_method();
//		pc.pp = 2; 
		/*
		ChildClass childArr[] = new ChildClass[5];
		ChildClass2 childArr1[] =new ChildClass2[3];
		childArr[0] = new ChildClass();
		childArr[1] = new ChildClass();
		childArr[2] = new ChildClass();
		childArr1[0] = new ChildClass2();
		childArr1[1] = new ChildClass2();
		childArr1[2] = new ChildClass2();
		 */
		/*
		ParantClass pcArr[] = new ParantClass[8];
		pcArr[0] = new ChildClass();
		pcArr[0].parant_method();
		pcArr[1] = new ChildClass2();
		pcArr[1].parant_method();
		pcArr[2] = new ChildClass();
		pcArr[2].parant_method();
		pcArr[3] = new child3Class();
		pcArr[3].parant_method();
		ParantClass pp = new ParantClass();
		pp.parant_method();
		*/
	}
}
