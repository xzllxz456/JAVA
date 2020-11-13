package OOP;

public class mainClass {
	/*
 	OOP: Object Oriented Programming
 		  객체 	  지향		프로그래밍
 		  
 		  절차지향
 		  선언(변수, 배열) - 50000line 넘어가면 본인도 헤멘다  ---> 
 		    										  1. 분산 -> 메소드(함수)
 		    										  2. 변수 -> number 충돌 유지보수 올라감
 		    										  3. 크기 -> 한계 
 		 1. 초기화
 		 
 		 
 		 2. 랜덤
 		 	  1)
 		 	  2)
 		 3. 입력처리
 		 	  1)
 		 	  2)
 		 4. 처리(판단)
 		 5. 결과
 		 
 		 // 학생 성적 관리
 		 int student[?][4] = {  // 0 1 2 3 가독성에 안좋다
 		 
 		 };
 		 
 		 student
 		 	name
 		 	kor
 		 	math
 		 	eng
				
	클래스 정의
	class 클래스명{
		변수들
		함수들(메소드 들)
	}
		stack		  동적할당(Heap)
	클래스명  변수 = new 클래스명();		//변수가 stack 영역에 올라감
		   Instance == 주체
		   Object == 객체
		   코드 관리 용이
 */
	public static void main(String[] args) {


		Myclass cls = new Myclass();
		//System.out.println(cls);
		cls.c = 'A';
		cls.n = 123;
		cls.str = "Hello";

		Myclass cls2 = new Myclass();
		cls2.c = 'B';
		cls2.n = 456;
		cls2.str = "world";

		// TV - 2대
		String name[] = new String[2];
		int channel[] = new int[2];
		boolean power[] = new boolean[2];

		name[0] = "smasung";
		name[1] = "LG";

		channel[0] = 11;
		channel[1] = 24;

		power[0] = true;
		power[1] = false;

		System.out.println("메이커: " + name[0] + " " + channel[0] + " " + power[0]);
		System.out.println("메이커: " + name[1] + " " + channel[1] + " " + power[1]);

		TV tv1,tv2;
		tv1 = new TV();
		tv2 = new TV();

		tv1.name = "LG";
		tv1.channel = 11;
		tv1.power = true;

		tv2.name = "samsung";
		tv2.channel = 23;
		tv2.power = true;
		System.out.println("==================클래스 사용==============");
		tv1.print();
		tv2.print();

	}
}

class Myclass{
	char c;		//   member 변수(클래스 멤버 변수)
	int n;
	String str;

}
class TV {
	String name;
	int channel;
	boolean power;

	void print() {
		System.out.println("메이커: " + name + " " + channel + " " + power);
	}
}


