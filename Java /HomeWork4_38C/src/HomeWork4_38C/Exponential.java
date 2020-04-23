/***
* CSE292 - Fall 2018

* Exponential.java

* Purpose: application that computes the value of e^x  by using the following formula. 
* Allow the user to enter the number of terms to calculate

*

* @author Jesus Medina

* @version 1.0 10/14/2018

*/
package HomeWork4_38C;
import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//create float estimate and integer e 
		float estimate = 1;
		int e = 10;
		
		//prompts user to input an integer, 
		System.out.print("Enter a number that will calculate the exponent of e : \n");
		float num = input.nextFloat();
		
		//use for loop to estimate e^x using user input
		for (int i = e-1; i > 0; --i) {
			estimate = 1 + num * estimate / i;
		}
		
		//print e^x 
		System.out.printf("e^x = %f\n", estimate);
		
	}

}
