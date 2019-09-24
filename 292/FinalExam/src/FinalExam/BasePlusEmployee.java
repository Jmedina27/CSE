package FinalExam;

public class BasePlusEmployee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private int numberOfKids;
	private int numberOfYears;
	private double grossSales;
	private double commissionRate;
	private double baseSalary; // base salary per week

	   // six-argument constructor
	   public BasePlusEmployee(String firstName, String lastName, 
	      String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary, int numberOfYears, int numberOfKids) {
	      
		   this.firstName = firstName;
		   this.lastName = lastName;
		   this.socialSecurityNumber = socialSecurityNumber;
		   this.numberOfKids = numberOfKids;
		   this.numberOfYears = numberOfYears;
		   
		   // if grossSales is invalid throw exception
		      if (grossSales < 0.0) {
		         throw new IllegalArgumentException("Gross sales must be >= 0.0");
		      }    
		      this.grossSales = grossSales;
		   
		   //if commissionRate is invalid throw exception
		   if (commissionRate < 0.0 || commissionRate > 1.0) {
		         throw new IllegalArgumentException(
		            "Commission rate must be > 0.0 and < 1.0");
		      } 
		   this.commissionRate = commissionRate; 
	   
	      // if baseSalary is invalid throw exception
	      if (baseSalary < 0.0) {                  
	         throw new IllegalArgumentException("Base salary must be >= 0.0");
	      }    
	      this.baseSalary = baseSalary;
	   }
	   
	   public String getFirstName() {
		   return firstName;
	   }
	   
	   public String getLastName() {
		   return lastName;
	   }
	   
	   public String getSocialSecurityNumber() {
		   return socialSecurityNumber;
	   }
	   
	   public void setGrossSales(double grossSales) {
		      if (grossSales < 0.0) {
		         throw new IllegalArgumentException("Gross sales must be >= 0.0");
		      }   
		      this.grossSales = grossSales;
	   }
	   
	   public double getGrossSales() {
		   return grossSales;
	   }
	   
	   // set base salary
	   public void setBaseSalary(double baseSalary) {
	      if (baseSalary < 0.0) {                  
	         throw new IllegalArgumentException("Base salary must be >= 0.0");
	      }       

	      this.baseSalary = baseSalary;                
	   } 

	   // return base salary
	   public double getBaseSalary() {return baseSalary;}
	   
	   //set commission rate
	   public void setCommissionRate(double commissionRate) {
		      if (commissionRate < 0.0 || commissionRate > 1.0) {
		         throw new IllegalArgumentException(
		            "Commission rate must be > 0.0 and < 1.0");
		      } 

		      this.commissionRate = commissionRate;
		   } 
	   
	   //return commission rate
	   public double getCommissionRate() {
		   return commissionRate;
	   }
	   
	   //set the number of years worked
	   public void setNumberOfYears(int numberOfYears) {
		   this.numberOfYears = numberOfYears;
	   }
	   
	   //return the number of years worked 
	   public int getNumberOfYears() {
		   return numberOfYears;
	   }
	   
	   //get the percentage increase for the amount of years worked
	   public double percentageIncrease(int numberOfYears) {
		   double percentage = 0;
		   
		   if (numberOfYears >= 5 && numberOfYears < 10) {
			   percentage = 0.05;
		   }
		   else if (numberOfYears >= 10 && numberOfYears < 15) {
			   percentage = 0.1;
		   }
		   else if (numberOfYears >= 15 && numberOfYears < 20) {
			   percentage =  0.15;
		   }
		   else if (numberOfYears >= 20) {
			   percentage = 0.20;
		   }
		   
		   return percentage;
	   }
	   
	   
	   // set the number of kids 
	   public void setNumberOfKids(int numberOfKids) {
		   this.numberOfKids = numberOfKids;
	   }
	   
	   //return the number of kids
	   public int getNumberOfKids() {
		   return numberOfKids;
	   }
	   
	   //Allowance of 500 per kid up to 3 kids, and 500 for the worker itself
	   public int Allowance(int numberOfKids) {
		  return (getNumberOfKids() * 500) + 500; 
	   }
	   
	   // calculate earnings
	   public double earnings() {
		   return getBaseSalary() + getCommissionRate() * percentageIncrease(numberOfYears);
	   }

	   // return String representation of BasePlusEmployee
	   @Override
	   public String toString() {
	      return String.format("%s %s: %,.2f",
	         super.toString(), "base salary", getBaseSalary());   
	   } 
}
