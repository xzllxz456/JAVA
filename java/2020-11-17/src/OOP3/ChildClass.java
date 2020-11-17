package OOP3;

public class ChildClass extends ParantClass {
	
	public ChildClass() {
		System.out.println("ChildClass childmethod() 자식생성자");
	}
	public void childmethod() {
//		private_num = 12;   private는 자식도 접근 불가
		setPrivate_num(123);
		int n = getPrivate_num();
		
		public_num = 2345;
		
		protected_num = 789;
		
		parentProtectedMethod();
		
		System.out.println("ChildClass childmethod()  n = " + n);
	}
}
