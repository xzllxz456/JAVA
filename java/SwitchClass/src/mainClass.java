	
public class mainClass {
	public static void main(String[] args) {
		/*
		 * switch: 조건문으로 값이 명확해야한다.
		 * 
		 * 가독성: (可讀性) 읽기 쉽다. 
		 * 
		 * switch(변수){
		 * 		//default:    //default가 위에 있을경우 break가 의미있다.
		 * 			//처리		
		 * 			//break;
		 * 
		 * 		case 변수에 대한 값1: 		if
		 * 			처리
		 * 			break; 	// 빠져나온다
		 * 
		 * 		case 변수에 대한 값2:		else if
		 * 			처리
		 * 			break;
		 * 		default:				else
		 * 			처리
		 * 			break;   // default가 마지막이면 break가 의미없다.
		 * }
		 * 
		 * 	> < >= <= != 사용 불가
		 * 소수값은 사용 못함. 제약이 많다. 사용범위 좁음
		 */
		
		int num = 2;
		
		switch(num) {
		case 1:				// if(num == 1)
			System.out.println("num은 1입니다.");
			break;
		case 2:				// else if(num == 1)
			System.out.println("num은 2입니다.");
			//break;  //중간에 break가 빠지면 다음 break까지 실행된다.
		case 3:
			System.out.println("num은 3입니다.");
			break;
		default:
			System.out.println("num은 ?입니다.");
				
		}
		
		char c = '가';
		
		switch (c) {
		case '가':
			System.out.println("c는 '가'입니다.");
			break;
			
		default:
			break;
		}
		
		double d = 3.141592;
		
		/*
		 * switch (d) { // switch문은 소숫값 사용 불가 
		 * 		case 3.141592: 
		 * 		break; 
		 * }
		 */	
		
		String str = "hello";
		switch (str) {
		case "hello":
			System.out.println("str = hello");
			break;
		}
		
		/*
		 * switch (num) { 		//부등호 기호 사용 불가
		 * 		case num > 1:
		 * 		break; }
		 */
		
	}
}











