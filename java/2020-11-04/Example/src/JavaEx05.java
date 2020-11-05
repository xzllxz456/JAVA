
import java.util.Scanner;

public class JavaEx05 {
	public static void main(String[] args) {
		//임의 수를 입력받고 그 해당하는 수의 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단수 입력");
		int gugu = sc.nextInt();
		for(int i = gugu; i <= gugu; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d \t", i, j, i*j);
			}
		}
	}
}
