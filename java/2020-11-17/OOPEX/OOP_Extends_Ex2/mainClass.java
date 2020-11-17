package OOP_Extends_Ex2;

public class mainClass {
	public static void main(String[] args) {
		/*
		Marine ma = new Marine();
		Tank ta = new Tank();
		Dropship dr = new Dropship();
		*/
		Unit unit = new Marine();
		Unit charUnti[] = new Unit[4];
		
		charUnti[0] = new Tank();
		charUnti[1] = new Marine();
		charUnti[2] = new Tank();
		charUnti[3] = new Dropship();
		
		charUnti[0].move(100, 120);
		charUnti[1].move(200, 150);
		charUnti[2].move(170, 220);
		charUnti[3].move(180, 210);
		
		for (int i = 0; i < charUnti.length; i++) {
			charUnti[i].stop();
		}
		
		for (int i = 0; i < charUnti.length; i++) {
//			if(부모클래스 instanceof 자식클래스);
			if(charUnti[i] instanceof Marine) {
				Marine m = (Marine)charUnti[i];
				m.stimPack();
			}else if(charUnti[i] instanceof Tank) {
				((Tank)charUnti[i]).changeMode();
			}else if(charUnti[i] instanceof Dropship) {
				((Dropship)charUnti[i]).unload();
				((Dropship)charUnti[i]).load();
			}
		}
	}
}
