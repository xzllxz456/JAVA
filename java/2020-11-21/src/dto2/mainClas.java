package dto2;

import java.util.List;
import java.util.Scanner;



import java.util.ArrayList;

public class mainClas {
	static List<MemberDto> memlist = new ArrayList<MemberDto>();
	static MemberDto member = new MemberDto();
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		// 추가, 삭제, 검색, 수정
		
		List<MemberDto> memlist = new ArrayList<MemberDto>();
		
		// 추가, 삭제, 수정
		// 3명
		MemberDto dto = new MemberDto(101, "홍길동", 24);
		memlist.add(dto);
		
		dto = new MemberDto(102, "성춘향", 16);
		memlist.add(dto);
		
		memlist.add(new MemberDto(103, "일지매", 18));
		
		for (int i = 0; i < memlist.size(); i++) {
		//	MemberDto m = memlist.get(i);
		//	System.out.println(m.toString());
			
			System.out.println(memlist.get(i).toString());
		}		
		
		// 검색
		// 이름
		String name = "성춘향";
		int findindex = -1;
		for (int i = 0; i < memlist.size(); i++) {
			MemberDto m = memlist.get(i);
			if(name.equals(m.getName())) {
				findindex = i;
				break;
			}
		}
		
		MemberDto m = memlist.get(findindex);
		System.out.println(m.toString());
				
		// 나이     18세이상 멤버
		List<MemberDto> findlist = new ArrayList<MemberDto>();
		
		for (int i = 0; i < memlist.size(); i++) {
			MemberDto mem = memlist.get(i);
			if(mem.getAge() >= 18) {
				findlist.add(mem);
			}
		}
		
		for (MemberDto mem : findlist) {
			System.out.println(mem.toString());
		}
		
		System.out.println();
		// 수정
		for (MemberDto mem : memlist) {
			System.out.println(mem.toString());
		}
		
		MemberDto uMem = new MemberDto(105, "정수동", 26);
		memlist.set(2, uMem);
		
		for (MemberDto mem : memlist) {
			System.out.println(mem.toString());
		}
		
		// call by reference
		MemberDto upMem = memlist.get(0);
		upMem.setName("임꺽정");
		
		for (MemberDto mem : memlist) {
			System.out.println(mem.toString());
		}
		
		memlist.remove(0);
		
		for (MemberDto mem : memlist) {
			System.out.println(mem.toString());
		}

	}

}
