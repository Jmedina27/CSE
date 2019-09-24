package HomeWork3_13;

public class Employee {
	String firstName;
	String lastName;
	double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		}
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}	
}
