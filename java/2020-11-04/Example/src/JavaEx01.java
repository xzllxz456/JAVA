
public class JavaEx01 {
	public static void main(String[] args) {
		//1부터 100까지 합
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("sum = " +  sum);
		
		//두번째 방법
		sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum = sum +i;
		}
		System.out.println("sum = " +  sum);
		//세번쨰 방법
		sum = 0;
		int count = 1;
		for (int i = 0; i < 1000; i++) {
			sum = sum + count;
			count++;
		}
		System.out.println("sum = " +  sum);
	}
}
