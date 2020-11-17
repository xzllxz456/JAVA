package StudentWork22;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDao {
	Scanner sc = new Scanner(System.in);
	private Student studentArr[] = null;
	private int memberNum;
	
	public StudentDao(int count) {
		studentArr = new Student[count];
		memberNum = 0;
		
		studentArr[0] = new Student(1, "홍길동", 100, 90, 80);
		studentArr[1] = new Student(2, "일지매", 90, 85, 90);
		studentArr[2] = new Student(3, "성춘향", 100, 100, 95);
	}
	
	// CRUD
	// 추가, 삭제, 검색, 수정
	public void insert() {	// create
		System.out.print("number = ");
		int number = sc.nextInt();
		
		System.out.print("name = ");
		String name = sc.next();
		
		System.out.print("국어 = ");
		int kor = sc.nextInt();
		
		System.out.print("수학 = ");
		int math = sc.nextInt();
		
		System.out.print("영어 = ");
		int english = sc.nextInt();
		
		studentArr[memberNum] = new Student(number, name, kor, math, english);
		
		memberNum++;
	}
	public void delete() {
		System.out.print("삭제할 학생명 = ");
		String name = sc.next();
		
		int index = -1;
		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] != null) {
				if(name.equals(studentArr[i].getName())) {
					index = i;
					break;
				}
			}
		}
		if(index != -1) {
			studentArr[index].setNumber(0);
			studentArr[index].setName("");
			studentArr[index].setKor(0);
			studentArr[index].setMath(0);
			studentArr[index].setEng(0);
			System.out.println("학생데이터를 삭제하였습니다");
		}else {
			System.out.println("학생데이터를 찾을 수 없습니다");
		}
		
	}
	public void select() {	// search
		System.out.print("찾을 학생명 = ");
		String name = sc.next();
		int index = -1;

		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] != null) {
				if(name.equals(studentArr[i].getName())) {
					index = i;
					break;
				}
			}
		}
		if(index != -1) {
			System.out.println("찾음" + studentArr[index]);
		}else {
			System.out.println("학생데이터를 찾을 수 없습니다");
		}
	}
	public void update() {
		System.out.print("찾을 학생명 = ");
		String name = sc.next();
		int index = -1;

		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] != null) {
				if(name.equals(studentArr[i].getName())) {
					index = i;
					break;
				}
			}
		}
		if(index != -1) {
			System.out.println("찾음" + studentArr[index]);
			System.out.println("영어바꾸기");
			studentArr[index].setEng(sc.nextInt());
			System.out.println("수학바꾸기");
			studentArr[index].setMath(sc.nextInt());
			System.out.println("국어바꾸기");
			studentArr[index].setKor(sc.nextInt());
		}else {
			System.out.println("학생데이터를 찾을 수 없습니다");
		}
	}
		
	public void allprint() {
		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] != null && !studentArr[i].getName().equals("")) {
				System.out.println(studentArr[i].toString());				
			}
		}
	}
	
	public void sorting() {
		/*
		// 배열 복사
		int Array[] = {1, 2, 3};
	//	int Alias[] = Array;		// 얕은 복사
		int Alias[] = new int[Array.length];
		
		for (int i = 0; i < Array.length; i++) {
			Alias[i] = Array[i];	// 깊은 복사
		}		
		Alias[1] = 22;
		*/
		
		
	//	int Array[] = {1, 2, 3};
	//	int Clone[] = Array.clone();	// 얕은 복사
		
		
		Student arrStudent[] = new Student[studentArr.length];
		
		for (int i = 0; i < arrStudent.length; i++) {
			arrStudent[i] = new Student();
		}
		
		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] != null) {							
				arrStudent[i].setNumber(studentArr[i].getNumber());
				arrStudent[i].setName(studentArr[i].getName());
				arrStudent[i].setKor(studentArr[i].getKor());
				arrStudent[i].setMath(studentArr[i].getMath());
				arrStudent[i].setEng(studentArr[i].getEng());
			}			
		}
				
		sortProc(arrStudent);
			
		System.out.println("영어점수의 순위 >>");
		for (Student s : arrStudent) {
			if(s != null) {
				System.out.println(s.toString());
			}
		}
		
		
	//	arrStudent[0].setName("정수동");
	//	System.out.println("studentArr:" + studentArr[0].getName());
	//	System.out.println("arrStudent:" + arrStudent[0].getName());
				
	}
	
	public void sortProc(Student arr[]) {		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {				
				if(arr[i].getEng() < arr[j].getEng()) {
					swap(arr, i, j);					
				}				
			}
		}
		
	}
	
	public void swap(Student arr[], int i, int j) {
		Student temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}
	

}


