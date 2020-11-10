package StudentEx;

import java.util.Arrays;
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
		String[] obj = { "이름  ", "국어 ", "영어 ", "수학 " };
		String[][] sub = new String[student][obj.length];
		for (int i = 0; i < obj.length; i++) {
			sub[0][i] = obj[i];
		}
		for (int i = 1; i < student; i++) {
			System.out.print("이름입력: ");
			sub[i][0] = sc.next();
			int w = 1;
			while (w < obj.length) {
				boolean b = false;
				System.out.print(sub[i][0] + obj[w] + " 점수입력: ");
				sub[i][w] = sc.next();
				for (int j = 0; j < sub[i][w].length(); j++) {
					int asc = (int) sub[i][w].charAt(j);
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
		int score[][] = new int[student - 1][obj.length - 1];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = Integer.parseInt(sub[i + 1][j + 1]);
				System.out.println(score[i][j]);
			}
			System.out.println();
		}
		// 각 학생들의 총점
		for (int i = 0; i < score.length; i++) {
			int stuSum = 0;
			for (int j = 0; j < score[i].length; j++) {
				stuSum = stuSum + score[i][j];
			}
			System.out.println(sub[i + 1][0] + "은 " + stuSum);
		}
		// 총점의 1등
		int stuSum[] = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				stuSum[i] += score[i][j];
			}

		}
		for (int i = 0; i < stuSum.length - 1; i++) {
			for (int j = i + 1; j < stuSum.length; j++) {
				if (stuSum[i] < stuSum[j]) {// 오름차순
					int temp = stuSum[i];
					stuSum[i] = stuSum[j];
					stuSum[j] = temp;
				}

			}
		}
		for (int i = 0; i < score.length; i++) {
			int stuSum1 = 0;
			for (int j = 0; j < score[i].length; j++) {
				stuSum1 = stuSum1 + score[i][j];
				if (stuSum1 == stuSum[0]) {
					System.out.println(sub[i + 1][0] + " 이1등");
				}
			}
		}
		// 과목의 1등
		int max = 0;
		int min = 101;
		System.out.println("국어 0 영어 1 수학 2 번입력");
		int n = sc.nextInt();
		for (int i = 0; i < score.length; i++) {
			if (n == 0) {
				for (int j = 0; j < score.length; j++) {
					if (max < score[j][n]) {
						max = score[j][n];
					}
				}
				if(max == score[i][n]) {
					System.out.println(sub[i+1][0] + "과목최고점"+ score[i][n]);
				}

			}
			if (n == 1) {
				for (int j = 0; j < score.length; j++) {
					if (max < score[j][n]) {
						max = score[j][n];
					}
				}
				if(max == score[i][n]) {
					System.out.println(sub[i+1][0] + "과목최고점"+ score[i][n]);
				}

			}

			if (n == 2) {
				for (int j = 0; j < score.length; j++) {
					if (max < score[j][n]) {
						max = score[j][n];
					}
				}
				if(max == score[i][n]) {
					System.out.println(sub[i+1][0] + "과목최고점"+ score[i][n]);
				}
			}
		}

		System.out.println("과목 최하 국어 0 영어 1 수학 2 번입력");
		n = sc.nextInt();
		
		for (int i = 0; i < score.length; i++) {
			if (n == 0) {
				for (int j = 0; j < score.length; j++) {
					if (min > score[j][n]) {
						min = score[j][n];
					}
				}
				if(min == score[i][n]) {
					System.out.println(sub[i+1][0] + "과목최저점"+ score[i][n]);
				}

			}
			if (n == 1) {
				for (int j = 0; j < score.length; j++) {
					if (min > score[j][n]) {
						min = score[j][n];
					}
				}
				if(min == score[i][n]) {
					System.out.println(sub[i+1][0] + "과목최저점"+ score[i][n]);
				}

			}

			if (n == 2) {
				for (int j = 0; j < score.length; j++) {
					if (min > score[j][n]) {
						min = score[j][n];
					}
				}
				if(min == score[i][n]) {
					System.out.println(sub[i+1][0] + "과목최저점"+ score[i][n]);
				}
			}
		}
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum = sum + score[i][j];
			}
		}
		avg = (double)sum/score.length;
		System.out.println("총점 " + sum);
		System.out.println("평균 " + avg);
		System.out.println("찾을이름입력");
		String name = sc.next();
		for (int i = 0; i < sub.length; i++) {
			if(name.equals(sub[i][0])) {
				System.out.println(Arrays.toString(sub[i]));
			}else {
				System.out.println("이름없음");
			}
		}
	}
}
