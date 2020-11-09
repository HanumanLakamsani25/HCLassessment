package com.main;

import com.pojo.Average;

public class MainAverage {

	public static void main(String[] args) {
		Average average = new Average();
		average.setNum1(19);
		average.setNum2(34);
		average.setNum3(98);
		System.out.println("Average :" + average.average());
		
	}
	

}
