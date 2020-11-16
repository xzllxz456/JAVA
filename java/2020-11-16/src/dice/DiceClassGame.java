package dice;

import java.util.Scanner;

public class DiceClassGame {
	final int COIN = 20;
	
	DiceClass d = new DiceClass();
	int d1;
	int d2;
	int dSum;
	int uNum;
	
	DiceClassGame(){
		
	}
	
	public int diceRan() {
		d.setDice((int)(Math.random() * 6) + 1);
		return d.getDice();
	}
	public void diceSum() {
		d1 = diceRan();
		d2 = diceRan();
		dSum = d1 + d2;
//		System.out.println(d1+" " + d2 + dSum);
	}
	public int InputNum() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	public void selectNum() {
		while(true) {
			uNum = InputNum();
			if(uNum == 2 || uNum == 12) {
				System.out.println("다시입력");
				continue;
			}
			break;
		}
	}
	
	public int result(int coin) {
		if(dSum == 2 || dSum == 12) {
			System.out.println("제시 불가");
			return coin;
		}else if(dSum == uNum && (dSum == 3 || dSum == 11)) {
			System.out.println("18배 획득");
			return coin * 18;
		}else if(dSum == uNum && (dSum == 4 || dSum == 10)) {
			System.out.println("12배 획득");
			return coin * 12;
		}else if(dSum == uNum && (dSum == 5 || dSum == 9)) {
			System.out.println("9배 획득");
			return coin * 9;
		}else if(dSum == uNum && (dSum == 6 || dSum == 8)) {
			System.out.println("7배 획득");
			return coin * 7;
		}else if(dSum == uNum && dSum == 7) {
			System.out.println("6배 획득");
			return coin * 6;
		}
		return 0;
	}
	
	public void print() {
		int myCoin = COIN;
		while(myCoin > 0) {
			System.out.println("배팅값입력: ");
			int bet = InputNum();
			System.out.print("주사위 합 입력");
			selectNum();
			myCoin = myCoin - bet;
			diceSum();
			myCoin = myCoin + result(bet);
			System.out.println("주사위 번호는 " + d1 + " " + d2);
			System.out.println("코인 갯수: " + myCoin);
			System.out.println("종료는 아무버튼 계속은 1");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(n != 1) {
				System.out.println("ㅂㅂㅂㅂㅂㅂㅂㅂ");
				break;
			}
		}
	}
	
}

