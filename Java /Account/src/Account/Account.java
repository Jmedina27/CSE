package Account;

public class Account {

		private String name;
		private double balance;
		
		public Account(String name, double balance) {
			
			this.name = name;
			
			if (balance > 0.0) {
				this.balance = balance;
			}
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void deposit(double deposit) {
			if (deposit > 0.0) {
				
				balance = balance + deposit;
			}
		}
		
		public String getName(String name) {
			return name;
		}
		
		public double getBalance(double balance) {
			
			return balance;
		}
}
