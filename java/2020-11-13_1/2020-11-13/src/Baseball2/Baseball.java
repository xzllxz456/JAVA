package Baseball2;

import java.util.Arrays;
import java.util.Scanner;

public class Baseball {
	int r_num[];
	int u_num[];
	boolean clear;
	int count;
	
	
	// 초기화 
	public void init() {
		r_num = new int [3];
		u_num = new int [3];
		clear = false;
		
		count = 1;
		
		random();
	}
	// 랜덤 수 취득
	public void random() {
		boolean swit[] = new boolean[10];
		int r, w;
		
		for (int i = 0; i < swit.length; i++) { 
			swit[i] = false;
		}
		w = 0;
		
		while (w < 3) {
			r = (int)(Math.random() * 10);
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r + 1;
				w++;
			}
		}
		System.out.println(Arrays.toString(r_num));
	}
	// 유저 입력
	public void userInput() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < u_num.length; i++) {
			System.out.println((i+1) + "번째 수");
			u_num[i] = sc.nextInt();
		}
	}
	// 판정 strike, ball
	public boolean finding() {
		int strike, ball;
		strike = ball = 0;
		//스트라이크 볼 판정
		for (int i = 0; i < r_num.length; i++) {
			for (int j = 0; j < u_num.length; j++) {
				if(u_num[i] == r_num[j] && i != j) {
					ball++;
				}
			}
		}
		for (int i = 0; i < r_num.length; i++) {
			if(u_num[i] == r_num[i]) {
				strike++;
			}
		}
		//message
		if(strike > 2) {
			return true;
		}
		System.out.println(strike + " 스트라이크 " + ball + "  볼 입니다.");
		
		return false;
	}
	
	// 결과
	public void loop() {
		int w = 0;
		
		while(w < 10) {
			userInput();
			clear = finding();
			if(clear) {
				break;
			}
			w++;
			count++;
		}
	}
	public void result() {
		if(clear) {
			System.out.println(count + "회만에 ");
			System.out.println("game clear!!");
		}else {
			System.out.println(" game over!!");
		}
	}
}
