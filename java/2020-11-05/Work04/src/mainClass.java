import java.util.Arrays;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//random number 첮기
		/*
		 * 랜덤 숫자(1~100)
		 * 유저가 입력 -> 1~100
		 * 랜덤숫자와 비교
		 * 77	 <- (50입력)            10회의 기회
		 * 			너무 작습니다.
		 * 		 <- (75입력)
		 * 			너무 작습니다.
		 * 		 <- (85입력)
		 * 			너무 큽니다
		 * 		 <- (77입력)
		 * 			정답입니다.
		 */	
		
//		//방법 1
//		Scanner sc = new Scanner(System.in);
//		int num = (int)(Math.random()*100) +1;
//		int choice;

//		loopOut:for(int i = 0; i < 10; i++) {
//			System.out.println("숫자입력: ");
//			choice = sc.nextInt();
//			
//			while(choice >= 100 || choice < 1) {
//				System.out.println("범위 벗어남 다시입력: ");
//				choice = sc.nextInt();
//			}
//
//			if(choice == num) {
//				System.out.println("정답입니다.");
//				break loopOut;
//			}
//			if(choice > num) {
//				System.out.println("너무 큽니다.");
//			}else {
//				System.out.println("너무 작습니다.");
//			}
//			System.out.println("기회는: " + (10 - i) + "번남았습니다");
//
//		}
//		System.out.println("끝");
		
//		//방법2
//		int w = 1;
//		while(w <= 10) {
//			System.out.println("숫자입력");
//			choice = sc.nextInt();
//			
//			while(choice >= 100 || choice < 1) {
//				System.out.print("범위 벗어남 다시입력: ");
//				choice = sc.nextInt();
//			}
//			
//			if(choice == num) {
//				System.out.println("정답입니다.");
//				break;
//			}else if(choice > num) {
//				System.out.println("너무 큽니다.");
//			}else {
//				System.out.println("너무 작습니다.");
//			}
//			System.out.println((10 - w) + "번의 기회가 남음");
//			w++;
//		}
//		//방법3
		
		// random number 찾기
		/*
			랜덤 숫자(1 ~ 100)
			유저 입력 -> 1 ~ 100
			
			랜덤 숫자 와 비교
			77		<- 	50				10회의 기회
						너무 작습니다
					<- 	75
						너무 작습니다
					<-	85
						너무 큽니다
						
						정답입니다.
		*/
		//////////////////////////랜덤 숫자 방법3
		/*
		Scanner sc = new Scanner(System.in);
		int arru[] = new int[3];
		int arrr[] = new int[3];
		
		
		for(int i = 0; i < arrr.length; i++) {
			arrr[i] = (int)(Math.random()*10)+1;
			for(int j = 0; j < i; j++) {
				if(arrr[i] == arrr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arrr));
	
		for(int i = 0; i < arrr.length; i++) {
			System.out.println((i+1)+ "번째 입력");
			arru[i] = sc.nextInt();
			for(int j = 0; j < i; j++) {
				if(arru[i] == arru[j]) {
					System.out.println((i+1)+ "번째틀림 다시" + " 입력");
					i--;
					break;
				}
			}
		}
	}
}
	*/	
