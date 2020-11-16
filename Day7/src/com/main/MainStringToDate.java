
package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author HanumanL
 *
 */
public class MainStringToDate {
	public static void main(String[] args) throws ParseException {
		System.out.println("Enter the date in dd/MM/yyyy HH:mm:ss");
		Scanner scanner = new Scanner(System.in);
		String dateString = scanner.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = dateFormat.parse(dateString);
		System.out.println("Date & time from given string is :"+date);
		scanner.close();
	}

}
