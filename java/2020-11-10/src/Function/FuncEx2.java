package Function;

import java.util.Arrays;

public class FuncEx2 {
	static int[] shuffle(int[] arr){
		for (int i = 0; i < arr.length+9; i++) {
			int add =(int) (Math.random() *9);
			for (int j = 0; j < arr.length; j++) {
				int temp = arr[add];
				arr[add] = arr[j];
				arr[j] = temp;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
//		기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
//		처리한 배열을 반환한다.
//		반환타입 : int[]
//		매개변수 : int[] arr – 정수 값이 담긴 배열
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}
}
