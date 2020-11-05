import java.util.Scanner;

public class mainClass {
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
		int r_arr[] = new int[3];
		int u_arr[] = new int[3];
		int w = 0;
		int w1 = 0;
		while(true) {
			while(true) {
				for(int i = 0; i < 3; i++) {
					r_arr[i] = (int)(Math.random()*10)+1;
				}
				if(r_arr[0]==r_arr[1]) {
					r_arr[1] = (int)(Math.random()*10)+1;
					continue;
				}else if(r_arr[1] == r_arr[2]) {
					r_arr[2] = (int)(Math.random()*10)+1;
					continue;
				}else if(r_arr[0] == r_arr[2]) {
					r_arr[2] = (int)(Math.random()*10)+1;
					continue;
				}
				break;
			}
			w = 0;
			for(int i = 0; i< 3; i++) {
				System.out.println(r_arr[i]);
			}
			while(w < 10) {

				for(int i = 0; i < 3; i++) {
					System.out.print("숫자입력:");
					u_arr[i] = sc.nextInt();
				}

				while(true) {

					if(u_arr[0]==u_arr[1]) {
						System.out.println("같은수가 있습니다 중간숫자를 바꿈");
						u_arr[1] = sc.nextInt();
						continue;
					}else if(u_arr[1] == u_arr[2]) {
						System.out.println("같은수 있음 마지막숫자바꿈");
						u_arr[2] = sc.nextInt();
						continue;
					}else if(u_arr[0] == u_arr[2]) {
						System.out.println("같은수 있음 첫번째 숫자 바꿈");
						u_arr[0] = sc.nextInt();
						continue;
					}
					break;

				}
				int strike = 0;
				int ball = 0;
				for(int i = 0; i <r_arr.length; i++) {
					for(int j = 0; j<u_arr.length; j++) {
						if( r_arr[i] == u_arr[j] && i == j) {
							strike++;
						}else if(r_arr[i] == u_arr[j] && i != j) {
							ball++;
						}
					}
				}
				System.out.println("스트라이크: " + strike + " 볼: " + ball);

				if(strike == 3) {
					System.out.println("아웃 끝");
					break;
				}else {
					w++;
					System.out.println("목숨 : "+  (10 - w));
				}
			}
			System.out.println("기회끝 ㅂㅂ");
			System.out.println("한번 더 하실? (y/n)");
			String re = sc.next();
			if(re.equals("n")) {
				System.out.println("ㅂㅂㅂㅂㅂㅂㅂㅂㅂㅂ");
				break;
			}else {
				System.out.println("재도전");
			}
		}


		
		
		
		
		
		
		
		
		
		
		
//		while(w1 < 3) {
//			if(u_arr[0] == n1 || u_arr[1] == n1 || u_arr[2] == n1) {
//				continue;
//			}
//			u_arr[w1] = n1;
//			System.out.println(u_arr[1]+""+u_arr[1]+""+u_arr[2]);
//	
//			w1++;
//		}
	}
}
