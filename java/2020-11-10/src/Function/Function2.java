package Function;

public class Function2 {
	public static void main(String[] args) {
		/*
		 	function: 함수 == method
		 				들어가는 값 -> 인수, 인자, Parameter, 매개변수(가인수)
		 				나오는 값 -> return 값
		 	
		 	나오는 값의 자료형    	 함수명(들어가는 값(다수))  {
		 		처리
		 		
		 		return 나오는 값 
		 	}
		 */
		// 가변인수<-변경이 가능한 변수(인수)  인수의 갯수가 변한다
		allocParam(12, 23, 45);
		
		allocParam(3,5,6,7,7,3,2,5,2,3,4,54,1,1,43);
		
		allocFunc("worldwkwkwk", 2,3,5,2,5,2,4);
	}
	//alloc <-할당
	//	... <- printf("%d", , , ....)
	static void allocParam(int...num) {
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("sum: " + sum);
	}
	//			
	static void allocFunc(String str, int...num) {	//가변인수가 앞에 있으면 안된다.(int...num, String str )안됨
													//인수의 갯수를 얼마나 받을지 모르기 때문이다. 가변인수는 제일 뒤에 한개만 
		System.out.println("str: " + str);			//사용  배열이랑 똑같이 사용 유동적
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
