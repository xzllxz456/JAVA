package day3Example;

public class JavaEx03 {
	public static void main(String[] args) {
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
	}
}

