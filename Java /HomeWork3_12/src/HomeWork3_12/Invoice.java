package HomeWork3_12;

public class Invoice {
	
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		
		if (quantity > 0) {
			this.quantity = quantity;
		}
		
		if (pricePerItem > 0.0) {
			this.pricePerItem = pricePerItem;
		}
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getpricePerItem() {
		return pricePerItem;
	}
	public double getInvoiceAmount() {
		double calculateTotalAmount;
		calculateTotalAmount = quantity * pricePerItem;
		return calculateTotalAmount;
	}
}
