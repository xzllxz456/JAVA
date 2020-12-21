package exam.list_set_map.sungjuk;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudentVO_Map_Exam {

	public static void main(String[] args) {
		/* ***********************
		1. 3명의 학생데이터(아이디,성명,국어,영어,수학)를 
		   StudentVO 클래스를 이용해서 만들고(저장하고)
		   2020111, "홍길동", 100, 90, 81
		   2020222, "이순신", 95, 88, 92
		   2020333, "김유신", 90, 87, 77
		2. Map 타입의 변수(map)에 저장하고
		3. map에 있는 데이터를 사용해서 화면출력
		   아이디  성명   국어 영어 수학 총점 평균
		   -----------------------------------------
		   2020111 홍길동 100  90   81   270  90.33
		   ...
		4. map에서 아이디(2020333) 수학점수를 80 점으로 수정하고
		   전체 데이터 다시 화면 출력   
		**************************/
		StudentVO svo1 = new StudentVO("2020111", "홍길동", 100, 90, 81);
		StudentVO svo2 = new StudentVO("2020222", "이순신", 95, 88, 92);
		StudentVO svo3 = new StudentVO("2020333", "김유신", 90, 87, 77);
		
		Map<String, StudentVO> map = new TreeMap<>();
		map.put(svo1.getId(), svo1);
		map.put(svo2.getId(), svo2);
		map.put(svo3.getId(), svo3);
		System.out.println("map : " + map);
		
		System.out.println("===== keySet() + iterator() =====");
//		Set<String> keySet = map.keySet();
//		Iterator<String> ite = keySet.iterator();
		Iterator<String> ite = map.keySet().iterator();
		while (ite.hasNext()) {
			String key = ite.next();
			StudentVO svo = map.get(key);
			System.out.println(svo.getId() +"\t" + svo.getName() + "\t" 
					+ "\t" + svo.getKor() + "\t" + svo.getEng() 
					+ "\t" + svo.getMath() );
		}
		
		System.out.println("===== values() ======");
		Collection<StudentVO> collection =  map.values();
		
		System.out.println("===== 개선된 for문(forEach) =======");
		for (String key : map.keySet()) {
			StudentVO svo = map.get(key);
			System.out.println(svo.getId() +"\t" + svo.getName() + "\t" 
					+ "\t" + svo.getKor() + "\t" + svo.getEng() 
					+ "\t" + svo.getMath() );
		}
		System.out.println("----------");
		for (StudentVO svo : map.values()) {
			System.out.println(svo.getId() +"\t" + svo.getName() + "\t" 
					+ "\t" + svo.getKor() + "\t" + svo.getEng() 
					+ "\t" + svo.getMath() );
		}
		System.out.println("==================");
		//아이디(2020333) 수학점수를 80 점으로 수정
		StudentVO svo = map.get("2020333");
		System.out.println("수정전 svo : " + svo);
		
		map.get("2020333").setMath(80);
		svo = map.get("2020333");
		System.out.println("수정후 svo : " + svo);
	}

}































