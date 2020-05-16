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
		
		//เมื่อไหร่ก็ตามที่เราทำการ override equals() แล้ว เราต้องทำการ override hashCode() ด้วยเสมอ 
		//ทุก object ที่เหมือนหรือเท่ากันจากการทดสอบด้วย equals() จะต้องมีค่า hash code เท่ากันเสมอ
		//ซึ่งเมื่อลองปริ้นค่า hashcode ของ sb และ s ออกมาแล้วมีค่าไม่เท่ากันเมื่อใช้ .equals จึงทำให้เงื่อนไขเป็นเท็จ
		
		
		
		
	}

}
