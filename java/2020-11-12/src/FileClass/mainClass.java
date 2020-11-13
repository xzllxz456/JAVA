package FileClass;

import java.io.File;
import java.io.IOException;
public class mainClass {
	public static void main(String[] args) /*throws Exception*/ {
//////////////////////데이터 저장과 읽기//////////////////////////
		/*
		 	source code -> 알고리즘(logic)
		 	
		 	file :  저장매체 -> 기능 	== Database
		 			데이터 저장(save), 불러오기(load)
		 			
		 	*.txt
		 	*.jpg *.dll *.lib *.jar *.dbp -> bitmap .......
		 			
		 		    dynamic link library(동적 파일) 용량 가볍다 적다 
		 				  library(정적 파일) 무겁다 용량크다
		 				  		Javalibrary파일
		 				  		
		 1111111 -> 정적파일  속도 보안 좋음,  단점:용량 큼            ----1-----1----1 동적파일   파일 찾고 읽고 진행 찾고 읽기
		 */
		// 파일 목록 읽기
//		File fdir = new File("C:\\");	// 파일 디렉터리
		/*
		String filelist[] = fdir.list();	//C:드라이브 목록 읽기
											//디렉토리의 파일목록(디렉토리포함)을 String배열로 반환
		
		for (int i = 0; i < filelist.length; i++) {  	
			System.out.println(filelist[i]);
		}
		*/
		/*
		// 파일, 폴더, 그외것들
		File fdir = new File("C:\\");
		File filelist[] = fdir.listFiles();		//디렉토리의 파일목록(디렉토리포함)을 File 배열로 반환
		
		for (int i = 0; i < filelist.length; i++) {
			if(filelist[i].isFile()) {				// 파일
				System.out.println("[파일]" + filelist[i].getName());
			}else if(filelist[i].isDirectory()) {	// 폴더(경로)
				System.out.println("[폴더]" + filelist[i].getName());
			}else {										// ?????????
				System.out.println("[?????]" + filelist[i].getName());
			}
			
		}
		*/
		
		// 파일 생성
//		String filestr = "D:\\newfile.txt";
//		File newfile = new File(filestr);
//		
//		try {	// 같은파일이 있을 수도 있어 예외처리한다.
//			if(newfile.createNewFile()) {
//				System.out.println("파일 생성 성공!");
//			}else {
//				System.out.println("파일 생성 실패!");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		String filestr = "D:\\tmp\\newfile.txt";	// 경로 지정하면 만들어짐
		File newfile = new File(filestr);
		
		try {	// 같은파일이 있을 수도 있어 예외처리한다.
			if(newfile.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}else {
				System.out.println("파일 생성 실패!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		// 파일의 존재 여부
		if(newfile.exists()) {
			System.out.println("파일이 존재합니다.");
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		// 파일 삭제
		if(newfile.delete()) {
			System.out.println(" 파일을 삭제 하였습니다.");
		}else {
			System.out.println("파일을 삭제하지 못했습니다.");
		}
		*/
		
		// 읽기 가능
		if(newfile.canRead()) {
			System.out.println("파일 읽기가 가능합니다.");
		}else {
			System.out.println("파일 읽을 수 없습니다.");
		}
		// 읽기 전용 세팅
//		newfile.setReadOnly();
		
		// 쓰기전용
//		newfile.setReadOnly();
		// 쓰기(편집) 가능
		if(newfile.canWrite()) {
			System.out.println("파일 쓰기가 가능합니다.");
		}else {
			System.out.println("파일 쓰기가 불가능합니다.");
		}
		
		
	}
	
}
