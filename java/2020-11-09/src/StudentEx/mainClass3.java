package StudentEx;

import java.util.Arrays;
import java.util.Scanner;

public class mainClass3 {
	public static void main(String[] args) {
		/*
		 * 성적관리
		 * 
		 * 1. 몇명의 학생의 통계?
		 * 
		 * 2. 입력(입력체크) 이름, 국어, 수학, 영어
		 * 
		 * 3. 각 학생들의 총점
		 * 
		 * 4. 총점의 1등
		 * 
		 * 5. 과목의 1등
		 * 
		 * 6. 과목의 최하점
		 * 
		 * 7. 총점의 평균
		 * 
		 * 8. 이름을 입력하면, 그 학생의 성적 출력
		 */
		Scanner sc = new Scanner(System.in);
		String student[][] = null;

		/*
		 * { {"홍길동", "90", "100", "85"} //row 데이터 };
		 */
		int sum;
		double avg;
		int max, min;

		// init
		sum = 0;
//		1. 몇명의 학생의 통계?
		System.out.print("학생수를 입력: ");
		int count = sc.nextInt();

		student = new String[count][4];

//		2. 입력(입력체크) 이름, 국어, 수학, 영어	//CRUD  ->  Create , Read, Update, Delete
		/*
		 * for (int i = 0; i < student.length; i++) { System.out.print("이름: "); //
		 * String name = sc.next(); // student[i][0] = name; student[i][0] = sc.next();
		 * System.out.print("국어: "); student[i][1] = sc.next();
		 * System.out.print("영어: "); student[i][2] = sc.next();
		 * System.out.print("수학: "); student[i][3] = sc.next();
		 * 
		 * for (int j = 0; j < student[i].length; j++) {
		 * 
		 * }
		 * 
		 * }
		 */
		int w = 0;
		while (w < student.length) {
			System.out.println((w + 1) + "번째 학생 이름: ");

//			student[w][0] = name;
			String name = sc.next();

			System.out.print("국어: ");
			String kor = sc.next();

			System.out.print("영어: ");
			String eng = sc.next();

			System.out.print("수학: ");
			String math = sc.next();

			if (name.trim().equals("")) {
				System.out.println("이름을 입력해 주세요");
				continue;
			}
			// 국어 체크
			boolean bad = false;
			for (int i = 0; i < kor.length(); i++) {
				int asc = (int) kor.charAt(i);
				if (asc < 48 || asc > 57) {
					bad = true;
					break;
				}
			}
			if (bad == true) {
				System.out.println("국어점수 잘못됨");
				continue;
			}
			// 영어점수
			bad = false;
			for (int i = 0; i < eng.length(); i++) {
				int asc = (int) eng.charAt(i);
				if (asc < 48 || asc > 57) {
					bad = true;
					break;
				}
			}
			if (bad == true) {
				System.out.println("영어점수 잘못됨");
				continue;
			}
			bad = false;
			for (int i = 0; i < math.length(); i++) {
				int asc = (int) math.charAt(i);
				if (asc < 48 || asc > 57) {
					bad = true;
					break;
				}
			}
			if (bad == true) {
				System.out.println("수학점수 잘못됨");
				continue;
			}
			// 정상적으로 입력한 경우
			student[w][0] = name;
			student[w][1] = kor;
			student[w][2] = eng;
			student[w][3] = math;

			w++;
		}
		for (int i = 0; i < student.length; i++) {
			System.out.println(Arrays.toString(student[i]));
		}

//		3. 각 학생들의 총점
//		System.out.println(Integer.parseInt(student[i[2]]) + Integer.parseInt(student[i[2]]));
		int st_sum[] = new int[student.length];
		for (int i = 0; i < student.length; i++) {
			int kor = Integer.parseInt(student[i][1]);
			int eng = Integer.parseInt(student[i][2]);
			int math = Integer.parseInt(student[i][3]);
			st_sum[i] = kor + math + eng;
		}
		for (int i = 0; i < st_sum.length; i++) {
			System.out.print(student[i][0] + "학생의 총점: ");
			System.out.println(st_sum[i]);
		}
//		4. 총점의 1등
		max = st_sum[0];
		for (int i = 0; i < st_sum.length; i++) {
			if (max < st_sum[i]) {
				max = st_sum[i];
			}
		}
		System.out.println("총점의 1등: " + max);

//		5. 국어 과목의 1등
		int kor_num[] = new int[student.length];
		for (int i = 0; i < kor_num.length; i++) {
			kor_num[i] = Integer.parseInt(student[i][1]);
		}
		max = kor_num[0];
		for (int i = 0; i < kor_num.length; i++) {
			if (max < kor_num[i]) {
				max = kor_num[i];
			}
		}
		System.out.println("국어의 최대 점수: " + max);
//		6. 과목의 최하점
		int[] math_num = new int[student.length];
		for (int i = 0; i < math_num.length; i++) {
			math_num[i] = Integer.parseInt(student[i][2]);
		}
		min = math_num[0];
		for (int i = 0; i < math_num.length; i++) {
			if(min > math_num[i]) {
				min = math_num[i];
			}
		}
		System.out.println("수학의 최저점수: " + min);
//		7. 총점의 평균
		for (int i = 0; i < st_sum.length; i++) {
			sum += st_sum[i];
		}
		avg = (double)sum / student.length;
		System.out.println("총점의 합계: " + sum);
		System.out.println("총점의 평균: " + avg);
		System.out.print("학생 이름 입력: ");
		String name = sc.next();
		int findIndex = -1;	// 못찾았을 경우
		for (int i = 0; i < student.length; i++) {
			if(name.equals(student[i][0])) {	//찾았을때
				findIndex = i;
				break;
			}
			
		}
		if(findIndex != -1) {
			System.out.println(Arrays.toString(student[findIndex]));
		}else {
			System.out.println("학생명단에 없습니다.");
		}
	}
}
