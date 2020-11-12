package Exception;

public class mainClass {
	/*
		 	Exception : 예외			!= error
		 	
		 	char c = 65;		=> 'A'
		 	array	index number[3] -> number[0 ~ 2]	number[3]
		 	class	Scanner 못찾는경우
		 	file	없는 경우
		 	
		 	형식 : 
		 	
		 	try{
		 	
		 		예외1 가 나올 수 있는 소스
		 		예외2 가 나올 수 있는 소스
		 	
		 	}catch(예외1클래스 e){
		 		특정 예외 메시지 (내보내는 메시지)
		 	}catch(예외2클래스 e){
		 		특정 예외 메시지
		 	}finally{	// 생략 가능
		 		// 무조건 실행
		 		// 뒤처리 	파일 -> undo	//DB오류일때, 파일이 문제가 있을때
		 	}
		 	
		 	void func() throw 예외1클래스{
		 		
		 	}
	 */
	
	public static void main(String[] args) {
		/*
		int array[] = {1, 2, 3};
		
		System.out.println("프로그램 시작");
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(array[i]);
			}
			
			System.out.println("프로그램 실행중 : ");	// 예외가 발생하면 건너뜀
		}catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println("배열에서 예외 발생 범위벗어남!");
			System.out.println("=========" + e.getMessage());	
			return;
			}catch (NumberFormatException e) {	// 자료형 안맞을때	
			}finally {
				// 무조건 실행
				System.out.println("여기는 finally 부분입니다.");
			}
		
		System.out.println("프로그램 끝");
		*/
//		func();
		func1();
//		func2();
	}
	static void func() {
		int array[] = {1, 2, 3};
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	//위랑 아래 같은 형식
	static void func1() throws ArrayIndexOutOfBoundsException{
		int array[] = {1, 2, 3};
		for (int i = 0; i < 4; i++) {
			System.out.println(array[i]);
		}
	}
//	static void func2() throws Exception{
//		int array[] = {1, 2, 3};
//		for (int i = 0; i < 4; i++) {
//			System.out.println(array[i]);
//		}
//	}
}
