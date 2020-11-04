package day04;

// 학생관리 프로그램
import java.util.Scanner;

public class StudentEx01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student s = new Student();

		while (true) {
			System.out.println("1. 입력 2. 출력 3. 종료");
			int userChoice = scanner.nextInt();

			if (userChoice == 1) {
				scanner.nextLine();
				System.out.print("학번: ");
				s.setId(scanner.nextLine());

				System.out.print("이름: ");
				s.setName(scanner.nextLine());

				s.setKorean(validateScore("국어", scanner));
				s.setEnglish(validateScore("영어", scanner));
				s.setMath(validateScore("수학", scanner));
			} else if (userChoice == 2) {
				if (s.getName() == null) {
					System.out.println("아직 입력된 정보가 없습니다.");
				} else {
					System.out.println(s);
				}

			} else if (userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}

		}
		scanner.close();
	}

	public static int validateScore(String testName, Scanner scanner) {
		System.out.print(testName + " 점수: ");
		int score = scanner.nextInt();
		while (score < 0 || score > 100) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print(testName + " 점수: ");
			score = scanner.nextInt();
		}
		return score;
	}
}
