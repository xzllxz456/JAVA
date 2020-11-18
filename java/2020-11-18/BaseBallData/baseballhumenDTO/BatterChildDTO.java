package baseballhumenDTO;

public class BatterChildDTO extends BaseBallParantDTO {
	private int hitter;
	private int hit;
	private double battingAvg;
	
	public BatterChildDTO() {
		
	}
	
	public int getHitter() {
		return hitter;
	}
	public void setHitter(int hitter) {
		this.hitter = hitter;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public double getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}
	public String toString() {
		return "번호" + getNumber() + " 이름 " + getName() + " 나이 " + getAge() + " 키 " + getKyy()
		+ " 친거 " + getHitter() + " 안타 " + getHit() + " 타률 " + getBattingAvg(); 
	}
	
}
