package day03;
// 사용자로부터 int 값을 하나 입력 받아서 
// 1부터 그 수까지의 합을 구하는 프로그램을
// 작성하세요. (10분)
import java.util.Scanner;
public class Ex05ForLoop02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int number = scanner.nextInt();
		//1~number까지의 합은 for 반복문이 종료가 되도
		//값이 남아있어야 하고 또 변수가 호출 가능해야하기 때문에
		//for문의 바깥에 만들어주어야 한다!
		int sum = 0;
		for(int i = 1; i <= number; i++) {	
			sum += i;
		}
		
		System.out.printf("%d부터 %d까지의 합: %d\n", 1, number, sum);
		//1부터 사용자가 새로 입력한 수까지의 곱을 구하는 for문을 만들어보세요(5분)
		System.out.print("새로운 숫자를 입력해주세요: ");
		number = scanner.nextInt();
		sum = 1;
		for(int i = 1; i <= number; i++) {
			sum *= i;
		}
		System.out.printf("1부터 %d까지의 곱: %d\n", number, sum);
		
		scanner.close();
	}
}







