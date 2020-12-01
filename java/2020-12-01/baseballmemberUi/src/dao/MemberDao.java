package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.DataProc;

public class MemberDao {
	private List<Human> list;
	private int memberNum;
	DataProc dp;
	
	public MemberDao() {
		list = new ArrayList<Human>();
		dp = new DataProc("baseBall3333333333333");
		dp.createFile();
		dataLoad();
		if(list.isEmpty()) {
			memberNum = 1000 + 1;
		}else {
			// list의 마지막 선수의 번호
			memberNum = list.get( list.size() - 1 ).getNumber();
			if(memberNum >= 2000) {
				memberNum = memberNum - 1000;
			}
			memberNum = memberNum + 1;
		}
		
//		list.add(new Batter(2001, "abc", 14, 22, 1, 1, 1));
//		list.add(new Batter(2002, "bcd", 14, 22, 1, 1, 1));
//		list.add(new Pitcher(1003, "cde", 14, 22, 1, 1, 1));
//		list.add(new Pitcher(1004, "efg", 14, 22, 1, 1, 1));
		
		
	}
		

	
	public boolean insert(Human h) {
		
		if (h instanceof Pitcher) {
			h.setNumber(memberNum);
		}else if(h instanceof Batter){
			h.setNumber(memberNum + 1000);
		}
		boolean b = list.add(h);
		for (Human hu : list) {
			System.out.println(hu.toString());
		}
		
		memberNum++;
		return b;
	}
	public boolean delete(String name) {
		int index = search(name);
		if(index == -1) {
			System.out.println("사람을 찾을수 없음");
			return false;
		}
		list.remove(index);
		System.out.println("삭제 완료");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		return true;
	}
	
	public int search(String name) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public List<Human> select(String name) {
		List<Integer> indexList = searchAll(name);
		List<Human> huList = new ArrayList<Human>();
		if(indexList.size() == 0) {
			System.out.println("선수 명단에 없습니다");
		}
		
		for (int i = 0; i < indexList.size(); i++) {
			Human h = list.get( indexList.get(i) );
			huList.add(h);
			System.out.println(h.toString());
		}		
		return huList;
	}
	
	public List<Integer> searchAll(String name) {
		List<Integer>hu = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				hu.add( i );
			}			
		}		
		return hu;
	}
	
	public Human Update(String name) {
		int index = search(name);
		if(index == -1) {
			System.out.println("사람을 찾을수 없음");
			return null;
		}
		Human h = list.get(index);
		return h;
	}
	public void inUpdate(Human h) {
		for (int i = 0; i < list.size(); i++) {
			if(h.getName().equals(list.get(i).getName())) {
				list.set(i, h);
			}
			System.out.println(list.get(i).toString());
		}
	}
	
	public List<Human> allprint() {
		return list;
	}
	
	public void dataSave() {		
		// 1001-홍길동-24-180.0-20-1-0.01
		
		String arrStr[] = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			arrStr[i] = h.toString();
		}
		
		dp.saveData(arrStr);		
	}
	
	public void dataLoad() {		
		String arrStr[] = dp.loadData();
		
		for (int i = 0; i < arrStr.length; i++) {
			/*
				1001-홍길동-24-180.0-10-2-0.2
				2002-일지매-21-179.0-12-4-0.3
				1003-성춘향-16-167.0-21-2-0.12
			*/
			
			String data[] = arrStr[i].split("-");
			int pos = Integer.parseInt(data[0]);
						
			if(pos < 2000) {
				list.add( new Pitcher(
						Integer.parseInt(data[0]), 	// 번호
										data[1], 	// 이름
						Integer.parseInt(data[2]), 	// 나이
						Double.parseDouble(data[3]), // 신장
						Integer.parseInt(data[4]), 	// 승
						Integer.parseInt(data[5]), 	// 패
						Double.parseDouble(data[6]) ) );	// 방어율
			}
			else {
				list.add( new Batter(
						Integer.parseInt(data[0]), 	// 번호
										data[1], 	// 이름
						Integer.parseInt(data[2]), 	// 나이
						Double.parseDouble(data[3]), // 신장
						Integer.parseInt(data[4]), 	// 타수
						Integer.parseInt(data[5]), 	// 안타 수
						Double.parseDouble(data[6]) ) );	// 타율				
			}			
		}		
	}
	
}
