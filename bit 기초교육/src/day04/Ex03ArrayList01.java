package day04;
// ArrayList

// 배열을 클래스화 시켜서 사용하기 편하게 만든
// 자바의 util

import java.awt.List;
import java.util.ArrayList;

public class Ex03ArrayList01 {
	public static void main(String[] args) {
		// ArrayList는 배열을 클래스화 시켜놓은
		// 클래스로써, 크기가 가변적이고, 또 여러개의
		// 요소를 다루는데 유용한 메소드들이 구현되어있다.

		// ArrayList<데이터타입> 이름 = new ArrayList<>();
		// 꺽쇠안에 해당 어레이리스트가 어떤 클래스의 모음집인지 적어야 하는데
		// 이때 꺽쇠안에는 클래스만 들어갈 수 있다!!!!
		// 그렇다면 기본형 데이터타입 8가지는...?
		// 그 8가지 데이터타입은 클래스형이 아니기 때문에
		// <>안에 들어갈 수 없다.
		// 그래서 java는 해당 기본형 데이터타입들을 클래스로 바꿔놓은
		// wrapper 클래스(포장 클래스)를 미리 만들어놓았다.
		// int 는 Integer, double 은 Double ...
		// 그래서 필요하다면 해당 포장 클래스를 데이터타입으로 적으면 된다.

		ArrayList<Student> studentList = new ArrayList<>();

		// 어레이리스트의 크기를 알고 싶다면
		// size() 메소드를 실행하면 된다!
		System.out.println("studentList.size(): " + studentList.size());

		Student s1 = new Student("1", "a");
		Student s2 = new Student("2", "b");
		Student s3 = new Student("3", "c");
		Student s4 = new Student("4", "d");
		Student s5 = new Student("5", "e");

		// 어레이리스트에 요소를 추가할때에는
		// add() 메소드를 실행하면 된다!
		studentList.add(s1);
		System.out.println("studentList.size(): " + studentList.size());

		studentList.add(s2);
		System.out.println("studentList.size(): " + studentList.size());

		studentList.add(s3);
		System.out.println("studentList.size(): " + studentList.size());

		studentList.add(s4);
		System.out.println("studentList.size(): " + studentList.size());

		// 해당 인덱스의 요소를 호출할때에는
		// get(인덱스) 메소드를 호출하면 된다.
		System.out.println("studentList.get(0): " + studentList.get(0));
		// 단 인덱스는 배열처럼 0~크기-1까지이다.

		// 만약 특정 요소가 해당 리스트에 존재하는지
		// 확인하고 싶다면 contains(요소)를 실행하면 된다.
		// 단 이때는, 해당 클래스 내부에 equals()메소드가 구현되어있어야 하고
		// 그리고 굳이 똑같은 객체가 아니라 equals()가 true가 나오는 객체여도
		// 된다.
		Student s11 = new Student("1", "a");
		System.out.println("list.contains(s1): " + studentList.contains(s1));
		System.out.println("list.contains(s5): " + studentList.contains(s5));
		System.out.println("list.contains(s11): " + studentList.contains(s11));

		// 만약 어떤 객체가 list에 몇번 index에 존재하는지
		// 확인하고 싶다면
		// indexOf()를 실행하면 된다.
		// 단, 해당 객체가 존재하지 않는다면
		// -1이 나온다.
		// contains와 마찬가지로 equals()를 필요로 한다.
		System.out.println("list.indexOf(s1): " + studentList.indexOf(s1));
		System.out.println("list.indexOf(s5): " + studentList.indexOf(s5));
		System.out.println("list.indexOf(s11): " + studentList.indexOf(s11));

		// 만약 특정 위치의 요소를 다른 객체와 바꾸고 싶다면
		// set(index, 객체)를 실행하면 된다.
		System.out.println("list.get(0): " + studentList.get(0));
		studentList.set(0, s5);
		System.out.println("list.get(0): " + studentList.get(0));
		
		// 리스트에서 요소를 삭제하는 방법은 두가지가 있다.
		// 둘다 remove라는 메소드를 사용하지만
		// remove는 인덱스와 객체에 대한
		// 오버로딩이 되어있기 때문에
		// 우리가 필요한 파라미터를 넘겨주면 된다.
		
		// 1. 인덱스 번호를 주어서
		//    해당 인덱스를 삭제
		System.out.println("list.get(0): " + studentList.get(0));
		studentList.remove(0);
		System.out.println("list.get(0): " + studentList.get(0));
		
		// 2. 객체를 넘겨줘서
		//    해당 객체와 일치하는(=equals가 true가 나오는)
		//    요소를 삭제
		
		
		Student s44 = new Student("4", "d");
		System.out.println("list.contains(s44): "+
						studentList.contains(s44));
		studentList.remove(s44);
		System.out.println("list.contains(s44): "+
				studentList.contains(s44));
	}
}











