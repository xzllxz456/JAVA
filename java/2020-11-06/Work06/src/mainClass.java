import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력된 문자열이 모두 숫자인지 확인하는 코드
		/*
		   String "12345"	모두 숫자입니다.
		   		  "12a34"	숫자가 아닙니다.
		 */



		System.out.print("문자열 입력: ");
		String strNum = sc.next();
		/*
		char c = strNum.charAt(0);
		int asc = (int)c;
//		System.out.println(asc);		//아스키코드
		
		if(asc >= 48 && asc <= 57) {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가아닙니다.");
		}
		*/
		
		// 문자열의 길이
		boolean b = false;
		int len = strNum.length();
		for(int i = 0; i < len; i++) {
			char c = strNum.charAt(i);
			int asc = (int)c;
			if(asc < 48 || asc > 57) {	//숫자
				b = true;
				break;
			}
		}
		if(b==true) {
			System.out.println("문자가 포함되어 있습니다.");
		}else {
			System.out.println("모두 숫자로 되어있습니다.");
		}


		
		
	}
}









