
package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.service.CompareDates;

/*
 * 
 * @author HanumanL
 *
 */
public class MainComparedates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date1 in the format dd-mm-yyyy:");
		String date1 = scanner.nextLine();
		System.out.println("Enter the date2 in the format dd-mm-yyyy:");
		String date2 = scanner.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date oldestDate;
		try {
			oldestDate = dateFormat.parse(CompareDates.findOldDate(date1, date2));
			System.out.println(
					"Oldest string among the two dates :" + new SimpleDateFormat("MM/dd/yyyy").format(oldestDate));
		} catch (ParseException e) {
			System.err.println(e);
		} finally {
			scanner.close();
			date1 = null;
			date2 = null;
			dateFormat = null;
		}

	}

}
