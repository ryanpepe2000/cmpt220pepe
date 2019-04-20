
public class CheckingAccount extends Account{
	private final static double OVERDRAFT_LIMIT = 5000;
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(int id, double bal) {
		super(id, bal);
	}
	
	@Override
	void withdraw(double amount) {
		if (amount <= getBalance() + OVERDRAFT_LIMIT )
			super.withdraw(amount);
	}
	
	@Override
	public String toString() {
		return "Type: Checking account;  ID: " + this.getId() 
				+ ";  balance: $" + this.getBalance();
	}
}
