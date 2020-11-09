package SortingWork;

import java.util.Scanner;

public class mainClass2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number[] = null;
		boolean updown = false;

		// user 몇개를 정렬?
		System.out.print("정렬의 숫자의 갯수 : ");
		int count = sc.nextInt();
		// 배열확보
		number = new int[count];
		String strNum[] = new String[count];
		// 숫자들 입력(잘못시 다시 입력)
		int w = 0;
		while (w < number.length) {
			System.out.print((w + 1) + "번째숫자입력: ");
			strNum[w] = sc.next();

			// check 문자 숫자
			boolean b = false;
			for (int i = 0; i < strNum[w].length(); i++) {
				int asc = (int) strNum[w].charAt(i);
				if (asc < 48 || asc > 57) {
					b = true;
					break;
				}
			}
			if (b == true) {
				System.out.println("잘못입력 다시입력");
				continue;
			}
			w++;
		}
		System.out.print("올림은 (1)/ 내림은 (2)");
		int ud = sc.nextInt();
		if (ud == 1) {
			updown = true;
		} else {
			updown = false;
		}
		// String -> Integer
		for (int i = 0; i < strNum.length; i++) {
			number[i] = Integer.parseInt(strNum[i]);
		}
		// 정렬
		for (int i = 0; i < strNum.length - 1; i++) {
			for (int j = i + 1; j < strNum.length; j++) {
				if (updown == true) {// 오름
					if (number[i] > number[j]) {
						int temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				} else {			// 내림
					if (number[i] < number[j]) {
						int temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}

				}
			}
		}
		for (int n : number) {
			System.out.print(n + " ");
		}
	}
}
