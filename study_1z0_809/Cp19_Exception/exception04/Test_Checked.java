package com.wealth.certificate.study_1z0_809.chapter19.exception04;

public class Test_Checked {

	public String findByName(String name) throws CustomerException_Checked {
		if ("".equals(name)) {
			throw new CustomerException_Checked("String is empty!");
		}
		return "String not empty";

	}

	public static void main(String[] args) {
		Test_Checked obj = new Test_Checked();
		try {
			String str = obj.findByName("");

		} catch (CustomerException_Checked e) {
			e.printStackTrace();
		}

	}

}
