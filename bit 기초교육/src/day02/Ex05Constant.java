package day02;
// 상수(Constant)
// 상수란 한번 값이 할당되면 더이상 변경이 불가능한 공간을
// 상수라고 한다.

// 상수는 일반 변수처럼 선언하지만
// 가장 앞에 final 이라는 키워드를 붙여준다.
// 예시: final double PI = 3.141592;

// static
// 스태틱이란 원래대로라면 메소드 혹은 변수, 상수등은 
// 항상 클래스 변수(=객체)를 만들어서 그 안에서 호출해야하지만
// static을 붙여주면 클래스 변수를 안 만들어도 사용 가능하다.
// 단!!!!!!! 만약 static 이 붙은 메소드가 다른 메소드나 변수, 상수를 사용할려면
// 그 다른 메소드, 변수, 상수에도 반드시 static을 붙여주어야 한다!

public class Ex05Constant {
	//상수는 주로 클래스 다음줄에 선언과 초기화를 한다.
	final static int NUMBER_OF_SUBJECTS = 4;
	public static void main(String[] args) {
		//위의 상수는 우리가 메인 메소드에서 사용하기 위해서는
		//반드시 static을 붙여주어야 한다.
		//왜냐하면 우리의 메인 메소드가 static 키워드가 붙어있기 때문이다!!!
		System.out.println("과목 수: "+NUMBER_OF_SUBJECTS);
		int korean = 45;
		int english = 50;
		int math = 60;
		int sum = korean + english + math;
		//magic 넘버를 사용한다면?
		double average = sum / 3;
		
		//상수를 이용한다면?
		System.out.println(average);
		average = sum / (double)NUMBER_OF_SUBJECTS;
	}
}














