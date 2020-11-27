package baseballmain.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import baseballmain.dto.Batter;
import baseballmain.dto.Human;
import baseballmain.dto.Pitcher;
import baseballmain.file.DataProc;



public class MemberDao {
	Scanner sc = new Scanner(System.in);
	private List<Human> list = new ArrayList<Human>();
	private int id;
	DataProc dp;
	public MemberDao() {
		list.add(new Pitcher(1001, "홍길동", 24, 180, 10, 2, 0.2));
		list.add(new Batter(2002, "일지매", 21, 178, 25, 12, 999.0));
		list.add(new Pitcher(1003, "성춘향", 23, 1722, 225, 212, 888));
		list.add(new Batter(2004, "홍길동",	456, 432, 1234, 46, 33.5));
		list.add(new Pitcher(1001, "eee", 24, 180, 10, 2, 1.2));
		list.add(new Batter(2002, "qqq", 21, 178, 25, 12, 2.0));
		list.add(new Pitcher(1003, "www", 23, 1722, 225, 212, 3888));
		list.add(new Batter(2004, "bbbb",	456, 432, 1234, 46, 433.5));
		dp = new DataProc("baseBall22222");
		dp.createFile();
		
//		load();
	}
	
	
	public void insert() {
		// 투수/타자 
		System.out.print("투수(1)/타자(2) : ");
		int pos = sc.nextInt();
		Human h = null;
		id = list.size();
		id++;
		
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		if(pos == 1) {
			int number = 1000 + id;
			
			System.out.print("승리 = ");
			int win = sc.nextInt();
			
			System.out.print("패전 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
		
			h = new Pitcher(number, name, age, height, win, lose, defence);			
			
		}else if(pos == 2){			
			int number = 2000 + id;
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타 수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			// human[mem_count] = new Batter(number, name, age, height, batcount, hit, hitAvg);
			h = new Batter(number, name, age, height, batcount, hit, hitAvg);
		}	
		list.add(h);
		allprint();
	}
	
	public void delete() {
		System.out.print("삭제할 사람 입력: ");
		String name = sc.next();
		int index = search(name);
		if(index == -1) {
			System.out.println("등록되지 않은 선수입니다.");
			return;
		}
		list.remove(index);
		System.out.println("정상적으로 삭제되었습니다.");
	}
	
	public void select() {
		System.out.print("찾을 사람 입력: ");
		String name = sc.next();
		List<Human> search = searchAll(name);
		if(search.isEmpty()) {
			System.out.println("선수 명단에 없습니다.");
		}else {
			System.out.println("검색한 선수명단입니다.");
			for (int i = 0; i < search.size(); i++) {
				System.out.println(search.get(i));
			}
		}
		
	}
	
	public void update() {
		System.out.print("수정할 사람 입력: ");
		String name = sc.next();
		int index = search(name);
		Human hu = list.get(index);
		
		System.out.print("나이 수정");
		hu.setAge(sc.nextInt());
		System.out.print("신장 수정");
		hu.setHeight(sc.nextDouble());
		if(hu instanceof Pitcher) {
			Pitcher p = (Pitcher)hu;
			System.out.print("승 입력: ");
			p.setWin(sc.nextInt());
			System.out.print("패 입력: ");
			p.setLose(sc.nextInt());
			System.out.print("승률 입력: ");
			p.setDefence(sc.nextDouble());
			list.set(index, p);
		}else if(hu instanceof Batter){
			Batter b = (Batter)hu;
			System.out.print("친거 입력: ");
			b.setBatcount(sc.nextInt());
			System.out.print("안타 입력: ");
			b.setHit(sc.nextInt());
			System.out.print("타율 입력: ");
			b.setHitAvg(sc.nextDouble());
			list.set(index, b);
		}else if(index == -1) {
			System.out.println("등록되지 않은 선수입니다.");
			return;
		}
	}

	private int search(String name) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			// 생성안된 객체 체크				삭제된 데이터를 체크
			if(name.equals(list.get(i).getName())) {
				index = i;
				break;
			}
		}

		return index;
	}
//	
	public List<Human> searchAll(String name) {
		List<Human>hu = new ArrayList<Human>();
	for (int i = 0; i < list.size(); i++) {
		if(name.equals(list.get(i).getName())) {
			hu.add(list.get(i));
		}
	}
	return hu;
	}
	
	public void allprint() {
		for (Human human : list) {
			System.out.println(human);
		}
	}
	
	public void save() {
		dp.saveData(list);
	}

	
	public void load() {
		List<String> datas = dp.loadData();
		
		for (int i = 0; i < datas.size(); i++) {
			
			String data[] = datas.get(i).trim().split("-");
			int number = Integer.parseInt(data[0]);
						
			if(number < 2000) {	//투수
				
				list.add(new Pitcher(Integer.parseInt(data[0]), data[1],
						Integer.parseInt(data[2]), Double.parseDouble(data[3]), 
						Integer.parseInt(data[4]), Integer.parseInt(data[5]), 
						Double.parseDouble(data[6])));	// 번호, 이름, 나이, 신장, 승, 패, 방어률
			}else {				// 타자
				list.add(new Batter(Integer.parseInt(data[0]), data[1],
						Integer.parseInt(data[2]), Double.parseDouble(data[3]), 
						Integer.parseInt(data[4]), Integer.parseInt(data[5]), 
						Double.parseDouble(data[6])));// 번호, 이름, 나이, 신장, 타수, 안타수, 타률
			}
		}
		id = datas.size();
		
	}
	
	public void sorting() {
		List<Human> pi = new ArrayList<Human>();
		List<Human> ba = new ArrayList<Human>();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Pitcher) {
				pi.add(list.get(i));
			}else if(list.get(i) instanceof Batter) {
				ba.add(list.get(i));
			}
		}
//		List<Human> pi1 = sort(pi);
//		List<Human> ba1 = sort(ba);
		ba = sort(ba);
		pi = sort(pi);
		for (int i = 0; i < pi.size(); i++) {
			System.out.println(pi.get(i));
		}
		System.out.println("==============================");
		for (int i = 0; i < ba.size(); i++) {
			System.out.println(ba.get(i));
		}
	}
	
	public List<Human> sort(List<Human> list) {
		Human h = null;
		
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if(list.get(i) instanceof Pitcher && list.get(j) instanceof Pitcher) {
					double num1 = ((Pitcher)list.get(i)).getDefence();
					double num2 = ((Pitcher)list.get(j)).getDefence();
					if(num1 < num2) {
						h = list.get(i);
						list.set(i, list.get(j));
						list.set(j, h);
					}
				}else if(list.get(i) instanceof Batter && list.get(j) instanceof Batter) {
					double num1 = ((Batter)list.get(i)).getHitAvg();
					double num2 = ((Batter)list.get(j)).getHitAvg();
					if(num1 < num2) {
						h = list.get(i);
						list.set(i, list.get(j));
						list.set(j, h);
					}
				}
			}
		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		
		return list;
	}
}