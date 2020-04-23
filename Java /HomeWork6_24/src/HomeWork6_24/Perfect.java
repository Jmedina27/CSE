/***
* CSE292 - Fall 2018

* Perfect.java

* Purpose: It determines whether a parameter number is a perfect number between 1-1000.

*

* @author Jesus Medina

* @version 1.0 10/23/2018

*/
package HomeWork6_24;

public class Perfect {
	
	public static Boolean isPerfect(int num) {
		//create an int called sum and have it = 0
		int sum = 0;
		
		//loop  all numbers less than 1000 to determine if they're factors
		for (int factor =1; factor < num; factor++) {
			//if they are a factor then add them to sum
			if (num % factor == 0) {
				sum +=factor;
			}
		}
		
		//if sum is equal to num then it is a perfect number
		if (sum == num) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		//create a loop that prints the perfect numbers b/w 1 to 1000 using the isPerfect function
		for (int num = 1; num <=1000; num++) {
			// if the number is perfect print the number 
			if (isPerfect(num)) {
				 System.out.println("The number " + num + " is a perfect number");;
			}
		}
	}

}

