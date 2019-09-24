package HomeWork3_12;

import java.util.Scanner;


public class InvoiceTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Invoice myInvoice = new Invoice("1234","sealant", 2, 17.00);
		
		System.out.printf("Part %s description : %s. Price per item is : $%.2f, quantity asked : %d%n", myInvoice.getPartNumber(), myInvoice.getPartDescription(), myInvoice.getpricePerItem(), myInvoice.getQuantity());
		System.out.printf("Total amount is : $%.2f%n", myInvoice.getInvoiceAmount());
		
		
		System.out.print("Enter the Part Number : ");
		String partNumber = input.nextLine();
		myInvoice.setPartNumber(partNumber);
		
		System.out.print("Enter the Part Description : ");
		String partDescription = input.nextLine();
		myInvoice.setPartDescription(partDescription);
		
		System.out.print("Enter the quantity : ");
		int quantity = input.nextInt();
		if (quantity < 0) {
			myInvoice.setQuantity(0);
		}
		else {
			myInvoice.setQuantity(quantity);
		}
		

		System.out.print("Enter the Price per item : ");
		double pricePerItem = input.nextDouble();
		if (pricePerItem < 0.00) {
			myInvoice.setPricePerItem(0.00);
		}
		else {
			myInvoice.setPricePerItem(pricePerItem);
		}
		
		System.out.printf("Part %s description : %s. Price per item is : $%.2f, quantity asked : %d%n", myInvoice.getPartNumber(), myInvoice.getPartDescription(), myInvoice.getpricePerItem(), myInvoice.getQuantity());
		System.out.printf("Total amount is : $%.2f%n", myInvoice.getInvoiceAmount());
		
		
	}

}
