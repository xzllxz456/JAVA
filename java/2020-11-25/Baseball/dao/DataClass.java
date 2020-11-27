package dao;

import java.util.List;

import dto.Batter;
import dto.Pitcher;
import file.DataProc;
import single.SingleClass;

public class DataClass {
	SingleClass si = SingleClass.getSi();
	DataProc dp;
	public DataClass() {
//		si.list.add(new Pitcher(1001, "홍길동", 24, 180, 10, 2, 0.2));
//		si.list.add(new Batter(2002, "일지매", 21, 178, 25, 12, 999.0));
//		si.list.add(new Pitcher(1003, "성춘향", 23, 1722, 225, 212, 888));
//		si.list.add(new Batter(2004, "홍길동",	456, 432, 1234, 46, 33.5));
//		si.list.add(new Pitcher(1005, "eee", 24, 180, 10, 2, 1.2));
//		si.list.add(new Batter(2006, "qqq", 21, 178, 25, 12, 2.0));
//		si.list.add(new Pitcher(1007, "www", 23, 1722, 225, 212, 3888));
//		si.list.add(new Batter(2008, "bbbb",	456, 432, 1234, 46, 433.5));
		
		
		dp = new DataProc("baseBall333333333");
		dp.createFile();
//		load();
		
	}
	
	public void save() {
		dp.saveData(si.list);
	}
	
	public void load() {
		List<String> datas = dp.loadData();
		
		for (int i = 0; i < datas.size(); i++) {
			
			String data[] = datas.get(i).trim().split("-");
			int number = Integer.parseInt(data[0]);
						
			if(number < 2000) {	//투수
				
				si.list.add(new Pitcher(Integer.parseInt(data[0]), data[1],
						Integer.parseInt(data[2]), Double.parseDouble(data[3]), 
						Integer.parseInt(data[4]), Integer.parseInt(data[5]), 
						Double.parseDouble(data[6])));	// 번호, 이름, 나이, 신장, 승, 패, 방어률
			}else {				// 타자
				si.list.add(new Batter(Integer.parseInt(data[0]), data[1],
						Integer.parseInt(data[2]), Double.parseDouble(data[3]), 
						Integer.parseInt(data[4]), Integer.parseInt(data[5]), 
						Double.parseDouble(data[6])));// 번호, 이름, 나이, 신장, 타수, 안타수, 타률
			}
		}
	}
}
