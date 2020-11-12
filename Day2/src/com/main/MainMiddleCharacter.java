package com.main;

import java.util.Scanner;


import com.pojo.Character;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainMiddleCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("Middle character of " + string + " is :" +Character.middleValue(string));
		scanner.close();
	}

}
