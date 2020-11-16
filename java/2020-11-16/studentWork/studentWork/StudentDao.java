package studentWork;

import java.util.Scanner;

public class StudentDao {
	Scanner sc = new Scanner(System.in);
	
	Student studentArr[] = null;
	private int memberNum;
	private int count;
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
		System.out.print("몇번째 학생을 지우겠습니까?: " + "1 ~ " + (count) + "까지" );
		int n = sc.nextInt();
		if(studentArr[n - 1] == null) {
			System.out.println("이미 비워져 있습니다.");
		}
		studentArr[n - 1] = null;
		System.out.println("삭제완료");
	}
	
	public void select() {	// search
		System.out.println("몇번째 학생을 찾나요? : " + "1 ~ " + (count) + "까지" );
		int n = sc.nextInt();
		if(studentArr[n - 1] == null) {
			System.out.println("없는 사람");
		}else {
			System.out.println(studentArr[n - 1].toString());
		}
	}
	
	public void update() {
		System.out.println("몇번째 학생을 바꾸나요? : " + "1 ~ " + (count) + "까지" );
		int n = sc.nextInt();
		if(studentArr[n - 1] == null) {
			System.out.print("없는 사람");
		}else {
			System.out.print("number: ");
			studentArr[n - 1].setNumber(sc.nextInt());
			
			
			System.out.print("name: ");
			studentArr[n - 1].setName(sc.next());
	
			System.out.print("kor: ");
			studentArr[n - 1].setKor(sc.nextInt());
			
			System.out.print("math: ");
			studentArr[n - 1].setMath(sc.nextInt());

			System.out.print("eng: ");
			studentArr[n - 1].setEng(sc.nextInt());
		}
	}
}
