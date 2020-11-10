package Calculator;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		/*
		 계산기
		 
		  1. 첫번째 수 입력(숫자인지 아닌지?)
		  2. 연산자 입력(정확한 연산자인지?) 
		  3. 두번째 수 입력(숫자인지 아닌지?
		  4. 연산처리
		  5. 결과 출력
		 */
		Scanner sc = new Scanner(System.in);
		String firstNum;
		String secondNum;
		String oper;
		
		while (true) {
			System.out.print("첫숫자입력: ");
			firstNum = sc.next();
			boolean b = false;
			for (int i = 0; i < firstNum.length(); i++) {
				int asc = (int) firstNum.charAt(i);
				if (asc < 48 || asc > 57) {
					b = true;
					break;
				}
			}
			if(b == true) {
				System.out.println("숫자 이상함 다시입력");
				continue;
			}
			break;
		}
		while (true) {
			System.out.print("두번째 숫자입력: ");
			secondNum = sc.next();
			boolean b = false;
			for (int i = 0; i < secondNum.length(); i++) {
				int asc = (int) secondNum.charAt(i);
				if (asc < 48 || asc > 57) {
					b = true;
					break;
				}
			}
			if(b == true) {
				System.out.println("숫자 이상함 다시입력");
				continue;
			}
			break;
		}
		while (true) {
			System.out.print("연산자 입력: ");
			oper = sc.next();
			boolean b = false;

			for (int i = 0; i < oper.length(); i++) {
				int asc = (int) oper.charAt(i);
				if(asc == 43) {
					break;
				}else if(asc == 47) {
					break;
				}else if(asc == 42) {
					break;
				}else if(asc == 45) {
					break;
				}else {
					b = true;
					break;
				}
			}
			if(b==true) {
				System.out.println("이상함");
				continue;
			}
			break;
		}
		int num1, num2;
		int sum, gob, cha;
		double na;
		if(oper.equals("+")) {
			num1 = Integer.parseInt(firstNum);
			num2 = Integer.parseInt(secondNum);
			 sum = num1 + num2;
			System.out.println(sum + "더하기");
		}else if(oper.equals("*")) {
			num1 = Integer.parseInt(firstNum);
			num2 = Integer.parseInt(secondNum);
			 gob = num1 * num2;
			System.out.println(gob + "곱하기");
		}else if(oper.equals("/")) {
			num1 = Integer.parseInt(firstNum);
			num2 = Integer.parseInt(secondNum);
			 na = (double)(num1 / num2);
			System.out.println(na + "나누기");
		}else if(oper.equals("-")) {
			num1 = Integer.parseInt(firstNum);
			num2 = Integer.parseInt(secondNum);
			 cha = num1 - num2;
			System.out.println(cha+"빼기");
		}
		
		
		
		
	}
}

//|| asc != 47 || asc != 42 || asc != 45