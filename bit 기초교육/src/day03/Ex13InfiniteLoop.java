package day03;
// 무한루프
// 무한루프란?
// 반복문이 영원히 끝나지 않는 것을 무한 루프라고 한다!
public class Ex13InfiniteLoop {
	public static void main(String[] args) {
		// 무한루프 만드는 첫번째 방법
		// 1. 변수와 조건식을 만들되
		//    그 변수가 변화하지 않는다면?
		int i = 1;
		System.out.println("while(i > 0)");
		//while(i > 0) {
		//	System.out.println("무한루프 1번!");
		//}
		
		System.out.println("루프 종료");
		
		// 2. 항상 참이 나오는 식을 만들어주면?
		//while(1 > 0) {
		//	System.out.println("무한루프 2번!!!");
		//}
		
		// 3. 뭐하러 식을 만드나.....
		while(true) {
			System.out.println("무한루프 3번!!!");
		}
		
		// 무한루프의 경우 
		// 해당 무한 루프가 종료되는 가능성이 없으면
		// 해당 루프 이후의 모든 코드들은
		// "도달할 수 없는 코드"로 판단되어
		// 에러가 난다.
		
	}
}
