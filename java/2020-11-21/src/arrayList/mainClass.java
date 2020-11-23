package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class mainClass {
	public static void main(String[] args) {
		/*
		 	Collection : (Object)수집
		 	
		 	List : 목록	+ Array
		 			데이터의 관리를 유동적으로 할 수 있는 배열
		 			
		 	ArrayList(== Vactor)	// 많을수록 추가 처리 삭제는 느려짐
		 			배열처럼 사용할 수 있는 목록
		 			선형 구조이다. 0-0-0-0-
		 			검색 속도가 빠르다.
		 			Index로 접근하고 관리된다.  0 ~ n-1 까지 접근 가능 메모리 크기까지 가능
		 			
		 	LinkedList
		 			삽입과 삭제가 빈번하게 처리하는 경우에 적합
		 	
		 */
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
//		java.util.List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list = new ArrayList<Integer>();
		
//		Integer arrlist[];
		
		// 추가
		arrlist.add(1001);
		
		arrlist.add(new Integer(1002));
		
		Integer in = new Integer(1003);
		
		arrlist.add(in);
		
		int len = arrlist.size();
		System.out.println("lenSize: " + len);
		
		// 데이터 산출
		Integer outVal = arrlist.get(1);
		System.out.println("arrlist.get(1): " + outVal);
		
		for (int i = 0; i < arrlist.size(); i++) {
			Integer n = arrlist.get(i);
			System.out.println(i + " : " + n);
		}
		
		for (Integer i : arrlist) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		// 원하는 위치에 추가
		Integer inum = new Integer(5002);
		arrlist.add(1, inum);
		for (Integer i : arrlist) {
			System.out.println(i);
		}
		// 삭제
		System.out.println("-------------------");
		arrlist.remove(2);
		for (Integer i : arrlist) {
			System.out.println(i);
		}
		// 검색
		int index = arrlist.indexOf(1003);
		System.out.println("index: " + index);
		System.out.println(arrlist.get(index));
		
		index = -1;
//		index = arrlist.lastIndexOf(1001);	// 뒤에서부터 찾기
		for (int i = 0; i < arrlist.size(); i++) {
			Integer value = arrlist.get(i);
			if(value == 5002) {
				index = i;
				break;
			}
		}
		System.out.println(arrlist.get(index));
		System.out.println("========================");
		for (Integer i : arrlist) {
			System.out.println(i);
		}
		System.out.println("---------------------");
		
		// 수정
		Integer udata = new Integer(1002);
		arrlist.set(1, udata);
		for (Integer i : arrlist) {
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		// 추가
		list.add("개");
		list.add("돼지");
		list.add("소");
		list.add(2, "동물");
		for (Integer i : arrlist) {
			System.out.println(i);
		}
		System.out.println("-------------");
		for (String str : list) {
			System.out.println(str);
		}
		// 삭제
		System.out.println("==================");
		list.remove("동물");
//		list.remove(2);
		for (String str : list) {
			System.out.println(str);
		}
		// 검색
		System.out.println(list.indexOf("돼지"));
		System.out.println(list.get(list.indexOf("돼지")));
		
		// 수정
		System.out.println("----------------------");
		list.set(2, "동물");
		for (String str : list) {
			System.out.println(str);
		}
		
	}
}
