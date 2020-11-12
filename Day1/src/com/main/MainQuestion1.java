package com.main;
import java.util.Scanner;

import com.pojo.Question1;

/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainQuestion1 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter values : ");
		int value1=scanner.nextInt();
		int value2=scanner.nextInt();
		int value3=scanner.nextInt();
		
		Question1 question1 = new Question1();
		System.out.println(question1.A(value1, value2, value3));
		
	value1=scanner.nextInt();
		value2=scanner.nextInt();
		value3=scanner.nextInt();
		System.out.println(question1.B(value1, value2, value3));
		
		
		value1=scanner.nextInt();
		value2=scanner.nextInt();
		value3=scanner.nextInt();
		int value4=scanner.nextInt();
		System.out.println(question1.C(value1, value2, value3, value4));
		
		value1=scanner.nextInt();
		value2=scanner.nextInt();
		value3=scanner.nextInt();
		value4=scanner.nextInt();
		int value5=scanner.nextInt();
		int value6=scanner.nextInt();
		System.out.println(question1.D(value1, value2, value3, value4, value5, value6));
		
		question1=null;
		scanner.close();

	}

}
