package Function;

import java.util.Arrays;

public class FuncEx5 {
//	(1) 배열의 값에 *2배의 연산된 값이 산출되도록 메소드를 작성하시오.
	static int[] getDouble(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}
		return arr;
	}
	public static void main(String[] args) {

	int num1[] = {1, 2, 3, 4, 5};
	int arr[] = getDouble(num1);
	// 결과 출력
	System.out.println(Arrays.toString(arr));

	}
}
