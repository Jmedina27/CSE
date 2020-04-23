/***
* CSE292 - Fall 2018

* Factorial.java

* Purpose: application that reads a nonnegative integer and computes and prints its factorial. 

*

* @author Jesus Medina

* @version 1.0 10/14/2018

*/

package HomeWork4_38;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//creates two int count and factor
		int count = 1;
		int factor = 1;
		
		//prompts user to enter a nonnegative integer
		System.out.print("Enter a nonnegative integer : ");
		int num = input.nextInt();
		
		//use a while loop to check if the user inputed a negative integer 
		while (num < 0) {
			System.out.printf(" %d is not a nonnegative integer, please enter a positvive integer\n");
			num = input.nextInt();
		}
		
		//if the integer is a positve integer 
		if (num >= 0 ) {
			//use while loop to calculate the factorial of user input
			while (count <= num) {
				factor = factor * count;
				count++;
			}
		//prints the factorial of user input
		System.out.println("The factorial of the nonnegative number is " + factor);
		}
		 
	}

}
