package com.wealth.certificate.dumps_1z0_809.question079;

public interface Moveable<Integer> {
	
	public default void walk(Integer distance) {System.out.println("Walking");}

	public void run(Integer distance);
	
	//public Integer run(Integer distance);
}