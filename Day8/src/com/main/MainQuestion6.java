
package com.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author HanumanL
 * 
 *
 */
public class MainQuestion6 {
	public static void main(String[] args) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String Name;
		String Role;
		try {
			FileWriter fileWriter = new FileWriter("Employee.csv");
			fileWriter.append("Employee Name");
			fileWriter.append(",");
			fileWriter.append("Employee Role");
			fileWriter.append("\n");
			System.out.println("Enter Employee Name :");
			Name = bufferedReader.readLine();
			System.out.println("Enter Employee Role :");
			Role = bufferedReader.readLine();
			fileWriter.append(Name);
			fileWriter.append(",");
			fileWriter.append(Role);
			fileWriter.append("\n");
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			BufferedReader bufferedReader2 = new BufferedReader(new FileReader("Employee.csv"));
			String line = null;
			while ((line = bufferedReader2.readLine()) != null) {
				String[] details = line.split(",");
				System.out.println(details[0] + "   " + details[1] + "   " + details[2]);
			}
			bufferedReader2.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
