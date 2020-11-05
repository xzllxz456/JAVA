import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		/*
		 	continue: Skip(생략)
		 			 다음처리를 생략
		 			   for, while
		 			   
		 	loop{	-> for, while
		 	처리 1
		 	처리 2
		 	if continue;
		 	처리 3	 // continue 아래부분은 생략
		 	}
		 */ 
//		for (int i = 0; i < 5; i++) {
//			System.out.println("i =" + i);
//			System.out.println("for Start");
//			if(i >= 3) continue;
//			
//			System.out.println("for End");
//			System.out.println();
//		}
//		for (int i = 0; i < 5; i++) {
//			System.out.println("i =" + i);
//			System.out.println("for Start");
//			if(i == 3) continue;
//			
//			System.out.println("for End");
//			System.out.println();
//		}
//		
//		int datas[] = {90, 85, -12, 70};
//		int sum = 0;
//		for (int i = 0; i < datas.length; i++) {
//			if(datas[i] < 0) continue;
//			
//			sum = sum + datas[i];
//		}
//		System.out.println("sum= " + sum);
//		 
//		//입력 받아야 하는 경우(음수는 입력불가)
		Scanner sc = new Scanner(System.in);
//		int numArr[] = new int[5];
//		int num;
//		for (int i = 0; i < numArr.length; i++) {
//			System.out.println((i+1) + "번째수= ");
//			num = sc.nextInt();
//			if(num < 0) {
//				System.out.println("음수입니다");
//				continue;
//			}
//			numArr[i] = num;
//		}
//		for(int i = 0; i < numArr.length; i++) {
//			System.out.println("numArr[" + i + "] = " + numArr[i]);
//		}
//		System.out.println();
		//while문의 경우
		int arrNum[] = new int[5];
		int number;
		int w = 0;
	
		while(w < 5) {
			System.out.print((w+1) + "번째 수 =");
			number = sc.nextInt();
			if(number < 0) {
				System.out.println("음수입니다.");
				continue;
			}
			arrNum[w] = number;
			w++;
			
		}
		w = 0;
		while(w < arrNum.length) {
			System.out.println("arrNum[" + w + "] = " + arrNum[w]);
			w++;
		}
	}
}
