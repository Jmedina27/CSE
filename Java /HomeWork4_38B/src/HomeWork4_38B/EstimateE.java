/***
* CSE292 - Fall 2018

* EstimateE.java

* Purpose: application that computes the value of e. 
* Allow the user to enter the number of terms to calculate.

*

* @author Jesus Medina

* @version 1.0 10/14/2018

*/

package HomeWork4_38B;
import java.util.Scanner;

public class EstimateE {

	//create a function called fact which acts the same as the factorial main function in HomeWork4_38
	public static int fact(int num) {
		int count = 1;
		int factor = 1;
		while (num < 0) {
			System.out.printf(" %d is not a nonnegative integer, please enter a positvive integer\n");
		}
		
		if (num >= 0 ) {
			
			while (count <= num) {
				factor = factor * count;
				count++;
			}
		}
		return factor;
	}
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Asks user to input an integer 
		System.out.print("Enter the number of terms to calculate the value of e : \n");
		int num = input.nextInt();
		//create a variable double result and int counter
		double result = 1;
		int counter = 1;
		
		//use while loop to calculate e
		while (counter <= num) {
			result += 1.0 / fact(counter);
			counter ++;
		}
		//prints e
		System.out.println("The factorial of the nonnegative number is " + result);
	}

}
