package exam.list_set_map;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
	/* ***********************
	1. 3명의 학생데이터(아이디,성명,국어,영어,수학)를 
	   StudentVO 클래스를 이용해서 만들고(저장하고)
	   2020111, "홍길동", 100, 90, 81
	   2020222, "이순신", 95, 88, 92
	   2020333, "김유신", 90, 87, 77
	2. Map 타입의 변수(map)에 저장하고
	3. map에 있는 데이터를 사용해서 화면출력
	     성명    국어  영어 수학  총점  평균
	   -------------------------------------
	     홍길동  100   90   81    270   90.33
	   ...
	4. map에서 아이디(2020333) 수학점수를 80 점으로 수정하고
	   전체 데이터 다시 화면 출력   
	**************************/
	static Map<String, StudentVO> map;
	public static void main(String[] args) {
		map = new HashMap<>();
		StudentVO svo = new StudentVO("2020111", "홍길동", 100, 90, 81);
		map.put(svo.getId(), svo);
		svo = new StudentVO("2020222", "이순신", 95, 88, 92);
		map.put(svo.getId(), svo);
		svo = new StudentVO("2020333", "김유신", 90, 87, 77);
		map.put(svo.getId(), svo);
		print();
		for (String key : map.keySet()) {
			if("2020333".equals(key)) {
				map.put(key, new StudentVO("2020333", "김유신", 90, 87, 80));
			}
		}
		System.out.println("---------------------");
		print();
		
	}
	public static void print() {
		System.out.println("번호 \t 성명\t 국어 \t 영어\t 수학\t 총점\t 평균");
		for (String key : map.keySet()) {
			System.out.println(key + "\t " +
								map.get(key).getName() + "\t " +
								map.get(key).getKor() + "\t " +
								map.get(key).getEng() + "\t " +
								map.get(key).getMath() + "\t "+ 
								map.get(key).getTot() + " \t" + 
								map.get(key).getAvg() + " \t" );
		}
		
	}
}	
