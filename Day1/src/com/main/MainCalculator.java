package com.main;

import com.pojo.Calculator;

public class MainCalculator {
  public static void main(String[] args)
  {
	  Calculator calculator = new Calculator();
	  calculator.setNum1(20);
	  calculator.setNum2(4);
	  System.out.println("Addition :"+ calculator.Addition());
	  System.out.println("Substraction :"+ calculator.Subtract());
	  System.out.println("Addition :"+ calculator.Multiply());
	  System.out.println("Addition :"+ calculator.Division());
	  System.out.println("Addition :"+ calculator.Remainder());	  
  }
  
}
