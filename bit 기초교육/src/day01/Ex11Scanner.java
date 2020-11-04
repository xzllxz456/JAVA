package day01;
// Scanner
// Scanner는 자바가 기본적으로 제공해주는 라이브러리에 존재하는
// 입력을 담당하는 클래스이다.
// 단 우리 패키지에 존재하지 않으므로
// import라는 명령어를 통해서 로딩을 해야한다.
import java.util.Scanner;
public class Ex11Scanner {
	public static void main(String[] args) {
		//클래스 변수 선언하기
		//클래스이름 변수이름 = new 클래스이름();
		//단 스캐너는 어디서 입력을 받을지를 ()안에 넣어주어야 한다.
		Scanner scanner = new Scanner(System.in);
		
		//만약 int를 입력받아야 한다면
		//nextInt() 메소드를 실행하면 된다.
		System.out.print("정수를 입력해주세요: ");
		int myNumber = scanner.nextInt();
		System.out.println("사용자가 입력한 정수: "+myNumber);
		
		//만약 double을 입력받아야 한다면
		//nextDouble() 메소드를 실행하면 된다.
		System.out.print("실수를 입력해주세요: ");
		double myDouble = scanner.nextDouble();
		System.out.println("사용자가 입력한 실수: "+myDouble);
		

		//Scanner 사용시 주의할점
		//1. 만약 nextInt를 쓰고선 실수나 문자를 입력하면...? 에러
		//2. 만약 nextDouble을 쓰고선 문자를 입력하면...? 에러
		//3. 스캐너 버그
		//   스캐너의 경우 nextInt(), nextDouble()등의 숫자를 입력하는
		//   메소드를 실행하고 나서는 버퍼메모리에 입력 종료를 뜻하는 엔터 문자가
		//   남아있다.
		//   따라서 nextInt(), nextDouble() 이후에 스트링 입력을 위해서
		//   nextLine()을 실행하면, 스캐너는 버퍼메모리에 남아있는
		//   엔터키를 보고 입력을 종료시킨다.
		//   따라서 해당 버그를 해결하기 위해서는, 
		//   String 입력 전에 nextLine()을 한번 써 주면 된다.
		
		System.out.print("이름을 입력해주세요: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("사용자가 입력한 이름: "+name);
		System.out.println("프로그램 종료");
		
		//또한 Scanner 와 같이 메모리를 읽는 클래스형 변수는
		//항상 가장 마지막 줄에
		//close()라는 메소드를 호출해서
		//'닫아'주면 메모리 누수가 발생하지 않게 된다.
		scanner.close();
	}
}














