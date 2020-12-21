package exam.sungjuk_map_scanner;

import java.util.HashMap;
import java.util.Scanner;

public class MapSungjukScanner {
	private HashMap<String, Integer> map = new HashMap<>();
	private Scanner scan = new Scanner(System.in);
	private int tot;
	private double avg;
	
	MapSungjukScanner() {
		insertSampleData();
	}

	private void insertSampleData() {
		map.put("홍길동1", 100);
		map.put("홍길동2", 90);
		map.put("홍길동3", 81);
		computeData();
	}
	
	public void startSungjukProcess() {
		while (true) {
			int select = selectMainMenu();
			if (select == 0) {
				System.out.println(">>> 프로그램 종료합니다.");
				break;
			}
		}
	}
	
	private int selectMainMenu() {
		System.out.println();
		System.out.println(":: 성적처리");
		System.out.println("1.성적입력  2.성적출력  3.성적초기화  0.종료");
		System.out.print("작업선택> ");
		int select = Integer.parseInt(scan.nextLine());
		switch (select) {
		case 1 : 
			System.out.println("성적입력작업 처리~~");
			insertData();
			break;
		case 2 :
			//System.out.println("성적출력작업 처리~~");
			if (map.isEmpty()) {
				System.out.println(">>> 출력할 데이터가 없습니다");
			} else {
				printData();
			}
			break;
		case 3 :
			//System.out.println("성적 초기화 처리~~");
			map.clear();
			tot = 0;
			avg = 0;
			break;
		}
		
		return select;
	}
	
	private void insertData() {
		while (true) {
			System.out.println("이름과 점수를 입력하세요(작업종료 이름에 0 입력)");
			System.out.print(">성명 : ");
			String name = scan.nextLine();
			if ("0".equalsIgnoreCase(name)) {
				System.out.println(":: 데이터 입력을 종료합니다.");
				break;
			}
			System.out.print(">점수 : ");
			int jumsu = Integer.parseInt(scan.nextLine());
			
			map.put(name, jumsu);
			computeData(); //자동 계산 처리
		}
	}

	private void computeData() {
		tot = 0;
		for (int score : map.values()) {
			tot += score;
		}
		//평균구하기
		avg = tot * 100 / map.size() / 100.0;
		
	}

	private void printData() {
		System.out.println("성명\t점수");
		System.out.println("----------------");
		for (String key : map.keySet()) {
			System.out.println(key + "\t" + map.get(key));
		}
		System.out.println("================");
		System.out.println("총점 : \t" + tot);
		System.out.println("평균 : \t" + avg);
	}
	
}














