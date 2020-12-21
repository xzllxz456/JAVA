package exam.list_set_map.sungjuk;

import java.util.ArrayList;
import java.util.List;

public class StudentVO_List_Exam {

	public static void main(String[] args) {
		/* ***********************
		1. 3명의 학생데이터(아이디,성명,국어,영어,수학)를 
		   StudentVO 클래스를 이용해서 만들고(저장하고)
		   "2020111", "홍길동", 100, 90, 81
		   "2020222", "이순신", 95, 88, 92
		   "2020333", "김유신", 90, 87, 77
		2. List 타입의 변수(list)에 저장하고
		3. list에 있는 데이타를 사용해서 화면출력
		   아이디  성명   국어 영어 수학 총점 평균
		   -----------------------------------------
		   2020111 홍길동 100  90   81   270  90.33
		   ...
		4. list에서 아이디(2020333) 수학점수를 80 점으로 수정하고
		   전체 데이터 다시 화면 출력   
		**************************/
		StudentVO svo1 = new StudentVO("2020111", "홍길동", 100, 90, 81);
		StudentVO svo2 = new StudentVO("2020222", "이순신", 95, 88, 92);
		StudentVO svo3 = new StudentVO("2020333", "김유신", 90, 87, 77);
		
		List<StudentVO> list = new ArrayList<>();
		list.add(svo1);
		list.add(svo2);
		list.add(svo3);
		System.out.println("list : " + list);
		
		//화면출력
		System.out.println("아이디\t성명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------");
		for (StudentVO svo : list) {
			String id = svo.getId();
			String name = svo.getName();
			int kor = svo.getKor();
			System.out.println(id +"\t" + name + "\t" + kor);
			
			System.out.println(svo.getId() +"\t" + svo.getName() + "\t" + svo.getKor());
		}
		System.out.println("-------------------------------------------");
		for (StudentVO svo : list) {
			svo.displayData();
		}
		
		//----------------------
		System.out.println("=============");
		//list에서 아이디(2020333) 수학점수를 80 점으로 수정
		String id = new String("2020333");
		for (StudentVO svo : list) {
			if (svo.getId().equals(id)) {
				System.out.println("id 2020333 이름 : " + svo.getName());
				svo.setMath(80);
			}
		}
		svo1.setKor(88);
		for (StudentVO svo : list) {
			svo.displayData();
		}
		if (svo1 == list.get(0)) {
			System.out.println("svo1과 list.get(0) 같은 객체(인스턴스)");
		} else {
			System.out.println("svo1과 list.get(0) 다른 객체(인스턴스)");
		}
		
		System.out.println(">> main() 끝");
	}
	
	
	
	
	

}