/*	
		int r_num, u_num;
		boolean clear;
		int w;
		String replay;
		
		while(true) {
		
			// initialize
			clear = false;
			w = 0;
			
			// 1. random 수를 취득(1 ~ 100)
			r_num = (int)(Math.random() * 100) + 1;
			System.out.println("r_num:" + r_num);
			
			//////////////////////////////////////// loop start
			while(w < 10) {
			
				// 2. user input(1 ~ 100)
				while(true) {		
					System.out.print("숫자 입력 = ");
					u_num = sc.nextInt();
					if(u_num >= 1 && u_num <= 100) {
						break;
					}
					System.out.println("범위를 벗어 났습니다. 다시 입력해 주십시오.");
				}
				
				// 3. 비교(처리)
				int find_num = 1;		// 메시지를 출력하기 위한 용도
				if(u_num > r_num) {
					find_num = 1;
				}else if(u_num < r_num) {
					find_num = 2;
				}else {	// 정답일 경우
					clear = true;
					break;
				}
				
				// 4. 메시지 출력
				switch(find_num) {
					case 1:
						System.out.println("너무 큽니다");
						break;
					case 2:
						System.out.println("너무 작습니다");
						break;
				}
			
				w++;
			}
			//////////////////////////////////////// loop end
	
			// 5. 결과 출력
			if(clear == true) {
				System.out.println("축하합니다. 클리어하셨습니다");
			}else {
				System.out.println("아쉽습니다. 다시 도전하십시오");
			}
			
			System.out.print("play again? (y/n)= ");
			replay = sc.next();
			
			if(replay.equals("n")) {
				System.out.println("안녕히 가십시오.");
				break;
			}else {
				System.out.println("파이팅입니다");
			}
		}
*/
		/*
		baseball
		
		1 ~ 10		7 3 5	
					1 2 3 <-			1 ball		
					2 3 7 <- 1 strike 	1 ball
					7 3 6 <- 2 strike
		
		랜덤 숫자 3개 달라야 한다.
					7 3 3 <- 2 strike 1 ball
		유저 숫자 3개 달라야 한다.
		
		10번의 기회
	*/
	
	// 선언
		int r_num[] = null;		// random number 저장 배열
		//	int r_num[] = { 1, 2, 3, 4, 5,  6, 7, 8, 9, 10 };	// 2번쨰 방법
		int u_num[] = null;		// user number 저장 배열
		boolean clear;
		int strike, ball;
		int gameloop;

		boolean swit[] = new boolean[10];

		// TODO:초기화
		r_num = new int[3];	
		u_num = new int[3];
		clear = false;
		gameloop = 0;

		for (int i = 0; i < swit.length; i++) {			
			swit[i] = false;	// 스위치를 off	
		}


		// 1. random 3개 취득
		// 1번째 방법
		/*
	while(true) {
		for (int i = 0; i < r_num.length; i++) {
			r_num[i] = (int)(Math.random() * 10) + 1;
		}

		if(r_num[0] != r_num[1] 
			&& r_num[0] != r_num[2]
				&& r_num[1] != r_num[2]) {
			break;
		}
	}*/

		// 2번째 방법
		/*
	int r1, r2;
	for (int i = 0; i < 1000; i++) {
		r1 = (int)(Math.random() * 10);	// 0 ~ 9
		r2 = (int)(Math.random() * 10);	// 0 ~ 9

		int temp = r_num[r1]; 			
		r_num[r1] = r_num[r2];
		r_num[r2] = temp;			
	}

	// r_num[0] ~ r_num[2]		
	for (int i = 0; i < r_num.length; i++) {
		System.out.println("r_num[" + i + "] = " + r_num[i]);
	}
		 */

		// debug 

		// 3번째 방법
		int r, w;
		w = 0;

		while(w < r_num.length) {
			r = (int)(Math.random() * 10);	// 0 ~ 9
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r + 1;			// 1 ~ 10
				w++;
			}			
		}

		for (int i = 0; i < r_num.length; i++) {
			System.out.println("r_num[" + i + "] = " + r_num[i]);
		}


		// ------------------------- loop
		while(gameloop < 10) {

			// 2. TODO:user input 3개 취득		
			while(true) {
				w = 0;
				while(w < 3) {
					System.out.print((w + 1) + "번째 수 = ");
					u_num[w] = sc.nextInt();
					w++;
				}

				if(u_num[0] == u_num[1] || 
						u_num[0] == u_num[2] || 
						u_num[1] == u_num[2]) {
					System.out.println("같은 숫자가 있습니다. 다시 입력하세요");
					continue;
				}
				break;
			}

			// 3. finding (판정)
			strike = ball = 0;
			// ball
			for (int i = 0; i < r_num.length; i++) {
				for (int j = 0; j < r_num.length; j++) {
					if(u_num[i] == r_num[j] && i != j) {
						ball++;
					}
				}
			}

			// strike
			for (int i = 0; i < r_num.length; i++) {
				if(u_num[i] == r_num[i]) {
					strike++;
				}
			}		

			// loop 탈출
			if(strike == 3) {
				clear = true;
				break;
			}

			// 4. message
			System.out.println(strike + "스트라이크 " + ball + "볼 입니다");

			gameloop++;
		}

		// --------------------------

		// 5. result
		if(clear) {
			System.out.println("Game Clear!!!");
		}else {
			System.out.println("Game Over~");
		}





	}

}







