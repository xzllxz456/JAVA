import java.util.Arrays;

public class dsadsad {
	public static void main(String[] args) {
//		int r_num[] = null;		// random number 저장 배열
		int r_num[] = { 1, 2, 3, 4, 5,  6, 7, 8, 9, 10 };	// 2번쨰 방법
		int u_num[] = null;		// user number 저장 배열
		boolean clear;
		int strike, ball;
		int gameloop;

		boolean swit[] = new boolean[10];

		// TODO:초기화
	//	r_num = new int[10];	
		u_num = new int[3];
		clear = false;
		gameloop = 0;

//		for (int i = 0; i < swit.length; i++) {			
//			swit[i] = false;	// 스위치를 off	
//		}


		// 1. random 3개 취득
		// 1번째 방법
		
//	while(true) {
//		for (int i = 0; i < r_num.length; i++) {
//			r_num[i] = (int)(Math.random() * 10) + 1;
//		}
//
//		if(r_num[0] != r_num[1] 
//			&& r_num[0] != r_num[2]
//				&& r_num[1] != r_num[2]) {
//			break;
//		}
//	}

		// 2번째 방법
		
	int r1, r2;
	for (int i = 0; i < 1000; i++) {
		r1 = (int)(Math.random() * 10);	// 0 ~ 9
		r2 = (int)(Math.random() * 10);	// 0 ~ 9

		int temp = r_num[r1]; 			
		r_num[r1] = r_num[r2];
		r_num[r2] = temp;	
		
		
		System.out.println(Arrays.toString(r_num));
	}
	System.out.println(Arrays.toString(r_num));

	}
}






