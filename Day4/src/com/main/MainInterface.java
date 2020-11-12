package com.main;

import java.util.Scanner;

import com.pojo.Calculator;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainInterface {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.nextLine();
		Calculator calculator = new Calculator();
		System.out.println("Sum of factors of " + num + " :" + calculator.divisor_sum(num));
		scanner.close();
		calculator = null;
		
	}

}
