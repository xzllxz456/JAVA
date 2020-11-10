package Function;

import java.util.Scanner;

public class FuncCalculEx {
	//숫자 검사 메소드
	static int numScan(String num) {
		
		while(true) {
			boolean b = false;
			for (int i = 0; i < num.length(); i++) {
				char c = num.charAt(i);
				if(c < '0' || c > '9') {
					b = true;
					break;
				}
				
			}
			if(b == true) {
				System.out.println("숫자가 이상함 다시 입력: ");
//				num = sc.next();
			}
			break;
		}
		return 3;
	}
	//연산자 검사 메소드
	
	//더하기 메소드
	
	//뺴기 메소드
	
	//곱하기 메소드
	
	//나누기 메소드
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력: ");
		int num1 = numScan(sc.next());
		
	}
}
