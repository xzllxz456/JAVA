package StudentEx2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {
	Scanner sc = new Scanner(System.in);
//	private Student studentArr[] = null;
	private List<Student> list = null;
	
	public StudentDao() {
		list = new ArrayList<Student>();
		
		list.add(new Student(1, "홍길동", 100, 90, 80));
		list.add(new Student(2, "일지매", 90, 85, 90));
		list.add(new Student(3, "성춘향", 100, 100, 95));
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
		list.add(new Student(number, name, kor, math, english));
	}
	public void delete() {
		System.out.print("삭제할 학생명 = ");
		String name = sc.next();
		int index = search(name);
		if(index != -1) {
			list.remove(index);
			System.out.println("삭제 완료");
		}else {
			System.out.println("찾을수 없음");
		}
	
	}
	
	public int search(String name) {
		int temp = -1;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				temp = i;
				break;
			}
		}
		return temp;
	}
	
	public void select() {	// search
		System.out.print("찾을 학생명 = ");
		String name = sc.next();
		searchAll(name);
//		int index = search(name);
//		if(index != -1) {
//			System.out.println("찾음");
//			System.out.println(list.get(index));
//		}else {
//			System.out.println("찾을수 없는 정보");
//		}
	}
	
	public void searchAll(String name) {
		int temp = -1;
		List<Student> flist = new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if(name.equals(s.getName())) {
				flist.add(s);
			}
		}
		if(!flist.isEmpty()) {
			System.out.println("검색된 데이터는 >>");
			for (int i = 0; i < flist.size(); i++) {
				System.out.println(flist.get(i).toString());
			}
		}else {
			System.out.println("찾을수 없음");
		}
	}
	public void update() {
		System.out.print("찾을 학생명 = ");
		String name = sc.next();
		int index = search(name);
		Student stu = list.get(index);
		if(index != -1) {
			System.out.print("국어 = ");
			stu.setKor(sc.nextInt());
			
			System.out.print("수학 = ");
			stu.setMath(sc.nextInt());
			
			System.out.print("영어 = ");
			stu.setEng(sc.nextInt());
			list.set(index, stu);
			System.out.println("수정완료");
		}else {
			System.out.println("없는정보");
		}
		
	}
		
	public void allprint() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void sortList() {
		List<Student> sortlist = new ArrayList<Student>();
//		List<Student> sortlist = new ArrayList<Student>(list);
//		LinkedList<Student> sortlist = new LinkedList<Student>(list);
		for (Student s : list) {
			sortlist.add(s);
		}
		Student stu = null;
		for (int i = 0; i < sortlist.size() - 1; i++) {
			for (int j = i + 1; j < sortlist.size(); j++) {
				int num1 = sortlist.get(i).getEng();
				int num2 = sortlist.get(j).getEng();
				if(num1 < num2) {
					stu = sortlist.get(i);
					sortlist.set(i, sortlist.get(j));
					sortlist.set(j, stu);
				}
			}
		}
		System.out.println("정렬된 영어점수: 내림차순");
		for (int i = 0; i < sortlist.size(); i++) {
			System.out.println(sortlist.get(i));
		}
	}
	
}


