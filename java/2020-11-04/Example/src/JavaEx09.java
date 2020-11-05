
import java.util.Scanner;

public class JavaEx09 {
	public static void main(String[] args) {
		//유저로부터 입력 받은 수들의 합계와 평균을 구해라
		Scanner sc = new Scanner(System.in);
		
//		방법2
		//선언
		
		int numArr[] = null;
		int sum;
		double avg;
		int count;
		//초기화
		sum = 0;
		//입력
		//	1. 몇개?
		System.out.print("연산하고 싶은 점수의 갯수= ");
		count = sc.nextInt();
		//	2. 동적할당(배열의 갯수를 지정)
		numArr = new int[count];
		//	3. 숫자의 갯수만큼 입력
		for(int i = 0; i < numArr.length; i++) {
			System.out.print((i+1) + "번째 수=");
			numArr[i] = sc.nextInt();
		}
		
		//합계산출
		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}
		//평균산출
		avg = sum / numArr.length;
		//결과산출
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
//		방법1		
//		System.out.println("몇개받음?:");
//		int num = sc.nextInt();
//		int score;
//		int sum = 0;
//		double avg = 0;
//		int arr[] = new int[num];
//		for(int i = 0; i < num; i++) {
//			System.out.println("점수입력:");
//			score = sc.nextInt();
//			arr[i] = score;
//		}
//		for(int i = 0; i < num; i++) {
//			sum += arr[i];
//		}
//		System.out.println("합: " + sum);
//		avg = (double)(sum / num);
//		System.out.println("평균: " + avg);
	}
}
