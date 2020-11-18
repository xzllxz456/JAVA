package baseballhumenDTO;

public class PitcherChildDTO extends BaseBallParantDTO{
	private int win;
	private int lose;
	private double defence;
	
	public PitcherChildDTO() {
		super();
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public double getDefence() {
		return defence;
	}
	public void setDefence(double defence) {
		this.defence = defence;
	}
	public String toString() {
		return "번호" + getNumber() + " 이름 " + getName() + " 나이 " + getAge() + " 키 " + getKyy()
		+ " 승 " + getWin() + " 패  " + getLose() + " 승률 " + getDefence(); 
	}
}
