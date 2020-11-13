package FileWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class mainClass {
	public static void main(String[] args) throws IOException {
		// file write		
		File file = new File("D:/tmp/test.txt");	// \\==/ 써도됨
		/*
		// 한 문자씩 기입
		FileWriter fw = new FileWriter(file);
		fw.write("안녕하세요 hello" + "\n");	// 파일이 없으면 만든다.
											//파일을 덮어씌워 수정불가
		fw.close();		// 파일을 무조건 닫아주어야 한다.!!!!!!!!
		*/
		/*
		// 추가 쓰기
		FileWriter fw = new FileWriter(file, true);
		fw.write("안녕하세요 hello" + "\n");
		fw.close();
		*/
		
		// 문장으로 쓰기						//true 추가하면 안덮어쓰고 추가입력
		FileWriter fw = new FileWriter(file, true);		// 파일 object 생성
		BufferedWriter bw = new BufferedWriter(fw); // 파일 한문장으로
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("안녕  ");	// 파일에 출력
		pw.println("하이하이");
		pw.println("건강하세요");
		
		pw.close();
		bw.close();
		fw.close();
	}
}
