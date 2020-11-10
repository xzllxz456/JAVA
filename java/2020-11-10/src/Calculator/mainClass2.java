package Calculator;

import java.util.Scanner;

public class mainClass2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 계산기
		int num1, num2, result = 0;
		String snum1, snum2;
		String oper;

//		  1. 첫번째 수 입력(숫자인지 아닌지?)
		while (true) {
			boolean ok = true;
			System.out.print("첫번째 number 입력: ");
			snum1 = sc.next();
			for (int i = 0; i < snum1.length(); i++) {
				char c = snum1.charAt(i);
				int asc = (int) c;
				if (asc < 48 || asc > 57) {
					System.out.println("잘못입력했습니다. 다시입력해줘요");
					ok = false;
					break;
				}
			}
			if (ok == true) {
				break;
			}
		}
//		  2. 연산자 입력(정확한 연산자인지?) 
		while (true) {
			System.out.print("연산자 (+, -, *, /) : ");
			oper = sc.next();
			/*
			 * if (oper.equals("+") || oper.equals("*") || oper.equals("-") ||
			 * oper.equals("/")) { break; }else { System.out.println("연산자가 이상합니다 다시입력해주세요");
			 * continue; }
			 */
			if (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {
				System.out.println("연산자가 이상합니다 다시입력해주세요");
				continue;
			}
			break;
		}

//		  3. 두번째 수 입력(숫자인지 아닌지?
		while (true) {
			boolean ok = true;
			System.out.print("두번째 number 입력: ");
			snum2 = sc.next();
			for (int i = 0; i < snum2.length(); i++) {
				char c = snum2.charAt(i);
				int asc = (int) c;
				if (asc < 48 || asc > 57) {
					System.out.println("잘못입력했습니다. 다시입력해줘요");
					ok = false;
					break;
				}
			}
			if (ok == true) {
				break;
			}
		}
		num1 = Integer.parseInt(snum1);
		num2 = Integer.parseInt(snum2);
//		  4. 연산처리
		switch (oper) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if(num2 != 0) {
			result = num1 / num2;
			}
			break;
		}

//		  5. 결과 출력
		System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
	}
}
/*
 		Scanner sc = new Scanner(System.in);		
			계산기
		int num1, num2, result = 0;
		String snum1, snum2;
		String oper;
				
		// 1. 첫번째 수 입력(숫자인지 아닌지?)
		while(true) {
			System.out.print("첫번째 number = ");
			snum1 = sc.next();
			
			boolean ok = true;
			for (int i = 0; i < snum1.length(); i++) {
				char c = snum1.charAt(i);
				int asc = (int)c;
				if(asc < 48 || asc > 57) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오");
					ok = false;
					break;
				}
			}
			if(ok == true) {
				break;
			}			
		}		
					
		// 2. 연산자(정확히 연산자인지?)
		while(true) {
			System.out.print("연산자(+, -, *, /) = ");
			oper = sc.next();
			*/
			/*
			if(oper.equals("+") || oper.equals("-") 
					|| oper.equals("*") || oper.equals("/")) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오");
			}*/
			/*
			if(!oper.equals("+") && !oper.equals("-") 
					&& !oper.equals("*") && !oper.equals("/")) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오");
				continue;
			}
			break;
		}
					
		// 3. 두번째 수 입력(숫자인지 아닌지?)
		while(true) {
			System.out.print("두번째 number = ");
			snum2 = sc.next();
			
			boolean ok = true;
			for (int i = 0; i < snum2.length(); i++) {
				char c = snum2.charAt(i);
				int asc = (int)c;
				if(asc < 48 || asc > 57) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오");
					ok = false;
					break;
				}
			}
			if(ok == true) {
				break;
			}			
		}	
		
		num1 = Integer.parseInt( snum1 );
		num2 = Integer.parseInt( snum2 );
		
		// 4. 연산처리
		switch( oper ) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if(num2 != 0) {
					result = num1 / num2;
				}
				break;		
		}
					
		// 5. 결과출력
		System.out.println( num1 + " " + oper + " " + num2 + " = " + result);
			
			
		
		
	}
}

 
 */

