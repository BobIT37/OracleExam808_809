package com.wealth.certificate.dumps_1z0_809_ert.question002;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question002 {
	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<>();
		queue.add("Susan");		//[Susan]
		queue.add("Allen");		//[Susan,Allen]
		queue.add("David");		//[Susan,Allen,David]
		System.out.println(queue.pop());
		System.out.println(queue.remove());
		System.out.println(queue);
	}
}


/*
What is the result?
A) 	David
	David
	[Susan, Allen]
B) 	Susan
	Susan
	[Susan, Allen]
C) 	Susan
	Allen
	[Susan, David] 
D) 	Susan 
	Allen 
	[David]
E) 	David
	Allen
	[Susan]
	
Answer : C.
Susan
Allen
[David]


add = Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) 
remove = Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque). 

push = Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) 
pop = Pops an element from the stack represented by this deque. In other words, removes and returns the first element of this deque. 

*/