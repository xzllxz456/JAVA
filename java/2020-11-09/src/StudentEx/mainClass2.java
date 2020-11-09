package StudentEx;

import java.util.Scanner;

public class mainClass2 {
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

		// 1. 몇명의 학생의 통계?
		Scanner sc = new Scanner(System.in);

		System.out.print("학생 몇명입니까?: ");
		int student = sc.nextInt() + 1;
		String obj[] = { "이름 ", "국어 ", "영어 ", "수학 " };
		String gradeCard[][] = new String[student][obj.length];
		// 과목 틀
		for (int i = 0; i < obj.length; i++) {
			gradeCard[0][i] = obj[i];
		}
		// 이름 점수 입력
		for (int i = 1; i < student; i++) {
			System.out.print("이름을 입력: ");
			gradeCard[i][0] = sc.next();

			int w = 1;
			while (w < obj.length) {
				boolean b = false;
				System.out.print(gradeCard[i][0] + "의" + obj[w] + "점수는?:");
				gradeCard[i][w] = sc.next();
				for (int j = 0; j < gradeCard[i][w].length(); j++) {
					int asc = (int) gradeCard[i][w].charAt(j);
					if (asc < 48 || asc > 57) {
						b = true;
						break;
					}
				}
				if (b == true) {
					System.out.println("이상한게 있음 다시입력");
					continue;
				}
				w++;
			}
		}

	}
}
