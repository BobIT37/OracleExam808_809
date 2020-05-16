package com.wealth.certificate.dumps_1z0_809_ert.question064;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question064 {

	public static void main(String[] args) {
		List<Country> couList = Arrays.asList(
		new Country("Italy", Country.Continent.EUROPE),
		new Country("Japan", Country.Continent.ASIA),
		new Country("Germany", Country.Continent.EUROPE));
		Map<Country.Continent, List<String>> regionNames = couList.stream()
				.collect(Collectors.groupingBy(Country:: getRegion,
						Collectors.mapping(Country::getName, Collectors.toList())));
		System.out.println(regionNames);
		// Output 
		// {EUROPE=[Italy, Germany], ASIA=[Japan]}
	}
	
}
