
package com.main;

import java.util.Scanner;

import com.service.UserMainCodeValidate;

/**

 * 
 * @author HanumanL
 *
 */
public class MainValidate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Ip Address :");
		String ip = scanner.nextLine();
		if (UserMainCodeValidate.validateIp(ip) == 1) {
			System.out.println("Enter Ip Address is Valid ");
		} else
			System.out.println("Enter Ip Address is Notvalid");
		scanner.close();
	}

}
