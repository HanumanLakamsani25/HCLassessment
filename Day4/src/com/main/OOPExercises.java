package com.main;

import com.pojo.A;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class OOPExercises {
	public static void main(String[] args) {
		A objA = new A();
		System.out.println("in main(): ");
		System.out.println("objA.a = " + objA.getA());// We can't access as the variable is given with private access modifier
		objA.setA(222);// We can't able to give because a is private
						// we can do it by calling the setter function obj.setA()
	}
}
