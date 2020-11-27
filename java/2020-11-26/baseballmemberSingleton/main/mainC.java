package main;

import java.util.Scanner;

import dao.MemberDao;
import dao.Imple.AllPrintClass;
import dao.Imple.DataLoad;
import dao.Imple.DataSave;
import dao.Imple.DeleteClass;
import dao.Imple.InsertClass;
import dao.Imple.LankClass;
import dao.Imple.SelectClass;
import dao.Imple.UpdateClass;

public class mainC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DataLoad load = new DataLoad("야구야구야구야구팀");
		load.proc();
		
		while(true) {
			System.out.println("1.선수 추가");
			System.out.println("2.선수 삭제");
			System.out.println("3.선수 검색");
			System.out.println("4.선수 수정");
			System.out.println("5.선수 모두 출력");
			System.out.println("6.데이터 저장");
			System.out.println("7.타율 순으로 출력");
			System.out.println("8.종료");
			
			System.out.print(">> ");
			int work = sc.nextInt();
			MemberDao dao = null;
			
			switch(work) {
				case 1:
					dao = new InsertClass();
					break;
				case 2:
					dao = new DeleteClass();
					break;
				case 3:
					dao = new SelectClass();
					break;
				case 4:
					dao = new UpdateClass();
					break;
				case 5:
					dao = new AllPrintClass();
					break;
				case 6:
					dao = new DataSave("야구야구야구야구팀");
					break;
				case 7:
					dao = new LankClass();
					break;
				case 8:
					System.exit(0);					
					break;			
			}
			dao.proc();
		}

	}

}

