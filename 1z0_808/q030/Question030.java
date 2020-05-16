package com.wealth.certificate.dumps_1z0_808.question030;

//Referencs for choice D
//http://www.developer.com/java/other/article.php/3109251/Stopping-Your-Class-from-Being-Inherited-in-Java-the-Official-Way-and-the-Unofficial-Way.htm

public final class Question030 {

}
 
class Question030Extends extends Question030 { // Cannot extends final class
	
}

//---------------------------------------------------------------------
class PrivateTest{
	private PrivateTest() {
		System.out.println("Private Default Constructor");
	}

	public static PrivateTest getInstance() {
		return new PrivateTest();
	}

}

public class PrivateTest2 extends PrivateTest{


}