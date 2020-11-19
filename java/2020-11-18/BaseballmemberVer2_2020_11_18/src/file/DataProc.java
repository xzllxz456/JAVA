package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataProc {
	File f;
	
	public DataProc(){
	}
	public File createFile(String fileName) {
		f = new File("D:\\tmp\\" +fileName +".txt");

		if(f.exists() == false) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(fileName + ".txt 파일을 생성하였습니다");
		}
		return f;
	}
	
	public boolean dataSave(String[] strArr) {
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i = 0; i < strArr.length; i++) {
				pw.println(strArr[i]);
			}
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public String[] dataLoad() {
		String datas[] = null;
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
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return datas;
	}
	
	
}
