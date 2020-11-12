package com.main;

import java.util.Scanner;

import com.pojo.EvenSquare;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainEvenSquare {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = scanner.nextInt();

		EvenSquare evenSquare = new EvenSquare();
		int result = evenSquare.EvenSum(number);

		System.out.println("Squares of even digits is: " + result);
	}

}
