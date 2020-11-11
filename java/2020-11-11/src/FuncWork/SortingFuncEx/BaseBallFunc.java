package SortingFuncEx;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBallFunc {
	public static void main(String[] args) {
		/*
	 	baseball
	 	
	 	1 ~ 10          7 3 5 
	 					1 2 3 <-	1 ball
	 					2 3 7 <-	1 strike 1 ball
	 					7 3 6 <-	2 strike
	 					7 3 5 <- 	out
	 	랜덤 숫자는 3개, 다 달라야 한다.
	 				  7 3 3 <- 2 strike 1 ball
	 	유저 숫자도 3개 달라야 한다.
	 						
	 	10번의 기회
	 */
		Scanner sc = new Scanner(System.in);
		while(true) {
		int ranNum[] = null;
		boolean clear = false;
		
		ranNum = rNum();
		clear = loop(ranNum);
		resultPrint(clear);
		System.out.println("종료는 1번: 아니면 아무거나 누르세요 ");
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println("잘가요");
			break;
		}
		
		}
		
	}
	static void resultPrint(boolean clear) {
		if(clear == true) {
			System.out.println("Game clear!!!!!!!");
		}else {
			System.out.println("Game over~~~~~~~~");
		}
	}
	
	static boolean loop(int r_num[]) {
		int strike, ball;
		int u_num[] = new int[3];
		boolean clear = false;
		
//		loop
		int count = 0;
		int w = 0;
		while(w < 10) {
			unum(u_num);
			strike = strikeCheck(u_num, r_num);
			ball = ballCheck(u_num, r_num);
			if(strike >= 3) {
				clear = true;
				break;
			}
			System.out.println(strike + " 스트라이크 " + ball + " 볼 입니다. ");
			count++;
			System.out.println((9 - count) + "번 기회남음");
			w++;
			
		}
		
		
		return clear;
	}
	static int ballCheck(int u_num[], int r_num[]) {
		int ball = 0;
		for (int i = 0; i < r_num.length; i++) {
			for (int j = 0; j < r_num.length; j++) {
				if(u_num[i] == r_num[j] && i!=j) {
					ball++;
				}
			}
		}
		return ball;
	}
	
	static int strikeCheck(int u_num[], int r_num[]) {
		int strike = 0;
		for (int i = 0; i < r_num.length; i++) {
			if(u_num[i] == r_num[i])
				strike++;
		}
		return strike;
	}

	static int[] rNum() {
		int arr[] = new int[3];
		int w = 0;
		while(w < arr.length) {
			boolean b =false;
			int n = (int)(Math.random() * 9) + 1;
//			for (int i = 0; i < arr.length; i++) {
//				if(arr[i] == n) {
//					b = true;
//					break;
//				}
//			}
			b = sameNum(arr, b, n);
			if(b == true) {
				continue;
			}
			arr[w] = n;
			w++;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	static int[] unum(int arr[]) {
		Scanner sc = new Scanner(System.in);
		int w = 0;
		while(w < arr.length) {
			boolean b = false;
			System.out.println((w+1) + "번째 입력: ");
			int n = sc.nextInt();
//			for (int i = 0; i < arr.length; i++) {
//				if(arr[i] == n) {
//					b = true;
//					break;
//				}
//			}
			b = sameNum(arr, b, n);
			if(b == true) {
				System.out.println("중복수 있음 다시입력");
				continue;
			}
			arr[w] = n;
			w++;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	static boolean sameNum(int[] arr, boolean b, int n) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == n) {
				b = true;
				break;
			}
		}
		return b;
	}
}

