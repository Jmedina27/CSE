package MidtermReview;

public class BankAccount {

	private String name;
	private double balance;
	private static double totalBalance = 0;
	private static int totalMembers = 0;
	private static int zeroBalanceMembers = 0;
	private static int fiftyKBalanceMembers = 0;
	private static String bankAddress;
	
	public BankAccount(String name, double balance) {
		this.name = name;
		totalMembers++;
		if (balance > 0) {
			this.balance = balance;
			totalBalance += balance;
			if (totalBalance >= 50000) {
				fiftyKBalanceMembers++;
			}
		}
		else {
			zeroBalanceMembers++;
			balance = 0;
		}
	}
	
	public BankAccount(String name) {
		this(name,0);
	}
	public BankAccount() {
		this("",0);
	}
	
	private boolean isFiftyKBalance() {
		return balance >= 50000;
	}
	private boolean isZeroBalance() {
		return balance == 0;
	}
	
	public void Deposit(double deposit) {
		boolean zeroBalance = isZeroBalance();
		boolean fiftyKBalance = isFiftyKBalance();
		
		if ( deposit > 0 ) {
			this.balance = deposit;
			totalBalance += deposit;
			
		}
		
	}
	
	
}
