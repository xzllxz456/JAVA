import java.util.Arrays;

public class CardEx {
	public static void main(String[] args) {
		// 카드 0~51
		/*
		 	1~ 10 J  Q  K * 4
		 		 11 12  13	
		 	0 ~ 12  스페이드
		 	13 ~ 25 하트
		 	26 ~ 38 클로버
		 	39 ~ 51 다이아
		 	1 -> 스페이드
		 	51 -> 13(k) 클로버
		 */
		
		
		String arr[] = new String[52];

		for(int i = 0; i < 52; i++) {
			if(i%13 < 10 ) {
				arr[i] = (i) + "";
			}else if(i%13 == 10){
				arr[i] = "J";
			}else if(i%13 == 11) {
				arr[i] = "Q";
			}else if(i%13 == 12) {
				arr[i] = "K";
			}else if(arr[i].equals("0")){
				arr[i] = "1";
			}
		}
		for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	
		}
//			int button = i/13;
//			switch (button) {
//			case 0:
//				for(int j = 0; j < 13; j++) {
//					
//					System.out.println(j + "->" + (arr[j])+ "스페이드");
//					
//					break;
//				}
//			case 1:
//				
//				break;
//			case 2:
//		
//				break;
//			case 3:
//				
//				break;
				
		
	}
}
//			if(i/13 == 0) {
//				System.out.println(i + "->" + (arr[i])+ "스페이드")
//				;
//			}else if(i/13 == 1) {
//				System.out.println(i + "->" + ((arr[i]))+ "다이아");
//			}else if(i/13 == 2) {
//				System.out.println(i + "->" + ((arr[i]))+ "하트");
//			}else {
//				System.out.println(i + "->" + ((arr[i]))+ "클로버");
//			}
	//		for(int i = 0;i < arr.length; i++) {
	//		}









	//		for(int i = 0; i < 13; i++) {
	//			if(i < 10) {
	//			arr[i] = (i+1)+"스페이드";
	//			}else {
	//				
	//			}
	//		}


