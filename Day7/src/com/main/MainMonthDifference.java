
package com.main;

import java.text.ParseException;
import java.util.Scanner;

import com.service. MonthDifference ;

/**
 * 
 * @author HanumanL
 *
 */
public class MainMonthDifference {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Date1 :");
		String date1 = scanner.nextLine();
		System.out.println("Enter Date2 :");
		String date2 = scanner.nextLine();
		try {
			System.out.println("Difference months between the dates :" +  MonthDifference .getMonthDifference(date1, date2));
		} catch (ParseException e) {
			System.err.println(e);
		}
		scanner.close();
	}

}
