package com.main;

import java.util.Scanner;

public class MainQuesti0n1 {

	private static Scanner in;

	public static void main(String[] args) {
		System.out.println("Enter numbers ");
		in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		int num5 = in.nextInt();
		int num6 = in.nextInt();
		int result1 = num1 + num2 * num3;
		int result2 = (num1+num2)%num3;
		int result3 = num1+((num2*num3)/num4);
		int result4 = (num1+num2)/((num3*num4)-(num5%num6));
		System.out.println("Result : " + result1);
		System.out.println("Result : " + result2);
		System.out.println("Result : " + result3);
		System.out.println("Result : " + result4);
		in.close();

	}

}
