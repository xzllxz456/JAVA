package Function;

public class FuncExtest6 {
//	(1) 두 수를 나눗셈 연산으로 몫과 나머지를 구하는 메소드를 작성하시오.
	public static void main(String[] args) {
		int num1, num2;
		int result, tag[] = new int[1];
		num1 = 9;
		num2 = 2;
		
		result = getResult(num1, num2, tag);
		System.out.println("몫: " + result + " 나머지: " + tag[0]);
	}
	static int getResult(int n1, int n2, int t[]) {
		int result = n1 / n2;	//value
		t[0] = n1 % n2;	//address
		return result;
	}
}
