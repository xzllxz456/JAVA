package cls;

import java.util.Observable;

public class Myclass extends Observable{
	
	private String id;
	private String password;
	
	private String preArg = null; 	// 옵저버용 변수 
	
	public Myclass() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void notifyObservers(Object arg) {	// ObserverAA ,BB 에 날려줌
		
		String str = (String)arg;
		// 변화가 없었을 경우 -> 감시자에게 통지하지 않음
		if(str.equals(preArg)) {
			return;
		}
		// 변화가 있는 경우 => 값이 들어왔다
		preArg = str;
		this.setChanged(); // 옵저버에 있는 함수 // reset
		
		super.notifyObservers(arg);
		
		clearChanged();
	}
	
	

}
