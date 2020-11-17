package OOP_Extends_Ex2;

public class Dropship extends Unit {
	
//	int x, y; // 현재 위치
//	void move(int x, int y) { /* 지정된 위치로 이동 */ }
//	void stop() { /* 현재 위치에 정지 */ }
	
	void load() { /* 선택된 대상을 태운다.*/ 
		System.out.println("태움");
	}
	void unload() { /* 선택된 대상을 내린다.*/ 
		System.out.println("내림");
	}

}
