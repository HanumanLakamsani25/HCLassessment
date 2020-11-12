package com.main;

import java.util.Scanner;
import com.pojo.House;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class MainHouse {

	public static void main(String[] args) {
		System.out.println("Enter the room details in the oder roomNumber,roomTyype,roomArea ans if AC available :");
		Scanner scanner = new Scanner(System.in);
		int houseNo = scanner.nextInt();
		scanner.nextLine();
		String roomType = scanner.nextLine();
		float houseArea = scanner.nextFloat();
		boolean acMachine = scanner.nextBoolean();
		House house = new House(houseNo, roomType, houseArea, acMachine);
		System.out.println(house);
		scanner.close();
		house = null;
	}

}
