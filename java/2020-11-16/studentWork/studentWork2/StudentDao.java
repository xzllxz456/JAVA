package studentWork2;

import java.util.Scanner;

public class StudentDao {
	Scanner sc = new Scanner(System.in);
	
	Student studentArr[] = null;
	private int memberNum;
	private int count;
	private boolean b;
	private int temp;
	private Student selectedStudent;
	public StudentDao() {
		count = sc.nextInt();
		studentArr = new Student[count];
	}
	
	// CRUD
	// 추가, 삭제, 검색, 수정
	public void insert() {	//create
		memberNum = 0;
		while(memberNum < count){
			if(studentArr[memberNum] == null) {
				System.out.print("number: ");
				int number = sc.nextInt();

				System.out.print("name: ");
				String name = sc.next();

				System.out.print("kor: ");
				int kor = sc.nextInt();

				System.out.print("math: ");
				int math = sc.nextInt();

				System.out.print("eng: ");
				int eng = sc.nextInt();

				studentArr[memberNum] = new Student(number, name, kor, math, eng);
				break;
			}
			memberNum++;
			
			if(memberNum == count)
				System.out.println("가득참");
		}
	
		
	}
	
	public void delete() {
		System.out.print("지울 사람 입력");
		if(humen()) {
			studentArr[temp] = null;
			System.out.println((temp+1) + "번째 공간 빔");
		}
	}

	public void select() {	// search
		System.out.print("찾을 사람 입력");
		if(humen()) {
			System.out.println(selectedStudent);
		}
	}
	
	public void update() {
		System.out.print("찾을 사람 입력");
		if(humen()) {
			System.out.println(selectedStudent + "수정 전");
			System.out.print("kor: ");
			selectedStudent.setKor(sc.nextInt());
			
			System.out.print("math: ");
			studentArr[temp].setMath(sc.nextInt());

			System.out.print("eng: ");
			studentArr[temp].setEng(sc.nextInt());
			System.out.println(selectedStudent + "수정 후");
		}
	}
	public boolean humen() {
		try {
			String name = sc.next();
			for (int i = 0; i < studentArr.length; i++) {
				if(studentArr[i].getName().equals(name)) {
					temp = i;
					selectedStudent = studentArr[i];
					return true;
				}
			}
			
		} catch (NullPointerException e) {
			
		}
		System.out.println("찾을수 없음");
		return false;
	}
}
