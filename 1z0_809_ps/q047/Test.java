package com.wealth.certificate.dumps_1z0_809_ps.question047;

class Env
{
	/*4*/	void doStuff() throws ArithmeticException, NumberFormatException, Exception {
	/*5*/		if(Math.random() > -1) throw new Exception("Try again");
	/*6*/	}
			
			public void Test()
			{
	/*24*/		try {
	/*25*/			doStuff();
	/*26*/		} catch ( ArithmeticException | NumberFormatException | Exception e) {
	/*27*/			System.out.println(e.getMessage());
	/*28*/		} catch (Exception e) {
	/*29*/			System.out.println(e.getMessage());
	/*30*/		}
			}
}

public class Test {

	// using this method for the running purpose only, the real question is above class
	public static void main(String[] args) {
		Env env = new Env();
		env.Test();
	}

}
