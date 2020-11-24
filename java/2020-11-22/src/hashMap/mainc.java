package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class mainc {
	public static void main(String[] args) {
		/*
		 	HashMap : 사전
		 				String | Object key에 String을 많이쓰고 value 에 Object를 많이씀
		 				"사과" : "apple"
		 				  key :  value	-> 1 pair(한쌍으로 관리 키와 밸류로) => web json
		 				  		자바: 백앤드								웹: 프론트앤드
		 				  tree 구조 - 탐색속도가 빠르다 반으로 쪼개서 찾는다 효율이 좋다
		!!!!!!!!!!		  key값은 중복되지 않는다.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 	TreeMap = HashMap + Sorting  (Hash 맵과 Tree 맵 서로 호환 가능 )
		 */
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();	// 클래스로 인스턴스 생성
		Map<Integer, String> map = new HashMap<Integer, String>(); // 인터페이스를 인스턴스 생성
//		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>(hMap);	// TreeMap은 무거워서
																			// sorting만 할떄만 사용
		// 추가	 key  value
		hMap.put(111, "백십일");
		hMap.put(new Integer(222), new String("이백이십이"));
		hMap.put(333, "삼백삼십삼");
		
		// value 취득
		String value = hMap.get(111);
//		String value = hMap.get(1111);
		System.out.println("value : " + value);
		
		// 검색
		// 값 있다/없다. key로 검색
//		boolean b = hMap.containsKey(new Integer(222));
		boolean b = hMap.containsKey(222);
		System.out.println("b = " + b);
		
		// 값을 취득
		if(hMap.containsKey(333)) {
			value = hMap.get(333);
			System.out.println("valuㄷ = " + value);
		}
		
		// 모든 key값을 취득 -> value
		Iterator<Integer> it = hMap.keySet().iterator();	// 첫번째 값 넣기
	
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("key : " + key);
			
			String val = hMap.get(key);
			System.out.println("val : " + val);
		}
		
		// 수정
		System.out.println("---------수정-----------");
		hMap.replace(111, "100 + 10 + 1");
//		hMap.put(111, "110 + 1");	// 키가 중복되면 value가 바뀐다. 키가 중복되면 추가 안됨
		
		// 삭제
		hMap.remove(222);	// 키값으로 지움
		
		it = hMap.keySet().iterator();	// 첫번째 값 // 셋팅해서 이터레이터를 던져준다
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("key : " + key);
			
			String val = hMap.get(key);
			System.out.println("val : " + val);
		}
		
		HashMap<String, String> haMap = new HashMap<String, String>();
		
		haMap.put("apple", "사과");
		haMap.put("pear", "배");
		haMap.put("graph", "포도");
		haMap.put("banana", "바나나");
		
		// 취득
		value = haMap.get("apple");
		System.out.println("value : " + value);
		
		// sorting
		// TreeMap으로 바꾸어서 사용한다.
		// TreeMap <---> HashMap
//		TreeMap<String, String> treeMap = new TreeMap<String, String>(haMap);
		TreeMap<String, String> treeMap = new TreeMap<>(haMap);	// 생성 제네릭은 생략 가능
		
		// 오름차순
		Iterator<String> itKey = treeMap.keySet().iterator();
		System.out.println("--------------------------------------");
		while (itKey.hasNext()) {
			String key = itKey.next();
			System.out.println("key : " + key + "  value : " + treeMap.get(key));
		}
		// 내림차순
		Iterator<String> itKey1 = treeMap.descendingKeySet().iterator();
		System.out.println("--------------------------------------");
		while (itKey1.hasNext()) {
			String key = itKey1.next();
			System.out.println("key : " + key + "  value : " + treeMap.get(key));
		}
		// 출력
		
		
		
	}
}
