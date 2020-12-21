package exam.list_set_map.sungjuk;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentVO_Set_Exam {

	public static void main(String[] args) {
		/* ***********************
		1. 3명의 학생데이터(아이디,성명,국어,영어,수학)를 
		   StudentVO 클래스를 이용해서 만들고(저장하고)
		   2020111, "홍길동", 100, 90, 81
		   2020222, "이순신", 95, 88, 92
		   2020333, "김유신", 90, 87, 77
		2. Set 타입의 변수(set)에 저장하고
		3. set에 있는 데이터를 사용해서 화면출력
		   아이디  성명   국어 영어 수학 총점 평균
		   -----------------------------------------
		   2020111 홍길동 100  90   81   270  90.33
		   ...
		4. set에서 아이디(2020333) 수학점수를 80 점으로 수정하고
		   전체 데이터 다시 화면 출력   
		**************************/
		StudentVO svo1 = new StudentVO("2020111", "홍길동", 100, 90, 81);
		StudentVO svo2 = new StudentVO("2020222", "이순신", 95, 88, 92);
		StudentVO svo3 = new StudentVO("2020333", "김유신", 90, 87, 77);
		
		Set<StudentVO> set = new HashSet<>();
		set.add(svo1);
		set.add(svo2);
		set.add(svo3);
		System.out.println("set : " + set);
		
		//화면출력
		System.out.println("아이디\t성명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------");
		Iterator<StudentVO> ite = set.iterator();
		while (ite.hasNext()) {
			StudentVO svo = ite.next();
			System.out.println(svo.getId() +"\t" + svo.getName() + "\t" + svo.getKor());
		}
		System.out.println("-------------------------------------------");
		System.out.println("ite.hasNext() : " + ite.hasNext());
		ite = set.iterator();
		while (ite.hasNext()) {
			StudentVO svo = ite.next();
			System.out.println(">> " + svo.getId() +"\t" + svo.getName() + "\t" 
					+ "\t" + svo.getKor() + "\t" + svo.getEng() 
					+ "\t" + svo.getMath() );
		}
		System.out.println("==================");
		
		//데이터 수정 : 아이디(2020333) 수학점수를 80 점으로 수정
		String id = "2020333";
		for (StudentVO svo : set) {
			if (id.equals(svo.getId())) {
				svo.setMath(80);
			}
		}
		//전체 데이터 출력
		System.out.println("=== 수정 후 데이터 ===");
		System.out.println("아이디\t성명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------");
		for (StudentVO svo : set) {
			System.out.println(">> " + svo.getId() +"\t" + svo.getName() + "\t" 
					+ "\t" + svo.getKor() + "\t" + svo.getEng() 
					+ "\t" + svo.getMath() );
		}
	}

}










