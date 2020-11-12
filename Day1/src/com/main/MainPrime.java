package com.main;

import java.util.Scanner;

import com.pojo.Prime;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainPrime {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number=scanner.nextInt();
		
		Prime prime=new Prime();
		boolean flag=prime.Check(number);
		
		if(flag) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is not Prime");
		}

		prime=null;
		scanner=null;
	}

}
