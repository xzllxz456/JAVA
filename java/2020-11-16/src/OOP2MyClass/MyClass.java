package OOP2MyClass;

public class MyClass {
	private int number;		// 클래스 내부에서만 접근이 가능
	public String name;		// 어디서든지 접근이 가능
	protected char c;
	// variable 90% private
	/*
	 
	//setter;
	public void setNumber(int newNumber) {
		number = newNumber;
	}
	//getter;
	public int getNumber() {
		return number;
	}
	
	*/
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
		
		/*
		  this: 자기참조 -> 자기 자신의 주소(Heap)
		  		0번째 매개변수로 자기 자신을 가리키는 주소
		 */
	}
	
	public MyClass getThis() {
		return this;
	}
	
	public void method() {
		
//		int number = 12;		아래 로컬 number변수가 지역변수로 된다.
		number = 12;
		this.number = 14;
		this.setNumber(23);
		
	}
}
