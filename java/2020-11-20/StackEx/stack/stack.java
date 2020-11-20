package stack;
public class stack {
	//FILO
	private int top;		// 제일 상위에 있는 것
	private int maxSize;	// 크기
	
	private Object stackArray[];	// 통
	
	public stack(int maxSize) {
		this.maxSize = maxSize;
		top = -1;
		stackArray = new Object[maxSize];
	}
	
	// 통이 비어있는지
	public boolean isEmpty() {
		return (top == -1);
	}
	
	// 통이 가득 차있는지
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	// 통에 값을 넣는다
	public void push(Object item) {
		if(isFull()) {
			System.out.println("통이 가득 차있습니다.");
			return;
		}
		
		top++;
		stackArray[top] = item;
	}
	
	// 통에 값을 순서대로 빼낸다(제거한다.) 
	public Object pop() {
		Object item = peek();
		if(top <= -1) {
			System.out.println("통이 비었습니다.");
			return null;
		}
//		stackArray[top] = null;	// 배열에 지우기가 안된고
		top--;
		return item;
	}
	
	// 제일 위의 공을 
	public Object peek() {
		if(isEmpty()) {
			System.out.println("통이 비어있습니다.");
			return null;
		}
		return stackArray[top];
	}
	
	public void check() {
		for (int i = top; i >=0; i--) {
			System.out.println(stackArray[i]);
		}
	}
	
}
