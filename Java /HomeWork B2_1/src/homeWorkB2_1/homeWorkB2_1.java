package homeWorkB2_1;

import java.util.Scanner;

public class homeWorkB2_1 {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter a five-digit number: ");
		
		int num = input.nextInt();
		if (num%5 == 0) {
			System.out.printf("number %d%n", num);
			System.out.println("is divisible by 5.");
		}
		else {
			System.out.printf("This number %d%n", num);
			System.out.println("is not divisble by 5");
		}
		
		System.out.printf("The number is: %d%n", num);
		System.out.printf("The number is: %10d%n", num);
		System.out.printf("The number is: %010d%n", num);
		System.out.printf("The number is: %,d%n", num);
		System.out.printf("The number is: $%,d%n", num);
		

	}

}
