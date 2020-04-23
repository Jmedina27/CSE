/***
* CSE292 - Fall 2018

* homeWork2_17.java

* Purpose: Allows the user to input three integers and displays the sum, product,average of all three.
* Purpose: Also allows displays the smallest and largest number of the three. 

*

* @author Jesus Medina


*/

package homeWork2_17;

import java.util.Scanner;

public class homeWork2_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Int 1: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter Int 2: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter Int 3: ");
		int num3 = input.nextInt();
		
		int sum = num1 + num2 + num3;
		
		int prod = num1 * num2 * num3;
		
		int avrg = (num1 + num2 + num3)/3;
		
		System.out.printf("The sum of all three integers is: " + "%d%n", sum);
		System.out.printf("The product of all three integers is: " + "%d%n", prod);
		System.out.printf("The average of all three integers is: " + "%d%n", avrg);
		if (num1 < num2 && num1 < num3) {
			System.out.printf("The smallest number is: " + "%d%n", num1);
		}
		else if (num2 < num1 && num2 < num3) {
			System.out.printf("The smallest number is: " + "%d%n", num2);
		}
		else if (num3 < num1 && num3 < num2) {
			System.out.printf("The smallest number is: " + "%d%n", num3);
		}

		if (num1 > num2 && num1 > num3) {
			System.out.printf("The biggest number is: " + "%d%n", num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.printf("The biggest number is: " + "%d%n", num2);
		}
		else if (num3 > num1 && num3 > num2) {
			System.out.printf("The biggest number is: " + "%d%n", num3);
		}

	}

}
