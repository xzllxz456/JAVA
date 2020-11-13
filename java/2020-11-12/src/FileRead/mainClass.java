package FileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mainClass {
	public static void main(String[] args) {
		
		// fileRead
		File file = new File("D:\\tmp\\test.txt");
//		File file = new File("D:\\tmp\\newfile.txt");
		//	intstance, object
		
		try {
			FileReader fr = new FileReader(file);
			/*		한문장씩 읽기 무거운 처리
			String str = "";
		
			int c = fr.read();	//read가 int 값으로 반환, 한 문자씩 읽는다.
			
			while (c != -1) {	// -1 파일의 끝
				System.out.println((char)c);
				str = str + (char)c;
				c = fr.read();
			}
			System.out.println(str);
			*/
			// 문장으로 읽는다  		Buffer == 저장공간
			String str = "";
			BufferedReader br = new BufferedReader(fr);
			
			while ((str = br.readLine()) != null) {		//파일 끝이 아닐 때 까지
				System.out.println(str);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
//			FileNotFoundException();
			System.out.println("파일이 없습니다.");
		} catch (IOException e) { 
			System.out.println("파일을 읽어들일 수 없습니다.");
//			  e.printStackTrace(); 
		} catch (Exception e) {
			System.out.println("그 외의 예외입니다.");
		}
			  
			 
	}
}
