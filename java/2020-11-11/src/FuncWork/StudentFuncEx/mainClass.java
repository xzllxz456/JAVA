package StudentFuncEx;

import java.util.Arrays;
import java.util.Scanner;

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
public class mainClass {
	public static void main(String[] args) {
		student();
		
	}
	// 학생 점수
	static void student(){
		String stusub[][] = null;
		int scores[][] = null;
		stusub = subInput();
		scores = numScore(stusub); 
		stSum(stusub);
		subRank(scores);
		lowRank(scores);
		allSum(scores);
		scan(stusub);
	}
	
	static void scan(String[][] stusub) {
		System.out.println("찾을 이름: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for (int i = 1; i < stusub.length; i++) {
			if(name.equals(stusub[i][0])) {
				System.out.println(Arrays.toString(stusub[i]));
			}
		}
	}
	static void allSum(int[][] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				sum = sum + scores[i][j];
			}
		}
		double avg = (double) sum/ (scores.length * scores[0].length);
		System.out.println("총점 : " + sum);
		System.out.println("평균: " + avg);
	}
	static void lowRank(int[][] numArr) {
		int low = numArr[0][0];//국 0 영 1 수 2
		for (int i = 0; i < numArr.length; i++) {
			if(low > numArr[i][0]) {
				low = numArr[i][0];
			}
		}
		System.out.println("최하점: " + low);
	}
	static void subRank(int numArr[][]) {
		int high = -1;
		for (int i = 0; i < numArr.length; i++) {		//국 0 영 1 수 2
			if(high < numArr[i][0]) {
				high = numArr[i][0];
			}
		}
		System.out.println("최고점: " + high);

	}
	// 각 총점
	static void stSum(String[][] stusub) {
		String rank1 = " ";
		int[] arr = new int[stusub.length - 1];
		for (int i = 0; i < stusub.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j < stusub[i].length - 1; j++) {
				sum = sum + Integer.parseInt(stusub[i + 1][j + 1]);
			}
			arr[i] = sum;
			System.out.println(stusub[i+1][0]+sum);
			//순위
			rank1 = rank(arr);	//최고점
		}
		//하이스코어
		high(rank1, arr, stusub);
	}
	static void high(String rank, int[] arr, String[][] str) {
		for (int i = 0; i < arr.length - 1; i++) {
			if(rank.equals(Integer.toString(arr[i]))) {
				System.out.println("총점 1등은" + rank + "점  " + str[i + 1][0]);
			}
		}
	}
	static String rank(int[] arr) {
		int first = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					first = arr[i];
				}
			}
		}
		String first1 = first + "";
		return first1;
	}
	static int[][] numScore(String[][] stusub) {
		int arr[][] = new int[stusub.length - 1][stusub[0].length - 1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(stusub[i + 1][j + 1]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		return arr;
	}
	
	
	static String[][] subInput() {
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
			sub[i][0].trim();
			
			int w = 1;
			while (w < obj.length) {
				boolean b = false;
				System.out.print(sub[i][0] + obj[w] + " 점수입력: ");
				sub[i][w] = sc.next();
				b = numCheck(sub[i][w], b);
								
				if (b == true) {
					System.out.println("이상한게 있음 다시입력");
					continue;
				}

				w++;
			}
		}
		for (int i = 0; i < sub.length; i++) {
			System.out.println(Arrays.toString(sub[i]));
		}
		return sub;
	}
	
	
	//숫자입력
	static boolean numCheck(String str, boolean b) {
		for (int i = 0; i < str.length(); i++) {
			int asc = (int) str.charAt(i);
			if (asc < 48 || asc > 57) {
				b = true;
				break;
			}
		}
		return b;
	}
}
