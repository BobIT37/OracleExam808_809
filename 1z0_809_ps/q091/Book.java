package com.wealth.certificate.dumps_1z0_809_ps.question091;

public class Book {
	int id;
	String name;

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public boolean equals(Object obj) { //line n1
		boolean output = false;
		Book b = (Book) obj;
		if (this.name.equals(b.name)) {
			output = true;
		}
		return output;
	}
	
}



