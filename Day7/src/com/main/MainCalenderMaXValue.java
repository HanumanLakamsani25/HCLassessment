package com.main;

import java.util.Calendar;
/*
 * 
 * @author HanumanL
 * 
 */
public class MainCalenderMaXValue {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Current date and time :" + calendar.getTime());
		System.out.println("Maximum year from current date :" + calendar.getActualMaximum(Calendar.YEAR));
		System.out.println("Maximum month from current date :" + calendar.getActualMaximum(Calendar.MONTH));
		System.out.println("Maximum week from current date :" + calendar.getActualMaximum(Calendar.WEEK_OF_YEAR));
		System.out.println("Maximum date from current date :" + calendar.getActualMaximum(Calendar.DATE));
	}
}
