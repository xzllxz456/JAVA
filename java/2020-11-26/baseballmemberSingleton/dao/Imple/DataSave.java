package dao.Imple;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import dao.MemberDao;
import dto.Human;
import singleton.SingletonClass;

public class DataSave implements MemberDao {
	private File file;
	
	public DataSave(String filename) {
		file = new File("D:\\tmp\\" + filename + ".txt");
	}
	
	public void createFile() {
		try {
			if(file.createNewFile()) {		
				System.out.println("파일 생성 성공!");
			}else {
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {
			System.out.println("파일 입출력 문제발생");
		}		
	}
	
	@Override
	public void proc() {
		SingletonClass si = SingletonClass.getInstance();
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for (int i = 0; i < si.getList().size(); i++) {
				Human h = si.getList().get(i);
				pw.println(h);
			}
			pw.close();
		} catch (IOException e) {
			System.out.println("파일 저장시 문제 발생");
		}
	}
	
	
	
	
}
