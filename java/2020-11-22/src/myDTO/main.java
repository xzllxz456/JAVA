package myDTO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
//		HashMap<Integer, Object> myMap = new HashMap<Integer, Object>();
		HashMap<Integer, MyDto> myMap = new HashMap<Integer, MyDto>();	//둘다 같음
		Iterator<Integer> it;
		MyDto dto;
		int key1 = 0;
		
		
		
		// 추가
		
		// 삭제
		
		// 검색
		
		// 수정
		
		// 출력
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 입력: 1 추가/ 2 삭제 / 3 검색/ 4 수정/ 5 출력 / 6 종료");
			int n = sc.nextInt();
			
			if(n == 1) {
				dto = new MyDto();
				++key1;
				System.out.print("넘버 입력: ");
				dto.setNumber(sc.nextInt());
				System.out.println("이름 입력");
				dto.setName(sc.next());
				myMap.put(key1, dto);
			}
			
			it = myMap.keySet().iterator();
			while (it.hasNext()) {
				Integer key = it.next();
				System.out.println("key : " + key + "value : " + myMap.get(key));
			}
			// 삭제
			if(n == 2) {
				System.out.print("지울 키값 입력: ");
				Integer in = sc.nextInt();
				myMap.remove(in);
			}
			
			if(n == 3) {
				System.out.print("찾을 키값 입력: ");
				Integer in = sc.nextInt();
				System.out.println(myMap.get(in));
			}
			
			if(n == 4) {
				dto = new MyDto();
				System.out.print("바꿀거 입력: ");
				Integer in = sc.nextInt();
				System.out.print("넘버 입력: ");
				dto.setNumber(sc.nextInt());
				System.out.println("이름 입력");
				dto.setName(sc.next());
				myMap.replace(in, dto);
			}
		}
		
	}
}
