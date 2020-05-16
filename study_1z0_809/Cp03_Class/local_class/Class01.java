package com.wealth.certificate.study_1z0_809.chapter03.local_class;

//Local Class
public class Class01 {
	public static void main(String[] args) {
		Computer c = new Computer();
		c.process(0);
	}
}

class Computer {
	private String serialNumber = "1234XX";
	{
		serialNumber = "xxx";
	}

	void process(int n) { // if n doesn't change and it will be considered effectively final
		serialNumber = new String("3333XX");
		final String taskName = "Task #1"; // final
		int taskId = 1; // Effectively final
		StringBuffer taskName2 = new StringBuffer("Task #2");

		// Effectively final is only concerned with references, not objects or their
		// content,
		// because at the end of the day, we are referencing the same object.
		taskName2.append("1"); // This is valid!
		// Uncommenting the following line will generate an error
		// taskName = new StringBuffer("Task #2");

		// Local classes can only be used inside the method or block that defines them
		class Core {
		}
		// The local class has to be used BELOW its definition.
		// Otherwise, the compiler won't be able to find it.
		Core core = new Core();

		class Processor {
			// can access the members of the enclosing class,
			// but they cannot declare static members (only static final attributes),
			// just like inner classes.
			Processor() {
				System.out.println("Processor #1 of computer " + serialNumber);

				System.out.println("Processor " + n + " processing " + taskName + " id " + taskId);

				System.out.println(taskName2);
			}
			
			void method1() {}
		}
		
		Processor p1 = new Processor();
		serialNumber = "4444XX";
		Processor p2 = new Processor();
	}

	void method() {
		// CANNOT be declared with an access level
		// local class can be declared as abstract or final (but not at the same time).
		abstract class MethodAbstractLocalClass {
		}

		final class MethodFinalLocalClass extends MethodAbstractLocalClass {
		}

		class MethodLocalClass {
		}

		MethodLocalClass mlc = new MethodLocalClass();
		if (1 == 1) {
			class IfLocalClass {
			}

			IfLocalClass ilc = new IfLocalClass();
		}

	}

	static void staticMethod() {
		
		class MethodLocalClass {
			
		}
	}
}

/*
The methods in an anonymous class don't really have access to local variables and method parameters. 
Rather, when an object of the anonymous class is instantiated, copies of the final local variables 
and method parameters referred to by the object's methods are stored as instance variables in the object. 
The methods in the object of the anonymous class really access those hidden instance variables.
*/