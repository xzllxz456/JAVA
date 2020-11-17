package staticEx;

public class StaticmainClass {
	public static void main(String[] args) {
		/*
		 	static : 정적 
		 	
		 			stack	heap	static				sys
		 			지역변수	동적할당	정적영역(계속 값 유지)	
		 							
		 */
//		StaticMyClass cls = new StaticMyClass();
//		cls.method();
		
//		StaticMyClass.staticVar = 12;
		/*
		StaticMyClass c = new StaticMyClass();
		c.method();
		c.method();
		c.method();
		
		StaticMyClass cls = new StaticMyClass();
		cls.method();
		*/

//		StaticMyClass.staticMethod();
		StaticMyClass mcls = StaticMyClass.getInstance();
	}
}
