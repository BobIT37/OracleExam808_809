package com.wealth.certificate.dumps_1z0_808.question203.p3;

import com.wealth.certificate.dumps_1z0_808.question203.p1.DoInterface;


public class DoClass implements DoInterface {
	public DoClass(int p1) {
	}
	//B.Removing the public modififer from the definittion of method1 at line n2 -> remove �����е�ͧ��С���� public
	public void method1(int p1) {} // line n2 
	
	//C.Changing the private modifier on the declaration of method 2 public at line n3 -> �ѧ complie ����ҹ������� DoInterface ����� method2
	private void method2(int p1) {} // line n3
}

class Test {
	public static void main(String[] args) {
		//D. Changing the line n4 DoClass doi = new DoClass (); -> DoClass ����� constructure ����Ѻ ()
		DoInterface doi = new DoClass(100); // line n4
		doi.method1(100);
		doi.method2(100); //no have method2 in DoInteface 
	}
}
//��Ҩз���� complie ���ͧ��С�� DoClass doi = new DoClass(100); �������¹ private �� public ��� method2