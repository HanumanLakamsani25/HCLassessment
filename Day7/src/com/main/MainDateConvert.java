
package com.main;

import java.text.ParseException;
import java.util.Scanner;

import com.service.DateConvert;

/**
 * 
 * @author HanumanL
 *
 */
public class MainDateConvert {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date :");
		String date = scanner.nextLine();
		try {
			System.out.println("New Date :" +DateConvert.dateConvert(date));
		} catch (ParseException e) {
			System.err.println(e);
		}
		scanner.close();
	}

}
