
public class mainClass {
	public static void main(String[] args) {
		/*
		 * loop문, 순환문  
		 * 지정된 회수만큼 반복을 처리하는 제어문
		 * 
		 * for((선언)초기화; 조건식; 연산식) {
		 * 		처리
		 * }
		 * 
		 * int num = 0;
		 * 
		 * num = num + 1;
		 * num = num + 1;
		 * num = num + 1;
		 *     :
		 *     :
		 *     
		 *     
		 *     -------------------------
		 * for(초기화(1); 조건식(2) (5) (8 조건이 안맞으면); 연산식(4)(7)){ 		// 중심부는 항상 거친다.
		 * 		처리(3)(6)
		 * }
		 * (9) //탈출
		 */
		
		int n;
		for(n = 0; n < 10; n++) {
			System.out.println("n = " + n);
		}
		System.out.println("n = " + n);
		for(n = 10; n < 10; n++) {
			System.out.println("n = " + n);
		}
		
		// 1 ~ 10 까지 더하기
		int num = 0;
//		num = num + 1;
//		num = num + 2;
//		num = num + 3;
//	//		:
//		num = num + 10;  		// 하드코딩 
		
		for(n = 1; n <=10; n++) {
//			num = num + n;
			num += n;
		}
		System.out.println(num);
		
		for(int i = 0; i < 10; i++) {		// for문 안에 변수를 선언하면 for문 종료시 소멸
			System.out.println("i = " + i);
		}
	}
}
