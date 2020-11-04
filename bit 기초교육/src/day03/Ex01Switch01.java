package day03;

// 조건문 두번째
// switch
// 스위치의 경우 조건문이지만
// 특이하게도 조건식이 아니라
// 변수 혹은 변수 가 변화하는 결과값에 따라서
// 실행될 코드가 결정된다는 점이 다르다.
public class Ex01Switch01 {
	public static void main(String[] args) {
		int number = 2;

		// 스위치는
		// switch(변화 가능한 변수 혹은 변수의 연산자를 추가함) {
		// case 특정값:
		// 실행할 코드
		// ....
		// break;
		// case 특정값:
		// 실행할 코드
		// ....
		// break;
		// default:
		// 실행할 코드
		// ....
		// break;
		// }

		switch (number) {
		case 1:
			System.out.println("case 1 도착");
			System.out.println("number의 현재값: " + number);
			break;
		case 2:
			System.out.println("case 2 도착");
			System.out.println("number의 현재값: " + number);
			break;
		case 3:
			System.out.println("case 3 도착");
			System.out.println("number의 현재값: " + number);
			break;
		default:
			System.out.println("default 도착");
			System.out.println("number의 현재값: " + number);
			break;
		}
		// switch의 경우 case안에
		// break 라는 예약어가 존재한다.
		// break의 경우 해당 코드 블락을 그 시점에서
		// 종료 시킨다.
		// 만약 switch의 case 안에 
		// break가 없으면
		// break가 나올때까지의 모든 코드를 다 실행시킨다.
		// 단, switch의 변수가 일치하는 값에 해당하는 케이스부터.
		
	}
}














