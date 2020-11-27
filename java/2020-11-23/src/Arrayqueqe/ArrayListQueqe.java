package Arrayqueqe;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueqe {

	private List<Object> list = new ArrayList<Object>();
	private int maxSize;
	
	public ArrayListQueqe() {
		maxSize = 10;
	}
	
	public boolean isEmpty() {
		return (list.size() == 0);
	}
	
	public boolean isFull() {
		return (list.size() >= 10);
	}
	
	public void push(Object obj) {
		if(isFull()) {
			return;
		}
		list.add(obj);
	}
	
	public Object pop() {
		Object obj = peek();
		list.remove(obj);
		return obj;
	}
	
	public Object peek() {
		if (isEmpty()) {
			return null;
		}
		return list.get(0);
	}
	
}
