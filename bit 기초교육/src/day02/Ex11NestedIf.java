package day02;
//중첩 if문
// "if문 안에 if문!"
import java.util.Scanner;
public class Ex11NestedIf {
	public static void main(String[] args) {
		//바깥쪽 if가 true가 나와야
		//그 안에 if가 실행이 된다.
		
		//사용자로부터 성별, 나이, 신체등급순으로 입력받아서
		//현역, 공익, 면제가 출력되는 프로그램
		Scanner scanner = new Scanner(System.in);
		System.out.print("성별을 입력해주세요(남자는 1, 여자는 2): ");
		int sex = scanner.nextInt();
		if(sex == 1) {
			//남성이므로 나이를 입력 받는다.
			System.out.print("나이를 입력해주세요: ");
			int age = scanner.nextInt();
			if(age >= 18) {
				//성인 남성이므로 신체등급을 입력받는다.
				System.out.print("등급을 입력해주세요: ");
				int category = scanner.nextInt();
				if(category >= 1 && category <= 3) {
					System.out.println("현역!"); 
				}else if(category == 4) {
					System.out.println("공익!");
				}else {
					System.out.println("면제!");
				}
			}else {
				System.out.println("아직 미성년자입니다.");
			}
		}else {
			//여성이므로 메시지만 출력해준다.
			System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
		}
		
		
		scanner.close();
	}
}
