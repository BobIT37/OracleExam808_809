package com.wealth.certificate.dumps_1z0_809.question118;

import java.util.function.Predicate;

public interface CourseFilter extends Predicate<String> {
	public default boolean test (String str) {
		return str.equals("Java");
		}
}