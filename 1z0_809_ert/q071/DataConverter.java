package com.wealth.certificate.dumps_1z0_809_ert.question071;

public class DataConverter /*implements AutoCloseable*/{
	
	public void copyFlatFilesToTables() { }
	public void close() throws Exception {
		throw new RuntimeException(); //line n1
	}

	public static void main(String[] args) /*throws Exception */{ 
		try (DataConverter dc = new DataConverter()) //line n2
			{ dc.copyFlatFilesToTables(); 
		}

	}

}
