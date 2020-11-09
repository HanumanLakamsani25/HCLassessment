package com.main;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */


import java.util.Scanner;
import com.pojo.Substring;



public class MainSubstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the String");
		String string = scanner.nextLine();
		System.out.println("Enter two indices(integers)");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		scanner.close();
		System.out.println("Given String is: " + string);
		System.out.println("The substring is: " + Substring.substrings(string, start, end));

	}

}
