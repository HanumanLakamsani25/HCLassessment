
package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.pojo.PlayerAgeValidity;
import com.service.CheckPlayerEligibility;

/**
 * 
 * @author HanumanL
 * 
 * 
 *
 */
public class MainIPL {

	public static void main(String[] args) {

		String playerName;
		int playerAge;

		Scanner scanner = new Scanner(System.in);

		PlayerAgeValidity playerage = new PlayerAgeValidity();

		try {
			System.out.println("Enter  player name:");
			playerName = scanner.nextLine();

			System.out.println("Enter  player age");
			playerAge = scanner.nextInt();

			playerage.validateAndDisplay(playerName, playerAge);
		} catch (CheckPlayerEligibility e1) {
			System.err.println(e1.getErrorMessage());
		} catch (InputMismatchException e2) {
			System.err.println("The input type is incompatible");
		}

		playerage = null;
		scanner.close();
	}

}
