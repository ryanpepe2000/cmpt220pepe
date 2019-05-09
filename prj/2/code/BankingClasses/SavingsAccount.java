package BankingClasses;


import javax.persistence.Entity;
import javax.persistence.Transient;


@Entity
public class SavingsAccount extends Account{
	
	@Transient
	final private String ACCOUNT_TYPE = "Savings";
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(double ammount, AccountHolder acct) {
		super(ammount, acct);
	}
	
	@Override
	public String getAccountType() {
		return ACCOUNT_TYPE;
	}
	
	@Override
	public void withdraw(double amt) {
		if (getBalance() >= amt) {
			super.withdraw(amt);
		} else {
			System.out.println(10/0); // This will throw dividebyzero exception which is handled in Gui
		}
	}
	
	@Override
	public String toString() {
		return "Account Type: Savings\nBalance: " + this.getBalance() +
				"\nAccount ID: " + this.getAccountId();
	}
	
	@Override
	public Object[] returnAccountInfo(){
		return new Object[] {
			new Integer(this.getAccountId()), this.ACCOUNT_TYPE, new Double(this.getBalance())
		};
	}
}
