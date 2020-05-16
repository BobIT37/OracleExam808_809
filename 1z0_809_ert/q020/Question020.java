package com.wealth.certificate.dumps_1z0_809_ert.question020;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question020 {

	public static void main(String[] args) {
		//line n1 //Which should be inserted into line n1 to print Average = 2.5?
		//A) 
		IntStream str = IntStream.of(1, 2, 3, 4); //2.5
		
		//B) 
		//IntStream str = Stream.of(1, 2, 3, 4); //cannot convert from Stream<Integer> to IntStream
		
		//C) 
		//DoubleStream str = Stream.of(1.0, 2.0, 3.0, 4.0) ; //cannot convert from Stream<Double> to DoubleStream
		
		//D) 
		//Stream str = Stream.of(1, 2, 3, 4) ; //Error Stream not in Method average();
		
		Double d = str.average().getAsDouble();
		//D. Edit -> str.mapToInt(x-> Integer.parseInt(x.toString())).average().getAsDouble();
		System.out.println("Average = " + d);
	}

}
