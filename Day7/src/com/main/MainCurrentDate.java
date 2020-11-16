
package com.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author HanumanL
 *
 */
public class MainCurrentDate {

	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime date = LocalDateTime.now();
		System.out.println("Date & Time:"+dateTimeFormatter.format(date));
		dateTimeFormatter = null;
		date = null;
	}

}
