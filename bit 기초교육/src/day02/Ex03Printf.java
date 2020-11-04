package day02;
// printf의 경우
// ()안에 ""를 적어주고
// 우리가 출력해야될 변수의 형식을 지정해줄 수 있다.

public class Ex03Printf {
	public static void main(String[] args) {
		//1. 10진법 정수('d'ecimal)
		int number = 151;
		//-A. 10진법 정수를 그대로 출력해라
		System.out.printf("1-A. %d\n", number);
		//-B. 10진법 정수를 오른쪽 정렬 5자리로 출력해라
		System.out.printf("1-B. %5d\n", number);
		//-B2. 자릿수 정렬의 경우, 출력해야 될 내용이 지정된 자릿수보다 많으면
		//     무시가 된다.
		System.out.printf("1-B2. %5d\n", 1234567);
		//-C. 10진법 정수를 왼쪽 정렬 5자리로 출력해라
		System.out.printf("1-C. %-5d(끝)\n", number);
		//-D. 10진법 정수를 오른쪽 정렬하고 왼쪽 빈자리는 0으로 채워서 5자리로 출력해라
		System.out.printf("1-D. %05d\n", number);
		
		//2. 16진법(he'x'adecimal)
		//   16진법은 한 자리가 총 16개의 숫자로 이루어져있고,
		//   각 자리는 16의 제곱이다.
		//   10~15의 경우 알파벳 a~e까지로 표시한다.
		//A. 정수를 16진법으로 표시하고 알파벳이 존재할시 소문자로 표시해라
		number = 155;
		System.out.printf("2-A. %x\n", number);
		//B. 정수를 16진법으로 표시하고 알파벳이 존재할시 대문자로 표시해라
		System.out.printf("2-B. %X\n", number);
		//C. 정수를 소문자 16진법으로 표시하고 오른쪽 정렬해서 5자리로 표시해라
		System.out.printf("2-C. %5x\n", number);
		//D. 정수를 대문자 16진법으로 표시하고 왼쪽 정렬해서 5자리로 표시해라
		System.out.printf("2-D. %-5X(끝)\n", number);
		//E. 정수를 대문자 16진법으로 표시하고 오른쪽 정렬해서 빈칸은 0으로 채우고
		//   총 8자리로 표시해라
		System.out.printf("2-E. %08X\n", number);
		
		//3. 실수('f'loat)
		double myDouble = 123.45678;
		//A. 실수를 그대로 표시해라
		System.out.printf("3-A. %f\n", myDouble);
		//B. 실수를 소숫점 2번째 자리까지 표시해라
		System.out.printf("3-B. %.2f\n", myDouble);
		//C. 실수를 오른쪽 정렬한 7자리로 표시하고 소숫점은 1자리까지만 표시해라
		System.out.printf("3-C. %7.1f\n", myDouble);
		//D. 실수를 왼쪽 정렬한 7자리로 표시하고 소숫점은 7자리까지만 표시해라
		System.out.printf("3-D. %-7.7f\n", myDouble);
		//E. 실수를 오른쪽 정렬한 10자리로 표시하고 왼쪽 빈공간은 0으로 채우고
		//   소숫점은 3자리까지만 표시해라
		System.out.printf("3-E. %010.3f\n", myDouble);
		
		//4. 과학표기법(e)
		//A. 숫자를 과학표기법으로 표시해라
		System.out.printf("4-A. %e\n", myDouble);
		
		//5. 문자열('S'tring)
		String myString = "abcDEFghi";
		//A. 문자열을 그대로 표시해라
		System.out.printf("5-A. %s\n", myString);
		//B. 문자열을 표시하되 소문자가 있으면 대문자로 표시해라
		System.out.printf("5-B. %S\n", myString);
		//C. 문자열을 10자리 오른쪽 정렬해서 그대로 표시해라
		System.out.printf("5-C. %10s\n", myString);
		//D. 문자열을 8자리 왼쪽 정렬해서 모두 대문자로 표시해라
		System.out.printf("5-D. %-8S\n", myString);

		//printf는 다음과 같이도 활용이 가능하다.
		int korean = 80;
		int english = 70;
		int math = 95;
		System.out.printf("총점: %d점, 평균: %.2f점\n", 
				(korean+english+math), 
				(korean+english+math)/3.0);
		
		//printf를 사용할 때 주의할 점
		//1. 존재하지 않는 %문자를 쓰면 에러가 난다.
		//System.out.printf("%z\n", myDouble);
		//2. %문자와 할당되는 값의 데이터타입이 다르면 에러가 난다.
		//System.out.printf("%d\n", myDouble);
		//3. 할당되는 값이 많으면 상관 없지만 만약 %문자의 갯수가 더 많으면
		//   에러가 난다.
		System.out.printf("%d %d\n", 1, 2, 3, 4);
		System.out.printf("%d %d %d %d\n", 1, 2);
	}
}














