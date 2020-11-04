package day03;
// 반복문
// "조건식이 true가 나오는 동안 코드를 반복시킴"
// 반복문에는 for 반복문과 while 반복문이 있다.
// for 반복문: 명확하게 끝이 있음(몇회동안 반복해!)
// while 반복문: 명확하게 끝이 없음(true인 동안은 계속 반복해!)
public class Ex04ForLoop {
	public static void main(String[] args) {
		//for 반복문의 경우
		//우리가 반복여부를 결정할 변수, 조건식, 변수의 변화식을 적어서
		//해당 코드블락의 내용을 반복할지 말지를 결정하게 된다.
		//for 반복문은 기본적으로 다음과 같은 구조를 가진다.
		for(int i = 1; i <=3; i++) {
			System.out.println(i+"번째 반복중!");
		}
		//for문은 다음과 같은 실행순서를 가지낟.
		//1. 제어 변수의 초기화 (int i = 1)
		//2. 반복 조건 체크 (i <= 3)
		//2-A1. true일 경우 코드 블락 내용 실행
		// -A2. 실행후 변화식 실행
		// -A3. 반복 조건 체크 후 A1~A3 실행
		//2-B. false일 경우 for문 종료
		for(int i = 1; i <= 0; i++) {
			System.out.println(i+"번째 반복중!");
		}
		
		//for문 팁
		//1. for문 바깥에서 변수를 선언해도 된다.
		int outerI;
		for(outerI = 1; outerI <= 3; outerI++) {
			System.out.println("outerI의 현재값: "+outerI);
		}
		//2. 제어 변수의 초기화나 조건식에 다른 변수가 들어갈 수도 있다!
		int myInt = 1;
		int myInt2 = 3;
		for(int i = myInt; i <= myInt2; i++) {
			System.out.println("i의 현재값: "+i);
		}
		//3. 제어 변수의 변화식은 굳이 ++이 아니라 값을 변화시킬 수 있는
		//   할당연산자면 뭐든 사용 가능하다!
		for(int i = 3; i >= 1; i--) {
			System.out.println("i의 현재값: "+i);
		}
		//for 반복문 사용할 때 주의할 점
		//1. for() 뒤에 ; 을 넣으면 안된다!!!!
		for(int i = 1; i <= 3; i++); {
			System.out.println("반복될까요?");
		}
		//위의 코드는 for(int i = 1; i <= 3; i++) 만 3번 반복하고
		//그 반복문이 끝나면 System.out.println("반복될까요?") 가
		//한번 출력되는 형태가 된다!
		
		//2. 중괄호는 반드시 포함시키자
		for(int i = 1; i <= 3; i++)
			System.out.println("i의 현재값: "+i);
			System.out.println("for문의 마지막줄");
		//중괄호가 생략되면 
		//해당 for문 바로 다음줄 단 한줄만 반복이 된다.
		
		//3. 조건식 혹은 변화식이 잘못되면 무한루프에 빠지게 된다.
		for(int i= 1; 1 <=3; i++) {
			System.out.println(i);
		}
		// 무한루프에 빠졌을 때에는 콘솔창에 빨간 네모 버튼을 누르면
		// 해당 프로그램이 종료된다!
		//System.out.println("프로그램 종료");
	}
}














