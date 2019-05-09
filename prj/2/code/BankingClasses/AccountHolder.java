package BankingClasses;
import java.util.ArrayList;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "account_holder")
public class AccountHolder {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "birth_date")
	private Date birthDate;
	
	@Column(name = "username", unique=true)
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Transient
	private ArrayList<CheckingAccount> checkingAccounts = new ArrayList<>();
	@Transient
	private ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();
	
	
	public AccountHolder(){}
	
	public AccountHolder(String firstName, String lastName, Date birthDate, String username, String password, String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	// Getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getBirthDate() {
		return birthDate.toString();
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getUserId() {
		return userId;
	}
	
	@OneToMany(targetEntity=CheckingAccount.class, mappedBy="accountHolder",
			cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public CheckingAccount[] getCheckingAccounts() {
		CheckingAccount[] accounts = new CheckingAccount[checkingAccounts.size()];
		for (int i = 0; i < checkingAccounts.size(); i++)
			accounts[i] = checkingAccounts.get(i);
		return accounts;
	}
	
	@OneToMany(targetEntity=SavingsAccount.class, mappedBy="accountHolder",
			cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public SavingsAccount[] getSavingsAccounts() {
		SavingsAccount[] accounts = new SavingsAccount[savingsAccounts.size()];
		for (int i = 0; i < savingsAccounts.size(); i++) 
			accounts[i] = savingsAccounts.get(i);
		return accounts;
	}
	
	public int getNumberOfAccounts() {
		return this.getCheckingAccounts().length + this.getSavingsAccounts().length;
	}
	
	// Setters
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public void setLastName(String name) {
		this.lastName = name;
	}
	
	public void setBirthDate(Date bday) {
		this.birthDate = bday;
	}
	
	public void setUsername(String uname) {
		this.username = uname;
	}
	
	public void setPassword(String pass) {
		//Checks to see if the password has varying cases and contains a number
		if (((pass.toLowerCase() != pass && pass.toUpperCase() != pass) && pass.matches(".*\\d.*")))
			this.password = pass;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setUserId(int id) {
		this.userId = id;
	}
	
	// Methods used for account class
	
	public void addCheckingAccount(CheckingAccount acct) {
		// Only allows any user to create a maximum of five accounts
		if (checkingAccounts.size() < 5)
			checkingAccounts.add(acct);
	}
	
	public void addSavingsAccount(SavingsAccount acct) {
		// Only allows any user to create a maximum of five accounts
		if (savingsAccounts.size() < 5)
			savingsAccounts.add(acct);
	}
	
	public void removeCheckingAccount(CheckingAccount acct) {
		checkingAccounts.remove(acct);
	}
	
	public void removeSavingsAccount(SavingsAccount acct) {
		savingsAccounts.remove(acct);
	}
	
	@Override
	public String toString() {
		return "First Name: " + this.firstName + "\nLast Name: " + this.lastName;
	}
}
