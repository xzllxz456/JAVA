package Proc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) throws Exception {
		// 파일 생성 -> 파일명
	
		File file1 = createFile(name());
		
		String[] str = {"안녕하세요 ", "싫어요", "안돼요"};
		
		boolean b = dataSave(file1, str);
		
		if(b == true) {
			System.out.println("파일 저장 성공 ");
		}else {
			System.out.println("파일 저장 실패");
		}
		// 파일 쓰기  / 파일 추가 쓰기 -> input data
//		// 추가쓰기
//		fw = new FileWriter(file1, true);
//		fw.write("안녕하세요" + "\n");
//		fw.close();
//		// 파일 읽기 -> output data
//		FileReader fr = new FileReader(file1);
//		String str = "";
//		BufferedReader br = new BufferedReader(fr);
//		while ((str = br.readLine()) != null) {
//			System.out.println(str);
//		}
		
		// 파일에 모든 데이터를 String[]
//		br = new BufferedReader(fr);
//		int c = fr.read();
//		String[] str1 = new String[(br.readLine()).length()];
//		while (c != -1) {
//			for (int i = 0; i < (br.readLine()).length(); i++) {
//				str[i] = 
//			}
//			
//		}
		
		
//		fr.close();
//		// 파일 추가 쓰기
//		fw = new FileWriter(file1, true);
//		BufferedWriter bw = new BufferedWriter(fw);
//		PrintWriter pw = new PrintWriter(bw);
//		
//		pw.print("안녕하세요 hellow");
//		pw.println("싫어요");
//		pw.println("안되요");
//		pw.println("하지마세요");
//		pw.close();
//		bw.close();
//		fw.close();
	}
	static String name() {
		System.out.println("파일이름 입력");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		return str;
	}
	static File createFile(String strName) {
		File f = new File("D:\\tmp\\" + strName + ".txt");
		if(f.exists()) {
			System.out.println("파일이 존재합니다.");
		}else {
			try {
				f.createNewFile();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(strName + ".txt 파일을 생성하였습니다.");
		}
		return f;
	}
	
	static boolean dataSave(File f, String[] datas) {
		
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i = 0; i < datas.length; i++) {
				pw.println(datas[i]);
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	static String[] dataLoad(File f) {
		String[] datas = null;
		try {
			FileReader fr = new FileReader(f);
			int count = 0;
			String str;
			BufferedReader br = new BufferedReader(fr);			
			while( (str = br.readLine()) != null ) {
				count++;					
			}
			br.close();
			datas = new String[count];
			fr = new FileReader(f);
			br = new BufferedReader(fr);	// 파일포인터의 초기화
			int i = 0;
			while( (str = br.readLine()) != null ) {
				datas[i] = str;
				i++;
			}
			br.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return datas;

	
	}
}
