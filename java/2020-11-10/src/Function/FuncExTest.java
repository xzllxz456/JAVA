package Function;

import java.util.Arrays;

public class FuncExTest {
//	기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
//	처리한 배열을 반환한다.
//	반환타입 : int[]
//	매개변수 : int[] arr – 정수 값이 담긴 배열
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
//		int[] result = shuffle(original);
//		System.out.println(Arrays.toString(result));
		shuffle2(original);
		System.out.println(Arrays.toString(original));
	}
	static void shuffle2(int ori[]) {
		for (int i = 0; i < 1000; i++) {
			int r1 = (int)(Math.random() * ori.length);
			int r2 = (int)(Math.random() * ori.length);
			int temp = ori[r1];
			ori[r1] = ori[r2];
			ori[r2] = temp;
		}
	}
	static int[] shuffle(int ori[]) {
		for (int i = 0; i < 1000; i++) {
			int r1 = (int)(Math.random() * ori.length);
			int r2 = (int)(Math.random() * ori.length);
			int temp = ori[r1];
			ori[r1] = ori[r2];
			ori[r2] = temp;
		}
		return ori;
	}
}
