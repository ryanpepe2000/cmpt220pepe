package HibernateClasses;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import BankingClasses.Account;
import BankingClasses.AccountHolder;
import BankingClasses.CheckingAccount;
import BankingClasses.SavingsAccount;

public class MakeQuery {

	//Makes a query that will return array of AccountHolders 
	public static AccountHolder[] acctHolderQuery(String query) {
				ArrayList<AccountHolder> temp = new ArrayList<>();
		
				// Create Session Factory
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(AccountHolder.class)
						.buildSessionFactory();
				
				// Create Session
				Session session = factory.getCurrentSession();
				
				try {
					// start a transaction
					session.beginTransaction();
					
					//query AccountHolders
					List<AccountHolder> acctHolders = session.createQuery(query).getResultList();
					
					// add acctHolders to ArrayList
					for (AccountHolder acctHlr : acctHolders)
						temp.add(acctHlr);
					
					// change arraylist to array
					AccountHolder[] array = new AccountHolder[temp.size()];
					for (int i = 0; i < temp.size(); i++) {
						array[i] = temp.get(i);
					}
					
					// commit transaction
					session.getTransaction().commit();
					System.out.println("Done!\n\n");	
					
					return array;
				}
				finally {
					factory.close();
				}
			}
	
	
	public static Account[] accountQuery(String query) {
		ArrayList<Account> temp = new ArrayList<>();

		// Create Session Factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(AccountHolder.class)
				.addAnnotatedClass(CheckingAccount.class)
				.addAnnotatedClass(SavingsAccount.class)
				.buildSessionFactory();
		
		// Create Session
		Session session = factory.getCurrentSession();
		
		try {
			// start a transaction
			session.beginTransaction();
			
			//query AccountHolders
			List<Account> accounts = session.createQuery(query).getResultList();
			
			// add acctHolders to ArrayList
			for (Account acct : accounts)
				temp.add(acct);
			
			// change arraylist to array
			Account[] array = new Account[temp.size()];
			for (int i = 0; i < temp.size(); i++) {
				array[i] = temp.get(i);
			}
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!\n\n");	
			
			return array;
		}
		finally {
			factory.close();
		}
	}
	
	//QUERY THAT RETURNS A 2D ARRAY THAT IS USED STRICTLY FOR JTABLE MODELING
	public static Object[][] accountTableModelQuery(String query) {
		ArrayList<Account> temp = new ArrayList<>();

		// Create Session Factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(AccountHolder.class)
				.addAnnotatedClass(CheckingAccount.class)
				.addAnnotatedClass(SavingsAccount.class)
				.buildSessionFactory();
		
		// Create Session
		Session session = factory.getCurrentSession();
		
		try {
			// start a transaction
			session.beginTransaction();
			
			//query AccountHolders
			List<Account> accounts = session.createQuery(query).getResultList();
			
			// add acctHolders to ArrayList
			for (Account acct : accounts)
				temp.add(acct);
			
			// Create object 2d array that will be used in the DefaultTableModel
			Object[][] object = new Object[temp.size()][4];
			for (int i = 0; i < temp.size(); i++) {
				object[i][0] = new Integer(temp.get(i).getAccountId());
				object[i][1] = temp.get(i).getAccountType();
				object[i][2] = new Double (temp.get(i).getBalance());
				object[i][3] = temp.get(i).getDateCreated();
			}
				
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!\n\n");	
			
			return object;
		}
		finally {
			factory.close();
		}
	}
	
	public static void updateBalance(int accountId, double newBalance) {
		// Create Session Factory
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Account.class)
						.addAnnotatedClass(AccountHolder.class)
						.addAnnotatedClass(CheckingAccount.class)
						.addAnnotatedClass(SavingsAccount.class)
						.buildSessionFactory();
				
				// Create Session
				Session session = factory.getCurrentSession();
				
				try {
					// start a transaction
					session.beginTransaction();
					
					//query AccountHolders
					Query query = session.createQuery("update Account set balance = : newBalance where accountId = : id");
					query.setParameter("newBalance", newBalance);
					query.setParameter("id", accountId);
					query.executeUpdate();
					
					// commit transaction
					session.getTransaction().commit();
					System.out.println("Done!\n\n");	
				}
				
				finally {
					factory.close();
				}
	}
	
	public static Account retrieveAccount(int accountId) {
		// Create Session Factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(AccountHolder.class)
				.addAnnotatedClass(CheckingAccount.class)
				.addAnnotatedClass(SavingsAccount.class)
				.buildSessionFactory();
		
		// Create Session
		Session session = factory.getCurrentSession();
		
		try {
			// start a transaction
			session.beginTransaction();
			
			//query AccountHolders
			List<Account> temp = session.createQuery("from Account a where a.accountId='" + accountId + "'").getResultList();
			Account tempAcct = temp.get(0);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!\n\n");
			return tempAcct;
		}
		
		finally {
			factory.close();
		}
	}
}
