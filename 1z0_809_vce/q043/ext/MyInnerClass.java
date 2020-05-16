package com.wealth.certificate.dumps_1z0_809_vce.question043.ext;
class A {
	private int x = 0;
	class B {
		int x = 1;
		class C {
			protected int x = 2;
			public void print() {
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(B.this.x);
				System.out.println(A.this.x);
				System.out.println(A.B.C.this.x);
			}
		}					
	}
}

class X {
	int a = 0;
	static class Y {
		int a = 1;
		class Z {
			int a = 2;
		}
	}
}

public class MyInnerClass {

	public static void main(String[] args) {
		System.out.println("For test something.");
		
		A a = new A();
		A.B b = a.new B();
		A.B.C c1 = b.new C();
		A.B.C c2 = new A().new B().new C();
		c2.print();
		
		X x = new X();
		X.Y y = new X.Y();
		X.Y.Z z = new X.Y().new Z();


		
	}

}
