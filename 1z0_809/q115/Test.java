package com.wealth.certificate.dumps_1z0_809.question115;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	private static final Predicate<? super Integer> predicate = null;

	public static void main(String[] args) {
		Stream<List<String>> iStr= Stream.of (
		Arrays.asList ("1", "John"),
		Arrays.asList ("2", null));
		Stream<String> nInSt = iStr.flatMapToInt ((x) -> x.stream());
		nInSt.forEach (System.out :: print);
		
		//IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper); 
		/*Stream<String> nInSt = iStr.map(x -> x.toString());*/
		
		/*Stream<List<Integer>> iInt= Stream.of(Arrays.asList(1,2,3), Arrays.asList(44,55,66));
		iInt.flatMapToInt(x -> x.stream().filter(z -> z.intValue()%2==0).mapToInt(z->z)).forEach(System.out :: println);*/
	}
	
}