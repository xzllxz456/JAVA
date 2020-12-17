package com.mystudy.list01.arraylist;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(new Integer(5));
		list1.add(1); //int -> Integer 자동형변환되어서 저장
		list1.add(new Integer(5));
		list1.add(new Integer(3));
		list1.add("123"); //String
		System.out.println(list1);
		Integer obj = (Integer) list1.get(0); // Integer <- Object(실체 Integer)
		int intValue = obj.intValue(); //int <- Integer
		System.out.println("intValue : " + intValue);
		
		//4번 인덱스 값 처리 : 문자열데이터가 있음
		//실행시 java.lang.ClassCastException 발생
		//int <- Integer <- Object(실체 String) : 형변환 안됨
		//intValue = (Integer) list1.get(4); //강제형변환
		
		//여러 종류의 데이터를 저장해서 사용하는 경우
		//모든 데이터에 대한 타입을 확인하는 절차를 진행해야 하는 경우 발생
		if (list1.get(4) instanceof Integer) {
			Integer obj2 = (Integer) list1.get(4);
			intValue = obj2.intValue(); //int <- Integer(자동형변환 가능)
			System.out.println("intValue : " + intValue);
		} else if (list1.get(4) instanceof String) {
			String str = (String) list1.get(4);
			//System.out.println("str.substring(1) : " + str.substring(1));
		}
		
		//---------------------------------------
		System.out.println("--------------------------");
		//인덱스:  0  1  2  3  4
		//list1 : [5, 1, 5, 3, 홍길동]
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println("list2 : " + list2); //[1, 5, 3]
		
		//데이터 추가 : add
		list2.add(4);
		System.out.println("list2 : " + list2);
		
		//데이터 참조(검색, 확인) : get
		System.out.println(list2.get(0)); //첫번째 데이터 조회(확인)
		
		//데이터 수정
		list2.set(0, 999);
		System.out.println("list2.set(0, 999) 실행후 : " + list2);
		
		//데이터 삭제
		list2.remove(0);
		System.out.println("list2.remove(0) 실행후 : " + list2);
		
		list2.add(77);
		list2.add(88);
		list2.add(77);
		System.out.println(list2); //[5, 3, 4, 77, 88, 77]
		
		//java.lang.IndexOutOfBoundsException
		//list2.remove(77); //인덱스 번호 77에 있는 데이터 삭제
		boolean isRemove = list2.remove(new Integer(77));
		System.out.println("list2.remove(new Integer(77)) : " + list2);
		
		System.out.println("====================");
		System.out.println("list2 : " + list2);
		System.out.println("list2.size() : " + list2.size());
		ArrayList list3 = new ArrayList(list2);
//		list2.remove(0);
//		System.out.println("list2 : " + list2);
//		System.out.println("list2.size() : " + list2.size());
		
		//List 특성은 데이터가 삭제되면 뒤쪽에 데이터가 앞쪽으로 이동
		int size = list2.size();
		for (int i = 0; i < size; i++) {
			System.out.println("i: " + i +", size : " + list2.size());
			System.out.println(list2);
			list2.remove(0);
		}
		System.out.println("최종 list2 : " + list2);
		
		//List 데이터 삭제 작업은 뒤쪽 인덱스 값부터 앞으로 이동하면서 작업
		System.out.println("================");
		System.out.println("list3 : " + list3);
		for (int i = list3.size() - 1; i >= 0; i--) {
			System.out.println("i: " + i +", size : " + list3.size());
			System.out.println(list3);
			list3.remove(i);
		}
		System.out.println("최종 list3 : " + list3);
		
	}

}





