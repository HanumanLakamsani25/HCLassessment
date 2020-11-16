
package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author HanumanL
 *
 */
public class CompareDates {
	public static String findOldDate(String date1, String date2) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date3 = dateFormat.parse(date1);
		Date date4 = dateFormat.parse(date2);
		if (date3.compareTo(date4) > 0) 
		{
			return date2;
		} else {
			return date1;
		}
	}
}
