package dao;

import java.util.Arrays;
import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.DataProc;

public class MemberDao {
	Scanner sc = new Scanner(System.in);
	DataProc file = new DataProc();
	
	private Human human[] = null;
	private int mem_count;
	
	public MemberDao() {
		human = new Human[100];
		mem_count = 0;
	}
	
	public MemberDao(int count) {
		human = new Human[count];
		mem_count = 0;
	}
	
	public void insert() {
		// 투수/타자
		System.out.print("투수(1) / 타자(2)");
		int pos = sc.nextInt();
		
		System.out.print("번호: ");
		int number = sc.nextInt();
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("신장: ");
		double height = sc.nextDouble();
		
		Human h = null;	// 
		if(pos == 1) {
			System.out.print("승수: ");
			int win = sc.nextInt();
			
			System.out.print("패전: ");
			int lose = sc.nextInt();
			
			System.out.print("승률: ");
			double defence = sc.nextDouble();
			
//			human[mem_count] = new Pitcher(number, name, age, height, win, lose, defence);
			h = new Pitcher(number, name, age, height, win, lose, defence);
		}else if(pos == 2) {
			System.out.print("타수 : ");
			int batcount = sc.nextInt();
			
			System.out.print("안타수: ");
			int hit = sc.nextInt();
			System.out.print("타율: ");
			double hitAvg = sc.nextDouble();
//			human[mem_count] = new Batter(number, name, age, height, batcount, hit, hitAvg);
			h = new Batter(number, name, age, height, batcount, hit, hitAvg);
		}
		human[mem_count] = h;
		mem_count++;
	}
	
	public void allPrint() {
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				System.out.println(human[i].toString());
			}
		}
	}
	
	public void delete() {
		System.out.print("삭제할 선수: ");
		String name = sc.next();
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				if(name.equals(human[i].getName())) {
					human[i].setNumber(0);
					human[i].setName("");
					human[i].setAge(0);
					human[i].setHeight(0);
					if(human[i] instanceof Pitcher) {
						((Pitcher)human[i]).setWin(0);
						((Pitcher)human[i]).setLose(0);
						((Pitcher)human[i]).setDefence(0);
						break;
					}
					if(human[i] instanceof Batter) {
						((Batter)human[i]).setBatcount(0);
						((Batter)human[i]).setHit(0);
						((Batter)human[i]).setHitAvg(0);
						break;
					}
				}
			
			}else {
				System.out.println("없습니다.");
				break;
			}
				
		}
		System.out.println("삭제완료");
	}
	
	public void select() {
		System.out.print("찾을 선수: ");
		String name = sc.next();
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				if(name.equals(human[i].getName())) {
					System.out.println(human[i]);
				}
			}
		}
	}
	
	public void update() {
		System.out.print("바꿀 선수: ");
		String name = sc.next();
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				if(name.equals(human[i].getName())) {
					System.out.print("번호바꾸기");
					human[i].setNumber(sc.nextInt());
					System.out.print("이름바꾸기");
					human[i].setName(sc.next());
					System.out.print("나이바꾸기");
					human[i].setAge(sc.nextInt());
					System.out.print("신장바꾸기");
					human[i].setHeight(sc.nextDouble());
					if(human[i] instanceof Pitcher) {
						System.out.print("승수 바꾸기");
						((Pitcher)human[i]).setWin(sc.nextInt());
						System.out.print("페수 바꾸기");
						((Pitcher)human[i]).setLose(sc.nextInt());
						System.out.print("승률바꾸기");
						((Pitcher)human[i]).setDefence(sc.nextDouble());
						break;
					}
					if(human[i] instanceof Batter) {
						System.out.print("타수 바꾸기");
						((Batter)human[i]).setBatcount(sc.nextInt());
						System.out.print("안타 수 바꾸기");
						((Batter)human[i]).setHit(sc.nextInt());
						System.out.print("타율바꾸기");
						((Batter)human[i]).setHitAvg(sc.nextDouble());
						break;
					}
				}
			}
		}
	}

	public void dataSave() {
		file.createFile("baseballMember");
		String strArr[] = new String[mem_count];
		dataChange(strArr);
		file.dataSave(strArr);
		
		strArr = file.dataLoad();
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
	}
	
	public void dataChange(String[] str) {
		
		for (int i = 0; i < mem_count; i++) {
			if(human[i] instanceof Pitcher) {
				str[i] = "type 1" + human[i].toString();
			}else if(human[i] instanceof Batter) {
				str[i] = "type 2" + human[i].toString();
			}
		}
//		for (String string : str) {
//			System.out.println(string);
//		}
	}
	

	public void pitcherRank() {
		Human copyHuman[] = new Human[mem_count];
		System.arraycopy(human, 0, copyHuman, 0, mem_count);
		for (int i = 0; i < copyHuman.length; i++) {
			for (int j = i + 1; j < copyHuman.length; j++) {
				if(copyHuman[j] instanceof Pitcher && copyHuman[i] instanceof Pitcher) {
					if(((Pitcher)copyHuman[i]).getDefence() < ((Pitcher)copyHuman[j]).getDefence()) {
						Human temp = copyHuman[i];
						copyHuman[i] = copyHuman[j];
						copyHuman[j] = temp;
					}
				}
			}
			for (int j = i + 1; j < copyHuman.length; j++) {
				if(copyHuman[j] instanceof Batter && copyHuman[i] instanceof Batter) {
					if(((Batter)copyHuman[i]).getHitAvg() < ((Batter)copyHuman[j]).getHitAvg()) {
						Human temp = copyHuman[i];
						copyHuman[i] = copyHuman[j];
						copyHuman[j] = temp;
					}
				}
			}
		}
		copyHumanPrint(copyHuman);
	}
	public void copyHumanPrint(Human copyHuman[]) {
		for (int i = 0; i < copyHuman.length; i++) {
			if(human[i] instanceof Pitcher) {
				System.out.println("투수" + copyHuman[i]);
			}
			if(human[i] instanceof Batter) {
				System.out.println("타자" + copyHuman[i]);
			}
		}
	}
}
