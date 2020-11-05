import java.util.Scanner;

public class JavaEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력");
		String name = sc.next();
		System.out.println("나이입력");
		int age = sc.nextInt();
		System.out.println("남자면 true 여자면 false");
		boolean sex = sc.nextBoolean();
		System.out.println("핸드폰번호00-000-000");
		String pnum = sc.next();
		System.out.println("키입력");
		double height = sc.nextDouble();
		System.out.println("주소입력");
		String add = sc.next();
		
		System.out.println("이름: " + name + "  나이: " + age +
				"  성별: " + sex + "  핸드폰: " + pnum + "  키 : " + height + "  주소: " + add
				);
	}
}