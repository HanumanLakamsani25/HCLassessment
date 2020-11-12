package com.main;

import java.util.Scanner;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class  MainMyCalculator {
	Scanner scanner = new  Scanner(System.in);
	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();
	    public void verify() throws Exception {
	        if(num1==0 && num2==0) {
	            throw new Exception("num1 and num2 should not be zero.");
	        } else if(num1<0 || num2<0) {
	            throw new Exception("num1 or num2 should not be negative.");
	        } 
	    }
	}      

