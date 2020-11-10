package Function;

public class FuncExtest5 {
//	(1) 배열의 값에 *2배의 연산된 값이 산출되도록 메소드를 작성하시오.
	public static void main(String[] args) {
		int num1[] = {1, 2, 3, 4, 5};	// distanceHdc(int name, int**); (들어가는 값, 나가는 값)
		getDouble(num1);
		for (int i : num1) {
			System.out.print(i + " ");
		}
	}
	static void getDouble(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}
	}
}
