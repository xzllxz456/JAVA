
public class mainClass {
	public static void main(String[] args) {
		/*
		   Wrapper
		     일반 자료형을 클래스화 한것.
		     클래스: 묶음(저장요소, 함수)
		     
		     일반 자료형				wrapper class
		     boolean			Boolean
		     
		     byte				Byte
		     short				Short
		     int  				Integer	(o)=====자주씀
		     long				Long
		     
		     float				Float
		     double				Double	(o)=====자주씀
		     
		     char				Character
		     char[]				String	(o)=====자주씀
		     
		     class(변수, 함수, 메소드)
		     Integer int n, parseInt()
		 */
		
		//숫자 -> 문자열
		String str = 123 + "";
		//Math.random
		double d = Math.random();
		
		//문자열 -> 숫자
		int number = Integer.parseInt("123") + 1;
		System.out.println(number);
		
		double dnumber = Double.parseDouble("123.456");
		System.out.println(dnumber);
		
		// toString(), valueOf()
		Integer in = new Integer(123);	// int n = 23;
		String toStr = in.toString();
//		String tostr = in + "";
//		String tostr = String.valueOf(in);
		System.out.println("toStr = " + toStr);
		
		
	}
}

