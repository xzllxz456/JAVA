package SortingWork;

public class ExmainClass3 {
	public static void main(String[] args) {
		char[] abcCode =

			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};

							// 0 1 2 3 4 5 6 7 8 9

			char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			
			String src = "abc123";
			String result = "";
			
			for(int i=0; i < src.length();i++) {
				char ch = src.charAt(i);
				
				//
				if(ch >= 97 && ch <= 122) {
					int k = (int)(ch-49);
					ch = (char)k;
//					result = abcCode[ch];
					
				}
			}
				System.out.println("src:"+src);
				System.out.println("result:"+result);
	}
}	
