package com.wealth.certificate.dumps_1z0_809_ps.question076;

public class X implements Z{
	public String toString(){
		return "X ";
	}
	public static void main(String[] args){
		Y myY = new Y();
		X myX = myY;
		Z myZ = myX;
		System.out.print(myX);
		System.out.print((Y)myX);
		System.out.print(myZ);
	}
}

class Y extends X{
	public String toString(){
		return "Y ";
	}
}
