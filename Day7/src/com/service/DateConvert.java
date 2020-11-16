
package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author HanumanL
 *
 */
public class DateConvert {
	public static String dateConvert(String date1) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse(date1);
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
		return dateFormat2.format(date).toString();
	}
}
