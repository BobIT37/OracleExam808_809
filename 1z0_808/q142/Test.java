package com.wealth.certificate.dumps_1z0_808.question142;

import java.util.ArrayList;
import java.util.List;

class Alpha {
	public String doStuff(String msg) {
		return msg;
	}
}

class Beta extends Alpha {
	public String doStuff(String msg) {
		return msg.replace('a', 'e');
	}
}

class Gamma extends Beta {
	public String doStuff(String msg) {
		return msg.substring(2);
	}
}

public class Test {
	public static void main(String[] args) {
		List<Alpha> strs = new ArrayList<Alpha>();
		strs.add(new Alpha());
		strs.add(new Beta());
		strs.add(new Gamma());
		for (Alpha t : strs) {
			System.out.println(t.doStuff("Java"));
		}
	}
}

/*
What is the result?
A.	Java
	Java
	Java
B. 	Java
	Jeve
	va
C. 	Java
	Jeve
	ve
D. 	Compilation fails

 */
//Answer: B
/*
Explanation:
new Alpha()	>> Java
new Beta()	>> Jeve
new Gamma()	>> va


 */

