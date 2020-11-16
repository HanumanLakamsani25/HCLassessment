
package com.main;

import java.util.Scanner;

import com.service.UserMainCode;

/**
 * 
 * @author HanumanL
 *
 */
public class MainQuestion6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year :");
		int year = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the month code :");
		int monthCode = scanner.nextInt();
		System.out.println(
				"Number of  days in that particular month is :" + UserMainCode.getNumberOfDays(year, monthCode));
		scanner.close();
	}

}
