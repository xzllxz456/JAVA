package BaseBall;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBallGame {
	//랜덤
	int r_num[];
	int u_num[];
	boolean b;
	int strike;
	int ball;
	
	//때려넣기
	public void init() {
		Scanner sc = new Scanner(System.in);
		System.out.print("얼마나 할꺼임?");
		int nnnn = sc.nextInt();
		r_num = new int[nnnn];
		u_num = new int[nnnn];
		
		rnamdonNumArr();
	}
	// 랜덤
	public void rnamdonNumArr() {
		int w = 0;
		while(w < r_num.length) {
			b =false;
			int n = (int)(Math.random() * 9) + 1;
			sameNum(r_num, n);
			if(b) {
				continue;
			}
			r_num[w] = n;
			w++;
		}
		System.out.println(Arrays.toString(r_num));
	}
	//판독기
	public void sameNum(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == n) {
				b = true;
				break;
			}
		}
	}
	//유저 
	public void userNumArr() {
		Scanner sc = new Scanner(System.in);
		int w = 0;
		while(w < u_num.length) {
			b = false;
			System.out.println((w+1) + "번째 입력: ");
			int n = sc.nextInt();

			sameNum(u_num, n);
			if(b) {
				System.out.println("중복수 있음 다시입력");
				continue;
			}
			u_num[w] = n;
			w++;
		}
		System.out.println(Arrays.toString(u_num));
		
	}
	//스트라이크 
	public void stststst() {
		strike = 0;
		for (int i = 0; i < r_num.length; i++) {
			if(u_num[i] == r_num[i])
				strike++;
		}
	}
	//볼
	public void balllll() {
		ball = 0;
		for (int i = 0; i < r_num.length; i++) {
			for (int j = 0; j < r_num.length; j++) {
				if(u_num[i] == r_num[j] && i!=j) {
					ball++;
				}
			}
		}
	}
	
	
}
