package Claculater2;

import java.util.Scanner;

public class Claculater2 {
	int num1, num2;	
	int result;
	String oper;
	
	
	public int inputNumber(String str) {								

		Scanner sc = new Scanner(System.in);
		String snum;

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
		return Integer.parseInt(snum);
	}

	 public void inputOperator() {

			Scanner sc = new Scanner(System.in);
			oper = "";
			while (true) {
				System.out.print("연산자 (+, -, *, /) : ");
				oper = sc.next();
				if (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {
					System.out.println("연산자가 이상합니다 다시입력해주세요");
					continue;
				}
				break;
			}
		}

	public void numberProc() {
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
		}

	public void resultPrint() {
			num1 = inputNumber("첫번째");
			inputOperator();
			num2 = inputNumber("두번째");
			numberProc();
			System.out.println(num1 + " " + oper + " " + num2 +  " = " + result);
		}
}

