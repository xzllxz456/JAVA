package dice02;

public class DiceClass {
	private int number;
	
	public void dicecRand() {
		number = (int)(Math.random() * 6) + 1;
	}

	public int getNumber() {
		return this.number;
	}

}
