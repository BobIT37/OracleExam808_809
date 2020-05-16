package com.wealth.certificate.dumps_1z0_808.question022.answerthequestion;

interface Foo {  void dispaly();}
interface Too {  void dispaly();}
abstract class Woo implements Foo,Too{}

public class AnonymousGetClass {
	public static void main(String[] args) throws Exception{
	    Foo obj = new Foo(){
	        @Override
	        public void dispaly() {System.out.println("msg");}      
	    };
	    Too obj2 = new Too(){
	        @Override
	        public void dispaly() {System.out.println("msg2");}      
	    };
	    Foo obj3 = new Woo(){
			@Override
			public void dispaly() {System.out.println("msg3");}
	    	
	    };
	 System.out.println(obj.getClass());// ...AnonymousGetClass$1
	 System.out.println(obj2.getClass());// ...AnonymousGetClass$2
	 System.out.println(obj3.getClass());// ...AnonymousGetClass$3
	 //obj.dispaly(); // result: msg  
	 //obj2.dispaly(); // result: msg2  
	}
}
