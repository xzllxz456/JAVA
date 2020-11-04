package day01;
// 비교연산자
// 비교연산자는 2개의 값을 비교한다
// > >= < <= == !=
// 비교연산자는 결과값이 무조건 boolean 타입이 나온다
// "왼쪽이 오른쪽보다 큽니까?" true/false
public class Ex09Operator03 {
	public static void main(String[] args) {
		// 3이 4보다 큽니까?
		System.out.println("3 > 4: "+ (3 > 4));
		// 3이 4보다 크거나 같습니까? 
		System.out.println("3 >= 4: "+ (3 >= 4));
		// 3이 4보다 작습니까?
		System.out.println("3 < 4: "+ (3 < 4));
		// 3이 4보다 작거나 같습니까?
		System.out.println("3 <= 4: "+ (3 <= 4));
		// 3이 4와 같습니까?
		System.out.println("3 == 4: "+ (3 == 4));
		// 3이 4와 다릅니까?
		System.out.println("3 != 4: "+ (3 != 4));
		
		// 하지만 같거나 다르거나를 비교할 때에는 
		// 한가지 주의할 점이 있다.
		// 바로 참조형 변수의 경우에는 해당 연산자로 비교하면
		// 정확하지 못한 값을 받을 수도 있단 점이다.
		
		System.out.println("============참조형 비교연산자 오류 예시=========");
		String string1 = new String("abc");
		String string2 = "abc";
		String string3 = string2;
		System.out.println("string1: "+string1);
		System.out.println("string2: "+string2);
		System.out.println("string3: "+string3);
		
		//하지만 비교연산자를 사용해서 해당 String들이 모두 같은 값인지
		//확인하면 결과가 이상하다.
		System.out.println("===비교연산자 사용시===");
		System.out.println("string1 == string2: "+(string1 == string2));
		System.out.println("string1 == string3: "+(string1 == string3));
		System.out.println("string2 == string3: "+(string2 == string3));
		
		//우리가 비교연산자를 사용한 이유:
		//String 3개에 전부 "abc"가 들어가 있으니깐 2개씩 비교하면 true가 나오겠지? ㅎ
		//자바가 비교연산자를 봤을때:
		//앗 주소값을 비교해보니 2와 3은 주소값이 같지만 1과 2, 1과 3은 다른데?
		
		//따라서, 참조형 변수를 비교할 때에는
		//비교연산자가 아니라 해당 변수의 equals()라는 메소드를 실행해서 
		//비교해야한다.
		System.out.println("string1.equals(string2): "+(string1.equals(string2)));
		System.out.println("string1.equals(string3): "+(string1.equals(string3)));
		System.out.println("string2.equals(string3): "+(string2.equals(string3)));
	}
}













