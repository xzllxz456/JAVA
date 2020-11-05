
public class mainClass {
	public static void main(String[] args) {
		// 변수의 종류
		// 숫자형
		// 정수
		byte by;	// 1 byte	== 8 bit -> 256 개	0 ~ 255		0000 0000  0->+  1->-
		by = -128;	// 127 ~ -128
		System.out.println("by = " + by);
		
		short sh;	// 2 byte
		sh = 1234;
		System.out.println("sh = " + sh);
		
		int i;		// 4 byte
		i = 12232131;
		System.out.println("i = " + i);
		
		long l;		// 8 byte
		l = 12121212456454L;
		System.out.println("l = " + l);
		
		// 소수
		float f;	// 4 byte
		f = 123.456789f;
		System.out.println("f = " + f);
		
		double d;	// 8 byte
		d = 12345.567890;
		System.out.println("d = " + d);
		
		// 문자형
		// 문자
		char c;		// 2 byte	== character
					// a ~ z, @ # $ % A ~ Z, 한 가 
		c = 'A';
		System.out.println("c = " + c);
		c = '+';
		System.out.println("c = " + c);
		c = '한';
		System.out.println("c = " + c);
		
		// 문자열
		// 문자 + 문자 -> 문자열 	Array, String
		String str;
		str = "hello";
		System.out.println("str = " + str);		
		str = "world";
		
		
		//논리형(true/false)			BOOL(4byte) bool(1byte)
		boolean b;
//		b = 1;
//		b = 0;
		b = true;  // 1 
		b = false; // 0
		System.out.println("b = " + b);
		
	}
}
