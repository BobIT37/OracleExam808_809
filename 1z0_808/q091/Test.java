package com.wealth.certificate.dumps_1z0_808.question091;

public class Test {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5); //initial capacity specified by the capacity argument;
		String s ="";
		
		
		
		if(sb.equals(s)){ 
			System.out.println("Match 1");
		}else if (sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		}else{
			System.out.println("No Match");
		}
		
		//System.out.println(sb.hashCode());
		//System.out.println(s.hashCode());
		//System.out.println(s.hashCode() == sb.hashCode());
		
		//�����������������ҷӡ�� override equals() ���� ��ҵ�ͧ�ӡ�� override hashCode() �������� 
		//�ء object �������͹������ҡѹ�ҡ��÷��ͺ���� equals() �е�ͧ�դ�� hash code ��ҡѹ����
		//���������ͧ���鹤�� hashcode �ͧ sb ��� s �͡�������դ�������ҡѹ������� .equals �֧��������͹�����
		
		
		
		
	}

}
