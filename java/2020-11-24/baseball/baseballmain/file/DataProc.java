package baseballmain.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import baseballmain.dto.Human;

public class DataProc {
	private File file;
	
	public DataProc(String filename){
		file = new File("D:/tmp/" + filename + ".txt");
	}
//	파일 생성
	public void createFile() {
		try {
			if(file.createNewFile()){
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {
			System.out.println("파일 입출력 문제발생");
		}
	}
//	파일에 데이터 저장
	/*
	 	번호: 1001 이름:홍길동
	 	1001홍길동
	 	1001-홍길동-180.1-10-2-0.12
	 	들어가는 데이터: String[]
	 */
	public void saveData(List<Human> list) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
//			for (int i = 0; i < datas.length; i++) {
//				pw.println(datas[i]);
//			}
			for (Human human : list) {
				pw.println(human.toString());
			}
			pw.close();
			System.out.println("저장완료");
		} catch (IOException e) {
			System.out.println("파일 저장시 문제 발생");
		}
		
	}
	
	
	
//	파일에서 데이터 읽기
	/*
	 	나오는 데이터 : String[]
	 */
	public List<String> loadData() {
		List<String> stringList = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			// data를 저장
			String str;
			while((str = br.readLine()) != null) {
				stringList.add(str);
			}
			br.close();
			
		} catch (Exception e) {
			
		}
		return stringList;
	}
}
