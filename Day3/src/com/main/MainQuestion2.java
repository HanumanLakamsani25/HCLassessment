package com.main;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */

import java.util.Scanner;

import com.pojo.Question2;

public class MainQuestion2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		scanner.close();
		Question2 question2 = new Question2();
		question2.replace(string);

	}
}
