package day03;
//별찍기 1번
//	*
//	**
//	***
//	****
//	*****

// 위의 별을 찍을 건데 사용자가 입력한 숫자에 따라서 크기가 바뀐다.

// 이러한 별찍기 문제에서
// 바깥쪽 for 문은 세로 줄을 담당한다.
// 안쪽 for 문은 가로 별을 담당한다.
import java.util.Scanner;
public class Ex08PrintStar01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력할 줄의 수를 입력해주세요: ");
		int userNumber = scanner.nextInt();
		
		for(int height = 1; height <= userNumber; height++) {
			for(int width = 1; width <= height; width++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}










