package dao;

import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;

public class MemberDao {
	Scanner sc = new Scanner(System.in);
	
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
			System.out.println("타수 : ");
			int batcount = sc.nextInt();
			
			System.out.println("안타수: ");
			int hit = sc.nextInt();
			System.out.println("타율: ");
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
	
}
