package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.DataProc;

public class MemberDao {
	Scanner sc = new Scanner(System.in);
	private List<Human> list = new ArrayList<Human>();
	private int id = 0;
	DataProc dp;
	public MemberDao() {
//		list.add(new Pitcher(1001, "홍길동", 24, 180, 10, 2, 0.2));
//		list.add(new Batter(1002, "일지매", 21, 178, 25, 12, 0.5));
//		list.add(new Pitcher(1003, "성춘향", 23, 1722, 225, 212, 2.5));
//		list.add(new Batter(1004, "홍길동",	456, 432, 1234, 46, 33.5));
		dp = new DataProc("baseBall22222");
		dp.createFile();
		
//		load();
	}
	
	
	public void insert() {
		// 투수/타자 
		System.out.print("투수(1)/타자(2) : ");
		int pos = sc.nextInt();
		Human h = null;
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
		List<Human>flist = new ArrayList<Human>();
	for (int i = 0; i < list.size(); i++) {
		if(name.equals(list.get(i).getName())) {
			flist.add(list.get(i));
		}
	}
	return flist;
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
	
}

