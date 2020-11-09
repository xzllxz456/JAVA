package array2;

import java.util.Arrays;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
	
		/* 
		   1 차원 배열
		   Array: 같은 자료형 변수들의 묶음
		   		  index number로 관리된다.
		   		  int arr[] = new int[배열의 총 수];
		   		  						5	0 ~ 5-1
		   		  
		   		  int arr[] =  new int[3];//동적할당을하고 정적으로 활용
		   		  int arr[] = {1, 2, 3};
		   String member[] = {"홍길동", "24", "서울시"}; 
		   int age = Integer.parseInt(member[1]);
		   
		   2 차원 배열: 1차원 배열을 다수 관리를 할 수 있는 배열
		   
		   int array2[][] = new int[3][4];
		   int[] array2[] = new int[3][4];
		   int[][] array2 = new int[3][4];
		   
		   int array2[][] = {		//[열], [행]
		   		{1, 2, 3, 4},
		   		{5, 6, 7, 8},
		   		{9, 10, 11, 12}
		   };
		   
		   		
		 */
		
		int array[][] = new int[3][];
		int row1[] = {1, 2, 3};
		int row2[] = {2, 3, 4, 5};
		
		array[0] = row1;
		array[1] = row2;
		array[2] = row1;
		
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
			
		}
		
		char cArr[][] = { 
				{'A', 'B', 'C'},
				{'D', 'E', 'F'}
		};
		/*
		 	/////////////////pointer예시
		 	cArr[1][1] == 'E'
		 	
		 	char **cArr
		 	char []cArr[]
		 	*(*(cArr + 1) + 1) == 'E'
		 	
		 	
		 */
		
		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				System.out.print(cArr[i][j]);
			}
			System.out.println();
		}
		
		int array2[][] = new int[3][2];
		array2[0][0] = 11;
		array2[0][1] = 12;
		array2[1][0] = 21;
		array2[1][1] = 22;
		array2[2][0] = 31;
		array2[2][1] = 32;
		
		// alias -> pointer  (자바에서 쓸수있는 포인터)
		int array1[] = {111, 222 ,333};
		int alias[] = null;
		alias = array1;  	//*alias = array1;
		
		for (int i = 0; i < alias.length; i++) {
			System.out.println(alias[i]);
		}
		
		alias[1] = 200;
		
		System.out.println(array1[1]);
		
		// foreach   // array 안에있는 value 값까지 n이 도달
		for(int n : array1) {
			System.out.println("n = " + n);
		}
		//TODO:///////////////////Example:
		//2차원 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("몇행 ?: ");
		System.out.print("몇열 ?:");
		int line;
		int number;
		line = sc.nextInt();
		number = sc.nextInt();
		int arrNum[][] = new int[line][number];
		//값을 대입
		for (int i = 0; i < arrNum.length; i++) {
			for (int j = 0; j < arrNum[i].length; j++) {
				System.out.print(i + "행" + j + "열 수입력: ");
				arrNum[i][j] = sc.nextInt();
			}
		}
		//출력
		for (int i = 0; i < arrNum.length; i++) {
			for (int j = 0; j < arrNum[i].length; j++) {
				System.out.print(arrNum[i][j]);
			}
			System.out.println();
		}
		
		// 2차원 배열 -> 1차원 배열		2*3 -> 6
		
		//2차원 배열
		System.out.print("몇행 ?: ");
		System.out.print("몇열 ?:");
		int line1;
		int number1;
		// 값입력
		line1 = sc.nextInt();
		number1 = sc.nextInt();
		int arrNum1[][] = new int[line1][number1];
		int oneDimen[] = new int [line1 * number1];
		for (int i = 0; i < arrNum1.length; i++) {
			for (int j = 0; j < arrNum1[i].length; j++) {
				System.out.print(i + "행" + j + "열 수입력: ");
				arrNum1[i][j] = sc.nextInt();
			}
		}
		// 1차원 변환
		for (int i = 0; i < arrNum.length; i++) {
			for (int j = 0; j < arrNum[i].length; j++) {
				for(int k = 0; k < oneDimen.length; k++) {
					oneDimen[i] = arrNum[i][j];
				}
				System.out.print(arrNum1[i][j]);
			}
			System.out.println();
		}
		// 출력
		for (int i = 0; i < arrNum1.length; i++) {
			for (int j = 0; j < arrNum1[i].length; j++) {
			}
		}
		
	}
}















