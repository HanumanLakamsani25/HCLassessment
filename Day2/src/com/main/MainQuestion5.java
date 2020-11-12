package com.main;

import java.util.Scanner;

import com.pojo.Total;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainQuestion5 {

	public static void main(String[] args) {
		System.out.println("Enter three numbers to add :");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		scanner.nextLine();
		int num2 = scanner.nextInt();
		scanner.nextLine();
		int num3 = scanner.nextInt();
		scanner.nextLine();
		Total total = new Total();
		System.out.println("Sum of " + num1 + ", " + num2 + ", " + num3 + " is :" + total.add(num1, num2, num3));

		System.out.println("Employee total salary :" + total.totalSalary());
		scanner.close();
		total = null;
	}

}
