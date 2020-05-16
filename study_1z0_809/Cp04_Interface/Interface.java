package com.wealth.certificate.study_1z0_809.chapter04_Interface;

interface Monitorable {
    int ID = 0; // You have to assign a value at creation time
    //int TIMEOUT; // It's final, so you have to provide a value
    //private int IDprivate = 0; // It cannot be private
    void monitor();

}
class Resource implements Monitorable {
    void change() {
       //ID = 5; // This WON'T compile
    }

	public void monitor() {
	}
}

interface Pluggable {
    void plug();
}

//an interface can only extend other interfaces.
interface Resource2 extends Monitorable, Pluggable {     
	void printInfo();
}
