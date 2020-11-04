package day04;

// 학생 클래스
// 필드: 학번 이름 국어 영어 수학
// 메소드: 각 필드에 대한 getter/setter
//       총점 및 평균 계산 하는 메소드
//       학번과 이름을 기준으로 한 equals() 메소드
//       toString()
public class Student {
	private String id;
	private String name;
	private int korean;
	private int english;
	private int math;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int calculateSum() {
		return korean + english + math;
	}

	public double calculateAverage() {
		return calculateSum() / 3.0;
	}

	public boolean equals(Object o) {
		if (o instanceof Student) {
			Student s = (Student) o;
			if (this.name.equals(s.name) && this.id.equals(s.id)) {
				return true;
			}
		}

		return false;
	}

	public String toString() {
		return "학번: " + id + ", 이름: " + name + ", 국어점수: " + korean + "점, 영어점수: " + english + "점, 수학점수: " + math
				+ "점, 총점: " + calculateSum() + "점, 평균: " + calculateAverage() + "점";
	}

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student() {

	}
}
