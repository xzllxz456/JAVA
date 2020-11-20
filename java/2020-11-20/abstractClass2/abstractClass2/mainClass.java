package abstractClass2;

import Write.BallPen;
import Write.Pencil;
import Write.Writer;

public class mainClass {
	public static void main(String[] args) {
		/*
		 	ballpen, pencil 
		 	
		 */
		Writer w = new Pencil();
		MyClass cls = new MyClass(w);
		
//		MyClass cls = new MyClass(new Pencil());
		
		cls.method();
		
		cls = new MyClass(new BallPen());
		cls.method();
		
	}
}




