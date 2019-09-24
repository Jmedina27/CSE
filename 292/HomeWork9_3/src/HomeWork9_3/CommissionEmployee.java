/***
* CSE292 - Fall 2018

* CommissionEmployee.java

* Purpose:  
*

* @author Jesus Medina

* @version 1.0 11/11/2018

*/
package HomeWork9_3;

public class CommissionEmployee {
	
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
	//constructor
	public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
		
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		setGrossSales(sales);
		setCommissionRate(rate);
	}
	
	//set the first name
	public void setFirstName(String first) {
		firstName = first;
	}
	
	//retrieve first name
	public String getFirstName() {
		return firstName;
	}
	
	//set the last name 
	public void setLastName(String last) {
		lastName = last;
	}
	
	//retrieve the last name
	public String getLastName() {
		return lastName;
	}
	
	//set the social security number of the employee 
	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn;
	}
	
	//retrieve the ssn of the employee
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	// set gross sales
	public void setGrossSales(double sales) {
		grossSales = (sales < 0.0) ? 0.0 : sales;
	}
	
	//retrieves gross sales of employee
	public double getGrossSales() {
		return grossSales;
	}
	
	//set commission rate 
	public void setCommissionRate(double rate) {
		commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
	}
	
	//retrieve commission rate of employee
	public double getCommissionRate() {
		return commissionRate;
	}
	
	//determine the earnings of the employee
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	//String representation fo CommissionEmployee object
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f", "commission employee", getFirstName(), getLastName(), 
				"social security number", getSocialSecurityNumber(), "gross sales", getGrossSales(), "commission rate", getCommissionRate());
	}
}
