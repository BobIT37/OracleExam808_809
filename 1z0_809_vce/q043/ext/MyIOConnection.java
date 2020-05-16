package com.wealth.certificate.dumps_1z0_809_vce.question043.ext;

import java.io.IOException;

public class MyIOConnection implements java.io.Closeable {

	public static void main(String[] args) {
		try (MyIOConnection con = new MyIOConnection()) {
			System.out.println("To do someting");
			throw new RuntimeException();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("To do finally");
		}

	}

	@Override
	public void close() throws IOException {
		throw new IOException("Close exception");
	}

}
