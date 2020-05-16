package com.wealth.certificate.study_1z0_809.chapter03.anonymous_class;

//Anonymous class
//anonymous classes are a type of local classes, they have the same rules:   
//	- They can access the members of their enclosing class    
//	- They cannot declare static members (only if they are final static variables)   
//	- They can only access local variables (variables or parameters defined in a method) if they are final or effectively final.
public class Class01 {
	public static void main(String[] args) {
		// The new operator is followed by the name of an interface or a class and the
		// arguments to a constructor
		Computer comp = new Computer() {
			final static int i = 0;
			{
				//can't have CONSTRUCTORS. 
				//If you want to run some initializing code, you have to do it with an initializer block.
				
			}
			void process() {
				// Here goes the definition
			}
			
			void newMethod() {
				
			}

		};
		comp.process();
		//comp.newMethod();	// Compile-time error! because it's not defined in the superclass.
	}
}

class Computer {
	void process() {

	}
}

class Program {
	void start(Computer c) {
		// Definition goes here
	}

	public static void main(String args[]) {
		Program program = new Program();
		
		//An anonymous class can be used in a declaration or a method call.
		program.start(new Computer() {
			void process() {
				/** Redefinition goes here */
			}
		});
	}
}