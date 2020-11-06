
public class Ex2 {
	public static void main(String[] args) {
		Student1 s = new Student1("홍길", 1, 1, 100, 60, 76);
	}
}
class Student1{
	String name;
	int ban;
	int n;
	int kor;
	int math;
	int eng;
	Student1(){
		
	}
	Student1(String name, int ban, int n, int kor, int math, int eng){
		this.name = name;
		this.ban = ban;
		this.n = n;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
}
