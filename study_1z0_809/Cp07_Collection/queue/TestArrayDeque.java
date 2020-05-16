package com.wealth.certificate.study_1z0_809.chapter07.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestArrayDeque {
	public static void main(String[] args) {
		System.out.println("\n-----------boolean add(E e)-----------");
		Queue<Integer> deque = new ArrayDeque<Integer>(5);
		// use add() method to add elements in the deque
		System.out.println("deque.add(20); "+ deque.add(20));	// true
		System.out.println("deque.add(30); "+ deque.add(30));	// true
		System.out.println("deque.add(30); "+ deque.add(30));	// true
		System.out.println("deque.add(22); "+ deque.add(22));	// true
		//System.out.println("deque.add(null); "+ deque.add(null));	// java.lang.NullPointerException
		// let us print all the elements available in deque
		System.out.println(deque);	// [20, 30, 30, 22]
		
		System.out.println("\n-----------E remove()-----------");
		// [20, 30, 30, 22]
		deque.add(-1);		// true
		// this will remove element at the first(head) postion
		int retval = deque.remove();
		System.out.println("Element removed is : " + retval);	// 20
		// let us print all the elements available in deque
		System.out.println(deque);	// [30, 30, 22, -1]
		
		System.out.println("\n-----------E element()-----------");
		// [30, 30, 22, -1]
		System.out.println(deque.element());	// 30
		deque.clear();
		//System.out.println(deque.element());	// java.util.NoSuchElementException
		
		System.out.println("\n-----------boolean offer(E e)-----------");
		Queue<String> queue = new ArrayDeque<>();
		System.out.println(queue.offer("a")); // true [a]
		System.out.println(queue.offer("b")); // true [a, b]
		System.out.println(queue.offer("b")); // true [a, b, b]
		//System.out.println(queue.offer(null)); // java.lang.NullPointerException
		
		System.out.println("\n-----------E poll()-----------");
		// [a, b, b]
		System.out.println(queue.poll()); // a [b, b]
		System.out.println(queue.poll()); // b [b]
		System.out.println(queue.poll()); // b []
		System.out.println(queue.poll()); // null []
		
		System.out.println("\n-----------E peek()-----------");
		System.out.println(queue.offer("a")); // true [a]
		System.out.println(queue.offer("b")); // true [a, b]
		System.out.println(queue.offer("b")); // true [a, b, b]
		// [a, b, b]
		System.out.println(queue.peek()); // a
		System.out.println(queue.peek()); // a
		System.out.println(queue.peek()); // a
		
		System.out.println("\n-----------void push(E e)-----------");
		ArrayDeque<String> stack = new ArrayDeque<>();
		stack.push("a"); 	// [a]
		stack.push("b"); 	// [b, a]
		stack.push("c"); 	// [c, b, a]
		//stack.push(null); 	// NullPointerException
		
		System.out.println("\n-----------E pop()-----------");
		System.out.println(stack.pop()); // c
		System.out.println(stack.pop()); // b
		System.out.println(stack.pop()); // a
		//System.out.println(stack.pop()); // NoSuchElementException
		
		System.out.println("\n-----------E peek()-----------");
		stack.push("a"); 	// [a]
		stack.push("b"); 	// [b, a]
		stack.push("c"); 	// [c, b, a]
		
		System.out.println(stack.peek()); // c
		System.out.println(stack.peek()); // c
		System.out.println(stack.peek()); // c
	}
}
