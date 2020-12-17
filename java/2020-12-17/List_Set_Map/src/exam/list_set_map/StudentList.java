package exam.list_set_map;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	static List<StudentVO> list;
	public static void main(String[] args) {
		/************************
		1. 3명의 학생데이터(아이디,성명,국어,영어,수학)를 
		   StudentVO 클래스를 이용해서 만들고(저장하고)
		   2020111, "홍길동", 100, 90, 81
		   2020222, "이순신", 95, 88, 92
		   2020333, "김유신", 90, 87, 77
		2. List 타입의 변수(list)에 저장하고
		3. list에 있는 데이타를 사용해서 화면출력
		     성명     국어   영어  수학    총점     평균
		   --------------------------
		     홍길동  100  90  81  270  90.33
		   ...
		4. list에서 아이디(2020333) 수학점수를 80 점으로 수정하고
		   전체 데이터 다시 화면 출력   
		**************************/	
		list = new ArrayList<>();
		list.add(new StudentVO("2020111", "홍길동", 100, 90, 81));
		list.add(new StudentVO("2020222", "이순신", 95, 88, 92));
		list.add(new StudentVO("2020333", "김유신", 90, 87, 77));
		print();
		
		for (int i = 0; i < list.size(); i++) {
			if("2020333".equals(list.get(i).getId())) {
				list.get(i).setMath(80);
			}
		}
		System.out.println("====================");
		print();
	}
	public static void print() {
		System.out.println("번호 \t 성명\t 국어 \t 영어\t 수학\t 총점\t 평균");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId() + "\t " +
								list.get(i).getName() + "\t " +
								list.get(i).getKor() + "\t " +
								list.get(i).getEng() + "\t " +
								list.get(i).getMath() + "\t "+ 
								list.get(i).getTot() + " \t" + 
								list.get(i).getAvg() + " \t" );
		}
	}
}















