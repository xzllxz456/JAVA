package baseballmain.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import baseballmain.dto.Batter;
import baseballmain.dto.Human;
import baseballmain.dto.Pitcher;
import baseballmain.file.TreeDaraProc;


public class MemberDaoTree {
	Scanner sc = new Scanner(System.in);
	private HashMap<Integer, Human> myMap = new HashMap<Integer, Human>();
	Iterator<Integer> it;
	TreeDaraProc tdp;
	private int key = 0;
	
	public MemberDaoTree() {
//		myMap.put(1, new Pitcher(1001, "홍길동", 24, 180, 10, 2, 0.2));
//		myMap.put(2, new Batter(1002, "일지매", 21, 178, 25, 12, 0.5));
//		myMap.put(3, new Pitcher(1003, "성춘향", 23, 1722, 225, 212, 2.5));
//		myMap.put(4, new Batter(1004, "홍길동",	456, 432, 1234, 46, 33.5));
		
		tdp = new TreeDaraProc("야구야구야구");
		tdp.createFile();
		
		
	}
	
	public void insert() {
		it = myMap.keySet().iterator();
		while (it.hasNext()) {
			key = it.next();
		}
		System.out.print("투수(1)/타자(2) : ");
		int type = sc.nextInt();
		Human h = null;
		key++;
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		if(type == 1) {
			int num = 1000 + key;
			
			System.out.print("승리 = ");
			int win = sc.nextInt();
			
			System.out.print("패전 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			h = new Pitcher(num, name, age, height, win, lose, defence);
		}
		if(type == 2) {
			int num = 2000 + key;
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타 수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			// human[mem_count] = new Batter(number, name, age, height, batcount, hit, hitAvg);
			h = new Batter(num, name, age, height, batcount, hit, hitAvg);
		}
		myMap.put(key, h);
	}
	
	public void delete() {
		System.out.print("삭제할 사람 입력: ");
		String name = sc.next();
		Integer skey = search(name);
		if(skey != -1) {
			myMap.remove(skey);
		}else {
			System.out.println("없는 사람");
			return;
		}
	}
	
	public void update() {
		System.out.print("수정할 사람 입력: ");
		String name = sc.next();
		Integer skey = search(name);
		if(skey != -1) {
			Human hu = myMap.get(skey);
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
				myMap.replace(skey, p);
			}
			if(hu instanceof Batter) {
				Batter b = (Batter)hu;
				
				System.out.print("친거 입력: ");
				b.setBatcount(sc.nextInt());
				System.out.print("안타 입력: ");
				b.setHit(sc.nextInt());
				System.out.print("타율 입력: ");
				b.setHitAvg(sc.nextDouble());
				myMap.replace(skey, b);
			}
		}else {
			System.out.println("없는 사람");
			return;
		}
	}
	
	public void select() {
		System.out.print("찾을 사람 입력: ");
		String name = sc.next();
		HashMap<Integer, Human> hu = searchAll(name);
		if(hu.isEmpty()) {
			System.out.println("없는사람");
		}
	}
	
	public void allPrint() {
		it = myMap.keySet().iterator();
		while (it.hasNext()) {
			Integer sKey = it.next();
			System.out.println(sKey +" "+ myMap.get(sKey));
		}
	}
	
	public HashMap<Integer, Human> searchAll(String name) {
		HashMap<Integer, Human> hu = new HashMap<Integer, Human>();
		it = myMap.keySet().iterator();
		while (it.hasNext()) {
			Integer sKey = it.next();
			if(name.equals(myMap.get(sKey).getName())) {
				hu.put(sKey, myMap.get(sKey));
				System.out.println(sKey +" "+ myMap.get(sKey));
			}
		}
		return hu;
	}
	
	public Integer search(String name) {
		it = myMap.keySet().iterator();
		Integer sKey = -1;
		while (it.hasNext()) {
			sKey = it.next();
			if(name.equals(myMap.get(sKey).getName())) {
				return sKey;
			}
		}
		return sKey;
	}

	public void save() {
		tdp.saveData(myMap);
	}
	
	public void load() {
		List<String> datas = tdp.loadData();
		for (int i = 0; i < datas.size(); i++) {
			String data[] = datas.get(i).trim().split("-");
			int number = Integer.parseInt(data[1]);
			
			if(number < 2000) {	// 투수
				myMap.put((Integer.parseInt(data[0])), new Pitcher(Integer.parseInt(data[1]), data[2],
						Integer.parseInt(data[3]), Double.parseDouble(data[4]), 
						Integer.parseInt(data[5]), Integer.parseInt(data[6]), 
						Double.parseDouble(data[7])));
			}else {	// 타자
				myMap.put((Integer.parseInt(data[0])), new Batter(Integer.parseInt(data[1]), data[2],
						Integer.parseInt(data[3]), Double.parseDouble(data[4]), 
						Integer.parseInt(data[5]), Integer.parseInt(data[6]), 
						Double.parseDouble(data[7])));
			}
		}
	}
}
