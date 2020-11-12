package com.main;

import java.util.Scanner;

import com.pojo.Calculator;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainCalculator {
  public static void main(String[] args)
  {
	  Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first number: ");
		scanner.nextInt();
		System.out.print("Enter second number: ");
		scanner.nextInt();
	  Calculator calculator = new Calculator();
	  
	  System.out.println("Addition :"+ calculator.Addition());
	  System.out.println("Substraction :"+ calculator.Subtract());
	  System.out.println("Multiply :"+ calculator.Multiply());
	  System.out.println("Division :"+ calculator.Divide());
	  System.out.println("Remainder :"+ calculator.Remainder());	 
	  scanner=null;
	  calculator=null;
  }
  
}
