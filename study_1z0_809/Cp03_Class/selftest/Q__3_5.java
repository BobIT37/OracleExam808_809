package com.wealth.certificate.study_1z0_809.chapter03.selftest;

class A {
	class B {
		class C {
			void go() {
				System.out.println("go!");
			}
		}
	}
}

public class Question_3_5 {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new A.B(); // 1
		B.C c = b.new C(); // 2
		c.go(); // 3
	}
}

/*
What is the result?
A. Compilation first fails on the line // 1
B. Compilation first fails on the line // 2
C. Compilation fails on the line // 3
D. go! is printed


The correct answer is A.
This program first fails on the line marked as // 1 
because when instantiating an inner class from outside its enclosing class, 
you don't use its compound name (in this case A.B) on the right side of the statement. 
So instead of:
	A.B b = a.new A.B();

It's just:
	A.B b = a.new B();

If you want to call method go(), the correct code is:
	A a = new A();
	A.B bb = a.new B();
	A.B.C cc = bb.new C();
	cc.go();

*/