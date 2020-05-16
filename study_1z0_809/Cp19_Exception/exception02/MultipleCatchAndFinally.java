package com.wealth.certificate.study_1z0_809.chapter19.exception02;

public class MultipleCatchAndFinally {

	public static void main(String[] args) {
		MultipleCatchAndFinally multi1 = new MultipleCatchAndFinally();
		multi1.doSomething();

	}

	void doSomething() {
		try {
			int a[] = new int[5];
			a[5] = 30 / 3;
		/*}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());*/
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e /*| Exception e*/) {
			 //if(e instanceof ArithmeticException) {  //-> can use instanceof check exception type
			        // Do something else if the exception type
			        // is ArithmeticException
					//e = new ArithmethicException("My Exception"); // Compile-time error, variable is treated as final, can't reassign
			   // }
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e = new Exception("My Exception"); // It compiles!
			System.out.println(e.getMessage());
		}finally{
			System.out.println("finally");
		}
		System.out.println("rest of the code...");
	}

}
