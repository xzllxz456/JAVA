package dao.Imple;

import java.util.Scanner;

import Util.UtilClass;
import dao.MemberDao;
import dto.Batter;
import dto.Human;
import dto.Pitcher;
import singleton.SingletonClass;

public class UpdateClass implements MemberDao {
	Scanner sc = new Scanner(System.in);

	@Override
	public void proc() {
		SingletonClass si = SingletonClass.getInstance();
		System.out.print("수정하고 싶은 선수의 이름 = ");
		String name = sc.next();
		
		int index = UtilClass.search(name, si.getList());
		
		if(index == -1) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		
		Human h = si.getList().get(index);
		if(h instanceof Pitcher) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			((Pitcher)h).setWin(win);
			((Pitcher)h).setLose(lose);
			((Pitcher)h).setDefence(defence);
		}
		else if(h instanceof Batter) {
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타 수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			Batter bat = (Batter)h;
			bat.setBatcount(batcount);
			bat.setHit(hit);
			bat.setHitAvg(hitAvg);			
		}
		System.out.println("완료");
	}
	
}
