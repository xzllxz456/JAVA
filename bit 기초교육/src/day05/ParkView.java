package day05;
// 뷰는 사용자가 보는 화면을 지칭한다.
// 만약 우리가 웹프로그래밍을 한다면
// html 혹은 웹페이지가 뷰가 된다.
// 하지만 우리는 콘솔에서 프로그래밍하므로
// 하나의 클래스가 된다.

import java.util.Scanner;

public class ParkView {
	private ParkController controller;
	private Scanner scanner;
	private final int SIZE = 5;
	private final int UNIT_MINUTE = 10;
	private final int UNIT_PRICE = 1000;
	public ParkView() {
		controller = new ParkController();
		scanner = new Scanner(System.in);
		showMenu();
		scanner.close();
	}
	
	// 메뉴를 출력하는 showMenu() 메소드
	private void showMenu() {
		while(true) {
			System.out.println("비트 주차장 관리 프로그램");
			System.out.println("        1. 입차");
			System.out.println("        2. 출차");
			System.out.println("        3. 종료");
			System.out.print("> ");
			int choice = scanner.nextInt();
			if(choice == 1) {
				//입차를 담당하는 메소드 실행
				insertParkVO();
			}else if(choice == 2) {
				//출차를 담당하는 메소드 실행
				deleteParkVO();
			}else if(choice == 3) {
				//메시지 출력후 break
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
	}
	
	//입차를 담당하는 메소드
	private void insertParkVO() {
		//1. 주차장에 여유공간이 있는지 확인
		if(controller.size() < SIZE) {
			// 여유가 있으므로 주차 시작
			
			// 데이터를 담을 ParkVO 객체 생성
			ParkVO p = new ParkVO();
			
			// 차량 번호를 입력하는 메소드 실행
			validateNumber(p);
			
			// 시간을 입력하는 메소드 실행
			p.setInTime(validateTime());
			// controller에 p를 추가한다.
			controller.add(p);
		}else {
			// 여유가 없으므로 경고메시지 출력
			System.out.println("여유 공간이 없습니다.");
		}
	}
	
	private void validateNumber(ParkVO p) {
		System.out.print("차량 번호: ");
		scanner.nextLine();
		p.setNumber(scanner.nextLine());
		while(controller.contains(p)) {
			System.out.println("이미 주차된 번호입니다.");
			System.out.print("차량 번호: ");
			p.setNumber(scanner.nextLine());
		}
	}
	
	private int validateTime() {
		System.out.print("입차시간: ");
		int inTime = scanner.nextInt();
		while(controller.validateTime(inTime)) {
			System.out.println("잘못된 시간 형식입니다.");
			System.out.print("입차시간: ");
			inTime = scanner.nextInt();
		}
		return inTime;
	}
	
	//출차를 담당하는 메소드
	private void deleteParkVO() {
		//먼저 주차된 차량이 존재하는지 체크한다.
		if(controller.size() != 0) {
			//주차된 차량이 존재하므로 출차 시작
			
			//ParkVO 객체 생성
			ParkVO p = new ParkVO();
			
			//먼저 차량 번호를 입력받는다.
			validateDeleteNumber(p);
			
			//출차시간을 입력받는다.
			int outTime = validateOutTime(p);
			
			//ParkVO 객체와 outTime을 이용하여
			//요금 계산을 한다.
			calculateRate(p, outTime);
			
			//해당 객체를 삭제해준다.
			controller.remove(p);
		}else {
			System.out.println("주차된 차량이 없습니다."); 
		}
	}
	
	private void validateDeleteNumber(ParkVO p) {
		scanner.nextLine();
		System.out.print("차량 번호: ");
		p.setNumber(scanner.nextLine());
		while(!controller.contains(p)) {
			System.out.println("입차된 기록이 없는 번호입니다.");
			System.out.print("차량 번호: ");
			p.setNumber(scanner.nextLine());
		}
		controller.insertInTime(p);
	}
	
	private int validateOutTime(ParkVO p) {
		System.out.print("출차 시간: ");
		int outTime = scanner.nextInt();
		while(controller.validateTime(outTime) ||
				p.getInTime() > outTime) {
			System.out.println("잘못된 시간입니다.");
			System.out.print("출차 시간: ");
			outTime = scanner.nextInt();
		}
		
		return outTime;
	}
	
	private void calculateRate(ParkVO p, int outTime) {
		//시간의 차이 계산
		int hourDiff = outTime / 100 - p.getInTime() / 100;
		//분의 차이 계산
		int minuteDiff = outTime % 100 - p.getInTime() % 100;
		//2개를 분 단위로 합산
		int totalDiff = hourDiff * 60 + minuteDiff;
		//요금 계산
		int rate = totalDiff / UNIT_MINUTE * UNIT_PRICE;
		
		System.out.println("주차 요금은 총 "+rate+"원입니다.");
	}
}















