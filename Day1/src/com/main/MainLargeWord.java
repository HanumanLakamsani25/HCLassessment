package com.main;

	import java.util.Scanner;

import com.pojo.LargeWord;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
	public class MainLargeWord {

		public static void main(String[] args) {

			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter a sentence: ");
			String word=scanner.nextLine();

			LargeWord largeWord=new LargeWord();
			String result= largeWord.getLargeWord(word);
			
			System.out.println("Largest Word: "+result);
			
			largeWord=null;
			scanner=null;
		}

	}
