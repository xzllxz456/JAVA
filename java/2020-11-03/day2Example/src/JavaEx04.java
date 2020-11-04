import java.util.Scanner;

public class JavaEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x입력");
		int x = sc.nextInt();
		System.out.println("y입력");
		int y = sc.nextInt();
		
		int tmp;	// buffer(저장공간)
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("x = " + x + " y = " + y);
	}
}
