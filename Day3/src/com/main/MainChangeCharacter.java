package com.main;

import java.util.Scanner;

import com.pojo.ChangeCharacter;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public final class  MainChangeCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the string to Change:");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("Change character :");
	     char specialChar = scanner.next().charAt(0);
	     System.out.println("After the modifycations the string became :" + ChangeCharacter.change(string, specialChar));
		scanner.close();
	}

}
