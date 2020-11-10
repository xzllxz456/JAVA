package Function;

import java.util.Scanner;

public class FuncEx6 {
//	(1) 두 수를 나눗셈 연산으로 몫과 나머지를 구하는 메소드를 작성하시오.
	static int getResult(int num1, int num2, int[] tag) {
		int result = num1 / num2;
		tag[0] = num1 % num2;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int result, tag[];
		
		tag = new int[1];
		System.out.print("num1 입력: " );
		num1 = sc.nextInt();
		
		System.out.print("num2 입력: " );
		num2 = sc.nextInt();
		result = getResult(num1, num2, tag);
		// result = 몫, tag = 나머지
		System.out.println("몫: " + result +"나머지: "+ tag[0]);
	}
}
