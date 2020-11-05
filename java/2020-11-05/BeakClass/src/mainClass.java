
public class mainClass {
	public static void main(String[] args) {
		/*
		  break: 탈출
		  		 loop문과 같이 사용.
		  		 switch문 case -> break  사용
		  		 
		  		 switch(){
		  		 	case 1:
		  		 		처리
		  		 		break;       // 탈출의 의미
		  		 }
		  		 
		  		 for(int i = 0; i < 10; i++){
		  		 	if(i==5){
		  		 	break;    		//for문 탈출
		  		 	}
		  		 }
		*/
		int n = 0;
		for (int i = 0; ;i++ ) {
			System.out.println("i =" + i);
			if(i==12) {
				n = i;
				break;
			}
		}
		System.out.println("n = " + n);
		 
		char charArr[] = {'A', 'B', 'C', 'D'};
		for(int i = 0; i < charArr.length; i++) {
			System.out.println(i + " : " + charArr[i]);
			if(charArr[i] == 'C') {
				System.out.println("C문자를 찾았습니다.");
				break;
			}
		}
		for(int i = 0; i < 7; i++) {
			System.out.println("i = " + i);
			for(int j = 0; j <4; j++) {
				System.out.println("  j = " + j);
				if(i == 3 && j == 2) {
					break;
				}
			}
		}
		//2중 for문 탈출방법
		//1.
		boolean b = false;
		System.out.println();
		for(int i = 0; i < 7; i++) {
			System.out.println("i = " + i);
			for(int j = 0; j <4; j++) {
				System.out.println("  j = " + j);
				if(i == 3 && j == 2) {
					b = true;
				}
				if(b == true) {
					break;
				}
			}
			if(b == true) {
				break;
			}
		}
		System.out.println("---------------------------------------");
//		2.
		loopout:for(int i = 0; i < 7; i++) {	//loopout 커스텀 지정 
			System.out.println("i = " + i);
			for(int j = 0; j <4; j++) {
				System.out.println("  j = " + j);
				if(i == 3 && j == 2) {
					break loopout;   	// loopout을 탈출   /////////////////>>>>>>>>>>>>go - to문 구조
				}
			}
		}
		
		
	}
}










