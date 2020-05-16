package com.wealth.certificate.dumps_1z0_809_vce.question050;

class FuelNotAvailException extends Exception { }
class Vehicle {
	void ride() throws FuelNotAvailException { //line n1  //B. Replace line n1 with protected void ride() throws Exception {
		System.out.println("Happy Journey!");
	}
}
class SolarVehicle extends Vehicle {
	public void ride() throws Exception { //line n2
		super.ride();
	}
}
//A. Replace line n1 with public void ride() throws FuelNotAvailException {
//B. Replace line n1 with protected void ride() throws Exception {
//C. Replace line n2 with void ride() throws Exception {
//D. Replace line n2 with private void ride() throws FuelNotAvailException {

public class Question050 {
	public static void main (String[] args) throws FuelNotAvailException, Exception {
		Vehicle v = new SolarVehicle ();
		v.ride();
	}
}
