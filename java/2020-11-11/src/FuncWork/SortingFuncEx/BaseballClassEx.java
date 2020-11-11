package SortingFuncEx;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballClassEx {
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
	public static void main(String[] args) {
		int r_Num[] = null;
		boolean clear;
		// initialize(초기화)
		clear = false;
			// random
		r_Num = ranNumber();
		clear = loop(r_Num);
		
		// release
			// result
		resultPrint(clear);
		
		
	}
//	static void ranNumber(int r_num[]) {
//		boolean swit[] = new boolean[10];
//		int w = 0, r;
//		while(w < 3) {
//			r = (int)(Math.random()*10);
//			if(swit[r] == false) {
//				swit[r] = true;
//				r_num[w] = r + 1;
//				w++;
//			}
//		}
//	}
	static int[] ranNumber() {
		boolean swit[] = new boolean[10];
		int w = 0, r;
		int r_num[] = new int[3];
		while(w < 3) {
			r = (int)(Math.random()*10);
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r + 1;
				w++;
			}
		}
		System.out.println(Arrays.toString(r_num));
		return r_num;
	}
	static boolean loop(int[] r_num) {
		int strike, ball;
		int u_num[] = new int[3];
		boolean clear = false;
		
		// loop
		int w = 0;

		while(w < 10) {
			// user input
			userInput(u_num);
			//find
			strike = strikeCheck(u_num, r_num);
			ball = ballCheck(u_num, r_num);
			
			if(strike >= 3) {
				clear = true;
				break;
			}
			//message
			System.out.println(strike + " 스트라이크 " + ball + " 볼 입니다. ");
			w++;
		}
		return clear;
		
	}
	static void userInput(int u_num[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			for (int i = 0; i < u_num.length; i++) {
				System.out.print((i + 1) + " 번째수 : ");
				u_num[i] = sc.nextInt();
			}
			
			if(u_num[0] != u_num[1] && u_num[0] != u_num[2] && u_num[1] != u_num[2]) {
				break;
			}
			System.out.println("같은숫자가 입력됬습니다. 다시입력하세요.");
			continue;
		}
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
	static void resultPrint(boolean clear) {
		if(clear == true) {
			System.out.println("Game clear!!!!!!!");
		}else {
			System.out.println("Game over~~~~~~~~");
		}
	}
}
