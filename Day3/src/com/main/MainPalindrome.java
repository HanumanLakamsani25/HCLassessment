package com.main;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */

import java.util.Scanner;

import com.pojo.Palindrome;

public class MainPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		scanner.close();
		Palindrome palindrome = new Palindrome();

		palindrome.palindrome(string);
	}

}
