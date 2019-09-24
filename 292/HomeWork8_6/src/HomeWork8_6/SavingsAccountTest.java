/***
* CSE292 - Fall 2018

* SavingsAccountTest.java

* Purpose: Test
*

* @author Jesus Medina

* @version 1.0 11/11/2018

*/
package HomeWork8_6;

public class SavingsAccountTest {

	public static void main(String[] args) {
		
		//create saver1 with a starting balance of 2000
		SavingClassAccount saver1 = new SavingClassAccount(2000.0f);
		
		//create saver2 with a staring balance of 3000
		SavingClassAccount saver2 = new SavingClassAccount(3000.0f);
		
		//modify both savers' interest rate to 4%
		saver1.modifyInterestRate(0.04f);
		saver2.modifyInterestRate(0.04f);
		
		//calculate the new interest rate to both savers' balances
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		//print out the balances of the savers' 
		System.out.printf("saver1 balance = $%,.2f%n", saver1.getSavingsBalance());
		System.out.printf("saver2 balance = $%,.2f%n", saver2.getSavingsBalance());
		
		//modify interest of all savers' to 5% and calculate the monthly interest
		saver1.modifyInterestRate(0.05f);
		saver1.calculateMonthlyInterest();
		saver2.modifyInterestRate(0.05f);
		saver2.calculateMonthlyInterest();
		
		//print savers' new balance
		System.out.printf("saver1 balance = $%,.2f%n", saver1.getSavingsBalance());
		System.out.printf("saver2 balance = $%,.2f%n", saver2.getSavingsBalance());
		
		
	}

}
