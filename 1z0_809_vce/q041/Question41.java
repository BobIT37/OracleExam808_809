package com.wealth.certificate.dumps_1z0_809_vce.question041;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.function.UnaryOperator;

public class Question41 {

	public static void main(String[] args) {
		List<Integer> codes = Arrays.asList (10, 20);
		// operation on single operand that produces a result of same type of operand
		UnaryOperator<Double> uo = s -> s + 10.0; 
		// Fixed line 14 as line below
//		UnaryOperator<Integer> uo = s -> s + 10;
		codes.replaceAll(uo); // can't convert to integer

		/*default void replaceAll(UnaryOperator<E> operator) {
        	Objects.requireNonNull(operator);
        	final ListIterator<E> li = this.listIterator();
        	while (li.hasNext()) {
            	li.set(operator.apply(li.next()));
        	}
    	}*/
		
		codes.forEach(c -> System.out.println(c));
	}
	
}