package homeWork2_30;

import java.util.Scanner;

public class homeWork2_30 {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4, num5, num6, num7;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a seven-digit number: ");
		int num = input.nextInt();
		
		if (String.valueOf(num).length() < 7) {
			System.out.println("The number you entered is less than 7 digits.");
			num = input.nextInt();
			}
		else if (String.valueOf(num).length() > 7) {
			System.out.println("The number you entered is larger than 7 digits");
			num = input.nextInt();
		}
		else {
		num1 = num / 1000000;
		num2 = (num / 100000) % 10;
		num3 = (num / 10000) % 10;
		num4 = (num / 1000) % 10;
		num5 = (num / 100) % 10;
		num6 = (num / 10) % 10;
		num7 = (num / 1) % 10;
		
		System.out.printf(" %d " + "%d " + "%d " + "%d " + "%d " + "%d " + "%d%n ", num1, num2, num3, num4, num5, num6, num7);
		}
	}

}
