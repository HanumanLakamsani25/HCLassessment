
package com.main;

import java.util.Scanner;

import com.service.NoOfDays;



/**
 *
 * 
 * @author HanumanL
 *
 */
public class MainNoOfDays {

	
	public static void main(String[] args) {
		System.out.println("Enter year :");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter month to find number of days in that month :");
		int month = scanner.nextInt();
		System.out.println("Number of days =" + new NoOfDays().getDays(year, month));
		scanner.close();
	}

}