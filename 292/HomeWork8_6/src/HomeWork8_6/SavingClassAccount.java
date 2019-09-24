/***
* CSE292 - Fall 2018

* SavingClassAccount.java

* Purpose:  
*

* @author Jesus Medina

* @version 1.0 11/11/2018

*/
package HomeWork8_6;

public class SavingClassAccount {

	//amount savers have saved 
	private float savingBalance;
	
	//annual interest rate for all
	static float annualInterestRate = 0;
	
	//calculate the monthly interest for each saver
	public void calculateMonthlyInterest() {
		savingBalance += savingBalance * annualInterestRate /12;
		return;
	}
	
	//change the interest rate 
	public void modifyInterestRate(float newInterestRate) {
		annualInterestRate = newInterestRate;
		return;
	}
	
	//return the savings balance
	public float getSavingsBalance() {
		return savingBalance;
	}
	
	//constructor 
	SavingClassAccount(float startingBalance) {
		savingBalance = startingBalance;
		return;
	}
}
