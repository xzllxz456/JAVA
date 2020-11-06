import java.util.Scanner;

public class mainClass2 {
////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////
//입력된 알파벳(문자열)을 모두 대문자로 변경하는 코드
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String str = sc.next();
//		String upstr = str.toUpperCase();
//		System.out.println(upstr);
		// 입력된 알파벳 문자열을 모두 대문자로 변경하는 코드
		// toUpperCase
		// ASCII	A == 65  a == 97 -> 32
		String strNum = "abcDEF";
		String result = "";
		for(int i = 0;i < strNum.length(); i++) {
			
			int asc = (int)strNum.charAt(i);
			
			if(asc >= 65 && asc <= 90) {	// 대문자인 경우
				result = result + (char)asc;
			}else {
				asc = asc - 32;
				result = result + (char)asc;
			}
		}
		System.out.println("원문자열:" + strNum);
		System.out.println("변환문자열:" + result);
		
		
	}
}
