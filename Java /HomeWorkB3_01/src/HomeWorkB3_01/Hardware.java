package HomeWorkB3_01;

public class Hardware {
	String partNumber;
	String partDescription;
	int avalQuantity;
	double pricePerItem;
	
	//A constructor that initializes the two instance variables: part number and part description
	public Hardware(String partNumber, String partDescription) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
	}
	
	//A constructor that customize initialization of all four instance variables.
	public Hardware(String partNumber, String partDescription,int avalQuantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		
		if (avalQuantity > 0) {
			this.avalQuantity = avalQuantity;
		}
		if (pricePerItem > 0) {
			this.pricePerItem = pricePerItem;
		}
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public void setAvalQuantity(int avalQuantity) {
		if (avalQuantity > 0) {
			this.avalQuantity = avalQuantity;
		}	
	}
	
	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem > 0) {
			this.pricePerItem = pricePerItem;
		}
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public int getAvalQuantity() {
		return avalQuantity;
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	public  showInventory(String partNumber, String partDescription,int avalQuantity, double pricePerItem) {
		return partNumber;
		return partDescription;
		return avalQuantity;
		return pricePerItem;
	}
 }
