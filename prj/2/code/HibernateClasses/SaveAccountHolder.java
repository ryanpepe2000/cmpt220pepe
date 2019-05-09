package HibernateClasses;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BankingClasses.AccountHolder;

public class SaveAccountHolder {
	
	public static void save(AccountHolder user) {

		// Create Session Factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(AccountHolder.class)
				.buildSessionFactory();
		
		// Create Session
		Session session = factory.getCurrentSession();
		
		try {
			// create an accountholder object
			System.out.println("Creating new accountholder object");
			AccountHolder temp = user;
			
			// start a transaction
			session.beginTransaction();
			
			// save the object
			System.out.println("Saving the acctHolder...");
			session.save(temp);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			} finally {
			factory.close();
		}
	}	

}
