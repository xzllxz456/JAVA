package StudentWork;


import java.util.Arrays;
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
			studentArr[temp].setKor(sc.nextInt());
			
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
	
	public void sorting() {
		int arr[] = new int [studentArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (studentArr[i].getEng()+studentArr[i].getKor()+
					studentArr[i].getMath());
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				selectedStudent = studentArr[i];
				studentArr[j] = studentArr[i];
				studentArr[i] = selectedStudent;
			}
		}
		System.out.println(Arrays.toString(studentArr));
	}
	
	public void Korsorting() {
		for (int i = 0; i < studentArr.length - 1; i++) {
			for (int j = i + 1; j < studentArr.length; j++) {
				if(studentArr[i].getKor() > studentArr[j].getKor()) {
					int temp = studentArr[i].getKor();
					studentArr[i].setKor(studentArr[j].getKor());
					studentArr[j].setKor(temp);
				}
			}
		}
		System.out.println(Arrays.toString(studentArr));
	}
}
