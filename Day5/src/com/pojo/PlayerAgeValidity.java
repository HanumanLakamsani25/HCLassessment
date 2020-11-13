package com.pojo;

import com.service.CheckPlayerEligibility;

/**
 * 
 * @author HanumanL
 * 
 * 
 *
 */
public class PlayerAgeValidity {

	public void validateAndDisplay(String name, int age) throws CheckPlayerEligibility {
		if (age < 19) {
			throw new CheckPlayerEligibility("Not Eligible for playing in IPL");
		} else {
			System.out.println("Player Name:" + name);
			System.out.println("Player Age" + age);
		}
	}
}
