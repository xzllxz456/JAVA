import java.util.Scanner;

public class JavaMainClass {
	public static void main(String[] args) {
		/*
		 * 편의점 프로그램
		 * 
		 * 지불해야 할 금액: 	3230원
		 * 자신의 금액: 		10000원
		 * 
		 * 거스름 돈: 			?????
		 * 5000원 몇장 1000원 몇장 500원 몇개 100원 몇개 50원 몇개?10원 몇개?
		 * 
		 */
		Scanner sc = new Scanner(System.in);
//		System.out.println("물건가격: ");
//		int pri = sc.nextInt();
//		System.out.println("내돈: ");
//		int money = sc.nextInt();
//		
//		int result = money - pri;
//		
//		System.out.println("거스름돈 : " + result);
//		int fiveTh = result / 5000;
//		System.out.println("오천원: " +fiveTh);
//		result = result % 5000;
//		
//		int thous = result / 1000;
//		System.out.println("천원: " + thous);
//		result = result % 1000;
//		
//		int fiveHun = result / 500;
//		System.out.println("오백원: " + fiveHun);
//		result = result % 500;
//		
//		int hun = result / 100;
//		System.out.println("백원: " + hun);
//		result = result % 100;
//		
//		int fif = result / 50;
//		System.out.println("오십원: " + fif);
//		result = result % 50;
//		
//		int ten = result / 10;
//		System.out.println("십원" + ten);
//		result = result % 10;
		//변수의 선언 
		int myMoney;	//내돈
		int price;		//지불할돈
		int changeMoney; //거스름돈
		System.out.println("지불할 돈 : ");
		price = sc.nextInt();
		
		System.out.println("가지고있는 돈 : ");
		myMoney = sc.nextInt();
//		myMoney = 10000;
//		price = 3230;
		//거스름돈 계산
		changeMoney = myMoney - price;// 6770 % 5000 -> 1770
		//5000원
		int m5000 = changeMoney / 5000;
		//1000원
		int m1000 = (changeMoney % 5000) / 1000;
		//500원
		int m500 = (changeMoney % 1000) / 500;
		//100원
		int m100 = (changeMoney % 500) / 100;
		//50원
		int m50 = (changeMoney % 100)/ 50;
		//10원
		int m10 = (changeMoney % 50) / 10;
		//결과출력
		System.out.println("거스름돈: " + changeMoney + "원");
		System.out.println("5000원: " + m5000 + "장");
		System.out.println("1000원: " + m1000 + "장");
		System.out.println("500원: " + m500 + "개");
		System.out.println("100원: " + m100 + "개");
		System.out.println("50원: " + m50 + "개");
		System.out.println("10원: " + m10 + "개");
		
	}
}
