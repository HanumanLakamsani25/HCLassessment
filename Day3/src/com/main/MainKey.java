package com.main;

import java.util.Scanner;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */

import com.pojo.Key;

public class MainKey {

	private static int search;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values");
		int[] integers = new int[10];
		for (int i = 0; i < 10; i++) {
			integers[i] = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("Key Value");
		setSearch(scanner.nextInt());
		int position = Key.search(integers,-1);
		if (position == -1) {
			System.out.println("Key not found");
		} else {
			System.out.println(" Key found at: " + position);
		}
		scanner.close();
	}
 static int getSearch() {
		return search;
	}

	public static void setSearch(int search) {
		MainKey.search = search;
	}

}
