package day3Example;

import java.util.Scanner;

public class JavaEx09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개받음?:");
		int num = sc.nextInt();
		int score;
		int sum = 0;
		double avg = 0;
		int arr[] = new int[num];
		for(int i = 0; i < num; i++) {
			System.out.println("점수입력:");
			score = sc.nextInt();
			arr[i] = score;
		}
		for(int i = 0; i < num; i++) {
			sum += arr[i];
		}
		System.out.println("합: " + sum);
		avg = (double)(sum / num);
		System.out.println("평균: " + avg);
	}
}
