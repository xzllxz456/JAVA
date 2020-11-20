package cls;

import inter.WriteMode;

public class Ballpen implements WriteMode {

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Ballpen 볼펜으로 기입합니다.");
		erase();
	}
	
	public void erase() {
		System.out.println("화이트를 사용합니다.");
	}

}
