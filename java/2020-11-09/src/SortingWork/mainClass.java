package SortingWork;

import java.util.Arrays;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// user 몇개를 정렬?
		System.out.print("몇개를 정렬할까요");
		int num = sc.nextInt();
		int numArr[] = new int[num];
		// 배열확보 // 숫자들 입력
		for (int i = 0; i < numArr.length; i++) {
			System.out.print("숫자 입력: ");
			numArr[i] = sc.nextInt();
		}
		// 올림/내림
		// 정렬
		System.out.print("올림차순은 true/ 내림차순은 false");
		boolean updown = sc.nextBoolean();

			for (int i = 0; i < numArr.length - 1; i++) {
				for (int j = i + 1; j < numArr.length; j++) {
					if (updown == true) {
						if (numArr[i] > numArr[j]) {
							int temp = numArr[i];
							numArr[i] = numArr[j];
							numArr[j] = temp;
						}
					}else if(updown == false) {
						if (numArr[i] < numArr[j]) {
							int temp = numArr[i];
							numArr[i] = numArr[j];
							numArr[j] = temp;
					}
				}
			}
		}
//		if (updown == false) {
//			for (int i = 0; i < numArr.length - 1; i++) {
//				for (int j = i + 1; j < numArr.length; j++) {
//					}
//				}
//			}
			System.out.println(Arrays.toString(numArr));
		}
	}
