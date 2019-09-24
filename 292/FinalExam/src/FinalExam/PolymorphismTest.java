/**
 * PolymorphismTest.java
 * 
 * Jesus Medina
 * @version 1.0  
 *
 */
package FinalExam;
import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;

public class PolymorphismTest {
   public static void main(String[] args) {

	  // test case
      Employee employee1 = new Employee("Sue", "Jones", "111-11-1111", 10000, .06 );         
	  BasePlusEmployee employee2 = new BasePlusEmployee("Bob", "Lewis", "333-33-3333", 5000, .04,  3000, 5, 3);   
	  Employee employee3 = new Employee("Michael", "Hughes", "234-22-2232", 8000, .05);   
	  BasePlusEmployee employee4 = new BasePlusEmployee("Sandra", "Stanley", "343-43-3432", 15000, .04,  4000, 20, 2);   
	  BasePlusEmployee employee5 = new BasePlusEmployee("Robert", "Merch", "343-43-4222", 23000, .04,  5000, 30, 0);   
	  
	  
	  String first[] = { employee1.getFirstName(), employee2.getFirstName(), employee3.getFirstName(), 
			  employee4.getFirstName(), employee5.getFirstName()}; 
	  String last[] = { employee1.getLastName(), employee2.getLastName(), employee3.getLastName(), 
			  employee4.getLastName(), employee5.getLastName()};
	  String ssn[] = { employee1.getSocialSecurityNumber(), employee2.getSocialSecurityNumber(), employee3.getSocialSecurityNumber(), 
			  employee4.getSocialSecurityNumber(), employee5.getSocialSecurityNumber()};
	  double sales[] = { employee1.getGrossSales(), employee2.getGrossSales(), employee3.getGrossSales(),
			  employee4.getGrossSales(), employee5.getGrossSales()};
	  double commission[] = { employee1.getCommissionRate(), employee2.getCommissionRate(), employee3.getCommissionRate(),
			  employee4.getCommissionRate(), employee5.getCommissionRate()};
	  int years[] = { 0, employee2.getNumberOfYears(), 0, employee4.getNumberOfYears(), employee5.getNumberOfYears()}; 
	  
	  String category[] = { "normal", "base Plus", "normal", "base Plus", "base Plus"};
	  double salary[] = {0.0, employee2.getBaseSalary(), 0.0, employee4.getBaseSalary(), employee5.getBaseSalary()}; 

	  int kids[] = { 0, employee2.getNumberOfKids(), 0, employee4.getNumberOfKids(), employee5.getNumberOfKids()};
	  
	  
	  System.out.printf("%-6s%10s%25s%15s%20s%20s%15s%15s%10s", "First", "Last", "Social Security", "sales", "commission", "years", "category", "salary", "kids");
      System.out.println();
      for (int i = 0; i <= first.length; i++) {
    	  System.out.printf("%-6s\n", first[i]);
      }
      
      for (int i = 0; i <= last.length; i++) {
    	  System.out.printf("%10s\n", last[i]);
      }
      
      for (int i =0; i <= ssn.length; i++) {
    	  System.out.printf("%35s\n", ssn[i]);
      }
      
      System.out.println();
      for (int i = 0; i <= sales.length; i++) {
    	  System.out.printf("%50s\n", sales[i]);
      }
      System.out.println();
      for (int i = 0; i <= commission.length; i++) {
    	  System.out.printf("%70s\n", commission[i]);
      }
      System.out.println();
      for (int i = 0; i <= years.length; i++) {
    	  System.out.printf("%90s\n", years[i]);
      }
      System.out.println();
      for (int i = 0; i <= salary.length; i++) {
    	  System.out.printf("%115s\n", salary[i]);
      }
      System.out.println();
      for (int i = 0; i <= kids.length; i++) {
    	  System.out.printf("%50s\n", kids[i]);
      }
  
      
	} 
} 
