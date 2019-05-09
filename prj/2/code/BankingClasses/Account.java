package BankingClasses;
import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity 
@Table(name="account")
@DiscriminatorColumn(name="account_type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="employee")  
public abstract class Account{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "account_id")
	private int accountId;
	
	@Column(name = "balance")
	private double balance;
	
	@Column(name = "annual_interest_rate")
	private double annualInterestRate = 1.01;
	
	@Column(name = "date_created")
	private Date dateCreated;	
	
	@ManyToOne
	@JoinColumn(name="user_id_fk")
	private AccountHolder accountHolder;
	
	@Transient
	private String accountType;
	
	//Class Constructors //
	public Account(){
		this.dateCreated = new Date(Calendar.getInstance().getTime().getTime());
	}
	
	public Account(double balance, AccountHolder acctHolder){
		this.balance = balance;
		this.dateCreated = new Date(Calendar.getInstance().getTime().getTime());;
		this.accountHolder = acctHolder;
	}
	
	// Getters //
	public int getAccountId() {
		return accountId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	}

	public String getAccountType() {
		return "General";
	}
	// Setters //
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double air) {
		this.annualInterestRate = air;
	}

	// Methods associated with the general account superclass: //
	
	public void withdraw(double amt) {
		balance -= amt;
	}
	
	public void deposit(double amt) {
		balance += amt;
	}
	
	//Transfers a specified amount FROM acct1 TO acct2
	public static void transfer(Account acct1, Account acct2, double amt) {
		acct1.withdraw(amt);
		acct2.deposit(amt);
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 100 / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public Object[] returnAccountInfo(){
		return null;
	}
	
	@Override
	public String toString() {
		return "Account Type: General\nBalance: " + this.balance +
				"\nAccount ID: " + accountId;
	}

	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}
}
