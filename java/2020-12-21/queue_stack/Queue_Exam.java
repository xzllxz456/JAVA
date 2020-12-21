package com.mystudy.queue_stack;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Exam {

	public static void main(String[] args) {
		// 큐(Queue) : 선입선출(FIFO : First In First Out)
		System.out.println("---- 큐(Queue) : 선입선출(FIFO ---");
		Queue<String> que = new LinkedList<>();
		que.offer("1.첫째"); //입력
		que.add("2.둘째"); //입력
		que.offer("3.셋째");
		System.out.println("que : " + que);
		System.out.println("que.size() : " + que.size());
		
		System.out.println("\n--- peek() : 확인만 ----");
		System.out.println("que.peek() : " + que.peek());
		System.out.println("que.peek() : " + que.peek());
		System.out.println("que : " + que);

		System.out.println("\n--- poll() : 데이터꺼내기 ---");
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll()); //null : 데이터 없을 때
		System.out.println("que.poll() : " + que.poll()); //null : 데이터 없을 때
		System.out.println("> que : " + que);
		System.out.println("> que.size() : " + que.size());
		
		System.out.println("que.isEmpty() : " + que.isEmpty());
		System.out.println("que.peek() : " + que.peek());
		
		System.out.println("======== Queue 전체 데이터 추출 =======");
		que.offer("21.첫째");
		que.add("22.둘째");
		que.offer("23.셋째");
		System.out.println("que.isEmpty() : " + que.isEmpty());
		
		while (!que.isEmpty()) { //비어 있지 않으면
			System.out.println("que.poll() : " + que.poll());
		}
		System.out.println("que.isEmpty() : " + que.isEmpty());
		
		System.out.println("---- size() 사용 전체데이터 추출 ----");
		que.offer("31.첫째");
		que.add("32.둘째");
		que.offer("33.셋째");
		System.out.println("que.size() : " + que.size());
		
		while (que.size() > 0) {
			System.out.println("que.poll() : " + que.poll());
		}
		System.out.println("que.size() : " + que.size());
		
		System.out.println("\n---- remove() -------");
		que.offer("41.첫째");
		que.add("42.둘째");
		que.offer("43.셋째");
		System.out.println("que.size() : " + que.size());
		
		while (que.size() > 0) {
			System.out.println("que.remove() : " + que.remove());
		}
		System.out.println("que.size() : " + que.size());
		
		System.out.println("--- 데이터가 없을 때 remove() 실행시 예외발생 ---");
		//remove() : 데이터가 없으면 java.util.NoSuchElementException 예외발생
		System.out.println("que.remove() : " + que.remove());
		
		System.out.println(">> main() 끝");
	}

}









