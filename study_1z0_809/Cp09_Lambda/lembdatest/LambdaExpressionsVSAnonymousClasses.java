package com.wealth.certificate.study_1z0_809.chapter09.lembdatest;

import java.io.FileNotFoundException;
import java.io.IOException;

@FunctionalInterface
interface MyException {
	public void getException() throws FileNotFoundException;
}

@FunctionalInterface
interface AnInterface {
    default int aMethod() { return 0; }
    int anotherMethod();
}

public class LambdaExpressionsVSAnonymousClasses implements AnInterface {
	static boolean testinstance  = false;
	
	public static void main(String[] args) {
		/////////////////////////////=== lambda expressions VS Anonymous classes ===
	    
    	/////////////---They have some similarities:
    	/////// Local variables (variables or parameters defined in a method) can only be used if they are declared final or are effectively final.
	    //Anonymous classes
		boolean test = false;
		Searchable search = new Searchable() {
			@Override
			public boolean test(Car car) {
				return test; //compilation Error
			}
		};
		test = true;
		
		//Lambda expressions
		boolean test1 = false;
		Searchable search1 = c -> {return test1;}; //compilation Error
		test1 = true;
		
		/////// You can access instance or static variables of the enclosing class.
		//Anonymous classes
		/*Searchable search2 = new Searchable() {
			@Override
			public boolean test(Car car) {
				return testinstance;
			}
		};
		testinstance = true;
		
		//Lambda expressions
		Searchable search3 = c -> {return testinstance;};
		testinstance = true;*/
		
		///////  They must not throw more exceptions than specified in the throws clause of the functional interface method. Only the same type or a supertype.
		//Anonymous classes
		/*try {
			getException(new MyException() {
				@Override
				public void getException() throws FileNotFoundException {
					throw new FileNotFoundException();
				}
			});
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//Lambda expressions
		try {
			getException( () -> {throw new FileNotFoundException();} );
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		/////////////--- And some significant differences:
		/////// Scoping
		//Anonymous classes
		/*final int cnt = 0; 
		Runnable r = new Runnable() {
			@Override
			public void run() {
				int cnt = 5;	
				System.out.println("in run" + cnt);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		//Lambda expressions
		final int cnt1 = 0; 
		Runnable r1 = ()->{
			int cnt1 = 5; //compilation error
			System.out.println("in run"+cnt1);};
		Thread t1 = new Thread(r);
		t1.start();*/

		//Default methods of a functional interface cannot be accessed from within lambda expressions. Anonymous classes can.
		//Anonymous classes
		/*AnInterface aa = new AnInterface() {
			@Override
			public int anotherMethod() {
				return 1;
			}
			
			public int aMethod(){
				return 1;
			}
		};
		
		//Lambda expressions
		AnInterface a1 = () -> aMethod(); //Lambda not access default aMethod() in Function Interface
        System.out.println(a1.anotherMethod());*/

	}
	
	@Override
    public int anotherMethod() {
        return 1;
    }
	 
	private static void getException(MyException ex) throws FileNotFoundException{
		ex.getException();
	}

}
