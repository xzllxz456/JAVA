package array2;

public class array2ToArray1 {
	public static void main(String[] args) {
		// 2차원배열 -> 1차원 배열 변환  2*3 -> 6
		/*
		 	[][][]	  -> [][][][][][][]
		 	[][][]
		 */
		
		int array2[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		
		int array1[] = new int[array2.length * array2[0].length];
		/*
		 	array2[0][0]	array2[0].length == 4 * 0 + 0
		 	array2[0][1]	array2[1].length == 4 * 0 + 1
		 	array2[0][2]	array2[2].length == 4 * 0 + 2
		 	array2[0][3]	array2[3].length == 4 * 0 + 3
		 */
		for (int i = 0; i < array2.length; i++) {	//0 1 2
			for (int j = 0; j < array2[0].length; j++) {	// 0 1 2 3
				array1[array2[0].length * i + j] = array2[i][j];
			}
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println("arrat1[" + i + "] = " + array1[i]);
		}
	}
}
