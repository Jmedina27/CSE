package HomeWork4_18;

import java.util.Scanner;

public class CreditLimitCalculator {

	public static void main(String[] args) {
	
		int accountNumber, beginningBalance, itemsCharged, creditApplied;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the \"Acount Number\" : ");
		accountNumber = input.nextInt();
		
		System.out.println();
		
		System.out.print("Enter the \"Beginning Balance\" for this month : ");
		beginningBalance = input.nextInt();
		
		System.out.println();
		
		System.out.print("Enter the \"Total of Items Charged\" for this month : ");
		itemsCharged = input.nextInt();
		
		System.out.println();

		System.out.print("Enter the \"Total Credit Applied\" for this month : ");
		creditApplied = input.nextInt();
		
		System.out.println();
		
		int newBalance = (beginningBalance + itemsCharged) - creditApplied;
		
		System.out.printf("Account Number : %d%nBeginning Balance : %d%nTotal of Items Charged : %d%nTotal Credit Applied : %d%n" , accountNumber, beginningBalance, itemsCharged, creditApplied);
		
		System.out.println();
		
		System.out.printf("New Balance : %d%n",newBalance);
		
		if (newBalance < creditApplied ) {
			System.out.println("Credit Limit Exceeded");
		}
		

	}

}
