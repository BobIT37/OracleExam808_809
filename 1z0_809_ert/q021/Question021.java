package com.wealth.certificate.dumps_1z0_809_ert.question021;

import java.nio.file.*;

public class Question021 {

	public static void main(String[] args) {
		//Path iP = new Paths("/First.txt");	// A
		//Path iP = new Path("/First.txt");		// B
		Path iP = Paths.get("/", "First.txt");	// C
		//Path iP = Paths.toPath("/First.txt");	// D
		System.out.println(iP) ;
	}
}
