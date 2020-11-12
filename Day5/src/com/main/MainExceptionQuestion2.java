package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainExceptionQuestion2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter number1:");
			int num1 = scan.nextInt();
			System.out.println("Enter number2:");
			int num2 = scan.nextInt();
			System.out.println(num1 / num2);
		} catch (ArithmeticException | InputMismatchException e) {
			if (e instanceof ArithmeticException) {
				System.err.println("java.lang.ArithmeticException: / by zero");
			} else if (e instanceof InputMismatchException) {
				System.err.println("java.util.InputMismatchException");
			}
		}
		scan.close();
	}
}
