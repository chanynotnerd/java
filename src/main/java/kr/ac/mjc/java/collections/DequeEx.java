package kr.ac.mjc.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new ArrayDeque<>();
		queue.offer("Seoul");
		queue.offer("Busan");
		queue.offer("LA");
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		
		Deque<String> stack = new ArrayDeque<>();
		stack.offer("Seoul");
		stack.offer("Busan");
		stack.offer("LA");
		System.out.println(stack);
		
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack);
	}
}
