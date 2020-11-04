package day03;
// 다중 for loop
// for 문 안에 for문이 또 있고
// 바깥 쪽 for 문이 한번 반복될 동안,
// 안쪽 for문은 처음부터 끝까지 반복된다.
public class Ex06NestedForLoop {
	public static void main(String[] args) {
		//전통적으로 for문의 제어 변수는 
		//i > j > k ... 순으로 들어가지만
		//여러분들이 알기 쉬운 변수를 만들어도 무방하다.
		for(int i = 1; i <= 3; i++) {
			for(int j = 11; j <= 13; j++) {
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
	}
}
