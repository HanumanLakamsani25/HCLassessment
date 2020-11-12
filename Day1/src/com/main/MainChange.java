package com.main;

import java.util.Scanner;

import com.pojo.Change;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainChange {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Start Value: ");
		int start=scanner.nextInt();
		
		System.out.println("End Value: ");
		int end=scanner.nextInt();

		Change change=new  Change();
		change.FizzBuzz(start, end);
		
		change=null;
		scanner =null;
	}

}
