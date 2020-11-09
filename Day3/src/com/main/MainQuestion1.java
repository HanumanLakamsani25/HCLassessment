package com.main;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */

import java.util.Scanner;

import com.pojo.Question1;

public class MainQuestion1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string value in Upper Case");
		String string = scanner.nextLine();
		scanner.close();
		Question1 question1 = new Question1();
		question1.newString(string);

	}

}
