package com.main;

import com.pojo.A1;
import com.pojo.B;
import com.pojo.C;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class OOPSExcercise1 {

	static int a = 555;

	public static void main(String[] args) {
		A1 objA = new A1();
		B objB1 = new B();
		B objB2 = new B();
		C objC1 = new C();
		B objC2 = new C();
		A1 objC3 = new A1();
		objA.display();//a=100 
		objB1.display();//a=123
		objB2.display();//a=123
		objC1.display();//a=543
		objC2.display();//a=543
		objC3.display();//a=543
	}

}
