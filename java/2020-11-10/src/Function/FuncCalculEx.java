package Function;

import java.util.Scanner;

public class FuncCalculEx {
	// 숫자 검사 메소드
	static boolean numScan(String num) {

		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (c < '0' || c > '9') {
				return true;
			}
		}
		return false;

	}

	// 연산자 검사 메소드
	static boolean operScan(String oper) {
		if (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {
			System.out.println("연산자가 이상합니다 다시입력해주세요");
			return true;
		}
		return false;
	}

	static void calculator(int num1, int num2, String oper) {
		int val = 0;
		switch (oper) {
		case "+":
			val = num1 + num2;
			System.out.println(val);
			break;
		case "-":
			val = num1 - num2;
			System.out.println(val);
			break;
		case "*":
			val = num1 * num2;
			System.out.println(val);
			break;
		case "/":
			val = num1 / num2;
			int tail = num1 % num2;
			System.out.println(val + "." + tail);
			break;
		}
	}
	// 더하기 메소드

	// 뺴기 메소드

	// 곱하기 메소드

	// 나누기 메소드

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		while (true) {
			boolean b = false;
			System.out.print("첫번째 숫자 입력: ");
			String snum1 = sc.next();
			b = numScan(snum1);
			if (b == true) {
				System.out.println("숫자가 이상함 다시 입력: ");
				continue;
			}
			num1 = Integer.parseInt(snum1);
			break;
		}
		String oper;
		while (true) {
			boolean b = false;
			System.out.println("연산자 입력: ");
			oper = sc.next();
			b = operScan(oper);
			if (b == true) {
				System.out.println("연산자 이상 다시입력: ");
				continue;
			}
			break;
		}

		while (true) {
			boolean b = false;
			System.out.print("두번째 숫자 입력: ");
			String snum2 = sc.next();
			b = numScan(snum2);
			if (b == true || snum2.equals("0")) {
				System.out.println("숫자가 이상함 다시 입력: ");
				continue;
			}
			num2 = Integer.parseInt(snum2);
			break;
		}
		calculator(num1, num2, oper);
	}

}
