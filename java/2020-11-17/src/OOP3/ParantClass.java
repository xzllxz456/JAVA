package OOP3;

public class ParantClass {
	private int private_num;
	public int public_num;
	protected int protected_num;	// protected는 자식클래스 까지만 접근가능	외부 접근 차단
		
	public int getPrivate_num() {
		return private_num;
	}
	public void setPrivate_num(int private_num) {
		this.private_num = private_num;
	}
	
	
	public ParantClass(){
		System.out.println("ParantClass parantMethod()  부모 생성자");
	}
	public void parantMethod() {
		System.out.println("ParantClass parantMethod()");
	}
	
	protected void parentProtectedMethod() {
		System.out.println("ParantClass parentProtectedMethod()");
	}
}
