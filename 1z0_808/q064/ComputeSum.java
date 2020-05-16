package com.wealth.certificate.dumps_1z0_808.question064;

public class ComputeSum {
	public int x;
	public int y;
	private int sum; //private
	public ComputeSum (int nx, int ny) {
		x = nx; y =ny;
		updateSum();
	}
	private void setX(int nx) { x = nx; updateSum();} //private
	private void setY(int ny) { x = ny; updateSum();} //private
	private void updateSum() { sum = x + y;} //private
}


//class testCallFieldSum{
//	public static void main(String[] args) {
//		ComputeSum test = new ComputeSum(1,2);
//	} 
//}
