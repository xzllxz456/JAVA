package com.mystudy.set01.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExam {

	public static void main(String[] args) {
		//Set 인터페이스(추상체) : Set 타입에서 구현되어야 할 메소드 정의
		//HashSet 클래스(구현체) : Set 인터페이스를 구현한 클래스
		HashSet<String> set = new HashSet<>();
		set.add("1");
		set.add("홍길동");
		set.add("홍길동");
		set.add(new String("홍길동"));
		System.out.println("set : " + set);
		
		set.remove("1");
		System.out.println("set : " + set);
		
		System.out.println("set.contains(\"홍길동\") : " 
				+ set.contains("홍길동"));
		System.out.println("set.size() : " + set.size());
		System.out.println("set.isEmpty() : " + set.isEmpty());
		
		System.out.println("---------------");
		set.add("김유신");
		set.add("을지문덕");
		set.add("홍경래");
		System.out.println("set : " + set);
		
		System.out.println("==== Set 전체 데이터 조회(Iterator) =======");
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("---------");
		
		for (String name : set) {
			System.out.println(name);
		}
		
		System.out.println("====== 김유신 >>> 김유신2(수정) =======");
		//=================================
		//실습(수정) : 김유신 --> 김유신2 (변경처리)
		//김유신 삭제하고 김유신2 입력(방법1)
		//김유신2 입력하고 김유신 삭제(방법2)
		
		
	}

}











