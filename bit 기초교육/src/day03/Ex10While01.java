package day03;
// while 반복문
// for 반복문은 변수를 이용하더라도
// 몇회동안 반복해라 라는 의미가 강하다.
// 예시: for(int i = 1; i <= userNumber; i++)
//      i를 1로 초기화 하고 i가 userNumber보다 작을동안 코드를 반복하고
//      i를 1 증가시켜서 다시 조건을 체크해라
//      = 1부터 userNumber회만큼 반복해라
// 그에 반해서 while 반복문은
// 조건식이 true인동안 영원히 반복해라
// 즉 횟수가 명확하지 않다.

public class Ex10While01 {
	public static void main(String[] args) {
		// for(int i = 0; i < 3; i++){
		//		System.out.println(i)
		// }
		// 를 while로 표현해보자
		int i = 0;
		while(i < 3) {
			System.out.println(i);
			i++;
		}
	}
}












