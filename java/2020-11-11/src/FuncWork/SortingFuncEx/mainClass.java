package SortingFuncEx;

import java.util.Arrays;
import java.util.Scanner;

class mainClass {
	public static void main(String[] args) {
		// 입력
		int[] arr = null;
		arr = array();
			// 정상적인 숫자 체크
		// 정렬처리
		sortingUpDown(arr);
			//교환 처리
		// 결과 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr));

	}
	
	static int[] array() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 숫자 입력?");
		int n = sc.nextInt();
		int[] numarray = new int [n];
		String array[] = new String[n];
		for (int i = 0; i < array.length; i++) {
			while(true) {
				System.out.print((i+1) + "번째수");
				array[i] = sc.next();
				boolean b = false;
				for (int j = 0; j < array[i].length(); j++) {
					char c = (char)array[i].charAt(j);
					if(c < '0' || c > '9') {
						b = true;
						break;
					}
					if(c == ' ') {
						b = true;
						break;
					}
					
				}
				if(b == true) {
					System.out.println("숫자가 이상함 다시입력: ");
					continue;
				}
				break;
			}
			
			
		}
		for (int i = 0; i < array.length; i++) {
			numarray[i] = Integer.parseInt(array[i]);
		}
		return numarray;
	}
	
	static int[] sortingUpDown(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1은 오름차순/ 2는 내림차순: ");
		int s = sc.nextInt();
		switch (s) {
		case 1:
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			break;
		case 2:
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i] < arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			break;
		}
		return arr;
	}
}

