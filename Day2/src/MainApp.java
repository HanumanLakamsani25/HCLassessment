/**
 * 
 * 
 * author @Hanuman.L
 * 
 */

public class MainApp {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		employee1.empID = 1;
		employee2.empID = 2;
		employee1.empName = "Abc";
		employee1.empSalary = 10000;
		employee2.empName = "Xyz";
		employee2.empSalary = 120000;
		if(employee1.empSalary > employee2.empSalary)
		{
		System.out.println("Highest Salary" + employee1.empSalary);
		}
		else
		{
		System.out.println("Highest Salary :" + employee2.empSalary);
		}
	}

}
