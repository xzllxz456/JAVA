package StudentEx;

import java.util.Arrays;
import java.util.Scanner;

public class mainClass {
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

		System.out.print("학생 몇명입니까?: ");
		int student = sc.nextInt();
		String studentName[] = new String[student];
		String sub[] = { "국어", "영어", "수학" };
		String stuScorArr[][] = new String[student][sub.length];

		for (int i = 0; i < student; i++) {
			System.out.print("학생이름입력: ");
			studentName[i] = sc.next();
			int w = 0;
			// 점수입력
			while (w < sub.length) {
				boolean b = false;
				System.out.print(studentName[i] + sub[w] + " 을입력: ");
				stuScorArr[i][w] = sc.next();
				for (int j = 0; j < stuScorArr[i][w].length(); j++) {
					int asc = (int) stuScorArr[i][w].charAt(j);
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
		// 총점
		int sum = 0;
		int stuResult[][] = new int[student][sub.length];
		for (int i = 0; i < student; i++) {
			for (int j = 0; j < sub.length; j++) {
				stuResult[i][j] = Integer.parseInt(stuScorArr[i][j]);
				sum = sum + stuResult[i][j];
			}
		}
		double avg = (double) sum / (double) (student * sub.length);
		System.out.println("총점은" + sum);
		System.out.println("평균 " + avg);
		// 4. 총점의 1등
		int[] sumRank = new int[student];
		for (int i = 0; i < student; i++) {
			for (int j = 0; j < sub.length; j++) {
				sumRank[i] = sumRank[i] + stuResult[i][j];
			}
		}
		int rank[] = new int[student];
		for (int i = 0; i < rank.length; i++) {
			rank[i] = sumRank[i];
		}
		// 1 1등
		for (int i = 0; i < rank.length - 1; i++) {
			for (int j = i + 1; j < rank.length; j++) {
				if (rank[i] < rank[j]) {// 오름차순
					int temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;
				}

			}
		}
		for (int i = 0; i < rank.length; i++) {

			if (sumRank[i] == rank[0]) {
				System.out.println("총점 1등은" + studentName[i]);
				break;
			}
		}
		for (int i = 0; i < rank.length; i++) {
			rank[i] = stuResult[i][2];
		}
		for (int i = 0; i < rank.length - 1; i++) {
			for (int j = i + 1; j < rank.length; j++) {
				if (rank[i] < rank[j]) {// 오름차순
					int temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;
				}

			}
		}
		for (int i = 0; i < rank.length; i++) {

			if (stuResult[i][2] == rank[0]) {
				System.out.println("수학과목1등은" + studentName[i]);
			}
			if(stuResult[i][2] == rank[sub.length - 1]) {
				System.out.println("수학과목 꼴등은" + studentName[i]);

			}
		}
		System.out.print("누구찾음?");
		String name = sc.next();
		for (int i = 0; i < student; i++) {
				
			for (int j = 0; j < sub.length; j++) {
				if(name.equals(studentName[i])) {
					System.out.println(name + sub[j] +"점수는"
							+ stuResult[i][j]);
				}
			}
		}
	}
}
