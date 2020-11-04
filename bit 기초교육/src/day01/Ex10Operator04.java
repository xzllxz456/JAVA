package day01;
// 논리연산자
// 논리연산자는 2개의 boolean값에 대한 연산을 한다.
// &&: AND 연산. 2개가 모두 true일때만 true가 나온다.
// ||: OR 연산. 2개 중 하나라도 true이면 true가 나온다.
// !: 반전(부정) 연산. true는 false로 false는 true로 반전한다.

//  | I l 1
//  |: shift+\
//     \은 한글 키보드에서 원화 표시에 위치한 백슬러쉬 라는 키입력이다.
//     앞으론 원화표시라고 하지 말고 백슬러쉬 혹은 역슬러쉬라고 불러주자
//  I: 대문자 i
//  l: 소문자 l
//  1: 숫자 1

public class Ex10Operator04 {
	public static void main(String[] args) {
		// &&(AND) 연산
		System.out.println("true && true: "+(true && true));
		System.out.println("true && false: "+(true && false));
		System.out.println("false && true: "+(false && true));
		System.out.println("false && false: "+(false && false));
		
		// ||(OR) 연산
		System.out.println("true || true: "+(true || true));
		System.out.println("true || false: "+(true || false));
		System.out.println("false || true: "+(false || true));
		System.out.println("false || false: "+(false || false));
		
		// ! 연산
		System.out.println("!true: "+(!true));
		System.out.println("!false: "+(!false));
	}
}













