package main;

public class QueueClass {
	/*
	 	Queue == FIFO : First In First Out
	 					reer			front
	 */
	
	private int front;
	private int reer;
	private int maxSize;
	private Object queueArray[];
	
	public QueueClass(int maxSize) {
		this.maxSize = maxSize;
		queueArray = new Object[maxSize];
		
		front = 0;
		reer = -1;
	}
	
	public boolean isEmpty() {
		return (front == reer +1);
	}
	
	public boolean isFull() {
		return (reer == maxSize - 1);
	}
	
	// 추가
	public void push(Object obj) {
		if(isFull()){
			System.out.println("공간이 가득 차있습니다.");
			return;
		}
		
		reer++;
		queueArray[reer] = obj;
	}
	
	// 삭제
	public Object pop() {
		Object obj = peek();
		if(front > maxSize - 1) {
			return null;
		}
		front++;
		return obj;
		
	}
	
	public Object peek() {
		if(isEmpty()) {
			System.out.println("데이터가 없습니다.");
			return null;
		}
		return queueArray[front];
		
	}
	
	
}
