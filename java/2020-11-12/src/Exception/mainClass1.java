package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mainClass1 {
	public static void main(String[] args) {
		// NullPointerException		// 객체가 생성되지 않음
		String str = null;
		try {
			System.out.println(str.length());
		}catch (NullPointerException e) {
			System.out.println();
			e.printStackTrace();
		}
		
		
		// ArrayIndexOutOfBoundsException
		int arr[] = {1, 2, 3};
		try {
			System.out.println(arr[55]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" 배열범위 초과");
		}
		
		
		// FileNotFoundException	
		File file = new File("c:\\xxx.txt");	// 파일을 찾을 수 없을떄
		FileInputStream is;
		try {
			is = new FileInputStream(file);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		// NumberFormatException	// 형식이 틀렸을때
		try {
			int num = Integer.parseInt("123.456");	// parseDouble 로 형변환 후 다시 인트로 변환
//			int num = Integer.parseInt( ((int)Double.parseDouble("123.456")) + "");
//			System.out.println("num = " + num);
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		// StringIndexOutOfBoundsException
		String str1 = "abc";
		try {
			char c = str.charAt(4);
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		// 어떤 Exception 인지 모를때 (Exception e) 사용하면 가능 명백하게 사용하게 하기위해서 오류 이름 처리
	}
}
