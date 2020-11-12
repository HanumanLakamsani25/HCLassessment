package com.main;

import com.pojo.Swap;
import java.util.Scanner;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainSwap {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter num1:");
		scanner.nextInt();
		
		System.out.print("Enter num2: ");
		scanner.nextInt();
		
		Swap swap=new Swap();
		int[] swapvalues=swap.swap();
		System.out.println("After swapping the values are: "+ swapvalues[0]+" "+ swapvalues[1]);
		
		swap=null;
		scanner =null;
	}
}

