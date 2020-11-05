
public class JavaEx04 {
	public static void main(String[] args) {
// 구구단 1단부터 9단
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf(" %d * %d = %d", i, j, i*j);
			}
			System.out.println();
		}
	}
}
