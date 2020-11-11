import java.util.Arrays;
import java.util.Scanner;

class mainClass {
	public static void main(String[] args) {
		// 2차원 배열 -> 1차원 배열
		int array[][] = array1();
		int array1[] = changeArray(array);
		result(array1);
		
		
	}
	
	static int[] changeArray(int array[][]) {
		int[] oneDimen = new int[array.length * array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				oneDimen[array[0].length * i + j] = array[i][j];
			}
		}
		return oneDimen;
	}
	static int [][] array1(){
		Scanner sc = new Scanner(System.in);
		System.out.print("몇행 ?: ");
		System.out.print("몇열 ?:");
		int line1;
		int number1;
		// 값입력
		line1 = sc.nextInt();
		number1 = sc.nextInt();
		int arrNum1[][] = new int[line1][number1];
		for (int i = 0; i < arrNum1.length; i++) {
			for (int j = 0; j < arrNum1[i].length; j++) {
				System.out.print(i + "행" + j + "열 수입력: ");
				arrNum1[i][j] = sc.nextInt();
			}
		}
		return arrNum1;
	}
	static void result(int[] arr) {
		System.out.print(Arrays.toString(arr));
	}
}
