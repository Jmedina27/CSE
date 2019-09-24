/***
* CSE292 - Fall 2018

* BasePlusCommissionEmployeeTest.java

* Purpose:  Test BasePlusCommissionEmployee and CommissionEmployee
*

* @author Jesus Medina

* @version 1.0 11/11/2018

*/
package HomeWork9_3;

public class BasePlusCommissionTest {

	public static void main(String[] args) {
		
		//create an employee using the constructor BasePlusCommissionEmployee to set the first and last name
		//sets the social security number and the commission rate  amd the base salary 
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
		
		//prints out what what initialized in employee
		System.out.printf( "%s %s%n", "First name is", employee.getFirstName()  );
		System.out.printf( "%s %s%n", "Last name is", employee.getLastName()  );
		System.out.printf( "%s %s%n", "Social Security Number is", employee.getSocialSecurityNumber()  );
		System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales());
		System.out.printf("%s %.2f\n", "Commission Rate is", employee.getCommissionRate());
		System.out.printf("%s %.2f\n", "Base Salary is", employee.getBaseSalary());

		
		//chamges the employee base salary to 1000
		employee.setBaseSalary(1000);
		
		//prints out the updated employee salary 
		System.out.printf( "\n%s:\n\n%s\n", "Updated employee information obtained by toString", employee.toString());
	
	}

}
