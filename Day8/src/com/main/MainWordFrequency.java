
package com.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.service.WordFrequency;

/**
 * 
 * 
 * @author HanumanL
 *
 */
public class MainWordFrequency {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of words:");
		int count = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter strings to be searched :");

		WordFrequency frequency = new WordFrequency();
		String[] patterns = new String[count];
		for (int i = 0; i < count; i++) {
			patterns[i] = scanner.nextLine();
		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.println("Word " + patterns[i] + " " + frequency.wordFrequency(patterns[i]));
			} catch (FileNotFoundException e) {
				System.err.println(e);
			} catch (IOException e) {
				System.err.println(e);
			}
		}
		scanner.close();
	}

}
