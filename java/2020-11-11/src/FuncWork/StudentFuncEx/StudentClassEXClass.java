package StudentFuncEx;

import java.util.Arrays;
import java.util.Scanner;

public class StudentClassEXClass {
	//성적관리 프로그램
	public static void main(String[] args) {
		
		/*
			성적관리 프로그램
		*/	
				
		String student[][] = null;
				
		//	1. 몇명의 학생의 통계?
		int count = studentCountInput();
		
		//	2. 입력(입력첵크)				CRUD
		//		이름, 국어, 수학, 영어		Create, Read, Update, Delete
		student = studentInput(count);
		
		for (int i = 0; i < student.length; i++) {
			System.out.println( Arrays.toString(student[i]) );
		}
							
		//	3. 각 학생들의 총점
		studentAllNum(student);
									
		//	4. 총점의 1등
		studentAllNumOne(student);
						
		//	5. 과목의 1등
		studentTitleOne(student);
					
		//	6. 과목의 최하점		
								
		//	7. 총점의 평균
		sumOfAvg(student);
		
		//	8. 이름을 입력하면, 그 학생의 성적 출력
		studentScan(student);
	}
	
	/*
		TODO 
		함수명 : studentCountInput
		매개변수 : 없음
		return값 : int
		내용 : 학생수를 입력받는다
	*/
	static int studentCountInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력= ");
		int count = sc.nextInt();
		
		return count;		
	}
	// 맞게 입력하는지
	static String[][] studentInput(int count) {
		if(count > 0) {			
		}
		
		Scanner sc = new Scanner(System.in);
		String student[][] = new String[count][4];
		
		int w = 0;
		while(w < student.length) {
			
			System.out.println((w + 1) + "번째 학생의 정보>>");
			
			System.out.print("이름 = ");
			String name = sc.next();
			
			if(name.trim().equals("")) {
				System.out.println("이름을 입력해 주십시오");
				continue;
			}
			
			/*
			System.out.print("국어 = ");
			String lang = sc.next();
			
			if(isNumber(lang) == false) {
				System.out.println("국어 점수의 오류가 있습니다");
				continue;
			}			
			
			System.out.print("수학 = ");
			String math = sc.next();			
			if(isNumber(math) == false) {
				System.out.println("수학 점수의 오류가 있습니다");
				continue;
			}
			
			System.out.print("영어 = ");
			String eng = sc.next();			
			if(isNumber(eng) == false) {
				System.out.println("영어 점수의 오류가 있습니다");
				continue;
			}
			*/
			
			
			String title[] = { "국어", "수학", "영어" };
			String language[] = new String[3];
			boolean b = true;
			int index = 0;
			for (int i = 0; i < language.length; i++) {
				System.out.print(title[i] + " = ");
				language[i] = sc.next();		
				b = isNumber(language[i]);
				if(b == false) {
					index = i;
					break;
				}
			}
			if(b == false) {
				System.out.println(title[index] + " 점수의 오류가 있습니다");
				continue;
			}	
 			
			
			
			student[w][0] = name;
			student[w][1] = language[0];
			student[w][2] = language[1];
			student[w][3] = language[2];
			
			w++;
		}	
		return student;
	}
	
	static void studentAllNum(String student[][]) {
		if(student == null || student.length == 0) {
			System.out.println("학생데이터가 하나도 없습니다");
			return;
		}
		
		/*
		int st_sum[] = new int[student.length]; 
		for (int i = 0; i < student.length; i++) {
			int lang = Integer.parseInt(student[i][1]);
			int math = Integer.parseInt(student[i][2]);
			int eng = Integer.parseInt(student[i][3]);
			st_sum[i] = lang + math + eng;
		}
		*/
		int st_sum[] = strArrToIntArr(student);
		
		for (int i = 0; i < st_sum.length; i++) {
			System.out.print(student[i][0] + "의 총점:");
			System.out.println(st_sum[i]);
		}		
	}
	// 총점 1등
	static void studentAllNumOne(String student[][]) {
		/*
		int st_sum[] = new int[student.length]; 
		for (int i = 0; i < student.length; i++) {
			int lang = Integer.parseInt(student[i][1]);
			int math = Integer.parseInt(student[i][2]);
			int eng = Integer.parseInt(student[i][3]);
			st_sum[i] = lang + math + eng;
		}
		*/
		int st_sum[] = strArrToIntArr(student);
		
		int max = st_sum[0];
		for (int i = 0; i < st_sum.length; i++) {
			if(max < st_sum[i]) {
				max = st_sum[i];
			}
		}	
		System.out.println("총점의 최고점:" + max);		
	}
	// 합
	static int[] strArrToIntArr(String student[][]) {
		int st_sum[] = new int[student.length]; 
		for (int i = 0; i < student.length; i++) {
			int lang = Integer.parseInt(student[i][1]);
			int math = Integer.parseInt(student[i][2]);
			int eng = Integer.parseInt(student[i][3]);
			st_sum[i] = lang + math + eng;
		}
		return st_sum;
	}
		
	// 숫자에 문자가있는지
	static boolean isNumber(String str) {
		boolean b = true;
		for (int i = 0; i < str.length(); i++) {
			int asc = (int)str.charAt(i);
			if(asc < 48 || asc > 57) {
				b = false;
				break;
			}
		}
		return b;
	}
	//과목순위
	static void studentTitleOne(String student[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목을 입력 : 국어(1) 수학(2) 영어(3) = ");
		int title = sc.nextInt();
		
		int titleNum[][] = new int[student.length][3];
		for (int i = 0; i < titleNum.length; i++) {
			for (int j = 0; j < titleNum[i].length; j++) {
				titleNum[i][j] = Integer.parseInt( student[i][j + 1] );
			}		// 학생:0 1 2  과목:0 1 2	
		}
		/*
		for (int i = 0; i < titleNum.length; i++) {
			System.out.println( Arrays.toString(titleNum[i]));
		}*/
				
		int number[] = new int[student.length];		
		for (int i = 0; i < number.length; i++) {
			number[i] = titleNum[i][title - 1];	// 1 2 3 -> 0 1 2
		}		
		
		// 최대값
		int max = number[0];
		for (int i = 0; i < number.length; i++) {
			if(max < number[i]) {
				max = number[i];
			}
		}
		
		String titleName = "";
		if(title == 1) titleName = "국어";
		else if(title == 2) titleName = "수학";
		else if(title == 3) titleName = "영어";
		
		System.out.println( titleName + "의 최고 점수는 " + max + "입니다" );
		
	}
	// 과목 합 평균
	static void sumOfAvg(String student[][]) {		
		int sum[] = strArrToIntArr(student);
		int allSum = 0;
		
		for (int i = 0; i < sum.length; i++) {
			allSum = allSum + sum[i];
		}
		
		double avg = allSum / sum.length;
		
		System.out.println("총점의 평균은 " + avg + "점입니다");		
	}
	
	//학생찾기
	static void studentScan(String student[][]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾을 이름 : ");
		String name = sc.next();
		for (int i = 0; i < student.length; i++) {
			if(name.equals(student[i][0])) {
				System.out.println(Arrays.toString(student[i]));
			}else {
				System.out.println("이름없음");
				break;
			}
			
		}
	}
	
	
	
}

