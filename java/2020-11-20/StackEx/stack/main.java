package stack;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		/*
		 	stack: First In Last Out   FILO
		 */
		/*
		stack sta = new stack(5);
		
		String str = "one";
		sta.push(str);
		
		String peekstr = (String)sta.peek();
		System.out.println("top objct = " + peekstr);
		
		str = "two";
		sta.push(str);
		
		peekstr = (String)sta.peek();
		System.out.println("top objct = " + peekstr);
		
		String popStr = (String)sta.pop();
		System.out.println("삭제된 객체: " + peekstr);
		
		peekstr = (String)sta.peek(); 
		System.out.println("top objct = " + peekstr);
		
		Integer i = 111;
		sta.push(i);
		
		Integer t = (Integer)sta.peek();
		System.out.println("top objct = " + t);
		*/
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("얼마나 담을꺼?");
		stack sta = new stack(sc.nextInt());
		while (true) {
			System.out.println("값 넣기 1 / 값 빼기 2 / 값 상태 보기 3");
			int n = sc.nextInt();
			
			if(n == 1) {
				System.out.println("넣을거 입력: ");
				str = sc.next();
				sta.push(str);
				
				str = (String)sta.peek();
				System.out.println("top objct = " + str);
			}
			if(n == 2) {
				str = (String)sta.peek();
				System.out.println("top objct = " + str);
				
				str = (String)sta.pop();
				System.out.println("삭제된 객체: " + str);
			}
			if(n == 3) {
				sta.check();
			}
		}
	}
}
