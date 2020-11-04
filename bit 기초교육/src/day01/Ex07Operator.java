package day01;
// 연산자(operator)

// 연산자란, 특정 기호에 프로그래밍적으로
// 어떤 계산을 하라고 정의되어있는 기호들을 연산자라고 부른다.
// 연산자에는
// 산술, 할당, 비교, 논리, 비트 5가지 연산자가 존재한다.

// 산술: + - * / %
public class Ex07Operator {
	public static void main(String[] args) {
		int myNumber1 = 300;
		int myNumber2 = 40;
		System.out.println("myNumber1 + myNumber2: " + (myNumber1 + myNumber2));
		System.out.println("myNumber1 - myNumber2: " + (myNumber1 - myNumber2));
		System.out.println("myNumber1 * myNumber2: " + (myNumber1 * myNumber2));
		System.out.println("myNumber1 / myNumber2: " + (myNumber1 / myNumber2));
		// %는 앞에 숫자 나누기 뒤의 숫자의 나머지를 구하는
		// 나머지 연산자이다.
		System.out.println("myNumber1 % myNumber2: " + (myNumber1 % myNumber2));

		// 산술연산자의 경우
		// 정수끼리의 연산은 정수가 나온다.
		// 실수끼리의 연산은 실수가 나온다.
		// 정수와 실수의 연산은 실수가 나온다.

		double myDouble = 50;
		System.out.println("myNumber2 / myDouble: " + (myNumber2 / myDouble));

		// 만약 정수와 정수의 연산의 결과값을
		// 실수로 확인할려면
		// 반드시 명시적 형변환을 통해서 두 정수 중 하나를 실수로 바꿔주어야 한다.
		System.out.println("3 / 4: " + (3 / 4));
		System.out.println("3 / (double)4: " + (3 / (double)4));
		
		
	}
}











