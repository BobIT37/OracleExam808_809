package com.wealth.certificate.dumps_1z0_809_vce.question021;

public class Vehicle{
//public class Vehicle implements Comparable<Vehicle>{ 
	int vno;
   	String name;
	
	public Vehicle (int vno, String name){
		this.vno = vno;
		this.name = name;
	}
	public String toString(){
		return vno + ":" + name;
	}
	/*@Override
	public int compareTo(Vehicle o) {
		return vno - o.vno;
	}*/
}
