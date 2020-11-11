
public class mainClassLock {
	public static void main(String[] args) {
		//암호화 복호화
		char abcCode1[] = abcCode();
		char numCode1[] = numCode();
		String originalCode = "abc012";
		String resultCode = changeLock(abcCode1, numCode1, originalCode);
		
		System.out.println("originalCode: " + originalCode);
		System.out.println("resultCode: " + resultCode);
		
		String baseCode = deciphering(abcCode1, numCode1, resultCode);
		System.out.println("baseCode: " + baseCode);

	}
	static String changeLock(char[] abcCode, char[] numCode, String originalCode) {
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
		return resultCode;
	}
	// 복호화
	static String deciphering(char[] abcCode, char[] numCode, String resultCode) {
		String baseCode = "";

		for (int i = 0; i < resultCode.length(); i++) {
			char c = resultCode.charAt( i );
			int _asc = (int)c;

			if(_asc > 97 && _asc < 122) {	// 암호화된 숫자
				int index = 0;
				for(int j = 0; j < numCode.length; j++) {
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
		return baseCode;
	}
	
	static char[] abcCode() {
		char abcCode[] = {	 // a ~ z
				'`', '~', '!', '@', '#',	
				'$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', 
				'=', '|', '[', ']', '{', 
				'}', ';', ':', ',', '.', '/'
		};
		return abcCode;
	}
	
	static char[] numCode() {
		char numCode[] = {	// 0 ~ 9
				'q', 'w', 'e', 'r', 't', 
				'y', 'u', 'i', 'o', 'p' 
		};
		return numCode;
	}
	
}
