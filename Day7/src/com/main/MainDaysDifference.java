
package com.main;

import java.text.ParseException;
import java.util.Scanner;

import com.service.DaysDifference;
import com.service.UserMainCode;

/**

 * 
 * @author HanumanL
 *
 */
public class MainDaysDifference {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1st Date:");
		String date1 = scanner.nextLine();
		System.out.println("2nd Date");
		String date2 = scanner.nextLine();
		try {
			System.out.println("Number of Days Between 1st Date and 2nd Date :" + DaysDifference.getDateDifference(date1, date2));
		} catch (ParseException e) {
			System.err.println(e);
		}
		
		scanner.close();
	}

}
