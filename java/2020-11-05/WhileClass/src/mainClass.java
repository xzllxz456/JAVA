
public class mainClass {
	public static void main(String[] args) {
		
	
		/*
		 * while (순환문)
		 * 
		 * 형식: 
		 * 		변수선언
		 * 		변수초기화
		 * 
		 * 		while(조건식){
		 * 			처리
		 * 			연산식
		 * 		}
		 * 
		 * 		for(초기화; 조건식; 연산식){
		 * 			처리
		 * 		}
		 * 
		 * do while
		 * 
		 * 		변수선언
		 * 		변수초기화
		 * 		
		 * 		do{
		 * 			처리
		 * 			연산식
		 * 		}while(조건식);
		 */
		int w;
		w = 0;
		
		while (w < 10) {
			System.out.println("w: " + w);
			w++;
		}
		/*
		 * init (초기화)
		 * loop - while
		 * release (메모리 해방(메모리에서 사라짐))
		 */
		int w1 = 0;
		do {		// 조건을 안걸치고 do에서 일단 실행후 조건으로 감
			System.out.println("w1: " + w1);
			w1++;
		}while(w1 < 10);
		
		int w2, w3;
		w2 = 0;
		w3 = 0;
		while (w2 < 10) {
			System.out.println("w2 = " + w2);
			w3 = 0;
				while (w3 < 5) {
				System.out.println("   w3 = " + w3);
				w3++;
			}
			w2++;
		}
		
		//구구단
		//2중 while로 구구단
		w2 = 0;
		w3 = 0;
		while(w2 < 10) {
			w3 = 1;
			while(w3 < 10) {
				System.out.print("    "+w2 + "*" + w3+ "=" + (w2*w3));
				w3++;
			}
			System.out.println();
			w2++;
		}
		w2 = 0;
		w3 = 0;
		while(w2 < 10) {
			w3 = 1;
			System.out.println(w2 + "단");
			while(w3 < 10) {
				System.out.println("    "+w2 + "*" + w3+ "=" + (w2*w3));
				w3++;
			}
			w2++;
		}
	}
}