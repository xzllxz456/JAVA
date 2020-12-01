package dao.Imple;

import javax.swing.JTextField;

import Util.UtilClass;
import dto.Batter;
import dto.Human;
import dto.Pitcher;
import singleton.SingletonClass;

public class UpdateClass{
	SingletonClass si = SingletonClass.getInstance();
	int index;
	public UpdateClass() {
	}
	
	public Human update(String name) {
		
		index = UtilClass.search(name, si.getList());
		if(index == -1) {
			System.out.println("선수 명단에 없습니다");
			return null;
		}
		Human h = si.getList().get(index);
		return h;
	}
	
	public void update2(JTextField a, JTextField b, JTextField c) {
		Human h = si.getList().get(index);
		if(h instanceof Pitcher) {
			Integer win = Integer.parseInt(a.getText());
			Integer lose = Integer.parseInt(b.getText());
			Double defence = Double.parseDouble(c.getText());
			
			((Pitcher)h).setWin(win);
			((Pitcher)h).setLose(lose);
			((Pitcher)h).setDefence(defence);
		}
		if(h instanceof Batter) {
			Integer batcount = Integer.parseInt(a.getText());
			Integer hit = Integer.parseInt(b.getText());
			Double hitAvg = Double.parseDouble(c.getText());
			
			((Batter)h).setBatcount(batcount);
			((Batter)h).setHit(hit);
			((Batter)h).setHitAvg(hitAvg);
		}
		System.out.println(si.getList().toString());
	}
	
	
	
}
