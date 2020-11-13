package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingClass {
	int number[];
	int count;
	public void number() {
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
	}
	public void numbercount(int count) {
		Scanner sc = new Scanner(System.in);
		number = new int[count];
		for (int i = 0; i < number.length; i++) {
			while(true) {
				System.out.println((i+1) + "번째입력");
				String snum = sc.next();
				boolean b = isNumber (snum);
				if(b == true) {
					number[i] = Integer.parseInt(snum);
					break;
				}
				System.out.println("숫자가 아닙니다. 다시입력하세요");
			}
		}
	}
	public boolean isNumber(String str) {
		boolean b = true;
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			int asc = (int)c;
			if(asc < 48 || asc > 57) {
				b = false;
				break;
			}
		}
		return b;
	}

	public void up() {
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if(number[i] > number[j]) {
					swap(number, i, j);
				}
			}
		}
		System.out.println(Arrays.toString(number));
	}
	public void down() {
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if(number[i] < number[j]) {
					swap(number, i, j);
				}
			}
		}
		System.out.println(Arrays.toString(number));
	}
	public void swap(int[] number, int i, int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}

	public void result() {
		System.out.println("몇개숫자 만들꺼?");
		number();
		numbercount(count);
		up();
		down();
		
		
	}
}

