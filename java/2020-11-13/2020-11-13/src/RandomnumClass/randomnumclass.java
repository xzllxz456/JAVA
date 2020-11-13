package RandomnumClass;

import java.util.Scanner;

public class randomnumclass {
	/*
	 	숫자 빼기 게임
	 	Random : 15 ~ 100 -> 1개
	 	
	 	유저 입력: (1 ~ 5)
	 	
	 	34 -> 5 = 29 - 4 = 25 
	 	0과 같거나 작으면 패배
	 */
	int rnum;
	int unum;
	boolean b;
	int n;

	public void rnum() {
		rnum = (int)(Math.random() * 86) + 15;
	}
	
	public void unum() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			unum = sc.nextInt();
			if(unum > 0 && unum < 6) {
				break;
			}else {
				System.out.println("1~5까지 입력");
				unum = sc.nextInt();
			}
		}
	}
	
	public void init() {
		b = false;
	}
	
	public void check() {
		if(rnum <= 0) {
			System.out.print(rnum);
			System.out.println("님 졌음");
			b = true;
		}
	}
	
	public void onemore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("한번 더하실? y = 1 no = 2");
		n = sc.nextInt();
		if(n == 1) {
			System.out.println("다시시작");
			b = true;
		}else {
			b = false;
		}
	}
	
	public void loop() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int count = 1;
			rnum();
			System.out.println(rnum);
			b = false;
			while(true) {
				System.out.println("1~5까지 입력");
				unum();
				System.out.println(count + "번째");
				rnum = rnum - unum;
				check();
				if(b) {
					break;
				}
				count++;
			}
			onemore();
			
			if(b) {
				System.out.println("다시시작");
			}else {
				System.out.println("ㅂㅂㅂㅂㅂㅂㅂㅂ");
				break;
			}
		}
	}
}
