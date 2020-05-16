package com.wealth.certificate.dumps_1z0_809_vce.question043.ext;

class OtherConnection {
	
}

public class MyConnection implements AutoCloseable{

	public static void main(String[] args) {
		MyConnection con1 = new MyConnection();
		System.out.println("Open 1 : "+con1);
		
		try(MyConnection con2 = new MyConnection();MyConnection con3 = new MyConnection();MyConnection con4 = con3;MyConnection con5=null){
			System.out.println("Open 2 : "+con2);
			System.out.println("Open 3 : "+con3);
			System.out.println("Open 4 : "+con4);
			System.out.println("Open 5 : "+con5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void close() throws Exception {
		System.out.println("Close : "+this);
	}

}
