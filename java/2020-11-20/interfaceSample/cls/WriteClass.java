package cls;

import inter.WriteMode;

public class WriteClass {
	public void write_method(WriteMode wm) {
		wm.write();
		/*
		if(wm instanceof Ballpen) {
			((Ballpen)wm).erase();
		}else {
			((Pencil)wm).delete();
		}
		*/
		
	}
}
