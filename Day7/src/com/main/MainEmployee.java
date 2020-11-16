
package com.main;

import java.util.HashMap;
import java.util.Scanner;

import com.pojo.Employee;
import com.service.EmployeeService;
/**
 * @author HanumanL
 *
 */
public class MainEmployee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Details :");
		int size = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name and Designation " + size + " employees :");
		HashMap<String, String> details = new HashMap<String, String>();
		Employee employee;

		for (int i = 0; i < size; i++) {

			employee = new Employee(scanner.nextLine(), scanner.nextLine());
			details.put(employee.getName(), employee.getDesignation());
		}
		System.out.println("Enter Designation :");
		String designation = scanner.nextLine();
		String[] result = EmployeeService.getDesignation(details, designation);
		System.out.println("Employees with same Designations :");
		for (int i = 0; i < result.length; i++) {
			if (result[i] != null)
				System.out.println(result[i]);
		}
		scanner.close();
		details = null;
		employee = null;
	}

}
