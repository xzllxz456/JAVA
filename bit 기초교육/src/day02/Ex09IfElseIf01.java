package day02;
//만약 체크해야될 조건이 다양하다면
//if else if 구조로 만들면 된다.
//우리가 필요한 조건 만큼 else if로 추가해주면 된다.
public class Ex09IfElseIf01 {
	public static void main(String[] args) {
		int age = 20;
		if(age >= 18) {
			System.out.println("성인입니다.");
		}else if(age >= 14) {
			System.out.println("청소년입니다.");
		}else if(age >= 6) {
			System.out.println("어린이입니다.");
		}else {
			System.out.println("유아입니다.");
		}
	}
}
