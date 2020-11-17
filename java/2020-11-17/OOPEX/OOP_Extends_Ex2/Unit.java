package OOP_Extends_Ex2;

public class Unit {
	int x, y;
	void move(int x, int y) {
		System.out.println("x - " + x + "  y = " + y);
	}
	void stop() { /* 현재 위치에 정지 */ 
		System.out.println("stop");
	}
}
