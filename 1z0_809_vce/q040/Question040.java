package com.wealth.certificate.dumps_1z0_809_vce.question040;

import java.io.IOException;


class Folder implements AutoCloseable { // line n1 // (A)
//class Folder extends Closeable { // line n1 // (B)
//class Folder extends Exception { // line n1 // (C)
	
	// line n2
//	final void close () { // (D)
//		System.out.print("Close");
//	} 
	
	// line n2
	public void close () throws IOException {  // (E)
		System.out.print("Close");
	}
	public void open() {
		System.out.print("Open");
	}
}

public class Question040 {
	public static void main(String[] args) throws Exception {
		try (Folder f = new Folder()) {
			f.open();
		}
	}
}
