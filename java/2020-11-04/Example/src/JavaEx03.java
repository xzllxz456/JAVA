
public class JavaEx03 {
	public static void main(String[] args) {
		//1~ 100사이의 짝수의 합과 홀수의 합을 각각 출력
		int ennum = 0; // 짝
		int odnum = 0; // 홀
		
		for(int i = 1; i <= 100; i++) {
			if( 1 == i % 2) {
				odnum += i;
			}else {
				ennum += i;
			}
		}
		System.out.println("1부터 100 사이 짝수합은 :" + ennum);
		System.out.println("1부터 100 사이 홀수합은 :" + odnum);
		
		int sum1, sum2;
		sum1 = sum2 = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				sum1 = sum1 + i;
			}else {
				sum2 = sum2 + i;
			}
		}
		System.out.println("1부터 100 사이 짝수합은 :" + sum2);
		System.out.println("1부터 100 사이 홀수합은 :" + sum1);
		
	}
}

