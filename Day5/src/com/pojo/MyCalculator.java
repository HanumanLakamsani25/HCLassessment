package com.pojo;

import com.main.MainMyCalculator;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MyCalculator {  
	 MainMyCalculator checks = new MainMyCalculator(); 
    long power(int num1, int num2) throws Exception {
        checks.verify(); 
        return (long)Math.pow(num1, num2);
    }
}
