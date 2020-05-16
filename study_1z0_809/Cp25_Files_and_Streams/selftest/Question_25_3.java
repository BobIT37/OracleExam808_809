package com.wealth.certificate.study_1z0_809.chapter25_Files_and_Streams.selftest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Question_25_3 {

	public static void main(String[] args) throws IOException {
		Files.walk(Paths.get(".")).filter(p -> p.toString().endsWith("txt"));

		// A.
		Files.list(Paths.get(".")).filter(p -> p.toString().endsWith("txt"));

		// B.
		Files.find(Paths.get("."), (p, a) -> p.toString().endsWith("txt"));

		// C.
		Files.find(Paths.get("."), Integer.MAX_VALUE, p -> p.toString().endsWith("txt"));

		// D.
		Files.find(Paths.get("."), Integer.MAX_VALUE, (p, a) -> p.toString().endsWith("txt"));

	}

}
/*
3. Which of the following options is equivalent to
Files.walk(Paths.get("."))
.filter(p -> p.toString().endsWith("txt"));

A.
Files.list(Paths.get("."))
.filter(p -> p.toString().endsWith("txt"));

B.
Files.find(Paths.get("."),
(p,a) -> p.toString().endsWith("txt"));

C.
Files.find(Paths.get("."), Integer.MAX_VALUE,
 p -> p.toString().endsWith("txt"));

D.
Files.find(Paths.get("."), Integer.MAX_VALUE,
(p,a) -> p.toString().endsWith("txt"));

Answer D
Option A is not equivalent. Files.list() doesn't traverse subdirectories recursively.
Option B is not equivalent. Files.find() is missing the max depth argument.
Option C is not equivalent. The last argument must be a BiPredicate.
*/