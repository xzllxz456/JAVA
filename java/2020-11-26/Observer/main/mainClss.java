package main;

import Observer.ObserverAA;
import Observer.ObserverBB;
import cls.Myclass;

public class mainClss {
	public static void main(String[] args) {
		/*
		 	Observer : 감시, 정찰
		 				감시자 패턴
		 				특정 class를 감시
		 */
		Myclass cls = new Myclass();
		
		// 감시자를 2명 추가
		cls.addObserver(new ObserverAA());
		cls.addObserver(new ObserverBB());
		
		cls.setId("abc123");
		cls.setPassword("aabbccddPasworld");
		
		cls.notifyObservers("id: " + cls.getId() +"   pw: " + cls.getPassword());
		
	}
}
