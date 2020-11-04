package day03;
// 사용자로 부터 이름, 국어, 영어, 수학 점수를 입력 받아서
// 출력하는 프로그램을 작성하세요
// 요구사항 1.
//   무한 루프를 이용해서 메뉴를 만들어
//   사용자가 입력, 출력을 따로 선택할 수 있고
//   종료를 선택할 시에는 프로그램이 종료되게 만드세요.
// 요구사항 2.
//   사용자가 잘못된 점수를 입력하면 올바른 점수가 입력될때까지 입력되게 만들어주세요
// 요구사항 3.
//   점수 출력시에 평균에 맞추어
//     A, B, C, D, F가 추가적으로 출력되게 만들어주세요.
// 권장사항 1.
//   만약 사용자가 아무런 입력없이 출력을 누르면 아직 입력된 값이 없다고
//   출력되게 만들어보세요

// 결과화면:
//   이름: 조재영
//   국어: 080점 영어: 081점 수학: 081점
//   총점: 242점 평균: 80.66점(B) (50분까지)
import java.util.Scanner;
public class Ex15GradeBook2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = new String();
		int korean = -1;
		int english = 0;
		int math = 0;
		
		while(true) {
			System.out.println("1. 입력 2. 출력 3. 종료");
			System.out.print("> ");
			
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
				//성적 입력하는 코드
				System.out.print("이름: ");
				scanner.nextLine();
				name = scanner.nextLine();
				
				System.out.print("국어: ");
				korean = scanner.nextInt();
				while(korean < 0 || korean > 100) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.print("국어: ");
					korean = scanner.nextInt();
				}
				
				System.out.print("영어: ");
				english = scanner.nextInt();
				while(english < 0 || english > 100) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.print("영어: ");
					english = scanner.nextInt();
				}
				
				System.out.print("수학: ");
				math = scanner.nextInt();
				while(math < 0 || math > 100) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.print("수학: ");
					math = scanner.nextInt();
				}
			}else if(userChoice == 2) {
				//성적 출력하는 코드
				if(korean == -1) {
					//아직 성적 입력이 안된 상태이므로 경고메시지만 출력
					System.out.println("아직 입력된 정보가 없습니다.");
				}else {
					//성적 입력이 되었으므로 출력하는 코드 실행
					System.out.printf("이름: %s\n", name);
					System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", 
							korean, english, math);
					int sum = korean + english + math;
					double average = sum / 3.0;
					String letterGrade = new String();
					switch(sum / 30) {
					case 10:
					case 9:
						letterGrade = "A";
						break;
					case 8:
						letterGrade = "B";
						break;
					case 7:
						letterGrade = "C";
						break;
					case 6:
						letterGrade = "D";
						break;
					default:
						letterGrade = "F";
						break;
					}
					
					System.out.printf("총점: %03d점 평균: %.2f점(%s)\n", 
							sum, average, letterGrade);
				}
				
			}else if(userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
		
		scanner.close();
	}
}










