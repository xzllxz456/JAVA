package Arrayqueqe;

public class mainClass {
	public static void main(String[] args) {
		ArrayListQueqe aq = new ArrayListQueqe();
		String str = "AAAAA";
		aq.push(str);
		
		System.out.println("top Object = " + aq.peek());
		str = "BBBBB";
		aq.push(str);
		
		aq.pop();
		System.out.println("top Object = " + aq.peek());
//		aq.pop();
//		aq.pop();
//		System.out.println("top Object = " + aq.peek());
		
		
	}
}
