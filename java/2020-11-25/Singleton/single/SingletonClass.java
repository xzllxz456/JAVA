package single;


public class SingletonClass {

//	public static int staticNumber;
	private static SingletonClass si = null;
//	private static SingletonClass si2 = null;
	
	public int number;
	public int ynum;
	
	
	
	private SingletonClass() { 	// 생성 불가
//		number = 145;
	}
	

	public static SingletonClass getInstance() {
		if(si == null) {
			si = new SingletonClass();
		}
		return si;
	}

}


	
	

	