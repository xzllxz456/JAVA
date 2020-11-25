package single;

import java.util.ArrayList;
import java.util.List;

import dto.Human;

public class SingleClass {
	private static SingleClass si = null;
	
	public List<Human> list = new ArrayList<Human>();
	
	private SingleClass() {
	}

	public static SingleClass getSi() {
		if(si == null) {
			si = new SingleClass();
		}
		return si;
	}

	
	
}
