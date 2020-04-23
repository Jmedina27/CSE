package HomeWork5_14;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double principal = 1000.0;
		double rate1, rate2, rate3, rate4, rate5, rate6;
		rate1 = 0.05;
		rate2 = 0.06;
		rate3 = 0.07;
		rate4 = 0.08;
		rate5 = 0.09;
		rate6 = 0.10;
		
		
		for (int year =1; year <= 10; ++year) {
			double amount1 = principal = principal * Math.pow(1.0 + rate1, year);
			double amount2 = principal = principal * Math.pow(1.0 + rate2, year);
			double amount3 = principal = principal * Math.pow(1.0 + rate3, year);
			double amount4 = principal = principal * Math.pow(1.0 + rate4, year);
			double amount5 = principal = principal * Math.pow(1.0 + rate5, year);
			double amount6 = principal = principal * Math.pow(1.0 + rate6, year);
			
			System.out.print("Enter a percentage rate : ");
			int rate = input.nextInt();
			
			if (rate == 5) {
				System.out.printf("%4d%,20.2f%n", year, amount1);
			}
			
			if (rate == 6) {
			System.out.printf("%4d%,20.2f%n", year, amount2);
			}
			
			if (rate == 7) {
			System.out.printf("%4d%,20.2f%n", year, amount3);
			}
			
			if (rate == 8) {
			System.out.printf("%4d%,20.2f%n", year, amount4);
			}
			
			if (rate == 9) {
			System.out.printf("%4d%,20.2f%n", year, amount5);
			}
			
			if (rate == 10) {
			System.out.printf("%4d%,20.2f%n", year, amount6);
			}
		}
	}

}
