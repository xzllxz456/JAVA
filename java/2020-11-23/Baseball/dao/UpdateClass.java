package dao;

import java.util.Scanner;

import dto.Batter;
import dto.Pitcher;
import single.SingleClass;

public class UpdateClass {
	Scanner sc = new Scanner(System.in);
	
	public UpdateClass() {
	}
	
	public void update() {
		SingleClass sgtc = SingleClass.getSi();
		System.out.print("삭제할 사람 입력: ");
		String name = sc.next();
		int index = UtilClass.search(name);
		if(index == -1) {
			System.out.println("사람을 찾을수 없어요");
			return;
		}
		if(sgtc.list.get(index) instanceof Pitcher) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			((Pitcher)sgtc.list.get(index)).setWin(win);
			((Pitcher)sgtc.list.get(index)).setLose(lose);
			((Pitcher)sgtc.list.get(index)).setDefence(defence);
		}else if(sgtc.list.get(index) instanceof Batter) {
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타 수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			((Batter)sgtc.list.get(index)).setBatcount(batcount);
			((Batter)sgtc.list.get(index)).setHit(hit);
			((Batter)sgtc.list.get(index)).setHitAvg(hitAvg);
		}
	}
}
