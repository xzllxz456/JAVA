
public class mainClass {
	public static void main(String[] args) {
		// 논리 연산자(true/false) 제어문(논리)
		/*
		 *  && AND
		 *  || OR
		 *  !  NOT
		 *  
		 *  제어문과 같이 사용(if, while, do while)
		 */
		
		/*
		 * 		AND		0 0 -> 0
		 * 				0 1 -> 0
		 * 				1 0 -> 0
		 * 				1 1 -> 1
		 */
		int number = 0;
		System.out.println("========AND=======");
		System.out.println(number > 0 && number > 10);
		System.out.println(number > 0 && number <= 10);
		System.out.println(number >= 0 && number > 10);
		System.out.println(number >= 0 && number < 10);
		
		/*
		 * 		OR		0 0 -> 0
		 * 				0 1 -> 1
		 * 				1 0 -> 1
		 * 				1 1 -> 1
		 */
		System.out.println("========OR=======");
//		System.out.println(number < 10 || number > 30);    //이런 조건으로 많이 사용
		System.out.println(number > 0 || number > 10);
		System.out.println(number > 0 || number < 10);
		System.out.println(number >= 0 || number > 10);
		System.out.println(number >= 0 || number <= 10);
		
		/*
		 * 		NOT		0 -> 1
		 * 				1 -> 0
		 */
		System.out.println("========NOT=======");
		number = 5;
		System.out.println(number == 5);
		System.out.println(number != 5);
		
		System.out.println( !(number < 5) );  	//number >= 5
		
		System.out.println(!(number > 5 && number > 10));
		//					number <= 5 || number <= 10
		
		// 삼항 연산자 == if 
		/*
		 * value = (조건) ? "값1" : "값2"
		 */
		char c;
		c = (number > 0) ? 'Y':'N';
		System.out.println("c =" + c);
		
		int n;
		n = (number > 10)?20:(10 > number) ? 5:999;
		System.out.println("n = " + n);
		
		String str;
		str = (number > 5) ? "nuber는 5보다 큽니다.":"number는 5보다 같거나 작습니다.";
		System.out.println("str = " + str);
	}
}
