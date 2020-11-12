package com.main;

import java.util.Scanner;

import com.pojo.AscValue;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainAsc {


		public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("character: ");
			char c=scanner.next().charAt(0);
			AscValue ascValue= new AscValue();
			int result = ascValue.Value(c);
			
			System.out.println("Ascii value of "+ c +" character is: "+ result);
			
			ascValue=null;
			scanner =null;
		}
		}

