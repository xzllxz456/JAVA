package abstractClass2;

import Write.Writer;

public class MyClass {
	Writer w;
	public MyClass(Writer w) {
		this.w = w;
	}
	
	public void method() {
		w.write();
		w.erase();
	}
}
