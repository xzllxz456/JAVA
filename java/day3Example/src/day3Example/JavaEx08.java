package day3Example;

import java.util.Scanner;

public class JavaEx08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫수입력: ");
		int num = sc.nextInt();
		System.out.println("두 번째수입력: ");
		int num2 = sc.nextInt();
		System.out.println("연산자입력 +-/*");
		String c = sc.next();
		
		switch (c) {
		case "+":
			System.out.printf("%d + %d = %d", num, num2, num + num2);
			break;
		case "-":
			System.out.printf("%d - %d = %d",num, num2,num - num2);

			break;
		case "/":
			System.out.printf("%d / %d = %d",num, num2, num / num2);

			break;
		case "*":
			System.out.printf("%d * %d = %d",num, num2, num * num2);

			break;

		default:
			System.out.println("개소리");
			break;
		}
	}
}
