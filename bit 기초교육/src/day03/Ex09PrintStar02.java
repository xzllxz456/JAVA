package day03;
//	*****
//	****
//	***
//	**
//	*
// 사용자가 입력한 숫자에 따라 크기가 변하게
// 만들어보세요
import java.util.Scanner;
public class Ex09PrintStar02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력할 줄 수를 입력해주세요: ");
		int userNumber = scanner.nextInt();
		for(int height = 1; height <= userNumber; height++) {
			for(int width = height; width <= userNumber; width++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
