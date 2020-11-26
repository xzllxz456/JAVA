package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverAA implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		String str = (String)arg;
		
		System.out.println("감시자AA 입니다. 통지 받았습니다: " + str);
	}
	
}
