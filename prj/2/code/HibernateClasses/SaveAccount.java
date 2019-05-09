package HibernateClasses;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BankingClasses.Account;
import BankingClasses.AccountHolder;
import BankingClasses.CheckingAccount;
import BankingClasses.SavingsAccount;

public class SaveAccount {
	
	// Saves a new savingsaccount into the relational database 
	public static void save(SavingsAccount acct) {
		// Create Session Factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(AccountHolder.class)
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(SavingsAccount.class)
				.addAnnotatedClass(CheckingAccount.class)
				.buildSessionFactory();
		
		// Create Session
		Session session = factory.getCurrentSession();
		
		try {
			// create an account object
			System.out.println("Creating new account object");
			SavingsAccount temp = acct;
			
			// start a transaction
			session.beginTransaction();
			
			// save the object
			System.out.println("Saving the savings account...");
			session.save(temp);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			} finally {
			factory.close();
		}
	}	

	public static void save(CheckingAccount acct) {

		// Create Session Factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(AccountHolder.class)
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(CheckingAccount.class)
				.buildSessionFactory();
		
		// Create Session
		Session session = factory.getCurrentSession();
		
		try {
			// create an account object
			System.out.println("Creating new accountholder object");
			CheckingAccount temp = acct;
			
			// start a transaction
			session.beginTransaction();
			
			// save the object
			System.out.println("Saving the checking account...");
			session.save(temp);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			} finally {
			factory.close();
		}
	}	
}
