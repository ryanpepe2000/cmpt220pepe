package HibernateClasses;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BankingClasses.AccountHolder;

public class Authentification {

	public static boolean verifyCredentials(String username, String password) {
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
					List<AccountHolder> acctHolders = session.createQuery("from AccountHolder a where a.username='"+ username + "'").getResultList();
					
					if (acctHolders.isEmpty())
						return false;
					
					// display the acctHolders
					System.out.println(acctHolders.get(0).toString());
					
					// commit transaction
					session.getTransaction().commit();
					System.out.println("Done!\n\n");
					
					System.out.println("Username:" + acctHolders.get(0).getUsername() + " " + username + "\nPassword: "
							+ acctHolders.get(0).getPassword() + " " + password);
					
					if (acctHolders.get(0).getPassword().contentEquals(password)) 
						return true;
					} 
				finally {
					factory.close();
				}
				
				return false;
			}	
	}
