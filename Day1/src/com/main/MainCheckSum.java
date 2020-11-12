package com.main;

/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
import java.util.Scanner;

import com.pojo.CheckSum;

public class MainCheckSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long number = scanner.nextLong();

		int result = CheckSum.checkSum(number);
		if (result == 1) {
			System.out.println("Odd digit sum is odd");
		} else {
			System.out.println("Odd digit sum is even");
		}
	}

}
