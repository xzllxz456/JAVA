package day01;
// 실수형 데이터타입 double

// 실수란? 소숫점이 존재하는 숫자
// float과 double이 존재하지만
// 자바는 코드에서 실수를 발견할 시 double로 인식한다.

public class Ex04Double {
	public static void main(String[] args) {
		// 아래 코드는 에러가 난다.
		// int myInt = 3.141592;
		// 왜냐하면 3.141592는 소숫점이 존재하는 실수이고
		// int는 소숫점이 존재하지 않는 정수형 데이터타입이기 때문에
		// .141592 가 사라지기(=데이터손실이 발생하기) 때문이다.
		
		int myInt = (int) 3.141592;
		System.out.println("myInt의 현재값: " + myInt);
		
		// 아래 코드도 에러가 난다.
		// float myFloat = 3.141592;
		// 왜냐하면 3.141592는 자바에서 double 로 인식하고
		// float은 double보다 작은 크기의 자료형이기 때문에
		// 데이터손실이 일어날수 있다고 자바가 생각해서
		// 에러가 난다.
		// 따라서 float을 사용할때에는 값을 초기화 할때 2가지 방법으로
		// 초기화해줄 수 있다.
		// 1. 명시적 형변환
		float myFloat = (float)3.141592;
		System.out.println("myFloat의 현재값: "+myFloat);
		// 2. 실수가 float이라는 것을 명시한다.
		myFloat = 1.234f;
		System.out.println("myFloat의 현재값: "+myFloat);
		
		// 결론:
		// 자바가 정수는 int, 실수는 double로 인식한다.
		// 따라서 우리는 더이상 byte, short, float을 잘 사용하지
		// 않게 된다.
		
	}
}












