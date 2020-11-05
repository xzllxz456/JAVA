
public class mainClass {
	public static void main(String[] args) {
		/*
		 * 자료형 변환   int -> short	short -> int 
		 * 
		 * 					     우선순위
		 * 
		 * boolean	1byte		낮음
		 * 
		 * byte		1byte
		 * short	2byte
		 * int 		4byte
		 * long		8byte
		 * 
		 * float	4byte
		 * double	8byte		높음
		 */
		
		// auto(자동형변환)	작은 공간 -> 큰 공간
		short sh = 10;
		int num;
		
		num = sh;
		System.out.println("num: " + num);
		
		// cast(강제형변환)	큰 공간 -> 작은 공간
//		num = 32424441;
		num = 42;
		sh = (short) num;
		System.out.println("sh: " + sh);
		
		float f;
		long l = 12345678901234L;
		f = l;
		System.out.println("f: " + f);
		// E13 == 10^13
		// 1.2345679E13 * 100000000000000   
		// E-2 == 1/10 * 1/10
		double d = l;
		System.out.println("d: " + d);
		d = 1.23e-2;
		System.out.println("d = " + d);
		
		double tag;
		int num1, num2;
		num1 = 3;
		num2 = 2;
		
		tag = (double) num1 / num2;
		System.out.println("tag: " + tag);
		
		double d1 = 12370.12;
		int result;
		result = (int)d1;
		
		System.out.println("result: " + result);
	}
}
