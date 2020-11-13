package Proc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProcmainClass {
	public static void main(String[] args) {
		// 파일 생성
		String filename = "hello";
		File f = createfile(filename);
		
		// 파일 쓰기
		String str[] = { "안녕하세요", "건강하세요", "성공하세요" };
		boolean b = dataSave(f, str);
		if(b) {
			System.out.println("파일에 저장하였습니다");
		}else {
			System.out.println("파일에 저장하지 못했습니다");
		}
		
		// 파일 읽기
		String datas[] = dataLoad(f);
		for (String s : datas) {
			System.out.println(s);			
		}
		
		
	}
	
	// 파일 생성	-> 파일명
	static File createfile(String filename) {
		File f = new File("D:\\tmp\\" + filename + ".txt");
		
		if(f.exists()) { 
			System.out.println(filename + ".txt 파일이 존재합니다");
		}
		else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(filename + ".txt 파일을 생성하였습니다");
		}
		
		return f;
	}
	
	// 파일 쓰기/추가 쓰기	-> input
	static boolean dataSave(File f, String datas[]) {
		
		try {
			FileWriter fw = new FileWriter(f); // 파일 object 생성
			BufferedWriter bw = new BufferedWriter(fw);	// 한 문장으로
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i = 0; i < datas.length; i++) {
				pw.println( datas[i] );
			}
			pw.close();
		
		} catch (IOException e) {			
			return false;
		}
		
		return true;
	}
	
	// 파일 읽기	-> output
	// 파일에 모든 데이터를 String[]
	static String[] dataLoad(File f) {
		
		String datas[] = null;
		try {
			FileReader fr = new FileReader(f);
			
			// 데이터의 수 취득
			int count = 0;
			String str;
			BufferedReader br = new BufferedReader(fr);			
			while( (str = br.readLine()) != null ) {
				count++;					
			} 
			br.close();
			
			// 데이터의 수에 맞게 할당
			datas = new String[count];
			
			// 데이터의 취득
			fr = new FileReader(f);
			br = new BufferedReader(fr);	// 파일포인터의 초기화
			int i = 0;
			while( (str = br.readLine()) != null ) {
				datas[i] = str;
				i++;
			}
			br.close();
		
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}catch (IOException e) {			
			e.printStackTrace();
		}
		
		return datas;
	}
	
	// 파일 추가 쓰기
	
	
	

}
