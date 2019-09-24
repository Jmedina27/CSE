package HomeWork3_13;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee firstEmployee = new Employee("Jesus", "Medina", 4000.00);
		Employee secondEmployee = new Employee("Stephanie", "Topete", 3500.00);
		
		System.out.printf("Employee #1 : %s %s, %s's yearly salary is : $%,.2f%n", firstEmployee.getFirstName(), firstEmployee.getLastName(), firstEmployee.getFirstName(),firstEmployee.getMonthlySalary() * 12);
		System.out.printf("Employee #2 : %s %s, %s's yearly salary is : $%,.2f%n", secondEmployee.getFirstName(), secondEmployee.getLastName(), secondEmployee.getFirstName(),secondEmployee.getMonthlySalary() * 12);
		
		System.out.println("Both employees will be recieving a raise of 10%, here are the updated monthly salaries: ");
		
		
		double raise = 0.10;
		double monthlySalary1 = firstEmployee.monthlySalary + (firstEmployee.monthlySalary * raise);
		firstEmployee.setMonthlySalary(monthlySalary1);
		System.out.printf("%s monthly salary with raise is : $%,.2f%n", firstEmployee.getFirstName(),firstEmployee.getMonthlySalary() * 12);

		
		double monthlySalary2 = secondEmployee.monthlySalary + (secondEmployee.monthlySalary * raise);
		secondEmployee.setMonthlySalary(monthlySalary2);
		System.out.printf("%s monthly salary with the raise is : $%,.2f%n", secondEmployee.getFirstName(), secondEmployee.getMonthlySalary() * 12 );
	}

}
