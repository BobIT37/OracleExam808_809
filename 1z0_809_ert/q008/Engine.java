package com.wealth.certificate.dumps_1z0_809_ert.question008;

public class Engine {
	int fuelLevel;
	
	Engine(int fuelLevel) { this.fuelLevel = fuelLevel; }
	
	public void start() {
		//line n1
		//assert (fuelLevel) : "Terminating…";	// A	Type mismatch: cannot convert from double to boolean
		//assert fuelLevel < 0 : System.exit(0);	// B	Expression must return a value
		//assert (fuelLevel) > 0) : System.out.println("Impossible fuel");	//C	Expression must return a value
		assert fuelLevel > 0 : "Impossible fuel";	//D
		
		System.out.println("Started");
	}
	
	public void stop() { System.out.println("Stopped"); }
	
	public static void main(String[] args) {
		Engine eng = new Engine(0);
		eng.start();
	}
}
