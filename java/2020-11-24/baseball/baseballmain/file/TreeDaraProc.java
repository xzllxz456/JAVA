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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import baseballmain.dto.Human;

public class TreeDaraProc {
	private File file;
	
	public TreeDaraProc(String filename){
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
	
	public void saveData(HashMap<Integer, Human> myMap) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			Iterator<Integer> it = myMap.keySet().iterator();
			while (it.hasNext()) {
				Integer key = it.next();
				pw.println(key + "-" + myMap.get(key).toString());
			}
			pw.close();
			System.out.println("저장완료");
		} catch (IOException e) {
			System.out.println("저장할떄 문제 발생");
		}
	}
	
	public List<String> loadData() {
		List<String> stringList = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			// data 저장
			String str;
			while ((str = br.readLine()) != null) {
				stringList.add(str);
			}	
			br.close();
		}catch (Exception e) {
			System.out.println("불러오기 오류발생");
		}
//		}catch (FileNotFoundException e) {
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		return stringList;
	}
}
