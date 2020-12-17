package exam.list_set_map;

import java.util.HashSet;

public class StudentSet {
	static HashSet<StudentVO> set;
	public static void main(String[] args) {
		set = new HashSet<StudentVO>();
		set.add(new StudentVO("2020111", "홍길동", 100, 90, 81));
		set.add(new StudentVO("2020222", "이순신", 95, 88, 92));
		set.add(new StudentVO("2020333", "김유신", 90, 87, 77));
		print();
		for (StudentVO svo : set) {
			if("2020333".equals(svo.getId())) {
				svo.setMath(80);
//				set.add(new StudentVO("2020333", "김유신", 90, 87, 80));
			}
		}
		print();
	}
	
	public static void print() {
		System.out.println("번호 \t 성명\t 국어 \t 영어\t 수학\t 총점\t 평균");
		for (StudentVO svo : set) {
			System.out.println(svo.getId() + "\t " +
					svo.getName() + "\t " +
					svo.getKor() + "\t " +
					svo.getEng() + "\t " +
					svo.getMath() + "\t "+ 
					svo.getTot() + " \t" + 
					svo.getAvg() + " \t" );
		}
	}
}
