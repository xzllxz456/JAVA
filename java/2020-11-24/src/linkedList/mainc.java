package linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class mainc {
	public static void main(String[] args) {
		/*
		 	ArrayList : 검색, 대입 == Vector(단반향, 한직선으로 나간다.) STL : Standard Templete Library
		 	
		 	LinkedList : 실시간 추가, 삭제가 빠르다
		 */
		
		Vector<String> vec = new Vector<String>();
		
		vec.add(new String("hello"));
		vec.add(0, "world");
		
		System.out.println(vec);
		System.out.println(vec.size());
		System.out.println("-----------LinkedList------------");
		LinkedList<String> list = new LinkedList<String>();	//
//		List<String> list = new LinkedList<String>();
		list.add("Tigers");
		list.add("Giants");
		list.add("Twins");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		// 맨 앞에 element(요소)를 추가
		list.addFirst("Lions");
		System.out.println(list);
		// 맨 뒤에 element(요소)를 추가
		list.addLast("Bears");	// list.add 와 같다.
		System.out.println(list);
		
		// 서로 필요한거 있을떄 왔다갔다 가능
		ArrayList<String> alist = new ArrayList<String>(list);
		LinkedList<String> llist = new LinkedList<String>(alist);
		
		// iterator : 반복자 == 포인터	0x10 -> 0x14 (4byte만큼 이동)	// 속도가 빠르다 보안취약  해쉬맵에서 사용
		//							[0]		 [1]
		
		Iterator<String> it;	// 반복하다 되풀이하다 뜻 
		it = list.iterator();
		
		while(it.hasNext()) {
			String value = it.next();	// 반복자를 통해 값을 순서대로 꺼내기	// 주소를 반환하고 다음주소로 이동
			System.out.println("it: " + value);
		}
	}
}
