package main;

public class mainCla {
	public static void main(String[] args) {
		/*
		 	First in First Out
		 */
		QueueClass queue = new QueueClass(3);
		
		String str = "One";
		queue.push(str);
		
		String front = (String)queue.peek();
		System.out.println("front: " + front);
		
		str = "Two";
		queue.push(str);
		
		front = (String)queue.peek();
		System.out.println("front: " + front);
		
		str = "Three";
		queue.push(str);
		
		front = (String)queue.peek();
		System.out.println("front: " + front);
		
		queue.pop();	// 제일 앞에 있는 공을 빼 냈다.
		
		front = (String)queue.peek();
		System.out.println("front: " + front);
		
		queue.pop();	// 두번쨰 있는 공을 뺴 냈다.
		
		front = (String)queue.peek();
		System.out.println("front: " + front);
		
		str = "Two";
		queue.push(str);
		
		front = (String)queue.peek();
		System.out.println("front: " + front);
	}
}
