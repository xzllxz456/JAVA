package studentWork2;

public class Student {
	private int number;
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	Student(){
	}

	public Student(int number, String name, int kor, int math, int eng) {
		super();
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", kor=" + kor + ", math=" 
									+ math + ", eng=" + eng
				+ "]";
	}
	
	
}
