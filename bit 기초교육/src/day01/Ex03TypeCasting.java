package day01;
// 형변환(typecasting)

// 프로그래밍에서 어떤 값을 특정 데이터타입으로 변환이 가능하다.
// 이렇게 값을 특정 자료형으로 바꾸는 것을
// 형변환이라고 한다.
// 형변환에는 2가지 종류가 있다.
// 암시적 형변환(implicit typecasting)
// 암시적 형변환은 더 작은 데이터타입의 값을 
// 더 큰 데이터타입의 변수에 저장할때 발생한다.
// 우리가 아무런 명령어를 적지 않아도 자바가 자동으로 해준다.
// 왜냐하면 변환을 해도 데이터 손실이 일어나지 않기 때문이다.
// 예시: byte의 값을 int 변수에 저장할때

// 명시적 형변환(explicit typecasting)
// 명시적 형변환은 더 큰 데이터타입의 값을
// 더 작은 데이터타입의 변수에 저장할때 발생한다.
// 이때는 우리가 명확하게 바꿀 데이터타입을 적어주어야 한다.
// 왜냐하면, 변환할때 데이터 손실이 일어날 수도 있기 때문이다.
// 예시: int 값을 byte 변수에 저장할때
// 명시적 형변환은
// 변수 = (바꿀 데이터타입)값; 으로 해줄 수 있다.

// 자바에서는 코드의 정수를 자동으로 int로 인식한다.
// 코드의 실수는 double로 인식한다.

// 따라서 아래의 코드는 다음과 같은 과정을 거치게 된다.
// byte myByte = 100;
// 1. int 100은 byte의 범위에 들어가는지 체크
// 2. byte의 범위에 속하므로 int 100을 byte 100으로 암시적 형변환
// 3. byte 100을 myByte에 할당
public class Ex03TypeCasting {
	public static void main(String args[]) {
		// int 변수와 byte 변수를 하나씩 만들어보자
		int myInt = 3000;
		byte myByte = 50;

		// 암시적 형변환을 해보자
		myInt = myByte;
		System.out.println("myInt의 값: " + myInt);

		// 명시적 형변환을 해보자
		myByte = (byte)myInt;
		System.out.println("myByte의 값: " + myByte);
	}
}











