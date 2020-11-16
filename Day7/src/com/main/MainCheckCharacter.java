
package com.main;

import java.util.Scanner;

import com.service.CheckCharacters;

/**
 * @author HanumanL
 *
 */
public class MainCheckCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String inputString = scanner.nextLine();
		if (CheckCharacters.checkCharactersValue(inputString) == 1) {
			System.out.println("String is Valid");
		} else {
			System.out.println("String is InValid");
		}
		scanner.close();
		inputString = null;
	}

}
