import java.util.Arrays;

public class ArraysClass_1 {
	public static void main(String[] args) {
		int array2[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		
		int array1[] = null;
		array1 = array2ToArray1(array2);
		System.out.println(Arrays.toString(array1));
	}
	static int[] array2ToArray1(int arr[][]) {
		if(arr == null || arr.length == 0) return null;
		
		
		
		int array[] = new int[arr.length * arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				array[arr[0].length * i + j] = arr[i][j];
			}
			
		}
		return array;
	}
}
