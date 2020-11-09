package SortingWork;

public class ExmainClass3_1 {
	public static void main(String[] args) {
		char abcCode[] = {	 // a ~ z
				'`', '~', '!', '@', '#',	
				'$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', 
				'=', '|', '[', ']', '{', 
				'}', ';', ':', ',', '.', '/'
		};
		
		char numCode[] = {	// 0 ~ 9
				'q', 'w', 'e', 'r', 't', 
				'y', 'u', 'i', 'o', 'p' 
		};
		
		// 암호화
	//	String originalCode = "abc012";
		String originalCode = "hello201109";
		
		String resultCode = "";
		
		for (int i = 0; i < originalCode.length(); i++) {
			char c = originalCode.charAt( i );
			int asc = (int)c;
			
			// 알파벳
			if(asc >= 97 && asc <= 122) {	
				// 97 ~ 122 ->	0 ~ 25
				asc = asc - 97;
				resultCode = resultCode + abcCode[asc];											
			}		
			// 숫자
			if(asc >= 48 && asc <= 57) {	
				// 48 ~ 57 -> 0 ~ 9
				asc = asc - 48;
				resultCode = resultCode + numCode[asc];
			}		
		}
		
		System.out.println("originalCode:" + originalCode);
		System.out.println("resultCode:" + resultCode);
				
		// 복호화
		String baseCode = "";
		
		for (int i = 0; i < resultCode.length(); i++) {
			char c = resultCode.charAt( i );
			int _asc = (int)c;
	
			if(_asc >= 97 && _asc < 122) {	// 암호화된 숫자
				int index = 0;
				for(int j = 0;j < numCode.length; j++) {
					if(c == numCode[j]) { // 찾았다
						index = j;
						break;
					}
				}
				// 48 ~ 57
				index = index + 48;
				baseCode = baseCode + (char)index;			
				
			}else {							// 암호화된 알파벳
				int index = 0;
				for(int j = 0;j < abcCode.length; j++) {
					if(c == abcCode[j]) {	// 찾았다
						index = j;
						break;
					}
				}
				// 97 ~ 122
				index = index + 97;
				baseCode = baseCode + (char)index;			
			}
		
		}
		
		System.out.println("baseCode:" + baseCode);
		
		
	}
}
