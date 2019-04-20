
public class SavingsAccount extends Account {
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(int id, double bal) {
		super(id, bal);
	}
	
	@Override
	void withdraw(double amount) {
		if (amount <= getBalance())
			super.withdraw(amount);
	}
	
	@Override
	public String toString() {
		return "Type: Savings account;  ID: " + this.getId() 
				+ ";  balance: $" + this.getBalance();
	}
}
