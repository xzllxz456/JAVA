package com.mystudy.list03.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		//LinkedList 클래스 : List 인터페이스 계열
		LinkedList<String> list = new LinkedList<>();
		list.add("홍길동");
//		list.add("홍길동");
//		list.add("김유신");
		System.out.println("list : " + list);
		System.out.println(list.get(0));
		System.out.println("-----------------");
		
		String str = "강강,김유신,강감찬,을지문덕,홍경래";
		String[] strs = str.split(",");
		System.out.println("strs : " + Arrays.toString(strs));
		
		//배열에 있는 데이터를 리스트에 추가
		for (int i = 0; i < strs.length; i++) {
			list.add(strs[i]);
		}
		//개선된 for문 형태로도 작성(개인실습)
		System.out.println("list : " + list);
		
		System.out.println("===========================");
		//Collections.reverse(list);
		System.out.println("list reverse후 : " + list);
		
		//삭제 : 김유신
		list.remove("김유신");
		System.out.println("김유신 삭제후 : " + list);
		
		//--------------------------
		//(실습) 을지문덕 -> 을지문덕2 변경처리(수정)
		//1. "을지문덕" 이 어디에 있는지 찾고(indexOf)
		//2. 찾은 위치에서 "을지문덕2" 로 수정(set 메소드)
		System.out.println("---- 을지문덕 > 을지문덕2 -----");
		int index = list.indexOf("을지문덕");
		System.out.println("index : " + index);
		if (index >= 0) {
			list.set(index, "을지문덕2");
		} else {
			System.out.println("[예외] 데이터가 없습니다");
		}
		System.out.println("list수정후 : " + list);
		
		System.out.println("------ 을지문덕2 > 을지문덕3 -----");
		//을지문덕2 -> 을지문덕3
		for (int i = 0; i < list.size(); i++) {
			if ("을지문덕2".equals(list.get(i))) {
				list.set(i, "을지문덕3");
				break;
			}
		}
		System.out.println("list수정후 : " + list);
	}

}










