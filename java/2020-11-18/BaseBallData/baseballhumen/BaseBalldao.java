package baseballhumen;

import java.util.Scanner;

import baseballhumenDTO.BaseBallParantDTO;
import baseballhumenDTO.BatterChildDTO;
import baseballhumenDTO.PitcherChildDTO;

public class BaseBalldao {
	Scanner sc = new Scanner(System.in);
	private BaseBallParantDTO memberArr[] = null;
	private int member;
	private int count;
	
	public BaseBalldao(int member) {
		count = member;
		memberArr = new BaseBallParantDTO[member];
	}
	
	public void insert() {
		System.out.println("투수 등록 1번 타자 등록2번");
		int n = sc.nextInt();
		member = 0;
		while(member < count) {
			if(n == 1 && memberArr[member] == null) {
				//투수
				memberArr[member] = new PitcherChildDTO();
				humen();
				pitcher();
				break;
			}else if(n == 2 && memberArr[member] == null) {
				//타자
				memberArr[member] = new BatterChildDTO();
				humen();
				batter();
				break;
			}
			member++;
		}
	}
	public void humen() {
		System.out.print("번호 입력");
		memberArr[member].setNumber(sc.nextInt());
		System.out.print("이름입력: ");
		memberArr[member].setName(sc.next());
		System.out.print("나이입력: ");
		memberArr[member].setAge(sc.nextInt());
		System.out.print("키 입력: ");
		memberArr[member].setKyy(sc.nextDouble());
	}
	public void pitcher() {
		System.out.print("승입력: ");
		((PitcherChildDTO)memberArr[member]).setWin(sc.nextInt());
		System.out.print("패입력: ");
		((PitcherChildDTO)memberArr[member]).setLose(sc.nextInt());
		System.out.print("승률입력: ");
		((PitcherChildDTO)memberArr[member]).setDefence(sc.nextDouble());
		System.out.print(memberArr[member].toString());
	}
	public void batter() {
		System.out.print("타수입력: ");
		((BatterChildDTO)memberArr[member]).setHitter(sc.nextInt());
		System.out.print("안타수입력: ");
		((BatterChildDTO)memberArr[member]).setHit(sc.nextInt());
		System.out.print("타율입력: ");
		((BatterChildDTO)memberArr[member]).setBattingAvg(sc.nextDouble());
		System.out.println(memberArr[member].toString());
	}
	
	public void delete() {
		System.out.println("지울 사람 입력: ");
		String name = sc.next();
		for (int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) {
				continue;
			}
			if((memberArr[i].getName()).equals(name)) {
				System.out.println(name + "찾음!");
				memberArr[i] = null;
				/*
				if(memberArr[i] instanceof PitcherChildDTO) {
					memberArr[i] = null;
//					((PitcherChildDTO)memberArr[member]).setAge(0);
//					((PitcherChildDTO)memberArr[member]).setName("");
//					((PitcherChildDTO)memberArr[member]).setKyy(0);
//					((PitcherChildDTO)memberArr[member]).setNumber(0);
//					((PitcherChildDTO)memberArr[member]).setWin(0);
//					((PitcherChildDTO)memberArr[member]).setLose(0);
//					((PitcherChildDTO)memberArr[member]).setDefence(0);
					break;
				}else if(memberArr[i] instanceof BatterChildDTO) {
					memberArr[i] = null;
//					((BatterChildDTO)memberArr[member]).setAge(0);
//					((BatterChildDTO)memberArr[member]).setName("");
//					((BatterChildDTO)memberArr[member]).setKyy(0);
//					((BatterChildDTO)memberArr[member]).setNumber(0);
//
//					((BatterChildDTO)memberArr[member]).setBattingAvg(0);
//					((BatterChildDTO)memberArr[member]).setHit(0);
//					((BatterChildDTO)memberArr[member]).setHitter(0);
					break;
				}
				*/
			}
			System.out.println("없다");
		}
	}
//	public boolean type(int i) {
//		if(memberArr[i] instanceof PitcherChildDTO) {
//			return true;
//		}
//		return false;
//	}
	
	public void select() {
		System.out.println("찾을 사람 입력: ");
		String name = sc.next();
		for (int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) {
				continue;
			}
			if((memberArr[i].getName()).equals(name.trim())) {
				System.out.println(memberArr[i]);
				/*
				if(memberArr[i] instanceof PitcherChildDTO) {
					System.out.println(memberArr[i].toString());
					break;
				}else if(memberArr[i] instanceof BatterChildDTO) {
					System.out.println(memberArr[i].toString());
					break;
				}
				*/
			}
		}
	}
	
	public void update() {
		System.out.println("수정할 사람 입력: ");
		String name = sc.next();
		for (int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) {
				continue;
			}
			if((memberArr[i].getName()).equals(name)) {
				if(memberArr[i] instanceof PitcherChildDTO) {
					System.out.print("번호 입력");
					((PitcherChildDTO)memberArr[member]).setNumber(sc.nextInt());
					System.out.print("이름입력: ");
					((PitcherChildDTO)memberArr[member]).setName(sc.next());
					System.out.print("나이입력: ");
					((PitcherChildDTO)memberArr[member]).setAge(sc.nextInt());
					System.out.print("키 입력: ");
					((PitcherChildDTO)memberArr[member]).setKyy(sc.nextDouble());
					System.out.print("승 입력: ");
					((PitcherChildDTO)memberArr[member]).setWin(sc.nextInt());
					System.out.print("패입력: ");
					((PitcherChildDTO)memberArr[member]).setLose(sc.nextInt());
					System.out.print("승률입력:");
					((PitcherChildDTO)memberArr[member]).setDefence(sc.nextDouble());
					System.out.println(memberArr[i]);
				}else if(memberArr[i] instanceof BatterChildDTO) {
					System.out.print("번호 입력");
					((BatterChildDTO)memberArr[member]).setNumber(sc.nextInt());
					System.out.print("이름입력: ");
					((BatterChildDTO)memberArr[member]).setName(sc.next());
					System.out.print("나이입력: ");
					((BatterChildDTO)memberArr[member]).setAge(sc.nextInt());
					System.out.print("키 입력: ");
					((BatterChildDTO)memberArr[member]).setKyy(sc.nextDouble());
					System.out.print("타수입력: ");
					((BatterChildDTO)memberArr[member]).setHitter(sc.nextInt());
					System.out.print("안타수입력: ");
					((BatterChildDTO)memberArr[member]).setHit(sc.nextInt());
					System.out.print("타율입력: ");
					((BatterChildDTO)memberArr[member]).setBattingAvg(sc.nextDouble());
					System.out.println(memberArr[i]);
					break;
				}
			}
		}
	}
	
	public void allPrint() {
		for (int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) {
				continue;
			}else {
				System.out.println(memberArr[i]);
			}
		}
	}
	
	public void dataSave() {
		
	}
	
}
