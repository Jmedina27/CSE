/***
* CSE292 - Fall 2018

* Palindrome.java

* Purpose:  reads in a five-digit integer and determines whether it is a palindrome.
* If the number is not five digits long, display an error message and allow the user to enter a new value.

*

* @author Jesus Medina

* @version 1.0 10/11/2018

*/

package HomeWork4_31;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Prompts user to input a 5-digit number
		System.out.print("Enter a 5-digit number : ");
		int num = input.nextInt();
		if (num > 99999 || num < 10000) {
			while ((num > 99999) || (num < 10000)) {
			
				if (String.valueOf(num).length() < 5) {
					System.out.printf("%d is less than 5 digits, please enter a 5 digit number\n", num);
					num = input.nextInt();
				}
			
				else if (String.valueOf(num).length() > 5) {
					System.out.printf("%d is larger than 5 digits, please enter a 5 digit number\n", num);
					num = input.nextInt();
				}
			}
		}
		
		if ((num < 99999) || (num > 10000)) {
			int len = String.valueOf(num).length();
			for (int i = 0; i < len/2; i++) {
				for (int j = String.valueOf(num).length(); j > len/2; --j) {
					if (i != j) {
						System.out.printf("%d is not a palindrome number", num);
						num = input.nextInt();
					}
					if (i == j) {
						System.out.printf("%d is a palindrome number", num);
					}
				}
			}
		}
		
	}

}
