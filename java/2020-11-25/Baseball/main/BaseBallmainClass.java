package main;

import java.util.Scanner;

import dao.DataClass;
import dao.DeleteClass;
import dao.InsertClass;
import dao.SelectClass;
import dao.UpdateClass;
import dao.UtilClass;

public class BaseBallmainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		DataClass datac = new DataClass();
		
	
		
		
		while(true) {
			System.out.println("1.선수 추가");
			System.out.println("2.선수 삭제");
			System.out.println("3.선수 검색");
			System.out.println("4.선수 수정");
			System.out.println("5.선수 모두 출력");
			System.out.println("6.데이터 저장");
			System.out.println("7.데이터 불러오기");
			System.out.println("8.종료");
			
			System.out.print(">> ");
			int work = sc.nextInt();
			
			switch(work) {
				case 1:
					InsertClass ic = new InsertClass();
					ic.insert();
					break;
				case 2:
					DeleteClass dc = new DeleteClass();
					dc.delete();
					break;
				case 3:
					SelectClass slc = new SelectClass();
					slc.select();
					break;
				case 4:
					UpdateClass upc = new UpdateClass();
					upc.update();
					break;
				case 5:
					UtilClass.allPrint();
					break;
				case 6:
					datac.save();
					break;
				case 7:
					datac.load();
					break;
				case 8:
					System.exit(0);					
					break;			
			}
		}

	}

}
