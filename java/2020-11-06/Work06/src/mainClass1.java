import java.util.Scanner;

public class mainClass1 {
	public static void main(String[] args) {
		
		//입력을 받은 수가 정수, 소수인지를 판단하는 코드
		//정수입니다, 소수입니다.
		/*Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력: ");
		String str = sc.next();
		boolean b1 = str.contains(".");	
//		System.out.println(b1);
		if(b1 == false) {
			System.out.println("정수입니다.");
		}else {
			System.out.println("소수입니다.");
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력: ");
		String strnum = sc.next();
		
		int result = 0;
		//'.'있으면 소수 0 , n-1;
		int len = strnum.length();
		for(int i = 0; i < len; i++) {
			char c = strnum.charAt(i);
			//문자열인경우
			if((i == 0 && c == '.') || (i == strnum.length()-1 && c == '.')) {
				result = 1;
				break;
			}
			if(c =='.') {
				result = 2;
				break;
			}
		}
		switch (result) {
		case 0:
			System.out.println("이숫자는 정수로 되어 있습니다.");
			break;
		case 1:
			System.out.println("문자가 포함 되어 있습니다.");
			break;
		case 2:
			System.out.println("이숫자는 소수로 되어 있습니다.");
			break;
		}
	}
}
