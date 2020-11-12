package com.main;

import com.pojo.Address;
import com.pojo.Employee;

/**
 * 
 * 
 * author @Hanuman.L
 * 
 */


public class HrApp {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpId(12);
		employee.setEmpName("King");
		Address address1 = new Address(111, "Bengaluru", "Karnataka");
		Address address2 = new Address(122, "Chennai", "Tamil Nadu");
		Address address3 = new Address(133, "Rajahmundry", "Andhra Pradesh");
		Address[] addresses = new Address[3];
		addresses[0] = address1;
		addresses[1] = address2;
		addresses[2] = address3;
		employee.setAddress(addresses);
		System.out.println("Employee Id: " + employee.getEmpId());
		System.out.println("Employee Name: " + employee.getEmpName());
		Address[] addresses2 = employee.getAddress();
		for (int i = 0; i < addresses2.length; i++) {
			System.out.println("Door No :" + addresses2[i].getDoorNo());
			System.out.println("City :" + addresses2[i].getCity());
			System.out.println("State :" + addresses2[i].getState());

		}

		Employee employee1 = new Employee();
		employee1.setEmpId(22);
		employee1.setEmpName("Kong");
		Address address4 = new Address(211, "Bengaluru", "Karnataka");
		Address address5 = new Address(233, "Chennai", "Tamil Nadu");
		Address[] addresses1 = new Address[3];
		addresses1[0] = address4;
		addresses1[1] = address2;
		addresses1[2] = address5;
		employee1.setAddress(addresses1);
		Address[] addresses3 = employee.getAddress();
		for (int i = 0; i < addresses3.length; i++) {
			System.out.println("Door No :" + addresses3[i].getDoorNo());
			System.out.println("City :" + addresses3[i].getCity());
			System.out.println("State :" + addresses3[i].getState());

		}

		Employee[] state = getEmployeeByState(new Employee[] { employee, employee1 }, "Andhra Pradesh");

		printEmployees(state);

	}

	public static Employee[] getEmployeeByState(Employee[] employees, String state) {
		Employee[] emparray = new Employee[employees.length];
		int count = 0;
		for (int i = 0; i < employees.length; i++) {
			Address[] addresses = employees[i].getAddress();
			for (int j = 0; j < addresses.length; j++) {
				if (state.equalsIgnoreCase(addresses[j].getState())) {
					emparray[count] = employees[i];
					count++;
				}
			}
		}

		if (count == 0) {
			return null;
		} else {
			Employee[] value = new Employee[count];
			System.arraycopy(emparray, 0, value, 0, count);
			return value;
		}

	}

	private static void printEmployees(Employee[] employees) {
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
}
