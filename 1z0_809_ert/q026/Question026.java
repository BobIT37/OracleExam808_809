package com.wealth.certificate.dumps_1z0_809_ert.question026;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Question026 
{
	public static void main(String[] args)
	{
		Map<Integer, Integer> mVal = new HashMap<>() ;
		mVal.put(1, 10) ;
		mVal.put(2, 20) ;
		
	//line n1
	// A) : The target type of this expression must be a functional interface
		// BiConsumer<Integer, Integer, String> c = (i, j) -> { System.out.print(i + "," + j + " ; " ); } ;
	// B) : The method accept(int, int) is undefined for the type BiFunction<Integer,Integer,String>
		// BiFunction<Integer, Integer, String> c = (i, j) -> { System.out.print(i + "," + j + " ; " ); } ; 
	// C) 
		BiConsumer<Integer, Integer> c = (i, j) -> { System.out.print(i + "," + j + " ; " ); } ;
	// D) : Incorrect number of arguments for type BiConsumer<T,U>; it cannot be parameterized with arguments <Integer, Integer, Integer>
		// BiConsumer<Integer, Integer, Integer> c = (i, j) -> { System.out.print(i + "," + j + " ; " ) ;} ;
		
		c.accept(1, 2) ;
		mVal.forEach(c) ;
		
		/** C is Correct **/
	}
}