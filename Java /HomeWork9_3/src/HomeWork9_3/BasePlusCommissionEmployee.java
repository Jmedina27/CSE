/***
* CSE292 - Fall 2018

* BasePlusCommissionEmployee.java

* Purpose:  
*

* @author Jesus Medina

* @version 1.0 11/11/2018

*/

package HomeWork9_3;

public class BasePlusCommissionEmployee {
	
	private CommissionEmployee commissionEmployee;
	private double baseSalary;
	
	//constructor 
	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
		
		commissionEmployee = new CommissionEmployee(first, last, ssn, sales, rate);
		
		setBaseSalary(salary);
	}
	
	//set the first name 
	public void setFirstName(String first) {
		commissionEmployee.setFirstName(first);
	}
	
	//retrieve the first name
	public String getFirstName() {
		return commissionEmployee.getFirstName();
	}
	
	//set the last name 
	public void setLastName(String last) {
		commissionEmployee.setLastName(last);
	}
	
	//retrieve the last name
	public String getLastName() {
		return commissionEmployee.getLastName();
	}
	
	//set the social security number of the employee
	public void setSocialSecurituNumber(String ssn) {
		commissionEmployee.setSocialSecurityNumber(ssn);
	}
	
	//retrieve the social security number of employee
	public String getSocialSecurityNumber() {
		return commissionEmployee.getSocialSecurityNumber();
	}
	
	//set the gross sales of the employee
	public void setGrossSales(double sales) {
		commissionEmployee.setGrossSales(sales);
	}
	
	//retrieves the gross sales of the employee
	public double getGrossSales() {
		return commissionEmployee.getGrossSales();
	}
	
	//set the commission rate of the employee
	public void setCommissionRate(double rate) {
		commissionEmployee.setCommissionRate(rate);
	}
	
	//retrieves the commission rate of the employee
	public double getCommissionRate() {
		return commissionEmployee.getCommissionRate();
	}
	
	//set the base salary of the employee
	public void setBaseSalary(double salary) {
		baseSalary = (salary < 0.0) ? 0.0 : salary;
	}
	
	//retrieves the base salary of the employee
	public double getBaseSalary() {
		return baseSalary;
	}
	
	//determine the total earnings of the employee
	public double earnings() {
		return getBaseSalary() + commissionEmployee.earnings();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %.2f", "base-salaried", commissionEmployee.toString(), "base salary", getBaseSalary());
	}
}
