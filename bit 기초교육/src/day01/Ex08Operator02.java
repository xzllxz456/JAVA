package day01;
// 할당 연산자
// 할당 연산자는 오른쪽 값을
// 왼쪽 공간에 저장한다.
// = += -= *= /= %=
// 등이 있다.
public class Ex08Operator02 {
	public static void main(String[] args) {
		//오른쪽 30이란 int 값을
		//int 공간 myInt에 저장(할당)해라
		int myInt = 30;
		System.out.println("myInt의 현재값: "+myInt);
		
		//myInt에 저장된 값에 오른쪽 10을 더해서
		//다시 myInt에 할당해라
		myInt += 10;
		System.out.println("myInt의 현재값: "+myInt);
		
		//myInt에 저장된 값에 오른쪽 값 5를 빼서
		//다시 myInt에 할당해라
		myInt -= 5;
		System.out.println("myInt의 현재값: "+myInt);
		
		//myInt에 저장된 값에 오른쪽 값 2를 곱해서
		//다시 myInt에 할당해라
		myInt *= 2;
		System.out.println("myInt의 현재값: "+myInt);
		
		//myInt에 저장된 값에 오른쪽 값 3을 나눈 몫을
		//다시 myInt에 할당해라
		myInt /= 3;
		System.out.println("myInt의 현재값: "+myInt);
		
		//myInt에 저장된 값에 오른쪽 값 3을 나눈 나머지를
		//다시 myInt에 할당해라
		myInt %= 3;
		System.out.println("myInt의 현재값: "+myInt);
		
		//증감연산자
		//증감연산자는 산술연산자와 할당연산자가 결합된 형태로써
		//현재 변수에 저장된 값을 1 증가 시키거나 1 감소 시킨다.
		//단, 변수의 앞에 붙냐 뒤에 붙냐에 따라서 의미가 살짝 달라지게 된다!
		
		//++ 혹은 --가 뒤에 붙는 경우를
		//후위 증감연산자라고 하며
		//해당 줄에서 가장 마지막 순서로 실행이 된다.
		//즉 System.out.println("myInt++: "+ myInt++) 의 경우
		// 1: "myInt++: " 이란 내용을 가진 문자열(=String)을 생성
		// 2: "myInt++: " 뒤에 myInt의 현재값을 이어붙인다.
		// 3: "myInt++: 2" 라는 문자열을 System.out.println()이 출력한다.
		// 4: myInt의 값을 1 증가 시킨다.
		System.out.println("===증감연산자===");
		System.out.println("myInt의 현재값: "+myInt);
		System.out.println("myInt++: " + myInt++);
		System.out.println("myInt의 현재값: "+myInt);
		
		//반대로 ++ 혹은 --가 앞에 붙는 경우를
		//전위 증감연산자라고 하며
		//해당 줄에서 가장 먼저 실행이 된다.
		//즉 System.out.println("--myInt: "+ --myInt) 의 경우
		// 1: --myInt가 실행되어 myInt의 값이 1 감소한다.
		// 2: "--myInt: " 이란 내용을 가진 스트링이 생성된다.
		// 3: "--myInt: " 스트링 뒤에 myInt의 현재값이 이어진다.
		// 4: "--myInt: 2" 라는 문자열을 System.out.println()이 출력한다.
		System.out.println("--myInt: "+ --myInt);
		System.out.println("myInt의 현재값: "+myInt);
	}
}













