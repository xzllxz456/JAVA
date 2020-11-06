import java.util.Arrays;

public class mainClass {
	public static void main(String[] args) {
		/*
		   String: wrapper class
		   		      문자열 저장, 편집, 정보 취득
		 */
		
//		String str = new String();	//동적할당   == String str
		String str;
		// String: 클래스 명
		// str: Object(객체) == class의 변수
		
		str = "안녕하세요";	// == str = new String("안녕하세요");
//		str = new String(" 반갑습니다. 안녕하세요");
		System.out.println("str:" + str);
		
		char strChar[] = {'안', '녕', '하', '세', '요'};
		System.out.println(strChar);
		
		String str1 = new String("하이");
		String str2 = "바이";
		
		//문자열의 결합
		String str3;
//		str3 = str1 + str2;
		// 결과 동일
		str3 = str1.concat(str2);
		System.out.println("str3: "+str3);
		
		//비교 함수
		String str4 = "hello";
		String str5 = "hell";
		str5 = str5 + "o";
//		str5 = str5 + "o "; //null문자도 비교
		/*
		if(str4 == str5) {
			System.out.println("같은 문자열 입니다.");
		}else {
			System.out.println("다른 문자열 입니다.");
		}
		*/
		boolean b = str4.equals(str5);
		if(b==true) {
			System.out.println("같은 문자열 입니다.");
		}else {
			System.out.println("다른 문자열 입니다.");
		}
		
		//지정 문자의 위치 취득
		char charArr[] = { 'a', 'b', 'c'};
		
		String str6 = "abcdabcdabcd";
				// str6 = "n:홍길동a:24"
		int n;
		n = str6.indexOf("c");
		System.out.println("n = " + n);
		
		n = str6.lastIndexOf("c");	//역순으로 검색
		System.out.println("n = " + n);
		
		// 문자열의 길이	length()
		System.out.println(str6.length());
		
		str6 = "I can do it";	//length()는 빈공간도 Idex에 저장
		System.out.println(str6.length());
		
		// replace(수정)
		String str7 = "A*B**C";
		String str8 = str7.replace("*","-qq");	//(바꾸고 싶은	문자열, 바꿀문자열) 
		System.out.println("str8" + str8);
		
		// split
		/*
		   split: token을 활용해서 문자열을 자른다.
		   
		   hello-world-java		'-'==token
		 */
		String str9 = "홍길동 -24-2001/12/21-180.1";
		String splitArr[] = str9.split("-");
		System.out.println(Arrays.toString(splitArr));
		for(int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		
		// 범위를 통해서 문자열을 취득
		String str10 = "abcdefg";	//0~6
//		String substr = str10.substring(2, 5);	//2<= n <5  인덱스 몇번부터 몇번 전까지
		String substr = str10.substring(4);     //4~ 끝   인덱스 4부터 끝까지
		System.out.println(substr);
		
		// 모든 문자열을 대문자로, 소문자로 바꾸는 변환
		// Abcd -> ABCD
		// Abcd -> abcd
		
		String str11 = "abcDEF";
		String upstr = str11.toUpperCase();
		System.out.println(upstr);
		String lowstr = str11.toLowerCase();
		System.out.println(lowstr);
		
		// 앞의 공백을 제거해 주는 함수
		String str12 = "              java c언어  python       ";
		String trimstr = str12.trim();
		System.out.println("trimstr: " + trimstr);
		
		// 숫자 -> 문자열
		// valueOf
		int num = 123;
		long lo = 1234L;
		double d = 123.4567;
		
//		String s1 = num + "";
		String s1 = String.valueOf(num);
		String s2 = String.valueOf(lo);
		String s3 = String.valueOf(d);
		
		// 탐색: 지정 문자열을 포함하는지?
		String str13 = "서울시 강남구";
		boolean b1 = str13.contains("서울");	// null값을 넣으면 오류
		System.out.println("b1: " + b1);
		
		//String 을 배열로 사용
		String str14 = "가나다라마";	//char c[] = {'가', '나', '다', '라', '마'};
		char c = str14.charAt(2);
		System.out.println("c ="+ c);
	}
}
