package com.wealth.certificate.study_1z0_809.chapter17.stream04;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {

	/*
	 * A reduction is an operation that takes many elements and combines them (o reduce them) 
	 * into a single value or object, and it is done by applying an operation multiple times.
	 * 
	 * 
	 * The Stream interface has two methods for reduction:
	 * reduce()
	 * collect()
	 * 
	 */
	
	
	public static void main(String[] args) {

		/*
		 * reduce()
		 * 
		 * This method has three versions:
		 *	
		 *	- Optional<T> reduce(BinaryOperator<T> accumulator)
		 *	- T reduce(T identity, BinaryOperator<T> accumulator)
		 *	- <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
		 * 
		 * BinaryOperator<T> is equivalent to a BiFunction<T, T, T>, 
		 * where the two arguments and the return type are all of the same types.
		 */
		
		/*
		 * Old Style if you want to find values of n1+n2+n3+n4+...+nn
		 */
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int summ = 0;
		for(int n : numbers) {
		    summ += n; //this is accumulator
		}
		
		/*
		 * This code just applies a function for each element, 
		 * accumulating the result and returning an Optional wrapping that result, 
		 * or an empty Optional if there were no elements.
		 * 
		 */
		
		/*
		 * primitive version of stream uses the primitive version of Optional
		 * Method signature :
		 * Optional<T> reduce(BinaryOperator<T> accumulator)
		 */
		OptionalInt total = IntStream.of(1, 2, 3, 4, 5, 6)
                .reduce( (sum, n) -> sum + n );
		total.ifPresent(e -> System.out.println(e));
		
		/*
		 * 
		 * this is what happens step by step:

			1. An internal variable that accumulates the result is set to the first element of a stream (1).
			2. This accumulator and the second element of the stream (2) are passed as arguments to the BinaryOperator represented by the lambda expression (sum, n) -> sum + x.
			3. The result (3) is assigned to the accumulator.
			4. The accumulator (3) and the third element of the stream (3) are passed as arguments to the BinaryOperator.
			5. The result (6) is assigned to the accumulator.
			6. Steps 4 and 5 are repeated for the next elements of the stream until there are no more elements.
			
			However, what if you need to have an initial value? For cases like that, we have the version that takes two arguments:
		 * 
		 */
		
		/*
		 * version that takes two arguments:
		 *  Method signature :
		 *	T reduce(T identity, BinaryOperator<T> accumulator)
		 * 
		 * The first argument is the initial value, and it is called identity because strictly speaking, 
		 * this value must be an identity for the accumulator function, 
		 * in other words, for each value v, accumulator.apply(identity, v) must be equal to v.
		 * 
		 */
		int result = IntStream.of(1, 2, 3, 4, 5, 6)
	               .reduce( 4, (sum, n) -> sum + n );  //  4 is identity 
	    System.out.println("Result "+result);               
	    
	    result = IntStream.of(1, 2, 3, 4, 5, 6).reduce(4, Integer::sum);
	    System.out.println("Result "+result);       
	    
	    result = IntStream.of(1, 2, 3, 4, 5, 6).reduce(4, Reduce::addIntData); //Method reference Class:static method
	    System.out.println("Result "+result);     
	    

		
	    /* Notice that this version does not return an Optional object because if the stream empty, the identity value is returned.
	    * However, notice that in the last example, 
	    * the first value cannot be considered an identity (as in the first example) since,
	    * for instance, 4 + 1 is not equal to 4.
		*/
	    
	    /*
	     * However, if you want to return a reduced value of a different type,
	     *  you have to use the three arguments version of reduce():
		 * 
		 * <U> U reduce(U identity,
             BiFunction<U,? super T, U> accumulator,
             BinaryOperator<U> combiner)
	     * 
	     * 
	     */
		int length = Stream.of("Parallel", "streams", "are", "great")
				.reduce(0,
				(accumInt, str) -> {
					System.out.println("accumInt"+accumInt +" str"+str);
					return accumInt + str.length();
					}, // accumulator
				(accumInt1, accumInt2) -> accumInt1 + accumInt2);// combiner
		System.out.println("sum of lenght "+length);
		
		length =
				Stream.of("Parallel", "streams", "are", "great").
				reduce(0,
						(Integer accumInt, String str) -> accumInt + str.length(), // accumulator
						(Integer accumInt1, Integer accumInt2) -> accumInt1 + accumInt2);// combiner
		System.out.println("sum of lenght "+length);

		
		List<Integer> list2 = Arrays.asList(2, 3, 4);
		int res = list2.parallelStream().reduce(2, (s1, s2) -> {  //with parallel
				System.out.println("s1 "+s1+" s2 "+s2);
				return s1 * s2; 
				},
			(p, q) -> { 
				System.out.println("p"+p+" q "+q);
				return p + q;
			});
	     System.out.println(res);
	     //Here result will be 2*2 + 2*3 + 2*4 that  is 18. 
	     // for case of parallel will always start with identify and then merge at combiner  
	     
	     List<String> list1 = Arrays.asList("Mohan", "Sohan", "Ramesh");
	      String ans = list1.parallelStream().reduce("-", (s1, s2) -> s1 + s2, (p, q) -> p + q);
	      System.out.println(ans);
	      
	      
	      /*
	       * As the accumulator function adds a mapping (transformation) step to the accumulator function, 
	       * this version of the reduce() can be written as a combination of map() and the other versions of the reduce() method
	       *  (you may know this as the map-reduce pattern):
	       * 
	       */
	      
	  	length =
				Stream.of("Parallel", "streams", "are", "great").mapToInt(s -> s.length()). //Instead use BinaryOperator<U> combiner 
				reduce(0,( p,  q) -> q + p);
		System.out.println("sum of lenght "+length);
		
		length = Stream.of("Parallel", "streams", "are", "great")
                .mapToInt(s -> s.length())
                .sum();//average count max min sum
		
		/*
		 * It's recommended to use the three version reduce() method when:
 		 *
		 * Working with parallel streams 
		 * Having one function as a mapper and accumulator is more efficient than having separate mapping and reduction functions.
		 * 
		 */
		
	}
	
	
	public static int addIntData(int num1, int num2) {
		return num1 + num2;
	}

}
