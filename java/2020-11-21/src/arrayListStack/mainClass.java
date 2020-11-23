package arrayListStack;

public class mainClass {
	public static void main(String[] args) {
		stack as = new stack();
		String str1 = "AAAAA";
		as.push(str1);
		
		String peekStr = (String)as.peek();
		System.out.println("top Object = " + peekStr);
		
		str1 = "BBBBB";
		as.push(str1);
		
		peekStr = (String)as.peek();
		System.out.println("top Object = " + peekStr);
		
		String delStr = (String)as.pop();
//		System.out.println("top Object = " + peekStr);
		peekStr = (String)as.peek();
		System.out.println("top Object = " + peekStr);
	}
}
