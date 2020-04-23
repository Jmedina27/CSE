/***
* CSE292 - Fall 2018

* GreatestCommonDivisor.java

* Purpose: Finds the GCD of two numbers that the user inputs
*

* @author Jesus Medina

* @version 1.0 10/23/2018

*/
package HomeWork6_27;
import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		//sets up user input 
		Scanner input = new Scanner(System.in);
		
		//prompts user to input first number 
		System.out.println("Enter first number to find GCD : ");
		int num1 = input.nextInt();
		
		//prompts user to input second number
		System.out.println("Enter second number to find GCD : ");
		int num2 = input.nextInt();
		
		//displays the GCD of the two numbers
		System.out.println("GCD of the two numbers " + num1 + 
				" and " + num2 + " is : " + findGCD(num1,num2));
				
	}
	
	private static int findGCD(int num1, int num2) {
		
		if (num2 == 0) {
			return num1;
		}
		return findGCD(num2, num1%num2);
	}

}
