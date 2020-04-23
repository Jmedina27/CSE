package helloWorld;

import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Input a second integer: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		
		System.out.printf("The sum of both numbers is : %,20d%n", sum);
		*/
		//System.out.printf("%s %s", "Hello, World!");
		int a, b, c, d;
		a = 4; 
		b = 12; 
		c = 37; 
		d = 51; 
		int result = d % a * c + a % b + a; 
		System.out.printf("%d%n", result);
	}

}
