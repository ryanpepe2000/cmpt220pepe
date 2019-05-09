package BankingClasses;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class CheckingAccount extends Account{
	
	@Transient
	final static double  OVERDRAFT_LIMIT = 5000;
	@Transient
	final private String ACCOUNT_TYPE = "Checking";
	
	public CheckingAccount(){
		super();
	}
	
	public CheckingAccount(double ammount, AccountHolder acct){
		super(ammount, acct);
	}

	@Override
	public String getAccountType() {
		return ACCOUNT_TYPE;
	}
	
	// Methods used for this class	
	@Override
	public void withdraw(double ammount){
		if (ammount <= getBalance() + OVERDRAFT_LIMIT) {
			super.withdraw(ammount);
		} else {
			System.out.println(10 / 0); // This will cause a DivideByZeroException, which will be handled in GUI
		}
	}
	
	@Override
	public String toString() {
		return "Account Type: Checking\nBalance: " + this.getBalance() +
				"\nAccount ID: " + this.getAccountId();
	}
	
	@Override
	public Object[] returnAccountInfo(){
		return new Object[] {
			new Integer(this.getAccountId()), this.ACCOUNT_TYPE, new Double(this.getBalance())
		};
	}
}
