package HibernateClasses;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import BankingClasses.Account;
import BankingClasses.AccountHolder;

public class AccountsTableModel extends DefaultTableModel {
	private static final long serialVersionUID = 1L;

	// RETURNS THE JTABLE MODEL FOR EVERY ACCOUNT OF A USER VIA THE USERNAME
	public static DefaultTableModel accountModel(AccountHolder user) {
		ArrayList<Object> test = new ArrayList<>();
		
		Account[] accounts = MakeQuery.accountQuery("from Account a where a.accountHolder.userId=" + user.getUserId());
		for (Account acct : accounts) {
			test.add(acct);
		}
		
		// Creates a table model using the accountId, accountType, balance, and dateCreated
		DefaultTableModel model = new DefaultTableModel(MakeQuery.accountTableModelQuery("from Account a where a.accountHolder.userId=" + user.getUserId()),
		new String[] {
			"Account ID", "Account Type", "Balance", "Date Created"
		}
	) {
		private static final long serialVersionUID = 1L;
		Class<?>[] columnTypes = new Class[] {
			Object.class, String.class, Object.class, String.class
		};
		public Class<?> getColumnClass(int columnIndex) {
			return columnTypes[columnIndex];
		}
	};
	
		return model;
	}
}
