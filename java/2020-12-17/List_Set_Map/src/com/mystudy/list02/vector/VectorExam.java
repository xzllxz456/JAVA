package com.mystudy.list02.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("v.capacity() : " + v.capacity());
		v.add("1");
		v.add("2");
		v.add("3");
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		v.trimToSize();
		System.out.println("==== trimToSize() 실행후 ===");
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());

		v.add("4");
		System.out.println(v);
		//v.remove(7); //java.lang.ArrayIndexOutOfBoundsException
		v.remove(v.size() - 1); //마지막 데이터 : 크기(갯수) - 1
		System.out.println(v);
		
		v.set(0, "홍길동");
		System.out.println(v);
		
		System.out.println("===== 객체 복사(clone())====");
		Vector<String> v2 = (Vector<String>) v.clone();
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		System.out.println("---- v 데이터전체 삭제 후 ----");
		v.clear(); //전체데이터 삭제
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		System.out.println("========= Enumeration ======");
		Enumeration<String> enu = v2.elements();
		while (enu.hasMoreElements()) {
			String str = enu.nextElement();
			System.out.println("enu.nextElement() : " + str);
		}
	
		System.out.println("======== Iterator 활용 조회 =========");
		Iterator<String> ite = v2.iterator();
		while (ite.hasNext()) {
			String str = ite.next();
			System.out.println("ite.next() : " + str);
		}
		//System.out.println("ite.next() : " + ite.next());

	}

}






















