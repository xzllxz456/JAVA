
public class mainClass {
	public static void main(String[] args) {
		/* 
		 * Array: 배열 
		 * 		  변수의 확장 기능.
		 * 		 정의: 같은 자료형 변수의 묶음.
		 * 		 관리의 목적을 취한다.
		 * 
		 * 		 int number;
		 * 		 int charPosNum;
		 * 		
		 * 		 관리 요소: index number == 숫자
		 * 		 		 0 ~ (n - 1)개 까지 (n은 배열의 갯수)
		 * 		 int num1, num2, num3, num4, num5;
		 * 		 
		 * 		 int num[] = new int[5];
		 * 		 
		 * 		 형식: 
		 * 			자료형 배열변수명[] = new 자료형[배열의 총수];
		 * 
		 * 		 	int array[] = new int[10];
		 * 						  이부분은 동적할당, 정적할당으로 변경 불가
		 * 						 delete[] array   가비지 콜렉터  //메모리 관리로 지운다 (메모리 누수 때문)
		 * 			정적할당(static): 정해진 만큼
		 * 			동적할당(dynamic): 원하는 만큼 
		 * 
		 * 			  동적		  정적		  Data			code	  
		 * 			stack영역, 	 heap영역, 	static영역,	 sys영역
		 * 			*array[]   *new int[10]   정적변수
		 * 			*로컬변수	   *삭제 불가
		 * 			*빠져나오면     *힙영역에 쌓임
		 * 			 삭제			  (유지)
		 * 
		 * -------------------------------------------------------------------
		 * 			array[ 번지 ]
		 * 			array[0]
		 * 			array[1]
		 * 			array[2]
		 * 			array[3]
		 * 			  :
		 * 			array[n개]		//array[n+1] X존재불가//	
		 * 
		 * 			초기화 가능
		 * 			int num = 12;
		 * 			int num //선언
		 * 			num = 12//초기화
		 * 	
		 * 			int array[] = {1, 2, 3};	
		 * 			int array[];
		 * 			array = {1, 2, 3}
		 * 
		 * 			array   pointer
		 * 			int *pArr; == int pArr[];
		 * 			int pArr = new int[3];
		 * 
		 * 			int **pArr;
		 * 
		 * 			CRUD -> 기본적으로 Array 사용 
		 * 			Create -> 생성
		 * 			Read -> 읽기
		 *  		Update -> 보완
		 *   		Delete-> 삭제
		 * 
		 */
			
//		int array[] = new int[3]; //0~2
//		int []array = new int[3];
		int[] array = new int[3];
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		
		array[2] = array[0] + array[1];
		
		int array1[] = {111, 222, 333};
//		int[] array1 = new int[3];
//		
//		array1[0] = 111;
//		array1[1] = 222;
//		array1[2] = 333;
		//불가능
		/*
		 * int array2[]; 
		 * array2 = {111, 222, 333};
		 */
		int array2[];
		array2 = new int [5];
		array2[0] = 1;
		System.out.println(array2[1]); //동적할당을 안해주면 0으로 초기화 자동으로 됨
		/* 작동불가
		 * int num; 
		 * System.out.println(num);
		 */
		int num = 0;    		// 일반변수는 0으로 초기화
		int array3[] = null;	// null -> (0x0000 0000) == 0  // 참조같은 경우 null로 초기화
//		int array3[] = 0;   //불가능
		
		char charArr[] = {'A', 'B', 'C'};
		
		System.out.println(charArr.length);  	//length 길이
		System.out.println(array2.length);
		System.out.println(charArr[1]);
		
		char charArr1[] = new char[5];
		System.out.println(charArr1);			// 빈공간
		charArr1[0] = 'h';
		charArr1[1] = 'e';
		charArr1[2] = 'l';
		charArr1[3] = 'l';
		charArr1[4] = 'o';
		System.out.println(charArr1);
		System.out.println((int)charArr1[0]); // ASCII코드값

	}
}
