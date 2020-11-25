package dao;

import java.util.Scanner;

import dto.Batter;
import dto.Pitcher;
import single.SingleClass;

public class InsertClass {
	Scanner sc = new Scanner(System.in);
	SingleClass sgtc = SingleClass.getSi();
	private int memberNum;
	
	public InsertClass() {
		SingleClass sgtc = SingleClass.getSi();
		if(sgtc.list.isEmpty()) {
			memberNum = 1000 + 1;
		}else {
			// list의 마지막 선수의 번호
			memberNum = sgtc.list.get( sgtc.list.size() - 1 ).getNumber();
			if(memberNum >= 2000) {
				memberNum = memberNum - 1000;
			}
			memberNum = memberNum + 1;
		}
	}
	
	public void insert() {
		System.out.print("투수(1)/타자(2) = ");
		int position = sc.nextInt();
		
		// human
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		if(position == 1) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			System.out.print("패 = ");
			int lose = sc.nextInt();
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			sgtc.list.add(new Pitcher(memberNum, name, age, height, win, lose, defence));			
			
		}else if(position == 2){
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			System.out.print("안타 수 = ");
			int hit = sc.nextInt();
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			memberNum = memberNum + 1000;
			
			sgtc.list.add(new Batter(memberNum, name, age, height, batcount, hit, hitAvg));	
		}else {
			return;
		}
		memberNum++;
		UtilClass.allPrint();
	}
	
}
