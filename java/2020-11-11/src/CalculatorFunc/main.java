package CalculatorFunc;

import java.util.Scanner;

class main {
	public static void main(String[] args) {
		// 계산기
		int num1, num2, result = 0;
//		String snum1, snum2;
		String oper;

//		  1. 첫번째 수 입력(숫자인지 아닌지?)
		num1 = inputNumber("첫번째");
		

//		  2. 연산자 입력(정확한 연산자인지?) 
		oper = inputOperator();


//		  3. 두번째 수 입력(숫자인지 아닌지?
		num2 = inputNumber("두번째:");

//		  4. 연산처리
		result = numberProc(num1, num2, oper);

//		  5. 결과 출력
		result(num1, num2, oper, result);
//		System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
	}
	
	static int inputNumber(String str) {
		Scanner sc = new Scanner(System.in);
		String snum;
		int rnum;
		while (true) {
			boolean ok = true;
			System.out.print(str + "number 입력: ");
			snum = sc.next();
			for (int i = 0; i < snum.length(); i++) {
				char c = snum.charAt(i);
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
		rnum = Integer.parseInt(snum);
		
		return rnum;
	}
	static String inputOperator() {
		Scanner sc = new Scanner(System.in);
		String oper = "";
		while (true) {
			System.out.print("연산자 (+, -, *, /) : ");
			oper = sc.next();
			/*
			 * if (oper.equals("+") || oper.equals("*") || oper.equals("-") ||
			 * oper.equals("/")) { 
			 * break; 
			 * }else { System.out.println("연산자가 이상합니다 다시입력해주세요");
			 * continue; }
			 */
			if (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {
				System.out.println("연산자가 이상합니다 다시입력해주세요");
				continue;
			}
			break;
		}
		return oper;
	}
	static int numberProc(int n1, int n2, String op) {
		int result = 0;
		switch (op) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			if(n2 != 0) {
			result = n1 / n2;
			}
			break;
		}
		return result;
	}
	static void result(int n1, int n2, String str, int n3) {
		System.out.println(n1 + " " + str + " " + n2 + " = " + n3);
	}
	
}

