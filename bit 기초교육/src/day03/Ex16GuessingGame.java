package day03;
// 숫자 맞추기 게임
// 컴퓨터가 랜덤한 숫자를 만들어주고
// 사용자는 숫자를 입력해서
// 만약 입력한 숫자가 랜덤숫자보다 크면 DOWN
// 만약 반대의 경우에는 UP이 출력되서
// 몇번만에 사용자가 그 숫자를 맞추는지 보여준다.
import java.util.Scanner;
import java.util.Random;
public class Ex16GuessingGame {
	final static int MAX = 100;
	public static void main(String[] args) {
		//Scanner와 마찬가지로 Random도 외부 클래스이기 때문에 import 해야되고
		//Scanner 처럼 변수로 만들어주어야 한다.
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			System.out.println("1. 플레이 2. 종료");
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
				int score = 0;
				int computerNumber = random.nextInt(MAX)+1;
				System.out.print("숫자를 입력해주세요: ");
				int userNumber = scanner.nextInt();
				score++;
				while(computerNumber != userNumber) {
					if(computerNumber > userNumber) {
						System.out.println("UP");
					}else {
						System.out.println("DOWN");
					}
					System.out.print("숫자를 입력해주세요: ");
					userNumber = scanner.nextInt();
					score++;
				}
				System.out.println("정답!!!");
				System.out.println("사용자의 점수: "+score);
			}else if(userChoice == 2) {
				System.out.println("플레이 해주셔서 감사합니다.");
				break;
			}
		}
		
		scanner.close();
	}
}
