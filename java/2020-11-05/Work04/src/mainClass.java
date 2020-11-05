import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		
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
		Scanner sc = new Scanner(System.in);
		
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

	}
}

