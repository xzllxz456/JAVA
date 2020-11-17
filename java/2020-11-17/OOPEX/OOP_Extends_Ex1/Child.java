package OOP_Extends_Ex1;

public class Child extends Parent{
	int x = 3000;
	
	Child() {
		this(1000);
	}
	public Child(int x) {
//		super();	컴파일러가 만들어줌
		this.x = x;
	}
}
