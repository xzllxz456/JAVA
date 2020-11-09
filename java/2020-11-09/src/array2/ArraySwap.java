package array2;

import java.util.Arrays;

public class ArraySwap {
	public static void main(String[] args) {
		int numberOne[] = {1, 2, 3, 4, 5};
		int numberTwo[] = {11, 22, 33, 44, 55};
		
		int oneNum[] = numberOne;
		int twoNum[] = numberTwo;
		// swap
		// 처리가 가볍다
		int temp[];
		temp = oneNum;
		oneNum = twoNum;
		twoNum = temp;
		
		
		/* cpu가 바빠진다
		int temp;
		for (int i = 0; i < numberOne.length; i++) {
			temp = numberOne[i];
			numberOne[i] = numberTwo[i];
			numberTwo[i] = temp;
		}
		*/
//		System.out.println(Arrays.toString(numberOne));
//		System.out.println(Arrays.toString(numberTwo));
		System.out.println(Arrays.toString(oneNum));
		System.out.println(Arrays.toString(twoNum));
	}
}
